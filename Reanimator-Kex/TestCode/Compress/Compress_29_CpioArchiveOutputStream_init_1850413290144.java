package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_init_1850413290144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61636;
     Object term62030;
     Object term62053;

    public CpioArchiveOutputStream_init_1850413290144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term61432 = new HashMap();
        Object term61384 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term61203 = (byte[]) newByteArray(0);
        Object term61498 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setField(term61384, term61384.getClass(), "oneByte", term61203);
        setLongField(term61384, term61384.getClass(), "bytesWritten", 0L);
        setBooleanField(term61384, term61384.getClass(), "closed", false);
        setField(term61384, term61384.getClass(), "names", term61432);
        setLongField(term61384, term61384.getClass(), "crc", 0L);
        setLongField(term61384, term61384.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term61384, term61384.getClass(), "out", term61498);
        term61636 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap term62031 = new HashMap();
        term62030 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term62032 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term62033 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term62034 = newInstance(Class.forName("sun.nio.cs.US_ASCII"));
        Object[] term62037 = (Object[]) newArray("java.lang.String", 14);
        byte[] term62052 = (byte[]) newByteArray(1);
        setField(term62030, term62030.getClass(), "entry", null);
        setBooleanField(term62030, term62030.getClass(), "closed", false);
        setBooleanField(term62030, term62030.getClass(), "finished", false);
        setShortField(term62030, term62030.getClass(), "entryFormat", (short) 4);
        setField(term62030, term62030.getClass(), "names", term62031);
        setLongField(term62030, term62030.getClass(), "crc", 0L);
        setLongField(term62030, term62030.getClass(), "written", 0L);
        setField(term62032, term62032.getClass(), "entry", null);
        setBooleanField(term62032, term62032.getClass(), "closed", false);
        setBooleanField(term62032, term62032.getClass(), "finished", false);
        setShortField(term62032, term62032.getClass(), "entryFormat", (short) 0);
        setField(term62032, term62032.getClass(), "names", null);
        setLongField(term62032, term62032.getClass(), "crc", 0L);
        setLongField(term62032, term62032.getClass(), "written", 0L);
        setField(term62032, term62032.getClass(), "out", null);
        setIntField(term62032, term62032.getClass(), "blockSize", 0);
        setLongField(term62032, term62032.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term62032, term62032.getClass(), "zipEncoding", null);
        setField(term62032, term62032.getClass(), "oneByte", null);
        setLongField(term62032, term62032.getClass(), "bytesWritten", 0L);
        setField(term62030, term62030.getClass(), "out", term62032);
        setIntField(term62030, term62030.getClass(), "blockSize", 0);
        setLongField(term62030, term62030.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term62034, term62034.getClass(), "name", "US-ASCII");
        setElement(term62037, 0, "");
        setElement(term62037, 1, "");
        setElement(term62037, 2, "");
        setElement(term62037, 3, "");
        setElement(term62037, 4, "");
        setElement(term62037, 5, "");
        setElement(term62037, 6, "");
        setElement(term62037, 7, "");
        setElement(term62037, 8, "");
        setElement(term62037, 9, "");
        setElement(term62037, 10, "");
        setElement(term62037, 11, "");
        setElement(term62037, 12, "");
        setElement(term62037, 13, "");
        setField(term62034, term62034.getClass(), "aliases", term62037);
        setField(term62034, term62034.getClass(), "aliasSet", null);
        setField(term62033, term62033.getClass(), "charset", term62034);
        setField(term62030, term62030.getClass(), "zipEncoding", term62033);
        setField(term62030, term62030.getClass(), "oneByte", term62052);
        setLongField(term62030, term62030.getClass(), "bytesWritten", 0L);
        term62053 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term62053, term62053.getClass(), "entry", null);
        setBooleanField(term62053, term62053.getClass(), "closed", false);
        setBooleanField(term62053, term62053.getClass(), "finished", false);
        setShortField(term62053, term62053.getClass(), "entryFormat", (short) 0);
        setField(term62053, term62053.getClass(), "names", null);
        setLongField(term62053, term62053.getClass(), "crc", 0L);
        setLongField(term62053, term62053.getClass(), "written", 0L);
        setField(term62053, term62053.getClass(), "out", null);
        setIntField(term62053, term62053.getClass(), "blockSize", 0);
        setLongField(term62053, term62053.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term62053, term62053.getClass(), "zipEncoding", null);
        setField(term62053, term62053.getClass(), "oneByte", null);
        setLongField(term62053, term62053.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term61636;
        args[1] = (short) 4;
        args[2] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62030));
        assertTrue(recursiveEquals(term61636, term62053));
    }

};


