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

public class TypeCheck_visit_8595247841660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563447;
     Object term563643;
     Object term563735;

    public TypeCheck_visit_8595247841660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563447 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term563551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term563447, term563447.getClass(), "typeRegistry", term563551);
        term563643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term563643, term563643.getClass(), "type", 64);
        setField(term563643, term563643.getClass(), "jsType", null);
        term563735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term563735, term563735.getClass(), "jsType", term563849);
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
        args[1] = term563643;
        args[2] = term563735;
        try {
            callMethod(klass, "visit", argTypes, term563447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


