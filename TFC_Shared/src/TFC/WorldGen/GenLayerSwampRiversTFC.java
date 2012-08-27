package TFC.WorldGen;

import net.minecraft.src.GenLayer;
import net.minecraft.src.IntCache;

public class GenLayerSwampRiversTFC extends GenLayerTFC
{
	public GenLayerSwampRiversTFC(long par1, GenLayer par3GenLayer)
	{
		super(par1);
		this.parent = (GenLayerTFC) par3GenLayer;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
	 * amounts, or biomeList[] indices based on the particular GenLayer subclass.
	 */
	public int[] getInts(int par1, int par2, int par3, int par4)
	{
		int[] var5 = this.parent.getInts(par1 - 1, par2 - 1, par3 + 2, par4 + 2);
		int[] var6 = IntCache.getIntCache(par3 * par4);

		for (int var7 = 0; var7 < par4; ++var7)
		{
			for (int var8 = 0; var8 < par3; ++var8)
			{
				this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
				int var9 = var5[var8 + 1 + (var7 + 1) * (par3 + 2)];

				if(var9 == TFCBiome.swampland.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river2.biomeID;
				}
				else if(var9 == TFCBiome.swamp2.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river3.biomeID;
				}
				else if(var9 == TFCBiome.swamp3.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river4.biomeID;
				}
				else if(var9 == TFCBiome.swamp4.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river5.biomeID;
				}
				else if(var9 == TFCBiome.swamp5.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river6.biomeID;
				}
				else if(var9 == TFCBiome.swamp6.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river7.biomeID;
				}
				else if(var9 == TFCBiome.swamp7.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river8.biomeID;
				}
				else if(var9 == TFCBiome.swamp9.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river10.biomeID;
				}
				else if(var9 == TFCBiome.swamp10.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river11.biomeID;
				}
				else if(var9 == TFCBiome.taiga.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river12.biomeID;
				}
				else if(var9 == TFCBiome.taiga2.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river13.biomeID;
				}
				else if(var9 == TFCBiome.taiga3.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river14.biomeID;
				}
				else if(var9 == TFCBiome.taiga4.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river15.biomeID;
				}
				else if(var9 == TFCBiome.taiga5.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river16.biomeID;
				}
				else if(var9 == TFCBiome.taiga6.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river17.biomeID;
				}
				else if(var9 == TFCBiome.taiga7.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river18.biomeID;
				}
				else if(var9 == TFCBiome.taiga8.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river19.biomeID;
				}
				else if(var9 == TFCBiome.taiga9.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river20.biomeID;
				}
				else if(var9 == TFCBiome.taiga10.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river21.biomeID;
				}
				else if(var9 == TFCBiome.forest.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river22.biomeID;
				}
				else if(var9 == TFCBiome.forest2.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river23.biomeID;
				}
				else if(var9 == TFCBiome.forest3.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river24.biomeID;
				}
				else if(var9 == TFCBiome.forest4.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river25.biomeID;
				}
				else if(var9 == TFCBiome.forest5.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river26.biomeID;
				}
				else if(var9 == TFCBiome.forest6.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river27.biomeID;
				}
				else if(var9 == TFCBiome.forest7.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river28.biomeID;
				}
				else if(var9 == TFCBiome.forest8.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river29.biomeID;
				}
				else if(var9 == TFCBiome.forest9.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river30.biomeID;
				}
				else if(var9 == TFCBiome.plains.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river31.biomeID;
				}
				else if(var9 == TFCBiome.plains2.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river32.biomeID;
				}
				else if(var9 == TFCBiome.plains3.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river33.biomeID;
				}
				else if(var9 == TFCBiome.plains4.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river34.biomeID;
				}
				else if(var9 == TFCBiome.plains5.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river35.biomeID;
				}
				else if(var9 == TFCBiome.plains6.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river36.biomeID;
				}
				else if(var9 == TFCBiome.plains7.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river37.biomeID;
				}
				else if(var9 == TFCBiome.plains8.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river38.biomeID;
				}
				else if(var9 == TFCBiome.plains9.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river39.biomeID;
				}
				else if(var9 == TFCBiome.plains10.biomeID && this.nextInt(6) == 0)
				{
					var6[var8 + var7 * par3] = TFCBiome.river40.biomeID;
				}
				else
				{
					var6[var8 + var7 * par3] = var9;
				}
			}
		}

		return var6;
	}
}