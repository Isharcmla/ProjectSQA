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

public class TarArchiveInputStream_setCurrentEntry_80530496657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5124;
     Object term5194;
     Object term19450;
     Object term19471;

    public TarArchiveInputStream_setCurrentEntry_80530496657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19519 = Class.forName((String) "java.io.File$PathStatus");
        Field term19518 = ((Class) term19519).getDeclaredField((String) "INVALID");
        ((Field) term19518).setAccessible(true);
        Object enum55 = ((Field) term19518).get((Object) null);
        term5124 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5125 = (byte[]) newByteArray(7);
        Object term5138 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5174 = newInstance(Class.forName("java.io.File"));
        byte[] term5191 = (byte[]) newByteArray(1);
        setByteElement(term5125, 0, (byte) -10);
        setByteElement(term5125, 1, (byte) -106);
        setByteElement(term5125, 2, (byte) -124);
        setByteElement(term5125, 3, (byte) -71);
        setByteElement(term5125, 4, (byte) 113);
        setByteElement(term5125, 5, (byte) -77);
        setByteElement(term5125, 6, (byte) -12);
        setField(term5124, term5124.getClass(), "SMALL_BUF", term5125);
        setIntField(term5124, term5124.getClass(), "recordSize", -2014576105);
        setIntField(term5124, term5124.getClass(), "blockSize", 1296895584);
        setBooleanField(term5124, term5124.getClass(), "hasHitEOF", false);
        setLongField(term5124, term5124.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term5124, term5124.getClass(), "entryOffset", -900457279156388404L);
        setField(term5124, term5124.getClass(), "is", null);
        setField(term5138, term5138.getClass(), "name", "");
        setIntField(term5138, term5138.getClass(), "mode", 628918458);
        setIntField(term5138, term5138.getClass(), "userId", -1274456137);
        setIntField(term5138, term5138.getClass(), "groupId", 1041916673);
        setLongField(term5138, term5138.getClass(), "size", 1084801489398441516L);
        setLongField(term5138, term5138.getClass(), "modTime", 6273754186658578034L);
        setBooleanField(term5138, term5138.getClass(), "checkSumOK", false);
        setByteField(term5138, term5138.getClass(), "linkFlag", (byte) 58);
        setField(term5138, term5138.getClass(), "linkName", "");
        setField(term5138, term5138.getClass(), "magic", "ustar ");
        setField(term5138, term5138.getClass(), "version", "00");
        setField(term5138, term5138.getClass(), "userName", "root");
        setField(term5138, term5138.getClass(), "groupName", "");
        setIntField(term5138, term5138.getClass(), "devMajor", -601863069);
        setIntField(term5138, term5138.getClass(), "devMinor", 663292551);
        setBooleanField(term5138, term5138.getClass(), "isExtended", true);
        setLongField(term5138, term5138.getClass(), "realSize", 3620247240684476031L);
        setField(term5174, term5174.getClass(), "path", "UlajhuVLaP");
        setField(term5174, term5174.getClass(), "status", enum55);
        setIntField(term5174, term5174.getClass(), "prefixLength", -1885090354);
        setField(term5174, term5174.getClass(), "filePath", null);
        setField(term5138, term5138.getClass(), "file", term5174);
        setField(term5124, term5124.getClass(), "currEntry", term5138);
        setField(term5124, term5124.getClass(), "encoding", null);
        setByteElement(term5191, 0, (byte) 12);
        setField(term5124, term5124.getClass(), "SINGLE", term5191);
        setLongField(term5124, term5124.getClass(), "bytesRead", 8313800941204938919L);
        term5194 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5230 = newInstance(Class.forName("java.io.File"));
        setField(term5194, term5194.getClass(), "name", "");
        setIntField(term5194, term5194.getClass(), "mode", -2066804303);
        setIntField(term5194, term5194.getClass(), "userId", -1731761810);
        setIntField(term5194, term5194.getClass(), "groupId", 197109649);
        setLongField(term5194, term5194.getClass(), "size", -1214968196781083707L);
        setLongField(term5194, term5194.getClass(), "modTime", -1804015692891701666L);
        setBooleanField(term5194, term5194.getClass(), "checkSumOK", true);
        setByteField(term5194, term5194.getClass(), "linkFlag", (byte) 79);
        setField(term5194, term5194.getClass(), "linkName", "");
        setField(term5194, term5194.getClass(), "magic", "ustar ");
        setField(term5194, term5194.getClass(), "version", "00");
        setField(term5194, term5194.getClass(), "userName", "root");
        setField(term5194, term5194.getClass(), "groupName", "");
        setIntField(term5194, term5194.getClass(), "devMajor", -1239406390);
        setIntField(term5194, term5194.getClass(), "devMinor", 1557431527);
        setBooleanField(term5194, term5194.getClass(), "isExtended", false);
        setLongField(term5194, term5194.getClass(), "realSize", -6432617521836576658L);
        setField(term5230, term5230.getClass(), "path", "gGSMzuGICf");
        setField(term5230, term5230.getClass(), "status", enum55);
        setIntField(term5230, term5230.getClass(), "prefixLength", -1504890659);
        setField(term5230, term5230.getClass(), "filePath", null);
        setField(term5194, term5194.getClass(), "file", term5230);
        Class<? extends Object> term19784 = Class.forName((String) "java.io.File$PathStatus");
        Field term19783 = ((Class) term19784).getDeclaredField((String) "INVALID");
        ((Field) term19783).setAccessible(true);
        Object enum56 = ((Field) term19783).get((Object) null);
        term19450 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term19451 = (byte[]) newByteArray(7);
        Object term19452 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19465 = newInstance(Class.forName("java.io.File"));
        byte[] term19470 = (byte[]) newByteArray(1);
        setByteElement(term19451, 0, (byte) -10);
        setByteElement(term19451, 1, (byte) -106);
        setByteElement(term19451, 2, (byte) -124);
        setByteElement(term19451, 3, (byte) -71);
        setByteElement(term19451, 4, (byte) 113);
        setByteElement(term19451, 5, (byte) -77);
        setByteElement(term19451, 6, (byte) -12);
        setField(term19450, term19450.getClass(), "SMALL_BUF", term19451);
        setIntField(term19450, term19450.getClass(), "recordSize", -2014576105);
        setIntField(term19450, term19450.getClass(), "blockSize", 1296895584);
        setBooleanField(term19450, term19450.getClass(), "hasHitEOF", false);
        setLongField(term19450, term19450.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term19450, term19450.getClass(), "entryOffset", -900457279156388404L);
        setField(term19450, term19450.getClass(), "is", null);
        setField(term19452, term19452.getClass(), "name", "");
        setIntField(term19452, term19452.getClass(), "mode", -2066804303);
        setIntField(term19452, term19452.getClass(), "userId", -1731761810);
        setIntField(term19452, term19452.getClass(), "groupId", 197109649);
        setLongField(term19452, term19452.getClass(), "size", -1214968196781083707L);
        setLongField(term19452, term19452.getClass(), "modTime", -1804015692891701666L);
        setBooleanField(term19452, term19452.getClass(), "checkSumOK", true);
        setByteField(term19452, term19452.getClass(), "linkFlag", (byte) 79);
        setField(term19452, term19452.getClass(), "linkName", "");
        setField(term19452, term19452.getClass(), "magic", "ustar ");
        setField(term19452, term19452.getClass(), "version", "00");
        setField(term19452, term19452.getClass(), "userName", "root");
        setField(term19452, term19452.getClass(), "groupName", "");
        setIntField(term19452, term19452.getClass(), "devMajor", -1239406390);
        setIntField(term19452, term19452.getClass(), "devMinor", 1557431527);
        setBooleanField(term19452, term19452.getClass(), "isExtended", false);
        setLongField(term19452, term19452.getClass(), "realSize", -6432617521836576658L);
        setField(term19465, term19465.getClass(), "path", "gGSMzuGICf");
        setField(term19465, term19465.getClass(), "status", enum56);
        setIntField(term19465, term19465.getClass(), "prefixLength", -1504890659);
        setField(term19465, term19465.getClass(), "filePath", null);
        setField(term19452, term19452.getClass(), "file", term19465);
        setField(term19450, term19450.getClass(), "currEntry", term19452);
        setField(term19450, term19450.getClass(), "encoding", null);
        setByteElement(term19470, 0, (byte) 12);
        setField(term19450, term19450.getClass(), "SINGLE", term19470);
        setLongField(term19450, term19450.getClass(), "bytesRead", 8313800941204938919L);
        Class<? extends Object> term20848 = Class.forName((String) "java.io.File$PathStatus");
        Field term20847 = ((Class) term20848).getDeclaredField((String) "CHECKED");
        ((Field) term20847).setAccessible(true);
        Object enum62 = ((Field) term20847).get((Object) null);
        term19471 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19484 = newInstance(Class.forName("java.io.File"));
        setField(term19471, term19471.getClass(), "name", "");
        setIntField(term19471, term19471.getClass(), "mode", -2066804303);
        setIntField(term19471, term19471.getClass(), "userId", -1731761810);
        setIntField(term19471, term19471.getClass(), "groupId", 197109649);
        setLongField(term19471, term19471.getClass(), "size", -1214968196781083707L);
        setLongField(term19471, term19471.getClass(), "modTime", -1804015692891701666L);
        setBooleanField(term19471, term19471.getClass(), "checkSumOK", true);
        setByteField(term19471, term19471.getClass(), "linkFlag", (byte) 79);
        setField(term19471, term19471.getClass(), "linkName", "");
        setField(term19471, term19471.getClass(), "magic", "ustar ");
        setField(term19471, term19471.getClass(), "version", "00");
        setField(term19471, term19471.getClass(), "userName", "root");
        setField(term19471, term19471.getClass(), "groupName", "");
        setIntField(term19471, term19471.getClass(), "devMajor", -1239406390);
        setIntField(term19471, term19471.getClass(), "devMinor", 1557431527);
        setBooleanField(term19471, term19471.getClass(), "isExtended", false);
        setLongField(term19471, term19471.getClass(), "realSize", -6432617521836576658L);
        setField(term19484, term19484.getClass(), "path", "gGSMzuGICf");
        setField(term19484, term19484.getClass(), "status", enum62);
        setIntField(term19484, term19484.getClass(), "prefixLength", -1504890659);
        setField(term19484, term19484.getClass(), "filePath", null);
        setField(term19471, term19471.getClass(), "file", term19484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term5194;
        callMethod(klass, "setCurrentEntry", argTypes, term5124, args);
        assertTrue(recursiveEquals(term5124, term19450));
        assertTrue(recursiveEquals(term5194, term19471));
    }

};


