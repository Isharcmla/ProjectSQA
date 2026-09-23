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

public class TypeCheck_checkDeclaredPropertyInheritance_1380272849246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59341;
     Object term59441;

    public TypeCheck_checkDeclaredPropertyInheritance_1380272849246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59341 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Class<? extends Object> term60457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term60456 = ((Class) term60457).getDeclaredField((String) "INTERFACE");
        ((Field) term60456).setAccessible(true);
        Object enum33 = ((Field) term60456).get((Object) null);
        term59441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term59441, term59441.getClass(), "kind", enum33);
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
        args[2] = term59441;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "checkDeclaredPropertyInheritance", argTypes, term59341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


