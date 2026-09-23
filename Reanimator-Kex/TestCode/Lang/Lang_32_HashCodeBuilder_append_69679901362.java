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

public class HashCodeBuilder_append_69679901362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term406;
     Object term5497;
     Object term5498;
     Object term5472;

    public HashCodeBuilder_append_69679901362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term403, term403.getClass(), "iConstant", 37);
        setIntField(term403, term403.getClass(), "iTotal", 17);
        term406 = (int[]) newIntArray(7);
        setIntElement(term406, 0, -522618178);
        setIntElement(term406, 1, 1134449235);
        setIntElement(term406, 2, -883034806);
        setIntElement(term406, 3, 1585847225);
        setIntElement(term406, 4, 597278769);
        setIntElement(term406, 5, -1685132342);
        setIntElement(term406, 6, -1456670397);
        term5497 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5497, term5497.getClass(), "iConstant", 37);
        setIntField(term5497, term5497.getClass(), "iTotal", -17247241);
        term5498 = (int[]) newIntArray(7);
        setIntElement(term5498, 0, -522618178);
        setIntElement(term5498, 1, 1134449235);
        setIntElement(term5498, 2, -883034806);
        setIntElement(term5498, 3, 1585847225);
        setIntElement(term5498, 4, 597278769);
        setIntElement(term5498, 5, -1685132342);
        setIntElement(term5498, 6, -1456670397);
        term5472 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5472, term5472.getClass(), "iConstant", 37);
        setIntField(term5472, term5472.getClass(), "iTotal", -17247241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term406;
        Object retValue = callMethod(klass, "append", argTypes, term403, args);
        assertTrue(recursiveEquals(term403, term5497));
        assertTrue(recursiveEquals(term406, term5498));
        assertTrue(recursiveEquals(retValue, term5472));
    }

};


