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

public class Base64InputStream_read_30126145440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19662;

    public Base64InputStream_read_30126145440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19662 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term19528 = (byte[]) newByteArray(1);
        Object term19744 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term19662, term19662.getClass(), "singleByte", term19528);
        setField(term19744, term19744.getClass(), "buffer", null);
        setField(term19662, term19662.getClass(), "base64", term19744);
        setBooleanField(term19662, term19662.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term19662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


