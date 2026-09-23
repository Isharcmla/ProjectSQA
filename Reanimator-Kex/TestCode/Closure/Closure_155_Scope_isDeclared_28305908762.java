package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class Scope_isDeclared_28305908762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10613;

    public Scope_isDeclared_28305908762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10751 = newInstance(Class.forName("java.lang.Object"));
        HashMap term10661 = new HashMap();
        ((HashMap) term10661).put(term10751, term10751);
        HashMap term10963 = new HashMap();
        term10613 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term10915 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term10613, term10613.getClass(), "vars", term10661);
        setField(term10915, term10915.getClass(), "vars", term10963);
        setField(term10613, term10613.getClass(), "parent", term10915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        callMethod(klass, "isDeclared", argTypes, term10613, args);
    }

};


