package com.kara.zookeeper.constants;

import java.util.regex.Pattern;

/**
 * 
 * @author LiangMeng
 *
 */
public class Constants {
	public static final String  BACKUP_KEY                         = "backup";
    public static final String  DEFAULT_KEY_PREFIX                 = "default.";
    public static final Pattern COMMA_SPLIT_PATTERN                = Pattern.compile("\\s*[,]+\\s*");
    public static final String  LOCALHOST_KEY                      = "localhost";
    public static final String  LOCALHOST_VALUE                    = "127.0.0.1";
    public static final String  ANYHOST_KEY                        = "anyhost";
    public static final String  ANYHOST_VALUE                      = "0.0.0.0";
    public static final String  GROUP_KEY                          = "group";
    public static final String  VERSION_KEY                        = "version";
    public static final String  INTERFACE_KEY                      = "interface";

   	      
}
