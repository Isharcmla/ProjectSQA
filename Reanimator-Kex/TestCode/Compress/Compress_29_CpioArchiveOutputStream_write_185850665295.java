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

public class CpioArchiveOutputStream_write_185850665295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31474;
     Object term30314;
     Object term34835;
     Object term34836;

    public CpioArchiveOutputStream_write_185850665295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31474 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term31474, term31474.getClass(), "closed", false);
        term30314 = (byte[]) newByteArray(1000);
        term34835 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term34835, term34835.getClass(), "entry", null);
        setBooleanField(term34835, term34835.getClass(), "closed", false);
        setBooleanField(term34835, term34835.getClass(), "finished", false);
        setShortField(term34835, term34835.getClass(), "entryFormat", (short) 0);
        setField(term34835, term34835.getClass(), "names", null);
        setLongField(term34835, term34835.getClass(), "crc", 0L);
        setLongField(term34835, term34835.getClass(), "written", 0L);
        setField(term34835, term34835.getClass(), "out", null);
        setIntField(term34835, term34835.getClass(), "blockSize", 0);
        setLongField(term34835, term34835.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term34835, term34835.getClass(), "zipEncoding", null);
        setField(term34835, term34835.getClass(), "oneByte", null);
        setLongField(term34835, term34835.getClass(), "bytesWritten", 0L);
        term34836 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term30314;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "write", argTypes, term31474, args);
        assertTrue(recursiveEquals(term31474, term34835));
        assertTrue(recursiveEquals(term30314, term34836));
    }

};


