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

public class FunctionType_getGreatestSubtype_679591709551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429597;
     Object term430367;

    public FunctionType_getGreatestSubtype_679591709551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term431492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term431491 = ((Class) term431492).getDeclaredField((String) "ORDINARY");
        ((Field) term431491).setAccessible(true);
        Object enum796 = ((Field) term431491).get((Object) null);
        term429597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term430149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term430259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term429597, term429597.getClass(), "kind", enum796);
        setField(term430149, term430149.getClass(), "kind", enum796);
        setField(term430149, term430149.getClass(), "typeOfThis", term430259);
        setField(term429597, term429597.getClass(), "typeOfThis", term430149);
        Class<? extends Object> term431783 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term431782 = ((Class) term431783).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term431782).setAccessible(true);
        Object enum797 = ((Field) term431782).get((Object) null);
        term430367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term430541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term430367, term430367.getClass(), "kind", enum797);
        setField(term430541, term430541.getClass(), "kind", enum797);
        setField(term430541, term430541.getClass(), "typeOfThis", null);
        setField(term430367, term430367.getClass(), "typeOfThis", term430541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term430367;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term429597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


