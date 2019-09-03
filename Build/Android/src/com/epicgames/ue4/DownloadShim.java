package com.epicgames.ue4;

import com.YourCompany.DungeonGO.OBBDownloaderService;
import com.YourCompany.DungeonGO.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

