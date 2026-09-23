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

public class IOUtils_readFully_1029202871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27020;
     Object term25814;

    public IOUtils_readFully_1029202871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27020 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        Object term27148 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C"));
        setBooleanField(term27020, term27020.getClass(), "inUncompressedChunk", true);
        setIntField(term27020, term27020.getClass(), "uncompressedBytesRemaining", 0);
        setLongField(term27020, term27020.getClass(), "expectedChecksum", 0L);
        setField(term27020, term27020.getClass(), "checksum", term27148);
        term25814 = (byte[]) newByteArray(992);
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
        args[0] = term27020;
        args[1] = term25814;
        args[2] = 1075510985;
        args[3] = 2145760974;
        callMethod(klass, "readFully", argTypes, null, args);
    }

};


