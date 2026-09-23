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

public class BaseNCodecInputStream_read_1178397596119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136029;

    public BaseNCodecInputStream_read_1178397596119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136029 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term135832 = (byte[]) newByteArray(8);
        Object term136111 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term135842 = (byte[]) newByteArray(8);
        setField(term136029, term136029.getClass(), "singleByte", term135832);
        setField(term136111, term136111.getClass(), "buffer", term135842);
        setIntField(term136111, term136111.getClass(), "pos", -33554561);
        setIntField(term136111, term136111.getClass(), "readPos", 33554816);
        setField(term136029, term136029.getClass(), "baseNCodec", term136111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term136029, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


