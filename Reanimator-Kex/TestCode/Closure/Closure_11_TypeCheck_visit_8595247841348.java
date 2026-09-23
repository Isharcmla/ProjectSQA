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

public class TypeCheck_visit_8595247841348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406919;
     Object term407115;

    public TypeCheck_visit_8595247841348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406919 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term407023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term406919, term406919.getClass(), "typeRegistry", term407023);
        term407115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term407207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term407115, term407115.getClass(), "type", 52);
        setField(term407115, term407115.getClass(), "first", null);
        setField(term407207, term407207.getClass(), "jsType", null);
        setField(term407115, term407115.getClass(), "last", term407207);
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
        args[1] = term407115;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term406919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


