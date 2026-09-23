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
import java.lang.Object;

public class BaseNCodecInputStream_read_117959115853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44335;
     Object term39163;

    public BaseNCodecInputStream_read_117959115853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44335 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Object term44417 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term40167 = (byte[]) newByteArray(1000);
        setField(term44417, term44417.getClass(), "buffer", term40167);
        setIntField(term44417, term44417.getClass(), "pos", 0);
        setIntField(term44417, term44417.getClass(), "readPos", 0);
        setField(term44335, term44335.getClass(), "baseNCodec", term44417);
        setBooleanField(term44335, term44335.getClass(), "doEncode", true);
        term39163 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term39163;
        args[1] = 0;
        args[2] = 3;
        try {
            callMethod(klass, "read", argTypes, term44335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


