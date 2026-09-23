package com.google.javascript.rhino.jstype;

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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NamedType_setValidator_744060160152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32638;
     Object term32716;

    public NamedType_setValidator_744060160152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term32638, term32638.getClass(), "resolved", true);
        term32716 = newInstance(Class.forName("com.google.common.base.CharMatcher$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[1];
        args[0] = term32716;
        try {
            callMethod(klass, "setValidator", argTypes, term32638, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


