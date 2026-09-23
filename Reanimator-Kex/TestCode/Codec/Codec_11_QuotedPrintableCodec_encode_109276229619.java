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

public class QuotedPrintableCodec_encode_109276229619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;
     Object term126;
     Object term1226;
     Object term1229;
     Object term1210;

    public QuotedPrintableCodec_encode_109276229619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term118, term118.getClass(), "charset", "UTF-8");
        term126 = (byte[]) newByteArray(3);
        setByteElement(term126, 0, (byte) 79);
        setByteElement(term126, 1, (byte) -119);
        setByteElement(term126, 2, (byte) -66);
        term1226 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term1226, term1226.getClass(), "charset", "UTF-8");
        term1229 = (byte[]) newByteArray(3);
        setByteElement(term1229, 0, (byte) 79);
        setByteElement(term1229, 1, (byte) -119);
        setByteElement(term1229, 2, (byte) -66);
        term1210 = (byte[]) newByteArray(7);
        setByteElement(term1210, 0, (byte) 79);
        setByteElement(term1210, 1, (byte) 61);
        setByteElement(term1210, 2, (byte) 56);
        setByteElement(term1210, 3, (byte) 57);
        setByteElement(term1210, 4, (byte) 61);
        setByteElement(term1210, 5, (byte) 66);
        setByteElement(term1210, 6, (byte) 69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term126;
        Object retValue = callMethod(klass, "encode", argTypes, term118, args);
        assertTrue(recursiveEquals(term118, term1226));
        assertTrue(recursiveEquals(term126, term1229));
        assertTrue(recursiveEquals(retValue, term1210));
    }

};


