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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TarArchiveInputStream_read_82857799237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3142;
     Object term3221;
     Object term3222;
     Object term3224;

    public TarArchiveInputStream_read_82857799237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150557 = Class.forName((String) "java.io.File$PathStatus");
        Field term150556 = ((Class) term150557).getDeclaredField((String) "CHECKED");
        ((Field) term150556).setAccessible(true);
        Object enum40 = ((Field) term150556).get((Object) null);
        term3142 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3146 = (byte[]) newByteArray(5);
        Object term3152 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term3153 = (byte[]) newByteArray(4);
        Object term3163 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3198 = newInstance(Class.forName("java.io.File"));
        byte[] term3215 = (byte[]) newByteArray(4);
        setBooleanField(term3142, term3142.getClass(), "hasHitEOF", true);
        setLongField(term3142, term3142.getClass(), "entrySize", 6682528376118987775L);
        setLongField(term3142, term3142.getClass(), "entryOffset", 682356318767179819L);
        setByteElement(term3146, 0, (byte) -126);
        setByteElement(term3146, 1, (byte) 12);
        setByteElement(term3146, 2, (byte) -75);
        setByteElement(term3146, 3, (byte) 69);
        setByteElement(term3146, 4, (byte) -6);
        setField(term3142, term3142.getClass(), "readBuf", term3146);
        setField(term3152, term3152.getClass(), "inStream", null);
        setField(term3152, term3152.getClass(), "outStream", null);
        setByteElement(term3153, 0, (byte) 107);
        setByteElement(term3153, 1, (byte) -109);
        setByteElement(term3153, 2, (byte) 122);
        setByteElement(term3153, 3, (byte) 83);
        setField(term3152, term3152.getClass(), "blockBuffer", term3153);
        setIntField(term3152, term3152.getClass(), "currBlkIdx", -1963464809);
        setIntField(term3152, term3152.getClass(), "currRecIdx", 71190297);
        setIntField(term3152, term3152.getClass(), "blockSize", 1202361360);
        setIntField(term3152, term3152.getClass(), "recordSize", -2015048153);
        setIntField(term3152, term3152.getClass(), "recsPerBlock", -2063457669);
        setField(term3142, term3142.getClass(), "buffer", term3152);
        setField(term3163, term3163.getClass(), "name", "");
        setIntField(term3163, term3163.getClass(), "mode", -1222006000);
        setIntField(term3163, term3163.getClass(), "userId", 2095798786);
        setIntField(term3163, term3163.getClass(), "groupId", -1565502840);
        setLongField(term3163, term3163.getClass(), "size", -7291743527973326814L);
        setLongField(term3163, term3163.getClass(), "modTime", -5963439350418910964L);
        setByteField(term3163, term3163.getClass(), "linkFlag", (byte) -123);
        setField(term3163, term3163.getClass(), "linkName", "");
        setField(term3163, term3163.getClass(), "magic", "ustar ");
        setField(term3163, term3163.getClass(), "version", "00");
        setField(term3163, term3163.getClass(), "userName", "root");
        setField(term3163, term3163.getClass(), "groupName", "");
        setIntField(term3163, term3163.getClass(), "devMajor", 344323424);
        setIntField(term3163, term3163.getClass(), "devMinor", 9726679);
        setBooleanField(term3163, term3163.getClass(), "isExtended", false);
        setLongField(term3163, term3163.getClass(), "realSize", 9013624480170062917L);
        setField(term3198, term3198.getClass(), "path", "ZiaGIbnzTs");
        setField(term3198, term3198.getClass(), "status", enum40);
        setIntField(term3198, term3198.getClass(), "prefixLength", -25637976);
        setField(term3198, term3198.getClass(), "filePath", null);
        setField(term3163, term3163.getClass(), "file", term3198);
        setField(term3142, term3142.getClass(), "currEntry", term3163);
        setByteElement(term3215, 0, (byte) -76);
        setByteElement(term3215, 1, (byte) -115);
        setByteElement(term3215, 2, (byte) -48);
        setByteElement(term3215, 3, (byte) 126);
        setField(term3142, term3142.getClass(), "SINGLE", term3215);
        setLongField(term3142, term3142.getClass(), "bytesRead", 7862575738391801707L);
        term3221 = (byte[]) newByteArray(0);
        term3222 = new Integer(1555897383);
        term3224 = new Integer(202001407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3221;
        args[1] = term3222;
        args[2] = term3224;
        try {
            callMethod(klass, "read", argTypes, term3142, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


