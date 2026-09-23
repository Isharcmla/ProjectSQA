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

public class Base64InputStream_read_30006789246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45761;
     Object term44625;

    public Base64InputStream_read_30006789246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45761 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term45843 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term45843, term45843.getClass(), "buffer", null);
        setField(term45761, term45761.getClass(), "base64", term45843);
        setBooleanField(term45761, term45761.getClass(), "doEncode", true);
        term44625 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term44625;
        args[1] = 0;
        args[2] = 1;
        try {
            callMethod(klass, "read", argTypes, term45761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


