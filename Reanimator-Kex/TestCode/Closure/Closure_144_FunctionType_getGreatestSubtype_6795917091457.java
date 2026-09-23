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

public class FunctionType_getGreatestSubtype_6795917091457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092161;
     Object term2092949;

    public FunctionType_getGreatestSubtype_6795917091457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2096488 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2096487 = ((Class) term2096488).getDeclaredField((String) "ORDINARY");
        ((Field) term2096487).setAccessible(true);
        Object enum3730 = ((Field) term2096487).get((Object) null);
        term2092161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2092715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2092839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term2092161, term2092161.getClass(), "kind", enum3730);
        setField(term2092715, term2092715.getClass(), "kind", enum3730);
        setField(term2092715, term2092715.getClass(), "typeOfThis", term2092839);
        setField(term2092161, term2092161.getClass(), "typeOfThis", term2092715);
        Class<? extends Object> term2096779 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2096778 = ((Class) term2096779).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2096778).setAccessible(true);
        Object enum3731 = ((Field) term2096778).get((Object) null);
        term2092949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2093131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2092949, term2092949.getClass(), "kind", enum3731);
        setField(term2093131, term2093131.getClass(), "kind", enum3730);
        setField(term2093131, term2093131.getClass(), "typeOfThis", null);
        setField(term2092949, term2092949.getClass(), "typeOfThis", term2093131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2092949;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2092161, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


