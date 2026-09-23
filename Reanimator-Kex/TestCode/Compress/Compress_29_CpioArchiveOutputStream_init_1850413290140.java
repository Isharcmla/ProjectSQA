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

public class CpioArchiveOutputStream_init_1850413290140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60075;
     Object term60469;
     Object term60492;

    public CpioArchiveOutputStream_init_1850413290140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term59875 = new HashMap();
        Object term59827 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term59646 = (byte[]) newByteArray(0);
        Object term59937 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        setField(term59827, term59827.getClass(), "oneByte", term59646);
        setLongField(term59827, term59827.getClass(), "bytesWritten", 0L);
        setBooleanField(term59827, term59827.getClass(), "closed", false);
        setField(term59827, term59827.getClass(), "names", term59875);
        setLongField(term59827, term59827.getClass(), "crc", 0L);
        setLongField(term59827, term59827.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term59827, term59827.getClass(), "out", term59937);
        term60075 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap term60470 = new HashMap();
        term60469 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term60471 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term60472 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term60473 = newInstance(Class.forName("sun.nio.cs.US_ASCII"));
        Object[] term60476 = (Object[]) newArray("java.lang.String", 14);
        byte[] term60491 = (byte[]) newByteArray(1);
        setField(term60469, term60469.getClass(), "entry", null);
        setBooleanField(term60469, term60469.getClass(), "closed", false);
        setBooleanField(term60469, term60469.getClass(), "finished", false);
        setShortField(term60469, term60469.getClass(), "entryFormat", (short) 8);
        setField(term60469, term60469.getClass(), "names", term60470);
        setLongField(term60469, term60469.getClass(), "crc", 0L);
        setLongField(term60469, term60469.getClass(), "written", 0L);
        setField(term60471, term60471.getClass(), "entry", null);
        setBooleanField(term60471, term60471.getClass(), "closed", false);
        setBooleanField(term60471, term60471.getClass(), "finished", false);
        setShortField(term60471, term60471.getClass(), "entryFormat", (short) 0);
        setField(term60471, term60471.getClass(), "names", null);
        setLongField(term60471, term60471.getClass(), "crc", 0L);
        setLongField(term60471, term60471.getClass(), "written", 0L);
        setField(term60471, term60471.getClass(), "out", null);
        setIntField(term60471, term60471.getClass(), "blockSize", 0);
        setLongField(term60471, term60471.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term60471, term60471.getClass(), "zipEncoding", null);
        setField(term60471, term60471.getClass(), "oneByte", null);
        setLongField(term60471, term60471.getClass(), "bytesWritten", 0L);
        setField(term60469, term60469.getClass(), "out", term60471);
        setIntField(term60469, term60469.getClass(), "blockSize", 0);
        setLongField(term60469, term60469.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term60473, term60473.getClass(), "name", "US-ASCII");
        setElement(term60476, 0, "");
        setElement(term60476, 1, "");
        setElement(term60476, 2, "");
        setElement(term60476, 3, "");
        setElement(term60476, 4, "");
        setElement(term60476, 5, "");
        setElement(term60476, 6, "");
        setElement(term60476, 7, "");
        setElement(term60476, 8, "");
        setElement(term60476, 9, "");
        setElement(term60476, 10, "");
        setElement(term60476, 11, "");
        setElement(term60476, 12, "");
        setElement(term60476, 13, "");
        setField(term60473, term60473.getClass(), "aliases", term60476);
        setField(term60473, term60473.getClass(), "aliasSet", null);
        setField(term60472, term60472.getClass(), "charset", term60473);
        setField(term60469, term60469.getClass(), "zipEncoding", term60472);
        setField(term60469, term60469.getClass(), "oneByte", term60491);
        setLongField(term60469, term60469.getClass(), "bytesWritten", 0L);
        term60492 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term60492, term60492.getClass(), "entry", null);
        setBooleanField(term60492, term60492.getClass(), "closed", false);
        setBooleanField(term60492, term60492.getClass(), "finished", false);
        setShortField(term60492, term60492.getClass(), "entryFormat", (short) 0);
        setField(term60492, term60492.getClass(), "names", null);
        setLongField(term60492, term60492.getClass(), "crc", 0L);
        setLongField(term60492, term60492.getClass(), "written", 0L);
        setField(term60492, term60492.getClass(), "out", null);
        setIntField(term60492, term60492.getClass(), "blockSize", 0);
        setLongField(term60492, term60492.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term60492, term60492.getClass(), "zipEncoding", null);
        setField(term60492, term60492.getClass(), "oneByte", null);
        setLongField(term60492, term60492.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term60075;
        args[1] = (short) 8;
        args[2] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term60469));
        assertTrue(recursiveEquals(term60075, term60492));
    }

};


