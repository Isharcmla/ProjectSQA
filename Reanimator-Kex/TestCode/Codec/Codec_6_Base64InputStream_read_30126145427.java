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

public class Base64InputStream_read_30126145427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8139;

    public Base64InputStream_read_30126145427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8139 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term8010 = (byte[]) newByteArray(1);
        Object term8221 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term8139, term8139.getClass(), "singleByte", term8010);
        setField(term8221, term8221.getClass(), "buffer", null);
        setField(term8139, term8139.getClass(), "base64", term8221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term8139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


