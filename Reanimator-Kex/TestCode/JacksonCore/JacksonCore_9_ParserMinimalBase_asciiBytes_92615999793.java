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

public class ParserMinimalBase_asciiBytes_92615999793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20719;

    public ParserMinimalBase_asciiBytes_92615999793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20719 = (byte[]) newByteArray(7);
        setByteElement(term20719, 0, (byte) 32);
        setByteElement(term20719, 1, (byte) 32);
        setByteElement(term20719, 2, (byte) 32);
        setByteElement(term20719, 3, (byte) 32);
        setByteElement(term20719, 4, (byte) 32);
        setByteElement(term20719, 5, (byte) 2);
        setByteElement(term20719, 6, (byte) 32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "     \u0002 ";
        Object retValue = callMethod(klass, "_asciiBytes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term20719));
    }

};


