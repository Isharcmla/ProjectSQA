package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ObjectReader_detectBindAndClose_948151085239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791;
     Object term799;
     Object term801;

    public ObjectReader_detectBindAndClose_948151085239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791 = (byte[]) newByteArray(7);
        setByteElement(term791, 0, (byte) 74);
        setByteElement(term791, 1, (byte) -71);
        setByteElement(term791, 2, (byte) 49);
        setByteElement(term791, 3, (byte) -54);
        setByteElement(term791, 4, (byte) 67);
        setByteElement(term791, 5, (byte) 78);
        setByteElement(term791, 6, (byte) 87);
        term799 = new Integer(1227103734);
        term801 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term791;
        args[1] = term799;
        args[2] = term801;
        try {
            callMethod(klass, "_detectBindAndClose", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


