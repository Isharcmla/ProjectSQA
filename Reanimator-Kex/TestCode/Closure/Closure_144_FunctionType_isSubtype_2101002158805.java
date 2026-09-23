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

public class FunctionType_isSubtype_2101002158805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term923061;
     Object term923715;

    public FunctionType_isSubtype_2101002158805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term925201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term925200 = ((Class) term925201).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term925200).setAccessible(true);
        Object enum1673 = ((Field) term925200).get((Object) null);
        Class<? extends Object> term925501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term925500 = ((Class) term925501).getDeclaredField((String) "INTERFACE");
        ((Field) term925500).setAccessible(true);
        Object enum1674 = ((Field) term925500).get((Object) null);
        term923061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term923605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term923061, term923061.getClass(), "kind", enum1673);
        setField(term923605, term923605.getClass(), "kind", enum1674);
        setField(term923061, term923061.getClass(), "typeOfThis", term923605);
        Class<? extends Object> term925795 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term925794 = ((Class) term925795).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term925794).setAccessible(true);
        Object enum1675 = ((Field) term925794).get((Object) null);
        term923715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term923899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term923715, term923715.getClass(), "kind", enum1675);
        setField(term923715, term923715.getClass(), "typeOfThis", term923899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term923715;
        try {
            callMethod(klass, "isSubtype", argTypes, term923061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


