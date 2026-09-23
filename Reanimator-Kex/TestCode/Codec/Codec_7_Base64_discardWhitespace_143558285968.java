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

public class Base64_discardWhitespace_143558285968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1935;
     Object term10785;
     Object term10779;

    public Base64_discardWhitespace_143558285968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1935 = (byte[]) newByteArray(2);
        setByteElement(term1935, 0, (byte) 115);
        setByteElement(term1935, 1, (byte) 96);
        term10785 = (byte[]) newByteArray(2);
        setByteElement(term10785, 0, (byte) 115);
        setByteElement(term10785, 1, (byte) 96);
        term10779 = (byte[]) newByteArray(2);
        setByteElement(term10779, 0, (byte) 115);
        setByteElement(term10779, 1, (byte) 96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1935;
        Object retValue = callMethod(klass, "discardWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1935, term10785));
        assertTrue(recursiveEquals(retValue, term10779));
    }

};


