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

public class ParserMinimalBase_asciiBytes_92615999796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21677;

    public ParserMinimalBase_asciiBytes_92615999796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21677 = (byte[]) newByteArray(10);
        setByteElement(term21677, 0, (byte) 104);
        setByteElement(term21677, 1, (byte) 78);
        setByteElement(term21677, 2, (byte) 120);
        setByteElement(term21677, 3, (byte) 87);
        setByteElement(term21677, 4, (byte) 97);
        setByteElement(term21677, 5, (byte) 72);
        setByteElement(term21677, 6, (byte) 99);
        setByteElement(term21677, 7, (byte) 102);
        setByteElement(term21677, 8, (byte) 104);
        setByteElement(term21677, 9, (byte) 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        Object retValue = callMethod(klass, "_asciiBytes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term21677));
    }

};


