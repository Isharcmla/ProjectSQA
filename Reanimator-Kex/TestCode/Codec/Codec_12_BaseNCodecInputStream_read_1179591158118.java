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

public class BaseNCodecInputStream_read_1179591158118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133748;
     Object term128576;

    public BaseNCodecInputStream_read_1179591158118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133748 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Object term133830 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term129580 = (byte[]) newByteArray(1000);
        setField(term133830, term133830.getClass(), "buffer", term129580);
        setIntField(term133830, term133830.getClass(), "pos", 0);
        setIntField(term133830, term133830.getClass(), "readPos", 0);
        setField(term133748, term133748.getClass(), "baseNCodec", term133830);
        setBooleanField(term133748, term133748.getClass(), "doEncode", true);
        term128576 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term128576;
        args[1] = 0;
        args[2] = 3;
        try {
            callMethod(klass, "read", argTypes, term133748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


