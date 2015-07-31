package mono.com.tencent.tencentmap.mapsdk.map;


public class OnMapHitListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.OnMapHitListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapClick:(Lcom/tencent/mapsdk/raster/model/LatLng;)V:GetOnMapClick_Lcom_tencent_mapsdk_raster_model_LatLng_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.IOnMapHitListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnMapHitListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", OnMapHitListenerImplementor.class, __md_methods);
	}


	public OnMapHitListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnMapHitListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnMapHitListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapClick (com.tencent.mapsdk.raster.model.LatLng p0)
	{
		n_onMapClick (p0);
	}

	private native void n_onMapClick (com.tencent.mapsdk.raster.model.LatLng p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
