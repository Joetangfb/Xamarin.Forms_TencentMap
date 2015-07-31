package mono.com.tencent.tencentmap.mapsdk.map;


public class OnMarkerPressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.OnMarkerPressListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerPressed:(Lcom/tencent/mapsdk/raster/model/Marker;)V:GetOnMarkerPressed_Lcom_tencent_mapsdk_raster_model_Marker_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.IOnMarkerPressListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnMarkerPressListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", OnMarkerPressListenerImplementor.class, __md_methods);
	}


	public OnMarkerPressListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnMarkerPressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnMarkerPressListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMarkerPressed (com.tencent.mapsdk.raster.model.Marker p0)
	{
		n_onMarkerPressed (p0);
	}

	private native void n_onMarkerPressed (com.tencent.mapsdk.raster.model.Marker p0);

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
