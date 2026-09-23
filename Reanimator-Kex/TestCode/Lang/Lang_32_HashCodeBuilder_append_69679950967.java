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
import java.lang.Short;

public class HashCodeBuilder_append_69679950967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;
     Object term449;
     Object term5587;
     Object term5583;

    public HashCodeBuilder_append_69679950967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term446, term446.getClass(), "iConstant", 37);
        setIntField(term446, term446.getClass(), "iTotal", 17);
        term449 = new Short((short) 9519);
        term5587 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5587, term5587.getClass(), "iConstant", 37);
        setIntField(term5587, term5587.getClass(), "iTotal", 10148);
        term5583 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5583, term5583.getClass(), "iConstant", 37);
        setIntField(term5583, term5583.getClass(), "iTotal", 10148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term449;
        Object retValue = callMethod(klass, "append", argTypes, term446, args);
        assertTrue(recursiveEquals(term446, term5587));
        assertTrue(recursiveEquals(term449, (short) 9519));
        assertTrue(recursiveEquals(retValue, term5583));
    }

};


