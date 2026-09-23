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

public class BitInputStream_readBits_3411614657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12699;

    public BitInputStream_readBits_3411614657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12699 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term12865 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        Object term12993 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.PureJavaCrc32C"));
        setIntField(term12699, term12699.getClass(), "bitsCachedSize", -1);
        setField(term12865, term12865.getClass(), "oneByte", null);
        setBooleanField(term12865, term12865.getClass(), "inUncompressedChunk", true);
        setIntField(term12865, term12865.getClass(), "uncompressedBytesRemaining", 0);
        setLongField(term12865, term12865.getClass(), "expectedChecksum", 0L);
        setField(term12865, term12865.getClass(), "checksum", term12993);
        setField(term12699, term12699.getClass(), "in", term12865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "readBits", argTypes, term12699, args);
    }

};


