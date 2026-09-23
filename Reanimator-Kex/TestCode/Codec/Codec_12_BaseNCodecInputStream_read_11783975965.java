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

public class BaseNCodecInputStream_read_11783975965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public BaseNCodecInputStream_read_11783975965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term5 = (byte[]) newByteArray(5);
        setBooleanField(term3, term3.getClass(), "doEncode", false);
        setField(term3, term3.getClass(), "baseNCodec", null);
        setByteElement(term5, 0, (byte) 47);
        setByteElement(term5, 1, (byte) 48);
        setByteElement(term5, 2, (byte) 89);
        setByteElement(term5, 3, (byte) 75);
        setByteElement(term5, 4, (byte) 18);
        setField(term3, term3.getClass(), "singleByte", term5);
        setField(term3, term3.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


