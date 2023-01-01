public Polynomial multiply(Polynomial p){
        
        int limit=this.maxDegree+p.maxDegree;
        Polynomial polymul = new Polynomial(limit+1);
        
        for (int i=0;i<=this.maxDegree;i++)
        {
            int product=0;
            for (int j=0;j<=p.maxDegree;j++)
            {
                product=polymul.poly[i+j];
                product=product+(this.poly[i]*p.poly[j]);
                polymul.setCoefficient(i+j,product);
            }
            
            
        }
		
        return polymul;
		
	}
    
    private void doubleCapacity()
	{
		int[] temp=poly;
		poly=new int[2*temp.length];
		for (int i=0;i<temp.length;i++)
		{
			poly[i]=temp[i];
		}
	}

}
