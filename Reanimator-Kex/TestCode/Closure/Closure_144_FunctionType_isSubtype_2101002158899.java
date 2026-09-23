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

public class FunctionType_isSubtype_2101002158899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1092260;
     Object term1093002;

    public FunctionType_isSubtype_2101002158899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1093956 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1093955 = ((Class) term1093956).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1093955).setAccessible(true);
        Object enum1973 = ((Field) term1093955).get((Object) null);
        term1092260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1092804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1092892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1092260, term1092260.getClass(), "kind", enum1973);
        setField(term1092804, term1092804.getClass(), "kind", enum1973);
        setField(term1092804, term1092804.getClass(), "typeOfThis", term1092892);
        setField(term1092260, term1092260.getClass(), "typeOfThis", term1092804);
        term1093002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1093334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1093002, term1093002.getClass(), "kind", enum1973);
        setField(term1093334, term1093334.getClass(), "kind", enum1973);
        setField(term1093334, term1093334.getClass(), "typeOfThis", null);
        setField(term1093002, term1093002.getClass(), "typeOfThis", term1093334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1093002;
        try {
            callMethod(klass, "isSubtype", argTypes, term1092260, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


