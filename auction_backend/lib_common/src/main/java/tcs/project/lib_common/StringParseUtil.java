package tcs.project.lib_common;


import java.util.UUID;

public class StringParseUtil {
    public static UUID toUuid(String value){
        try{
            return UUID.fromString(value);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid jwt payload");
        }
    }
}
