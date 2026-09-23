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
import java.lang.Object;

public class CheckGlobalThis_shouldTraverse_212591951538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11426;
     Object term11496;
     Object term11566;

    public CheckGlobalThis_shouldTraverse_212591951538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11426 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term11496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11496, term11496.getClass(), "type", 86);
        term11566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11566, term11566.getClass(), "type", 86);
        setField(term11566, term11566.getClass(), "first", term11636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11496;
        args[2] = term11566;
        callMethod(klass, "shouldTraverse", argTypes, term11426, args);
    }

};


