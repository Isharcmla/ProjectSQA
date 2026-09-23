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

public class BitInputStream_readBits_3411614649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9534;

    public BitInputStream_readBits_3411614649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9534 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term9700 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        setIntField(term9534, term9534.getClass(), "bitsCachedSize", -1);
        setField(term9700, term9700.getClass(), "oneByte", null);
        setBooleanField(term9700, term9700.getClass(), "inUncompressedChunk", true);
        setField(term9534, term9534.getClass(), "in", term9700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "readBits", argTypes, term9534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


