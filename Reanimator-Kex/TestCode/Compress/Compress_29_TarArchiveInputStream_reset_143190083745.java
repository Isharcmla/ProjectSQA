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

public class TarArchiveInputStream_reset_143190083745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1579;
     Object term13130;

    public TarArchiveInputStream_reset_143190083745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13174 = Class.forName((String) "java.io.File$PathStatus");
        Field term13173 = ((Class) term13174).getDeclaredField((String) "INVALID");
        ((Field) term13173).setAccessible(true);
        Object enum34 = ((Field) term13173).get((Object) null);
        term1579 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1580 = (byte[]) newByteArray(1);
        Object term1587 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1623 = newInstance(Class.forName("java.io.File"));
        byte[] term1640 = (byte[]) newByteArray(0);
        setByteElement(term1580, 0, (byte) 102);
        setField(term1579, term1579.getClass(), "SMALL_BUF", term1580);
        setIntField(term1579, term1579.getClass(), "recordSize", 292681826);
        setIntField(term1579, term1579.getClass(), "blockSize", 458147407);
        setBooleanField(term1579, term1579.getClass(), "hasHitEOF", false);
        setLongField(term1579, term1579.getClass(), "entrySize", 1439298019805881866L);
        setLongField(term1579, term1579.getClass(), "entryOffset", -8708192233349544946L);
        setField(term1579, term1579.getClass(), "is", null);
        setField(term1587, term1587.getClass(), "name", "");
        setIntField(term1587, term1587.getClass(), "mode", -184153539);
        setIntField(term1587, term1587.getClass(), "userId", 493620644);
        setIntField(term1587, term1587.getClass(), "groupId", 1328271830);
        setLongField(term1587, term1587.getClass(), "size", 5907001541142728739L);
        setLongField(term1587, term1587.getClass(), "modTime", 4178434741742309755L);
        setBooleanField(term1587, term1587.getClass(), "checkSumOK", false);
        setByteField(term1587, term1587.getClass(), "linkFlag", (byte) -118);
        setField(term1587, term1587.getClass(), "linkName", "");
        setField(term1587, term1587.getClass(), "magic", "ustar ");
        setField(term1587, term1587.getClass(), "version", "00");
        setField(term1587, term1587.getClass(), "userName", "root");
        setField(term1587, term1587.getClass(), "groupName", "");
        setIntField(term1587, term1587.getClass(), "devMajor", 1596070772);
        setIntField(term1587, term1587.getClass(), "devMinor", 97029295);
        setBooleanField(term1587, term1587.getClass(), "isExtended", true);
        setLongField(term1587, term1587.getClass(), "realSize", -2068172595987555756L);
        setField(term1623, term1623.getClass(), "path", "RMFIsYGgne");
        setField(term1623, term1623.getClass(), "status", enum34);
        setIntField(term1623, term1623.getClass(), "prefixLength", -1371869594);
        setField(term1623, term1623.getClass(), "filePath", null);
        setField(term1587, term1587.getClass(), "file", term1623);
        setField(term1579, term1579.getClass(), "currEntry", term1587);
        setField(term1579, term1579.getClass(), "zipEncoding", null);
        setField(term1579, term1579.getClass(), "SINGLE", term1640);
        setLongField(term1579, term1579.getClass(), "bytesRead", -6292278961887936280L);
        Class<? extends Object> term13341 = Class.forName((String) "java.io.File$PathStatus");
        Field term13340 = ((Class) term13341).getDeclaredField((String) "CHECKED");
        ((Field) term13340).setAccessible(true);
        Object enum35 = ((Field) term13340).get((Object) null);
        term13130 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13131 = (byte[]) newByteArray(1);
        Object term13132 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13145 = newInstance(Class.forName("java.io.File"));
        byte[] term13150 = (byte[]) newByteArray(0);
        setByteElement(term13131, 0, (byte) 102);
        setField(term13130, term13130.getClass(), "SMALL_BUF", term13131);
        setIntField(term13130, term13130.getClass(), "recordSize", 292681826);
        setIntField(term13130, term13130.getClass(), "blockSize", 458147407);
        setBooleanField(term13130, term13130.getClass(), "hasHitEOF", false);
        setLongField(term13130, term13130.getClass(), "entrySize", 1439298019805881866L);
        setLongField(term13130, term13130.getClass(), "entryOffset", -8708192233349544946L);
        setField(term13130, term13130.getClass(), "is", null);
        setField(term13132, term13132.getClass(), "name", "");
        setIntField(term13132, term13132.getClass(), "mode", -184153539);
        setIntField(term13132, term13132.getClass(), "userId", 493620644);
        setIntField(term13132, term13132.getClass(), "groupId", 1328271830);
        setLongField(term13132, term13132.getClass(), "size", 5907001541142728739L);
        setLongField(term13132, term13132.getClass(), "modTime", 4178434741742309755L);
        setBooleanField(term13132, term13132.getClass(), "checkSumOK", false);
        setByteField(term13132, term13132.getClass(), "linkFlag", (byte) -118);
        setField(term13132, term13132.getClass(), "linkName", "");
        setField(term13132, term13132.getClass(), "magic", "ustar ");
        setField(term13132, term13132.getClass(), "version", "00");
        setField(term13132, term13132.getClass(), "userName", "root");
        setField(term13132, term13132.getClass(), "groupName", "");
        setIntField(term13132, term13132.getClass(), "devMajor", 1596070772);
        setIntField(term13132, term13132.getClass(), "devMinor", 97029295);
        setBooleanField(term13132, term13132.getClass(), "isExtended", true);
        setLongField(term13132, term13132.getClass(), "realSize", -2068172595987555756L);
        setField(term13145, term13145.getClass(), "path", "RMFIsYGgne");
        setField(term13145, term13145.getClass(), "status", enum35);
        setIntField(term13145, term13145.getClass(), "prefixLength", -1371869594);
        setField(term13145, term13145.getClass(), "filePath", null);
        setField(term13132, term13132.getClass(), "file", term13145);
        setField(term13130, term13130.getClass(), "currEntry", term13132);
        setField(term13130, term13130.getClass(), "zipEncoding", null);
        setField(term13130, term13130.getClass(), "SINGLE", term13150);
        setLongField(term13130, term13130.getClass(), "bytesRead", -6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term1579, args);
        assertTrue(recursiveEquals(term1579, term13130));
    }

};


