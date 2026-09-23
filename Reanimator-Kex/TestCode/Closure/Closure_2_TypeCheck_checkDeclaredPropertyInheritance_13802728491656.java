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
import java.lang.String;
import java.lang.Object;

public class TypeCheck_checkDeclaredPropertyInheritance_13802728491656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559556;
     Object term559656;

    public TypeCheck_checkDeclaredPropertyInheritance_13802728491656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559556 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Class<? extends Object> term560512 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term560511 = ((Class) term560512).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term560511).setAccessible(true);
        Object enum60 = ((Field) term560511).get((Object) null);
        term559656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term559896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term559656, term559656.getClass(), "kind", enum60);
        setBooleanField(term559656, term559656.getClass(), "unknown", false);
        setField(term559656, term559656.getClass(), "prototypeSlot", term559896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term559656;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "checkDeclaredPropertyInheritance", argTypes, term559556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


