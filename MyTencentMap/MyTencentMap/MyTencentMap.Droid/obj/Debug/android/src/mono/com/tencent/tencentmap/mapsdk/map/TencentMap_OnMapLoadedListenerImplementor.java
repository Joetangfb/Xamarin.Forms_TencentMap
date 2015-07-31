package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnMapLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapLoaded:()V:GetOnMapLoadedHandler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapLoadedListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapLoadedListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnMapLoadedListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnMapLoadedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnMapLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapLoadedListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapLoaded ()
	{
		n_onMapLoaded ();
	}

	private native void n_onMapLoaded ();

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
