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

public class CheckGlobalThis_shouldTraverse_212591951544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13074;
     Object term13144;

    public CheckGlobalThis_shouldTraverse_212591951544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13074 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term13144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13240 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13144, term13144.getClass(), "type", 105);
        setField(term13144, term13144.getClass(), "propListHead", term13240);
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
        args[1] = term13144;
        args[2] = null;
        callMethod(klass, "shouldTraverse", argTypes, term13074, args);
    }

};


