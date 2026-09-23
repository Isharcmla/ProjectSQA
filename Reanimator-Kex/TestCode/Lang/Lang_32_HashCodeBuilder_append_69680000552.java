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

public class HashCodeBuilder_append_69680000552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;
     Object term323;
     Object term5319;
     Object term5320;
     Object term5300;

    public HashCodeBuilder_append_69680000552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term320, term320.getClass(), "iConstant", 37);
        setIntField(term320, term320.getClass(), "iTotal", 17);
        term323 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term323, 0, true);
        setBooleanElement(term323, 1, true);
        setBooleanElement(term323, 3, true);
        term5319 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5319, term5319.getClass(), "iConstant", 37);
        setIntField(term5319, term5319.getClass(), "iTotal", 31860774);
        term5320 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term5320, 0, true);
        setBooleanElement(term5320, 1, true);
        setBooleanElement(term5320, 3, true);
        term5300 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5300, term5300.getClass(), "iConstant", 37);
        setIntField(term5300, term5300.getClass(), "iTotal", 31860774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term323;
        Object retValue = callMethod(klass, "append", argTypes, term320, args);
        assertTrue(recursiveEquals(term320, term5319));
        assertTrue(recursiveEquals(term323, term5320));
        assertTrue(recursiveEquals(retValue, term5300));
    }

};


