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

public class TypeCheck_visitName_1546932345221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54026;
     Object term54200;
     Object term54270;

    public TypeCheck_visitName_1546932345221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54026 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term54130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term54026, term54026.getClass(), "typeRegistry", term54130);
        term54200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54200, term54200.getClass(), "jsType", null);
        term54270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54270, term54270.getClass(), "type", 0);
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
        args[1] = term54200;
        args[2] = term54270;
        try {
            callMethod(klass, "visitName", argTypes, term54026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


