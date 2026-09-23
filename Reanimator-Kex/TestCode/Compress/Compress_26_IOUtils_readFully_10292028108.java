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
import java.lang.Object;

public class IOUtils_readFully_10292028108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39891;
     Object term39676;

    public IOUtils_readFully_10292028108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39891 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        Object term40045 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream"));
        setBooleanField(term39891, term39891.getClass(), "inUncompressedChunk", false);
        setLongField(term40045, term40045.getClass(), "bytesRead", 0L);
        setBooleanField(term40045, term40045.getClass(), "endReached", false);
        setIntField(term40045, term40045.getClass(), "writeIndex", 2142318310);
        setIntField(term40045, term40045.getClass(), "readIndex", 0);
        setField(term39891, term39891.getClass(), "currentCompressedChunk", term40045);
        term39676 = (byte[]) newByteArray(0);
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
        args[0] = term39891;
        args[1] = term39676;
        args[2] = 1087438255;
        args[3] = 2142318310;
        try {
            callMethod(klass, "readFully", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


