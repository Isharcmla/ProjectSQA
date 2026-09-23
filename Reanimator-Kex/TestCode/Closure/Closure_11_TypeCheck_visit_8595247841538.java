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

public class TypeCheck_visit_8595247841538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481726;
     Object term481908;

    public TypeCheck_visit_8595247841538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481726 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term481816 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term481726, term481726.getClass(), "validator", term481816);
        term481908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term482000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term482104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term482196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term482300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term481908, term481908.getClass(), "type", 52);
        setField(term482000, term482000.getClass(), "jsType", term482104);
        setField(term481908, term481908.getClass(), "first", term482000);
        setField(term482196, term482196.getClass(), "jsType", term482300);
        setField(term481908, term481908.getClass(), "last", term482196);
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
        args[1] = term481908;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term481726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


