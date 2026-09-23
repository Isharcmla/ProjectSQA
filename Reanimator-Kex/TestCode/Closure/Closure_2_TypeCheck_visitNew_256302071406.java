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

public class TypeCheck_visitNew_256302071406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442580;
     Object term442650;

    public TypeCheck_visitNew_256302071406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442580 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Class<? extends Object> term443644 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term443643 = ((Class) term443644).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term443643).setAccessible(true);
        Object enum51 = ((Field) term443643).get((Object) null);
        term442650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term442808, term442808.getClass(), "kind", enum51);
        setField(term442720, term442720.getClass(), "jsType", term442808);
        setField(term442650, term442650.getClass(), "first", term442720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term442650;
        try {
            callMethod(klass, "visitNew", argTypes, term442580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


