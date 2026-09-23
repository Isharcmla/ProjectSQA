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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_859524784995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271881;
     Object term272077;

    public TypeCheck_visit_859524784995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271881 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term271985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term271881, term271881.getClass(), "typeRegistry", term271985);
        term272077 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term272077, term272077.getClass(), "type", 52);
        setField(term272077, term272077.getClass(), "first", null);
        setField(term272169, term272169.getClass(), "jsType", null);
        setField(term272077, term272077.getClass(), "last", term272169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term272077;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term271881, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


