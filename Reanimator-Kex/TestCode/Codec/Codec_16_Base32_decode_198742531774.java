package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Base32_decode_198742531774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47404;
     Object term47510;

    public Base32_decode_198742531774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47404 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term47510 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term47510, term47510.getClass(), "eof", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = 0;
        args[2] = 1073741824;
        args[3] = term47510;
        try {
            callMethod(klass, "decode", argTypes, term47404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


