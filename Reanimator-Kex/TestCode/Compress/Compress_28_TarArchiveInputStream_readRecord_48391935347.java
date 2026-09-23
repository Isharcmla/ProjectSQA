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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_readRecord_48391935347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2530;

    public TarArchiveInputStream_readRecord_48391935347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15571 = Class.forName((String) "java.io.File$PathStatus");
        Field term15570 = ((Class) term15571).getDeclaredField((String) "INVALID");
        ((Field) term15570).setAccessible(true);
        Object enum40 = ((Field) term15570).get((Object) null);
        term2530 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2531 = (byte[]) newByteArray(5);
        Object term2542 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2578 = newInstance(Class.forName("java.io.File"));
        byte[] term2595 = (byte[]) newByteArray(3);
        setByteElement(term2531, 0, (byte) 70);
        setByteElement(term2531, 1, (byte) 48);
        setByteElement(term2531, 2, (byte) -46);
        setByteElement(term2531, 3, (byte) -128);
        setByteElement(term2531, 4, (byte) 66);
        setField(term2530, term2530.getClass(), "SMALL_BUF", term2531);
        setIntField(term2530, term2530.getClass(), "recordSize", -1547384488);
        setIntField(term2530, term2530.getClass(), "blockSize", 1442160736);
        setBooleanField(term2530, term2530.getClass(), "hasHitEOF", true);
        setLongField(term2530, term2530.getClass(), "entrySize", 7994303628307559416L);
        setLongField(term2530, term2530.getClass(), "entryOffset", 2443640364875054177L);
        setField(term2530, term2530.getClass(), "is", null);
        setField(term2542, term2542.getClass(), "name", "");
        setIntField(term2542, term2542.getClass(), "mode", 1114000454);
        setIntField(term2542, term2542.getClass(), "userId", -556405712);
        setIntField(term2542, term2542.getClass(), "groupId", -1772434990);
        setLongField(term2542, term2542.getClass(), "size", -1610676979013636850L);
        setLongField(term2542, term2542.getClass(), "modTime", 2062173786000223358L);
        setBooleanField(term2542, term2542.getClass(), "checkSumOK", true);
        setByteField(term2542, term2542.getClass(), "linkFlag", (byte) -112);
        setField(term2542, term2542.getClass(), "linkName", "");
        setField(term2542, term2542.getClass(), "magic", "ustar ");
        setField(term2542, term2542.getClass(), "version", "00");
        setField(term2542, term2542.getClass(), "userName", "root");
        setField(term2542, term2542.getClass(), "groupName", "");
        setIntField(term2542, term2542.getClass(), "devMajor", -1845499264);
        setIntField(term2542, term2542.getClass(), "devMinor", -505439934);
        setBooleanField(term2542, term2542.getClass(), "isExtended", true);
        setLongField(term2542, term2542.getClass(), "realSize", -8658027316505137504L);
        setField(term2578, term2578.getClass(), "path", "LQFpaHEwXR");
        setField(term2578, term2578.getClass(), "status", enum40);
        setIntField(term2578, term2578.getClass(), "prefixLength", -344842608);
        setField(term2578, term2578.getClass(), "filePath", null);
        setField(term2542, term2542.getClass(), "file", term2578);
        setField(term2530, term2530.getClass(), "currEntry", term2542);
        setField(term2530, term2530.getClass(), "encoding", null);
        setByteElement(term2595, 0, (byte) 81);
        setByteElement(term2595, 1, (byte) 65);
        setByteElement(term2595, 2, (byte) -44);
        setField(term2530, term2530.getClass(), "SINGLE", term2595);
        setLongField(term2530, term2530.getClass(), "bytesRead", 414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readRecord", argTypes, term2530, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


