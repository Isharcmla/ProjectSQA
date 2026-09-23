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
import java.lang.String;

public class TypeCheck_visitNew_256302071392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436998;
     Object term437172;

    public TypeCheck_visitNew_256302071392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436998 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term437102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term436998, term436998.getClass(), "typeRegistry", term437102);
        Class<? extends Object> term438468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term438467 = ((Class) term438468).getDeclaredField((String) "INTERFACE");
        ((Field) term438467).setAccessible(true);
        Object enum48 = ((Field) term438467).get((Object) null);
        term437172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term437330, term437330.getClass(), "kind", enum48);
        setField(term437242, term437242.getClass(), "jsType", term437330);
        setField(term437172, term437172.getClass(), "first", term437242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term437172;
        try {
            callMethod(klass, "visitNew", argTypes, term436998, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


