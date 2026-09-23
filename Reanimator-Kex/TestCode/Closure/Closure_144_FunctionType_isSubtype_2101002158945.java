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

public class FunctionType_isSubtype_2101002158945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163765;
     Object term1164543;

    public FunctionType_isSubtype_2101002158945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1167709 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1167708 = ((Class) term1167709).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1167708).setAccessible(true);
        Object enum2100 = ((Field) term1167708).get((Object) null);
        term1163765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1164309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1164433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1163765, term1163765.getClass(), "kind", enum2100);
        setField(term1164309, term1164309.getClass(), "kind", enum2100);
        setField(term1164309, term1164309.getClass(), "typeOfThis", term1164433);
        setField(term1163765, term1163765.getClass(), "typeOfThis", term1164309);
        Class<? extends Object> term1168009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1168008 = ((Class) term1168009).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1168008).setAccessible(true);
        Object enum2101 = ((Field) term1168008).get((Object) null);
        term1164543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1164875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1164543, term1164543.getClass(), "kind", enum2100);
        setField(term1164875, term1164875.getClass(), "kind", enum2101);
        setField(term1164875, term1164875.getClass(), "typeOfThis", null);
        setField(term1164543, term1164543.getClass(), "typeOfThis", term1164875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1164543;
        try {
            callMethod(klass, "isSubtype", argTypes, term1163765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


