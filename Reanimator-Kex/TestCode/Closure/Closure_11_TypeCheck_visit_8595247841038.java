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

public class TypeCheck_visit_8595247841038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291786;
     Object term291982;

    public TypeCheck_visit_8595247841038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291786 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term291890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term291786, term291786.getClass(), "typeRegistry", term291890);
        term291982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term292074 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term291982, term291982.getClass(), "type", 91);
        setField(term292074, term292074.getClass(), "jsType", null);
        setField(term291982, term291982.getClass(), "first", term292074);
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
        args[1] = term291982;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term291786, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


