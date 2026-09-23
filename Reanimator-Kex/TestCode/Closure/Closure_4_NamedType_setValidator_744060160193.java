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

public class NamedType_setValidator_744060160193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47771;
     Object term47885;

    public NamedType_setValidator_744060160193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term47771, term47771.getClass(), "resolved", true);
        term47885 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNotFunction"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[1];
        args[0] = term47885;
        try {
            callMethod(klass, "setValidator", argTypes, term47771, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


