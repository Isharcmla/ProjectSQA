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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseNCodecInputStream_read_1178397596111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125480;

    public BaseNCodecInputStream_read_1178397596111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125480 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term125283 = (byte[]) newByteArray(8);
        Object term125562 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term125293 = (byte[]) newByteArray(8);
        setField(term125480, term125480.getClass(), "singleByte", term125283);
        setField(term125562, term125562.getClass(), "buffer", term125293);
        setIntField(term125562, term125562.getClass(), "pos", -33554561);
        setIntField(term125562, term125562.getClass(), "readPos", 33554816);
        setField(term125480, term125480.getClass(), "baseNCodec", term125562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term125480, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


