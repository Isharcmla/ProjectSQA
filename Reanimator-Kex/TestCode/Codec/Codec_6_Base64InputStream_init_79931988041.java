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
import java.lang.IllegalArgumentException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Base64InputStream_init_79931988041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21503;
     Object term19750;

    public Base64InputStream_init_79931988041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21381 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term21435 = newInstance(Class.forName("java.io.PipedInputStream"));
        setField(term21381, term21381.getClass(), "in", term21435);
        setField(term21381, term21381.getClass(), "singleByte", null);
        setBooleanField(term21381, term21381.getClass(), "doEncode", false);
        term21503 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        term19750 = (byte[]) newByteArray(488);
        setByteElement(term19750, 0, (byte) -128);
        setByteElement(term19750, 1, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term21503;
        args[1] = true;
        args[2] = 1;
        args[3] = term19750;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


