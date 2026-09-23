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
import java.io.IOException;
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BitInputStream_readBits_3411614678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19085;

    public BitInputStream_readBits_3411614678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19085 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term19231 = newInstance(Class.forName("org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream"));
        Object term19291 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setIntField(term19085, term19085.getClass(), "bitsCachedSize", -1);
        setField(term19231, term19231.getClass(), "in", term19291);
        setField(term19085, term19085.getClass(), "in", term19231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "readBits", argTypes, term19085, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


