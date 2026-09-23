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

public class TypeCheck_checkDeclaredPropertyInheritance_13802728491061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302529;
     Object term302629;

    public TypeCheck_checkDeclaredPropertyInheritance_13802728491061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302529 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Class<? extends Object> term303919 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term303918 = ((Class) term303919).getDeclaredField((String) "INTERFACE");
        ((Field) term303918).setAccessible(true);
        Object enum42 = ((Field) term303918).get((Object) null);
        term302629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term302891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term302995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term302629, term302629.getClass(), "kind", enum42);
        setBooleanField(term302629, term302629.getClass(), "unknown", false);
        setField(term302891, term302891.getClass(), "type", term302995);
        setField(term302629, term302629.getClass(), "prototypeSlot", term302891);
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
        args[2] = term302629;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "checkDeclaredPropertyInheritance", argTypes, term302529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


