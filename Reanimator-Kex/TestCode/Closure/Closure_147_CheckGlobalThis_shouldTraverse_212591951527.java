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

public class CheckGlobalThis_shouldTraverse_212591951527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8010;
     Object term8080;
     Object term8150;

    public CheckGlobalThis_shouldTraverse_212591951527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8010 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term8080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8080, term8080.getClass(), "type", 86);
        term8150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8150, term8150.getClass(), "type", 86);
        setField(term8150, term8150.getClass(), "first", term8220);
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
        args[1] = term8080;
        args[2] = term8150;
        callMethod(klass, "shouldTraverse", argTypes, term8010, args);
    }

};


