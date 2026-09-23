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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IOUtils_readFully_1029202860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21299;
     Object term20094;

    public IOUtils_readFully_1029202860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21299 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        Object term21427 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C"));
        setBooleanField(term21299, term21299.getClass(), "inUncompressedChunk", false);
        setField(term21299, term21299.getClass(), "currentCompressedChunk", null);
        setLongField(term21299, term21299.getClass(), "expectedChecksum", 0L);
        setField(term21299, term21299.getClass(), "checksum", term21427);
        term20094 = (byte[]) newByteArray(992);
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
        args[0] = term21299;
        args[1] = term20094;
        args[2] = 1075510985;
        args[3] = 2145760974;
        callMethod(klass, "readFully", argTypes, null, args);
    }

};


