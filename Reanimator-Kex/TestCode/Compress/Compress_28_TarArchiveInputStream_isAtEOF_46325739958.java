package org.apache.commons.compress.archivers.tar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_isAtEOF_46325739958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5439;
     Object term20469;

    public TarArchiveInputStream_isAtEOF_46325739958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20514 = Class.forName((String) "java.io.File$PathStatus");
        Field term20513 = ((Class) term20514).getDeclaredField((String) "INVALID");
        ((Field) term20513).setAccessible(true);
        Object enum60 = ((Field) term20513).get((Object) null);
        term5439 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5440 = (byte[]) newByteArray(2);
        Object term5448 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5484 = newInstance(Class.forName("java.io.File"));
        byte[] term5501 = (byte[]) newByteArray(7);
        setByteElement(term5440, 0, (byte) -4);
        setByteElement(term5440, 1, (byte) -27);
        setField(term5439, term5439.getClass(), "SMALL_BUF", term5440);
        setIntField(term5439, term5439.getClass(), "recordSize", 1358829571);
        setIntField(term5439, term5439.getClass(), "blockSize", 991356662);
        setBooleanField(term5439, term5439.getClass(), "hasHitEOF", false);
        setLongField(term5439, term5439.getClass(), "entrySize", -2255965562447970862L);
        setLongField(term5439, term5439.getClass(), "entryOffset", 148047808219672941L);
        setField(term5439, term5439.getClass(), "is", null);
        setField(term5448, term5448.getClass(), "name", "");
        setIntField(term5448, term5448.getClass(), "mode", -506958186);
        setIntField(term5448, term5448.getClass(), "userId", -507387516);
        setIntField(term5448, term5448.getClass(), "groupId", -1970452551);
        setLongField(term5448, term5448.getClass(), "size", 7489064039921396098L);
        setLongField(term5448, term5448.getClass(), "modTime", 6843866297465638866L);
        setBooleanField(term5448, term5448.getClass(), "checkSumOK", true);
        setByteField(term5448, term5448.getClass(), "linkFlag", (byte) 120);
        setField(term5448, term5448.getClass(), "linkName", "");
        setField(term5448, term5448.getClass(), "magic", "ustar ");
        setField(term5448, term5448.getClass(), "version", "00");
        setField(term5448, term5448.getClass(), "userName", "root");
        setField(term5448, term5448.getClass(), "groupName", "");
        setIntField(term5448, term5448.getClass(), "devMajor", -1896376975);
        setIntField(term5448, term5448.getClass(), "devMinor", 729658803);
        setBooleanField(term5448, term5448.getClass(), "isExtended", true);
        setLongField(term5448, term5448.getClass(), "realSize", -4023935540989049732L);
        setField(term5484, term5484.getClass(), "path", "hxCBltsObl");
        setField(term5484, term5484.getClass(), "status", enum60);
        setIntField(term5484, term5484.getClass(), "prefixLength", 114754804);
        setField(term5484, term5484.getClass(), "filePath", null);
        setField(term5448, term5448.getClass(), "file", term5484);
        setField(term5439, term5439.getClass(), "currEntry", term5448);
        setField(term5439, term5439.getClass(), "encoding", null);
        setByteElement(term5501, 0, (byte) -25);
        setByteElement(term5501, 1, (byte) 114);
        setByteElement(term5501, 2, (byte) 105);
        setByteElement(term5501, 3, (byte) -95);
        setByteElement(term5501, 4, (byte) -6);
        setByteElement(term5501, 5, (byte) 51);
        setByteElement(term5501, 6, (byte) 122);
        setField(term5439, term5439.getClass(), "SINGLE", term5501);
        setLongField(term5439, term5439.getClass(), "bytesRead", 855932984568615096L);
        Class<? extends Object> term20688 = Class.forName((String) "java.io.File$PathStatus");
        Field term20687 = ((Class) term20688).getDeclaredField((String) "INVALID");
        ((Field) term20687).setAccessible(true);
        Object enum61 = ((Field) term20687).get((Object) null);
        term20469 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term20470 = (byte[]) newByteArray(2);
        Object term20471 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20484 = newInstance(Class.forName("java.io.File"));
        byte[] term20489 = (byte[]) newByteArray(7);
        setByteElement(term20470, 0, (byte) -4);
        setByteElement(term20470, 1, (byte) -27);
        setField(term20469, term20469.getClass(), "SMALL_BUF", term20470);
        setIntField(term20469, term20469.getClass(), "recordSize", 1358829571);
        setIntField(term20469, term20469.getClass(), "blockSize", 991356662);
        setBooleanField(term20469, term20469.getClass(), "hasHitEOF", false);
        setLongField(term20469, term20469.getClass(), "entrySize", -2255965562447970862L);
        setLongField(term20469, term20469.getClass(), "entryOffset", 148047808219672941L);
        setField(term20469, term20469.getClass(), "is", null);
        setField(term20471, term20471.getClass(), "name", "");
        setIntField(term20471, term20471.getClass(), "mode", -506958186);
        setIntField(term20471, term20471.getClass(), "userId", -507387516);
        setIntField(term20471, term20471.getClass(), "groupId", -1970452551);
        setLongField(term20471, term20471.getClass(), "size", 7489064039921396098L);
        setLongField(term20471, term20471.getClass(), "modTime", 6843866297465638866L);
        setBooleanField(term20471, term20471.getClass(), "checkSumOK", true);
        setByteField(term20471, term20471.getClass(), "linkFlag", (byte) 120);
        setField(term20471, term20471.getClass(), "linkName", "");
        setField(term20471, term20471.getClass(), "magic", "ustar ");
        setField(term20471, term20471.getClass(), "version", "00");
        setField(term20471, term20471.getClass(), "userName", "root");
        setField(term20471, term20471.getClass(), "groupName", "");
        setIntField(term20471, term20471.getClass(), "devMajor", -1896376975);
        setIntField(term20471, term20471.getClass(), "devMinor", 729658803);
        setBooleanField(term20471, term20471.getClass(), "isExtended", true);
        setLongField(term20471, term20471.getClass(), "realSize", -4023935540989049732L);
        setField(term20484, term20484.getClass(), "path", "hxCBltsObl");
        setField(term20484, term20484.getClass(), "status", enum61);
        setIntField(term20484, term20484.getClass(), "prefixLength", 114754804);
        setField(term20484, term20484.getClass(), "filePath", null);
        setField(term20471, term20471.getClass(), "file", term20484);
        setField(term20469, term20469.getClass(), "currEntry", term20471);
        setField(term20469, term20469.getClass(), "encoding", null);
        setByteElement(term20489, 0, (byte) -25);
        setByteElement(term20489, 1, (byte) 114);
        setByteElement(term20489, 2, (byte) 105);
        setByteElement(term20489, 3, (byte) -95);
        setByteElement(term20489, 4, (byte) -6);
        setByteElement(term20489, 5, (byte) 51);
        setByteElement(term20489, 6, (byte) 122);
        setField(term20469, term20469.getClass(), "SINGLE", term20489);
        setLongField(term20469, term20469.getClass(), "bytesRead", 855932984568615096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAtEOF", argTypes, term5439, args);
        assertTrue(recursiveEquals(term5439, term20469));
    }

};


