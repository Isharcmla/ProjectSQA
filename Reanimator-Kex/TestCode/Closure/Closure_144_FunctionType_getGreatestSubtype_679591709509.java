package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_679591709509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439643;
     Object term440307;

    public FunctionType_getGreatestSubtype_679591709509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term441599 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term441598 = ((Class) term441599).getDeclaredField((String) "ORDINARY");
        ((Field) term441598).setAccessible(true);
        Object enum799 = ((Field) term441598).get((Object) null);
        Class<? extends Object> term441890 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term441889 = ((Class) term441890).getDeclaredField((String) "INTERFACE");
        ((Field) term441889).setAccessible(true);
        Object enum800 = ((Field) term441889).get((Object) null);
        term439643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term440197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term439643, term439643.getClass(), "kind", enum799);
        setField(term440197, term440197.getClass(), "kind", enum800);
        setField(term439643, term439643.getClass(), "typeOfThis", term440197);
        term440307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term440629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term440307, term440307.getClass(), "kind", enum799);
        setField(term440629, term440629.getClass(), "kind", enum799);
        setField(term440307, term440307.getClass(), "typeOfThis", term440629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term440307;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term439643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


