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

public class FunctionType_getGreatestSubtype_6795917091229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1679009;
     Object term1679595;

    public FunctionType_getGreatestSubtype_6795917091229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1681197 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1681196 = ((Class) term1681197).getDeclaredField((String) "ORDINARY");
        ((Field) term1681196).setAccessible(true);
        Object enum3002 = ((Field) term1681196).get((Object) null);
        term1679009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1679267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1679377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1679485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1679009, term1679009.getClass(), "kind", enum3002);
        setField(term1679267, term1679267.getClass(), "kind", enum3002);
        setField(term1679377, term1679377.getClass(), "kind", enum3002);
        setField(term1679377, term1679377.getClass(), "typeOfThis", term1679485);
        setField(term1679267, term1679267.getClass(), "typeOfThis", term1679377);
        setField(term1679009, term1679009.getClass(), "typeOfThis", term1679267);
        Class<? extends Object> term1681488 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1681487 = ((Class) term1681488).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1681487).setAccessible(true);
        Object enum3003 = ((Field) term1681487).get((Object) null);
        term1679595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1679769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1679869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1679595, term1679595.getClass(), "kind", enum3002);
        setField(term1679769, term1679769.getClass(), "kind", enum3002);
        setField(term1679869, term1679869.getClass(), "kind", enum3003);
        setField(term1679869, term1679869.getClass(), "typeOfThis", null);
        setField(term1679769, term1679769.getClass(), "typeOfThis", term1679869);
        setField(term1679595, term1679595.getClass(), "typeOfThis", term1679769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1679595;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1679009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


