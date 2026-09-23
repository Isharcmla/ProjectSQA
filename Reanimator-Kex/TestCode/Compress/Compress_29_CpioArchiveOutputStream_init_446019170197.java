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

public class CpioArchiveOutputStream_init_446019170197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84401;
     Object term85310;
     Object term85333;

    public CpioArchiveOutputStream_init_446019170197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term84103 = new HashMap();
        Object term84055 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term83874 = (byte[]) newByteArray(0);
        Object term84263 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream"));
        setField(term84055, term84055.getClass(), "oneByte", term83874);
        setLongField(term84055, term84055.getClass(), "bytesWritten", 0L);
        setBooleanField(term84055, term84055.getClass(), "closed", false);
        setField(term84055, term84055.getClass(), "names", term84103);
        setLongField(term84055, term84055.getClass(), "crc", 0L);
        setLongField(term84055, term84055.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term84055, term84055.getClass(), "out", term84263);
        term84401 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap term85311 = new HashMap();
        term85310 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term85312 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term85313 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term85314 = newInstance(Class.forName("sun.nio.cs.US_ASCII"));
        Object[] term85317 = (Object[]) newArray("java.lang.String", 14);
        byte[] term85332 = (byte[]) newByteArray(1);
        setField(term85310, term85310.getClass(), "entry", null);
        setBooleanField(term85310, term85310.getClass(), "closed", false);
        setBooleanField(term85310, term85310.getClass(), "finished", false);
        setShortField(term85310, term85310.getClass(), "entryFormat", (short) 4);
        setField(term85310, term85310.getClass(), "names", term85311);
        setLongField(term85310, term85310.getClass(), "crc", 0L);
        setLongField(term85310, term85310.getClass(), "written", 0L);
        setField(term85312, term85312.getClass(), "entry", null);
        setBooleanField(term85312, term85312.getClass(), "closed", false);
        setBooleanField(term85312, term85312.getClass(), "finished", false);
        setShortField(term85312, term85312.getClass(), "entryFormat", (short) 0);
        setField(term85312, term85312.getClass(), "names", null);
        setLongField(term85312, term85312.getClass(), "crc", 0L);
        setLongField(term85312, term85312.getClass(), "written", 0L);
        setField(term85312, term85312.getClass(), "out", null);
        setIntField(term85312, term85312.getClass(), "blockSize", 0);
        setLongField(term85312, term85312.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term85312, term85312.getClass(), "zipEncoding", null);
        setField(term85312, term85312.getClass(), "oneByte", null);
        setLongField(term85312, term85312.getClass(), "bytesWritten", 0L);
        setField(term85310, term85310.getClass(), "out", term85312);
        setIntField(term85310, term85310.getClass(), "blockSize", 512);
        setLongField(term85310, term85310.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term85314, term85314.getClass(), "name", "US-ASCII");
        setElement(term85317, 0, "");
        setElement(term85317, 1, "");
        setElement(term85317, 2, "");
        setElement(term85317, 3, "");
        setElement(term85317, 4, "");
        setElement(term85317, 5, "");
        setElement(term85317, 6, "");
        setElement(term85317, 7, "");
        setElement(term85317, 8, "");
        setElement(term85317, 9, "");
        setElement(term85317, 10, "");
        setElement(term85317, 11, "");
        setElement(term85317, 12, "");
        setElement(term85317, 13, "");
        setField(term85314, term85314.getClass(), "aliases", term85317);
        setField(term85314, term85314.getClass(), "aliasSet", null);
        setField(term85313, term85313.getClass(), "charset", term85314);
        setField(term85310, term85310.getClass(), "zipEncoding", term85313);
        setField(term85310, term85310.getClass(), "oneByte", term85332);
        setLongField(term85310, term85310.getClass(), "bytesWritten", 0L);
        term85333 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term85333, term85333.getClass(), "entry", null);
        setBooleanField(term85333, term85333.getClass(), "closed", false);
        setBooleanField(term85333, term85333.getClass(), "finished", false);
        setShortField(term85333, term85333.getClass(), "entryFormat", (short) 0);
        setField(term85333, term85333.getClass(), "names", null);
        setLongField(term85333, term85333.getClass(), "crc", 0L);
        setLongField(term85333, term85333.getClass(), "written", 0L);
        setField(term85333, term85333.getClass(), "out", null);
        setIntField(term85333, term85333.getClass(), "blockSize", 0);
        setLongField(term85333, term85333.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term85333, term85333.getClass(), "zipEncoding", null);
        setField(term85333, term85333.getClass(), "oneByte", null);
        setLongField(term85333, term85333.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term84401;
        args[1] = (short) 4;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85310));
        assertTrue(recursiveEquals(term84401, term85333));
    }

};


