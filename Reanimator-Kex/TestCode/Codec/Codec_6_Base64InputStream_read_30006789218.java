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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base64InputStream_read_30006789218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3511;
     Object term3394;
     Object term3639;
     Object term3640;

    public Base64InputStream_read_30006789218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3511 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        term3394 = (byte[]) newByteArray(0);
        term3639 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        setBooleanField(term3639, term3639.getClass(), "doEncode", false);
        setField(term3639, term3639.getClass(), "base64", null);
        setField(term3639, term3639.getClass(), "singleByte", null);
        setField(term3639, term3639.getClass(), "in", null);
        term3640 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3394;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term3511, args);
        assertTrue(recursiveEquals(term3511, term3639));
        assertTrue(recursiveEquals(term3394, term3640));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


