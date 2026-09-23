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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BitInputStream_readBits_341161467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term92;

    public BitInputStream_readBits_341161467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term77 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term76, term76.getClass(), "in", null);
        setField(term77, term77.getClass(), "name", "xxtlPwDYFs");
        setField(term76, term76.getClass(), "byteOrder", term77);
        setLongField(term76, term76.getClass(), "bitsCached", -8257434502486459194L);
        setIntField(term76, term76.getClass(), "bitsCachedSize", 1484323161);
        term92 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term92;
        try {
            callMethod(klass, "readBits", argTypes, term76, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


