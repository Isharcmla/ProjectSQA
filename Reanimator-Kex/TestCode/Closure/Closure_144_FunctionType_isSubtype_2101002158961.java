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

public class FunctionType_isSubtype_2101002158961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1191791;
     Object term1192543;

    public FunctionType_isSubtype_2101002158961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1195074 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1195073 = ((Class) term1195074).getDeclaredField((String) "ORDINARY");
        ((Field) term1195073).setAccessible(true);
        Object enum2145 = ((Field) term1195073).get((Object) null);
        term1191791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1192335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1192433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1191791, term1191791.getClass(), "kind", enum2145);
        setField(term1192335, term1192335.getClass(), "kind", enum2145);
        setField(term1192335, term1192335.getClass(), "typeOfThis", term1192433);
        setField(term1191791, term1191791.getClass(), "typeOfThis", term1192335);
        Class<? extends Object> term1195365 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1195364 = ((Class) term1195365).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1195364).setAccessible(true);
        Object enum2146 = ((Field) term1195364).get((Object) null);
        term1192543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1192873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1192543, term1192543.getClass(), "kind", enum2145);
        setField(term1192873, term1192873.getClass(), "kind", enum2146);
        setField(term1192873, term1192873.getClass(), "typeOfThis", null);
        setField(term1192543, term1192543.getClass(), "typeOfThis", term1192873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1192543;
        try {
            callMethod(klass, "isSubtype", argTypes, term1191791, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


