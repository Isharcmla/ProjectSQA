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

public class TypeCheck_visit_8595247841376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418845;
     Object term419041;

    public TypeCheck_visit_8595247841376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418845 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term418949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term418845, term418845.getClass(), "validator", null);
        setField(term418845, term418845.getClass(), "typeRegistry", term418949);
        term419041 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term419133 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term419041, term419041.getClass(), "type", 29);
        setField(term419133, term419133.getClass(), "jsType", null);
        setField(term419041, term419041.getClass(), "first", term419133);
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
        args[1] = term419041;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term418845, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


