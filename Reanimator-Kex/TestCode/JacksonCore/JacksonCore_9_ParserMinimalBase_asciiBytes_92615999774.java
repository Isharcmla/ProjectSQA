package com.fasterxml.jackson.core.base;

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
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.base.EqualityUtils.*;

public class ParserMinimalBase_asciiBytes_92615999774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19365;

    public ParserMinimalBase_asciiBytes_92615999774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19365 = (byte[]) newByteArray(10);
        setByteElement(term19365, 0, (byte) 77);
        setByteElement(term19365, 1, (byte) 120);
        setByteElement(term19365, 2, (byte) 108);
        setByteElement(term19365, 3, (byte) 115);
        setByteElement(term19365, 4, (byte) 122);
        setByteElement(term19365, 5, (byte) 89);
        setByteElement(term19365, 6, (byte) 86);
        setByteElement(term19365, 7, (byte) 122);
        setByteElement(term19365, 8, (byte) 82);
        setByteElement(term19365, 9, (byte) 102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        Object retValue = callMethod(klass, "_asciiBytes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term19365));
    }

};


