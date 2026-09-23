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

public class BaseNCodecInputStream_read_117959115883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96078;
     Object term90910;

    public BaseNCodecInputStream_read_117959115883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96078 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Object term96160 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term91914 = (byte[]) newByteArray(1000);
        setField(term96160, term96160.getClass(), "buffer", term91914);
        setIntField(term96160, term96160.getClass(), "pos", 16383);
        setIntField(term96160, term96160.getClass(), "readPos", -33);
        setField(term96078, term96078.getClass(), "baseNCodec", term96160);
        term90910 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term90910;
        args[1] = 0;
        args[2] = 35;
        try {
            callMethod(klass, "read", argTypes, term96078, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


