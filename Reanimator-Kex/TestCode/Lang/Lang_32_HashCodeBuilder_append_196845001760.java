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

public class HashCodeBuilder_append_196845001760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;
     Object term385;
     Object term5451;
     Object term5452;
     Object term5429;

    public HashCodeBuilder_append_196845001760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term382, term382.getClass(), "iConstant", 37);
        setIntField(term382, term382.getClass(), "iTotal", 17);
        term385 = (float[]) newFloatArray(6);
        setFloatElement(term385, 0, 0.2707036F);
        setFloatElement(term385, 1, 0.3455959F);
        setFloatElement(term385, 2, 0.09123778F);
        setFloatElement(term385, 3, 0.5523636F);
        setFloatElement(term385, 4, 0.8564069F);
        setFloatElement(term385, 5, 0.5446086F);
        term5451 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5451, term5451.getClass(), "iConstant", 37);
        setIntField(term5451, term5451.getClass(), "iTotal", -1968656740);
        term5452 = (float[]) newFloatArray(6);
        setFloatElement(term5452, 0, 0.2707036F);
        setFloatElement(term5452, 1, 0.3455959F);
        setFloatElement(term5452, 2, 0.09123778F);
        setFloatElement(term5452, 3, 0.5523636F);
        setFloatElement(term5452, 4, 0.8564069F);
        setFloatElement(term5452, 5, 0.5446086F);
        term5429 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5429, term5429.getClass(), "iConstant", 37);
        setIntField(term5429, term5429.getClass(), "iTotal", -1968656740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term385;
        Object retValue = callMethod(klass, "append", argTypes, term382, args);
        assertTrue(recursiveEquals(term382, term5451));
        assertTrue(recursiveEquals(term385, term5452));
        assertTrue(recursiveEquals(retValue, term5429));
    }

};


