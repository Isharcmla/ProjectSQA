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

public class Base64InputStream_read_30126145443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32140;

    public Base64InputStream_read_30126145443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32140 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term32004 = (byte[]) newByteArray(1);
        Object term32222 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term32140, term32140.getClass(), "singleByte", term32004);
        setField(term32222, term32222.getClass(), "buffer", null);
        setField(term32140, term32140.getClass(), "base64", term32222);
        setBooleanField(term32140, term32140.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term32140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


