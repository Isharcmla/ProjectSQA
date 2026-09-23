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

public class TarArchiveInputStream_canReadEntryData_75948832459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5094;
     Object term20439;

    public TarArchiveInputStream_canReadEntryData_75948832459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20497 = Class.forName((String) "java.io.File$PathStatus");
        Field term20496 = ((Class) term20497).getDeclaredField((String) "INVALID");
        ((Field) term20496).setAccessible(true);
        Object enum56 = ((Field) term20496).get((Object) null);
        term5094 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5095 = (byte[]) newByteArray(7);
        Object term5108 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5144 = newInstance(Class.forName("java.io.File"));
        byte[] term5161 = (byte[]) newByteArray(1);
        setByteElement(term5095, 0, (byte) -25);
        setByteElement(term5095, 1, (byte) 114);
        setByteElement(term5095, 2, (byte) 105);
        setByteElement(term5095, 3, (byte) -95);
        setByteElement(term5095, 4, (byte) -6);
        setByteElement(term5095, 5, (byte) 51);
        setByteElement(term5095, 6, (byte) 122);
        setField(term5094, term5094.getClass(), "SMALL_BUF", term5095);
        setIntField(term5094, term5094.getClass(), "recordSize", 1296895584);
        setIntField(term5094, term5094.getClass(), "blockSize", 628918458);
        setBooleanField(term5094, term5094.getClass(), "hasHitEOF", false);
        setLongField(term5094, term5094.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term5094, term5094.getClass(), "entryOffset", -900457279156388404L);
        setField(term5094, term5094.getClass(), "is", null);
        setField(term5108, term5108.getClass(), "name", "");
        setIntField(term5108, term5108.getClass(), "mode", -1274456137);
        setIntField(term5108, term5108.getClass(), "userId", 1041916673);
        setIntField(term5108, term5108.getClass(), "groupId", -601863069);
        setLongField(term5108, term5108.getClass(), "size", 1084801489398441516L);
        setLongField(term5108, term5108.getClass(), "modTime", 6273754186658578034L);
        setBooleanField(term5108, term5108.getClass(), "checkSumOK", false);
        setByteField(term5108, term5108.getClass(), "linkFlag", (byte) 84);
        setField(term5108, term5108.getClass(), "linkName", "");
        setField(term5108, term5108.getClass(), "magic", "ustar ");
        setField(term5108, term5108.getClass(), "version", "00");
        setField(term5108, term5108.getClass(), "userName", "root");
        setField(term5108, term5108.getClass(), "groupName", "");
        setIntField(term5108, term5108.getClass(), "devMajor", 663292551);
        setIntField(term5108, term5108.getClass(), "devMinor", -1885090354);
        setBooleanField(term5108, term5108.getClass(), "isExtended", true);
        setLongField(term5108, term5108.getClass(), "realSize", 3620247240684476031L);
        setField(term5144, term5144.getClass(), "path", "SbAoxhfrkn");
        setField(term5144, term5144.getClass(), "status", enum56);
        setIntField(term5144, term5144.getClass(), "prefixLength", -2066804303);
        setField(term5144, term5144.getClass(), "filePath", null);
        setField(term5108, term5108.getClass(), "file", term5144);
        setField(term5094, term5094.getClass(), "currEntry", term5108);
        setField(term5094, term5094.getClass(), "zipEncoding", null);
        setByteElement(term5161, 0, (byte) -36);
        setField(term5094, term5094.getClass(), "SINGLE", term5161);
        setLongField(term5094, term5094.getClass(), "bytesRead", 8313800941204938919L);
        Class<? extends Object> term20670 = Class.forName((String) "java.io.File$PathStatus");
        Field term20669 = ((Class) term20670).getDeclaredField((String) "CHECKED");
        ((Field) term20669).setAccessible(true);
        Object enum57 = ((Field) term20669).get((Object) null);
        term20439 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term20440 = (byte[]) newByteArray(7);
        Object term20441 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20454 = newInstance(Class.forName("java.io.File"));
        byte[] term20459 = (byte[]) newByteArray(1);
        setByteElement(term20440, 0, (byte) -25);
        setByteElement(term20440, 1, (byte) 114);
        setByteElement(term20440, 2, (byte) 105);
        setByteElement(term20440, 3, (byte) -95);
        setByteElement(term20440, 4, (byte) -6);
        setByteElement(term20440, 5, (byte) 51);
        setByteElement(term20440, 6, (byte) 122);
        setField(term20439, term20439.getClass(), "SMALL_BUF", term20440);
        setIntField(term20439, term20439.getClass(), "recordSize", 1296895584);
        setIntField(term20439, term20439.getClass(), "blockSize", 628918458);
        setBooleanField(term20439, term20439.getClass(), "hasHitEOF", false);
        setLongField(term20439, term20439.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term20439, term20439.getClass(), "entryOffset", -900457279156388404L);
        setField(term20439, term20439.getClass(), "is", null);
        setField(term20441, term20441.getClass(), "name", "");
        setIntField(term20441, term20441.getClass(), "mode", -1274456137);
        setIntField(term20441, term20441.getClass(), "userId", 1041916673);
        setIntField(term20441, term20441.getClass(), "groupId", -601863069);
        setLongField(term20441, term20441.getClass(), "size", 1084801489398441516L);
        setLongField(term20441, term20441.getClass(), "modTime", 6273754186658578034L);
        setBooleanField(term20441, term20441.getClass(), "checkSumOK", false);
        setByteField(term20441, term20441.getClass(), "linkFlag", (byte) 84);
        setField(term20441, term20441.getClass(), "linkName", "");
        setField(term20441, term20441.getClass(), "magic", "ustar ");
        setField(term20441, term20441.getClass(), "version", "00");
        setField(term20441, term20441.getClass(), "userName", "root");
        setField(term20441, term20441.getClass(), "groupName", "");
        setIntField(term20441, term20441.getClass(), "devMajor", 663292551);
        setIntField(term20441, term20441.getClass(), "devMinor", -1885090354);
        setBooleanField(term20441, term20441.getClass(), "isExtended", true);
        setLongField(term20441, term20441.getClass(), "realSize", 3620247240684476031L);
        setField(term20454, term20454.getClass(), "path", "SbAoxhfrkn");
        setField(term20454, term20454.getClass(), "status", enum57);
        setIntField(term20454, term20454.getClass(), "prefixLength", -2066804303);
        setField(term20454, term20454.getClass(), "filePath", null);
        setField(term20441, term20441.getClass(), "file", term20454);
        setField(term20439, term20439.getClass(), "currEntry", term20441);
        setField(term20439, term20439.getClass(), "zipEncoding", null);
        setByteElement(term20459, 0, (byte) -36);
        setField(term20439, term20439.getClass(), "SINGLE", term20459);
        setLongField(term20439, term20439.getClass(), "bytesRead", 8313800941204938919L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term5094, args);
        assertTrue(recursiveEquals(term5094, term20439));
        assertTrue(recursiveEquals(retValue, false));
    }

};


