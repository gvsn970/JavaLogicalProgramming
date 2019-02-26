package com.nexiilabs.excelsheetread;
// Working program using Reader Class 
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator; 

public class MainSample 
{ 
    static int MAXN=1000001;
    static int spf[] = new int[MAXN]; 
    static HashSet s=new HashSet();
	static class Reader 
	{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 

		public Reader() 
		{ 
			din = new DataInputStream(System.in); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 

		public Reader(String file_name) throws IOException 
		{ 
			din = new DataInputStream(new FileInputStream(file_name)); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 

		public String readLine() throws IOException 
		{ 
			byte[] buf = new byte[64]; // line length 
			int cnt = 0, c; 
			while ((c = read()) != -1) 
			{ 
				if (c == '\n') 
					break; 
				buf[cnt++] = (byte) c; 
			} 
			return new String(buf, 0, cnt); 
		} 

		public int nextInt() throws IOException 
		{ 
			int ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do
			{ 
				ret = ret * 10 + c - '0'; 
			} while ((c = read()) >= '0' && c <= '9'); 

			if (neg) 
				return -ret; 
			return ret; 
		} 

		public long nextLong() throws IOException 
		{ 
			long ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 
			if (neg) 
				return -ret; 
			return ret; 
		} 

		public double nextDouble() throws IOException 
		{ 
			double ret = 0, div = 1; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 

			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 

			if (c == '.') 
			{ 
				while ((c = read()) >= '0' && c <= '9') 
				{ 
					ret += (c - '0') / (div *= 10); 
				} 
			} 

			if (neg) 
				return -ret; 
			return ret; 
		} 

		private void fillBuffer() throws IOException 
		{ 
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
			if (bytesRead == -1) 
				buffer[0] = -1; 
		} 

		private byte read() throws IOException 
		{ 
			if (bufferPointer == bytesRead) 
				fillBuffer(); 
			return buffer[bufferPointer++]; 
		} 

		public void close() throws IOException 
		{ 
			if (din == null) 
				return; 
			din.close(); 
		} 
	} 
	static int dp[]=new int[1000001];

	public static void main(String[] args) throws IOException 
	{ 
		Reader sc=new Reader();
		int T=sc.nextInt();
		while(T-->0)
		{
		    String s=sc.readLine();
		    int a[]=new int[100];
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)-48>=0&& s.charAt(i)-48<=9)
		        {
		            int val=s.charAt(i)-48;
		            int j=i-val;
		            if(i-val<0)
		            j=0;
		            for(;j<=i+val;j++)
		            a[j]++;
		        }
		    }
		    int f=1;
		    for(int i=0;i<a.length;i++)
		    {
		        if(a[i]>=2)
		        {
		            f=0;
		            break;
		        }
		    }
		    if(f==0)
		    System.out.println("unsafe");
		    else
		    System.out.println("safe");
		}
	} 
	static void sieve() 
    { 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++) 
            spf[i] = i; 
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
        for (int i=3; i*i<MAXN; i++) 
        { 
            if (spf[i] == i) 
            { 
                for (int j=i*i; j<MAXN; j+=i) 
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
    static long getFactorization(int x) 
    { 
        //Vector<Integer> ret = new Vector<>(); 
        s.clear();
        while (x != 1) 
        { 
            //ret.add(spf[x]); 
            s.add(spf[x]);
            x = x / spf[x]; 
        } 
        Iterator it=s.iterator();
	    long sum=0;
	    while(it.hasNext())
	    {
	        sum+=(Integer)it.next();
	    }
	    return sum;
        
    } 
	public void sieven(int n) 
    {
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
        for(int p = 2; p*p <=n; p++) 
        { 
            if(prime[p] == true) 
            { 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
    } 
	public static long gcd(long a,long b)
	{
	    if(b==0)
	    return a;
	    return gcd(b,a%b);
	}
	static int power(int x, int y, int p) 
    { 
        int res = 1;      
        x = x % p;  
        while (y > 0) 
        { 
            if((y & 1)==1) 
                res = (res * x) % p; 
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    } 
} 
