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

public class BaseNCodecInputStream_read_117959115841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22390;
     Object term21243;

    public BaseNCodecInputStream_read_117959115841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22390 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Object term22472 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term22472, term22472.getClass(), "buffer", null);
        setField(term22390, term22390.getClass(), "baseNCodec", term22472);
        setBooleanField(term22390, term22390.getClass(), "doEncode", true);
        term21243 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term21243;
        args[1] = 0;
        args[2] = 1;
        try {
            callMethod(klass, "read", argTypes, term22390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


