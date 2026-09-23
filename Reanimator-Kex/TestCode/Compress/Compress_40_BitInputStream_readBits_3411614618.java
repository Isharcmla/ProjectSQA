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
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class BitInputStream_readBits_3411614618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2048;
     Object term2586;

    public BitInputStream_readBits_3411614618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2048 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term2090 = newInstance(Class.forName("java.nio.ByteOrder"));
        setIntField(term2048, term2048.getClass(), "bitsCachedSize", 0);
        setField(term2090, term2090.getClass(), "name", "LITTLE_ENDIAN");
        setField(term2048, term2048.getClass(), "byteOrder", term2090);
        term2586 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term2587 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term2586, term2586.getClass(), "in", null);
        setField(term2587, term2587.getClass(), "name", "LITTLE_ENDIAN");
        setField(term2586, term2586.getClass(), "byteOrder", term2587);
        setLongField(term2586, term2586.getClass(), "bitsCached", 0L);
        setIntField(term2586, term2586.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "readBits", argTypes, term2048, args);
        assertTrue(recursiveEquals(term2048, term2586));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


