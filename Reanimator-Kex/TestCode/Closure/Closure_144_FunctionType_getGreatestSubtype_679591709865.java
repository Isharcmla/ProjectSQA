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

public class FunctionType_getGreatestSubtype_679591709865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1030014;
     Object term1030782;

    public FunctionType_getGreatestSubtype_679591709865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1032301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1032300 = ((Class) term1032301).getDeclaredField((String) "ORDINARY");
        ((Field) term1032300).setAccessible(true);
        Object enum1861 = ((Field) term1032300).get((Object) null);
        term1030014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1030568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1030672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1030014, term1030014.getClass(), "kind", enum1861);
        setField(term1030568, term1030568.getClass(), "kind", enum1861);
        setField(term1030014, term1030014.getClass(), "typeOfThis", term1030568);
        setField(term1030014, term1030014.getClass(), "registry", term1030672);
        Class<? extends Object> term1032592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1032591 = ((Class) term1032592).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1032591).setAccessible(true);
        Object enum1862 = ((Field) term1032591).get((Object) null);
        Class<? extends Object> term1032892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1032891 = ((Class) term1032892).getDeclaredField((String) "INTERFACE");
        ((Field) term1032891).setAccessible(true);
        Object enum1863 = ((Field) term1032891).get((Object) null);
        term1030782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1030944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1030782, term1030782.getClass(), "kind", enum1862);
        setField(term1030944, term1030944.getClass(), "kind", enum1863);
        setField(term1030782, term1030782.getClass(), "typeOfThis", term1030944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1030782;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1030014, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


