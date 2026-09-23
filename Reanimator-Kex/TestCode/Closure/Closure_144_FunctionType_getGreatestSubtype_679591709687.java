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

public class FunctionType_getGreatestSubtype_679591709687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715904;
     Object term716604;

    public FunctionType_getGreatestSubtype_679591709687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term717958 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term717957 = ((Class) term717958).getDeclaredField((String) "ORDINARY");
        ((Field) term717957).setAccessible(true);
        Object enum1289 = ((Field) term717957).get((Object) null);
        Class<? extends Object> term718249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term718248 = ((Class) term718249).getDeclaredField((String) "INTERFACE");
        ((Field) term718248).setAccessible(true);
        Object enum1290 = ((Field) term718248).get((Object) null);
        term715904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term716728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term716778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term716494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term715904, term715904.getClass(), "kind", enum1289);
        setField(term716728, term716728.getClass(), "kind", enum1289);
        setField(term716778, term716778.getClass(), "kind", enum1290);
        setField(term716728, term716728.getClass(), "typeOfThis", term716778);
        setField(term715904, term715904.getClass(), "typeOfThis", term716728);
        setField(term715904, term715904.getClass(), "call", term716494);
        term716604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term716604, term716604.getClass(), "kind", enum1289);
        setField(term716604, term716604.getClass(), "typeOfThis", term716728);
        setField(term716604, term716604.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term716604;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term715904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


