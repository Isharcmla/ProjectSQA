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

public class FunctionType_isSubtype_2101002158841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term863225;
     Object term863977;

    public FunctionType_isSubtype_2101002158841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term865423 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term865422 = ((Class) term865423).getDeclaredField((String) "ORDINARY");
        ((Field) term865422).setAccessible(true);
        Object enum1612 = ((Field) term865422).get((Object) null);
        Class<? extends Object> term865714 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term865713 = ((Class) term865714).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term865713).setAccessible(true);
        Object enum1613 = ((Field) term865713).get((Object) null);
        term863225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term863769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term863869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term863225, term863225.getClass(), "kind", enum1612);
        setField(term863769, term863769.getClass(), "kind", enum1613);
        setField(term863769, term863769.getClass(), "typeOfThis", term863869);
        setField(term863225, term863225.getClass(), "typeOfThis", term863769);
        term863977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term864307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term864417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term863977, term863977.getClass(), "kind", enum1612);
        setField(term864307, term864307.getClass(), "kind", enum1613);
        setField(term864307, term864307.getClass(), "typeOfThis", term864417);
        setField(term863977, term863977.getClass(), "typeOfThis", term864307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term863977;
        try {
            callMethod(klass, "isSubtype", argTypes, term863225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


