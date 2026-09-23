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
import java.util.HashMap;
import java.lang.Object;

public class CpioArchiveOutputStream_init_53926348223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3262;

    public CpioArchiveOutputStream_init_53926348223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3263 = new HashMap();
        term3262 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term3264 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term3265 = newInstance(Class.forName("sun.nio.cs.US_ASCII"));
        Object[] term3268 = (Object[]) newArray("java.lang.String", 14);
        byte[] term3283 = (byte[]) newByteArray(1);
        setField(term3262, term3262.getClass(), "entry", null);
        setBooleanField(term3262, term3262.getClass(), "closed", false);
        setBooleanField(term3262, term3262.getClass(), "finished", false);
        setShortField(term3262, term3262.getClass(), "entryFormat", (short) 1);
        setField(term3262, term3262.getClass(), "names", term3263);
        setLongField(term3262, term3262.getClass(), "crc", 0L);
        setLongField(term3262, term3262.getClass(), "written", 0L);
        setField(term3262, term3262.getClass(), "out", null);
        setIntField(term3262, term3262.getClass(), "blockSize", 512);
        setLongField(term3262, term3262.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term3265, term3265.getClass(), "name", "US-ASCII");
        setElement(term3268, 0, "");
        setElement(term3268, 1, "");
        setElement(term3268, 2, "");
        setElement(term3268, 3, "");
        setElement(term3268, 4, "");
        setElement(term3268, 5, "");
        setElement(term3268, 6, "");
        setElement(term3268, 7, "");
        setElement(term3268, 8, "");
        setElement(term3268, 9, "");
        setElement(term3268, 10, "");
        setElement(term3268, 11, "");
        setElement(term3268, 12, "");
        setElement(term3268, 13, "");
        setField(term3265, term3265.getClass(), "aliases", term3268);
        setField(term3265, term3265.getClass(), "aliasSet", null);
        setField(term3264, term3264.getClass(), "charset", term3265);
        setField(term3262, term3262.getClass(), "zipEncoding", term3264);
        setField(term3262, term3262.getClass(), "oneByte", term3283);
        setLongField(term3262, term3262.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3262));
    }

};


