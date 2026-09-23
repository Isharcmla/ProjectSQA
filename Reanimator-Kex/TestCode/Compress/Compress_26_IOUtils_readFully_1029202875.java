package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IOUtils_readFully_1029202875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28733;
     Object term28525;

    public IOUtils_readFully_1029202875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28733 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        setBooleanField(term28733, term28733.getClass(), "inUncompressedChunk", false);
        setField(term28733, term28733.getClass(), "currentCompressedChunk", null);
        setLongField(term28733, term28733.getClass(), "expectedChecksum", 2147483648L);
        term28525 = (byte[]) newByteArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term28733;
        args[1] = term28525;
        args[2] = 1073742847;
        args[3] = 2147483647;
        try {
            callMethod(klass, "readFully", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


