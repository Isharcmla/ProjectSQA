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

public class BaseNCodecInputStream_read_117959115816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2848;
     Object term1718;
     Object term4973;
     Object term4974;

    public BaseNCodecInputStream_read_117959115816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2848 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        term1718 = (byte[]) newByteArray(1000);
        term4973 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        setBooleanField(term4973, term4973.getClass(), "doEncode", false);
        setField(term4973, term4973.getClass(), "baseNCodec", null);
        setField(term4973, term4973.getClass(), "singleByte", null);
        setField(term4973, term4973.getClass(), "in", null);
        term4974 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1718;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term2848, args);
        assertTrue(recursiveEquals(term2848, term4973));
        assertTrue(recursiveEquals(term1718, term4974));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


