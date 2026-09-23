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

public class QuotedPrintableCodec_encode_1092762296263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192539;
     Object term192372;
     Object term192602;
     Object term192603;
     Object term192597;

    public QuotedPrintableCodec_encode_1092762296263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192539 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term192372 = (byte[]) newByteArray(1);
        setByteElement(term192372, 0, (byte) -128);
        term192602 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term192602, term192602.getClass(), "charset", null);
        term192603 = (byte[]) newByteArray(1);
        setByteElement(term192603, 0, (byte) -128);
        term192597 = (byte[]) newByteArray(3);
        setByteElement(term192597, 0, (byte) 61);
        setByteElement(term192597, 1, (byte) 56);
        setByteElement(term192597, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term192372;
        Object retValue = callMethod(klass, "encode", argTypes, term192539, args);
        assertTrue(recursiveEquals(term192539, term192602));
        assertTrue(recursiveEquals(term192372, term192603));
        assertTrue(recursiveEquals(retValue, term192597));
    }

};


