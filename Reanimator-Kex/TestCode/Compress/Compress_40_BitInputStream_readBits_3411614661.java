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

public class BitInputStream_readBits_3411614661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13375;

    public BitInputStream_readBits_3411614661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13375 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term13541 = newInstance(Class.forName("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream"));
        setIntField(term13375, term13375.getClass(), "bitsCachedSize", -1);
        setField(term13541, term13541.getClass(), "oneByte", null);
        setBooleanField(term13541, term13541.getClass(), "inUncompressedChunk", true);
        setIntField(term13541, term13541.getClass(), "uncompressedBytesRemaining", -2147483645);
        setField(term13375, term13375.getClass(), "in", term13541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "readBits", argTypes, term13375, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


