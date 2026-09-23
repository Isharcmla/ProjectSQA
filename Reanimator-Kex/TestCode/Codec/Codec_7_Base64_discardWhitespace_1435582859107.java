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

public class Base64_discardWhitespace_1435582859107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26296;
     Object term123519;
     Object term122538;

    public Base64_discardWhitespace_1435582859107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26296 = (byte[]) newByteArray(490);
        setByteElement(term26296, 0, (byte) -128);
        setByteElement(term26296, 1, (byte) 10);
        term123519 = (byte[]) newByteArray(490);
        setByteElement(term123519, 0, (byte) -128);
        setByteElement(term123519, 1, (byte) 10);
        term122538 = (byte[]) newByteArray(489);
        setByteElement(term122538, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term26296;
        Object retValue = callMethod(klass, "discardWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term26296, term123519));
        assertTrue(recursiveEquals(retValue, term122538));
    }

};


