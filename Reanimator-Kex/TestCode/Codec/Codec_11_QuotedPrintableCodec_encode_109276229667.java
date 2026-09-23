package org.apache.commons.codec.net;

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
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.net.EqualityUtils.*;

public class QuotedPrintableCodec_encode_109276229667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20469;
     Object term20352;
     Object term20496;
     Object term20497;
     Object term20494;

    public QuotedPrintableCodec_encode_109276229667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20469 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term20352 = (byte[]) newByteArray(0);
        term20496 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term20496, term20496.getClass(), "charset", null);
        term20497 = (byte[]) newByteArray(0);
        term20494 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term20352;
        Object retValue = callMethod(klass, "encode", argTypes, term20469, args);
        assertTrue(recursiveEquals(term20469, term20496));
        assertTrue(recursiveEquals(term20352, term20497));
        assertTrue(recursiveEquals(retValue, term20494));
    }

};


