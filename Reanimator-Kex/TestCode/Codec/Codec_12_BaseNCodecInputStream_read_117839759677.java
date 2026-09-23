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

public class BaseNCodecInputStream_read_117839759677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80399;

    public BaseNCodecInputStream_read_117839759677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80399 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term80202 = (byte[]) newByteArray(8);
        Object term80481 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term80212 = (byte[]) newByteArray(8);
        setField(term80399, term80399.getClass(), "singleByte", term80202);
        setField(term80481, term80481.getClass(), "buffer", term80212);
        setIntField(term80481, term80481.getClass(), "pos", -33554561);
        setIntField(term80481, term80481.getClass(), "readPos", 33554816);
        setField(term80399, term80399.getClass(), "baseNCodec", term80481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term80399, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


