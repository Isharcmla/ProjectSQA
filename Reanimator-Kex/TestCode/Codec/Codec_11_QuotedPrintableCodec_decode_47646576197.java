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

public class QuotedPrintableCodec_decode_47646576197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119514;
     Object term119359;
     Object term119810;
     Object term119811;
     Object term119808;

    public QuotedPrintableCodec_decode_47646576197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119514 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term119359 = (byte[]) newByteArray(0);
        term119810 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term119810, term119810.getClass(), "charset", null);
        term119811 = (byte[]) newByteArray(0);
        term119808 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term119359;
        Object retValue = callMethod(klass, "decode", argTypes, term119514, args);
        assertTrue(recursiveEquals(term119514, term119810));
        assertTrue(recursiveEquals(term119359, term119811));
        assertTrue(recursiveEquals(retValue, term119808));
    }

};


