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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getRecord_125393720949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2529;

    public TarArchiveInputStream_getRecord_125393720949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16180 = Class.forName((String) "java.io.File$PathStatus");
        Field term16179 = ((Class) term16180).getDeclaredField((String) "CHECKED");
        ((Field) term16179).setAccessible(true);
        Object enum44 = ((Field) term16179).get((Object) null);
        term2529 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2530 = (byte[]) newByteArray(6);
        Object term2542 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2578 = newInstance(Class.forName("java.io.File"));
        byte[] term2595 = (byte[]) newByteArray(5);
        setByteElement(term2530, 0, (byte) 96);
        setByteElement(term2530, 1, (byte) 70);
        setByteElement(term2530, 2, (byte) 48);
        setByteElement(term2530, 3, (byte) -46);
        setByteElement(term2530, 4, (byte) -128);
        setByteElement(term2530, 5, (byte) 66);
        setField(term2529, term2529.getClass(), "SMALL_BUF", term2530);
        setIntField(term2529, term2529.getClass(), "recordSize", 1442160736);
        setIntField(term2529, term2529.getClass(), "blockSize", 1114000454);
        setBooleanField(term2529, term2529.getClass(), "hasHitEOF", true);
        setLongField(term2529, term2529.getClass(), "entrySize", 7994303628307559416L);
        setLongField(term2529, term2529.getClass(), "entryOffset", 2443640364875054177L);
        setField(term2529, term2529.getClass(), "is", null);
        setField(term2542, term2542.getClass(), "name", "");
        setIntField(term2542, term2542.getClass(), "mode", -556405712);
        setIntField(term2542, term2542.getClass(), "userId", -1772434990);
        setIntField(term2542, term2542.getClass(), "groupId", -1845499264);
        setLongField(term2542, term2542.getClass(), "size", -1610676979013636850L);
        setLongField(term2542, term2542.getClass(), "modTime", 2062173786000223358L);
        setBooleanField(term2542, term2542.getClass(), "checkSumOK", true);
        setByteField(term2542, term2542.getClass(), "linkFlag", (byte) -112);
        setField(term2542, term2542.getClass(), "linkName", "");
        setField(term2542, term2542.getClass(), "magic", "ustar ");
        setField(term2542, term2542.getClass(), "version", "00");
        setField(term2542, term2542.getClass(), "userName", "root");
        setField(term2542, term2542.getClass(), "groupName", "");
        setIntField(term2542, term2542.getClass(), "devMajor", -505439934);
        setIntField(term2542, term2542.getClass(), "devMinor", -344842608);
        setBooleanField(term2542, term2542.getClass(), "isExtended", true);
        setLongField(term2542, term2542.getClass(), "realSize", -8658027316505137504L);
        setField(term2578, term2578.getClass(), "path", "LQFpaHEwXR");
        setField(term2578, term2578.getClass(), "status", enum44);
        setIntField(term2578, term2578.getClass(), "prefixLength", 941650513);
        setField(term2578, term2578.getClass(), "filePath", null);
        setField(term2542, term2542.getClass(), "file", term2578);
        setField(term2529, term2529.getClass(), "currEntry", term2542);
        setField(term2529, term2529.getClass(), "zipEncoding", null);
        setByteElement(term2595, 0, (byte) 81);
        setByteElement(term2595, 1, (byte) 65);
        setByteElement(term2595, 2, (byte) -44);
        setByteElement(term2595, 3, (byte) 33);
        setByteElement(term2595, 4, (byte) -74);
        setField(term2529, term2529.getClass(), "SINGLE", term2595);
        setLongField(term2529, term2529.getClass(), "bytesRead", 414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecord", argTypes, term2529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


