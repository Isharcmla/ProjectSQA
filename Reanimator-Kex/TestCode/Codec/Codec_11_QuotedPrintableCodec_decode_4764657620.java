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

public class QuotedPrintableCodec_decode_4764657620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term146;
     Object term1286;
     Object term1289;
     Object term1273;

    public QuotedPrintableCodec_decode_4764657620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term138, term138.getClass(), "charset", "UTF-8");
        term146 = (byte[]) newByteArray(4);
        setByteElement(term146, 0, (byte) 83);
        setByteElement(term146, 1, (byte) 74);
        setByteElement(term146, 2, (byte) -71);
        setByteElement(term146, 3, (byte) 49);
        term1286 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term1286, term1286.getClass(), "charset", "UTF-8");
        term1289 = (byte[]) newByteArray(4);
        setByteElement(term1289, 0, (byte) 83);
        setByteElement(term1289, 1, (byte) 74);
        setByteElement(term1289, 2, (byte) -71);
        setByteElement(term1289, 3, (byte) 49);
        term1273 = (byte[]) newByteArray(4);
        setByteElement(term1273, 0, (byte) 83);
        setByteElement(term1273, 1, (byte) 74);
        setByteElement(term1273, 2, (byte) -71);
        setByteElement(term1273, 3, (byte) 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term146;
        Object retValue = callMethod(klass, "decode", argTypes, term138, args);
        assertTrue(recursiveEquals(term138, term1286));
        assertTrue(recursiveEquals(term146, term1289));
        assertTrue(recursiveEquals(retValue, term1273));
    }

};


