package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;

public class HashCodeBuilder_append_114816903458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;
     Object term372;
     Object term5416;
     Object term5417;
     Object term5398;

    public HashCodeBuilder_append_114816903458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term369, term369.getClass(), "iConstant", 37);
        setIntField(term369, term369.getClass(), "iTotal", 17);
        term372 = (double[]) newDoubleArray(2);
        setDoubleElement(term372, 0, 0.3455959125047594);
        setDoubleElement(term372, 1, 0.5523635872663106);
        term5416 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5416, term5416.getClass(), "iConstant", 37);
        setIntField(term5416, term5416.getClass(), "iTotal", 1457552667);
        term5417 = (double[]) newDoubleArray(2);
        setDoubleElement(term5417, 0, 0.3455959125047594);
        setDoubleElement(term5417, 1, 0.5523635872663106);
        term5398 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5398, term5398.getClass(), "iConstant", 37);
        setIntField(term5398, term5398.getClass(), "iTotal", 1457552667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term372;
        Object retValue = callMethod(klass, "append", argTypes, term369, args);
        assertTrue(recursiveEquals(term369, term5416));
        assertTrue(recursiveEquals(term372, term5417));
        assertTrue(recursiveEquals(retValue, term5398));
    }

};


