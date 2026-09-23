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

public class FunctionType_isSubtype_21010021581083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258679;
     Object term1259191;

    public FunctionType_isSubtype_21010021581083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1260723 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1260722 = ((Class) term1260723).getDeclaredField((String) "ORDINARY");
        ((Field) term1260722).setAccessible(true);
        Object enum2347 = ((Field) term1260722).get((Object) null);
        Class<? extends Object> term1261014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1261013 = ((Class) term1261014).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1261013).setAccessible(true);
        Object enum2348 = ((Field) term1261013).get((Object) null);
        term1258679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1258935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1258679, term1258679.getClass(), "kind", enum2347);
        setField(term1258935, term1258935.getClass(), "kind", enum2348);
        setField(term1258935, term1258935.getClass(), "typeOfThis", null);
        setField(term1258679, term1258679.getClass(), "typeOfThis", term1258935);
        term1259191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1259373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1259467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1259191, term1259191.getClass(), "kind", enum2347);
        setField(term1259373, term1259373.getClass(), "kind", enum2347);
        setField(term1259373, term1259373.getClass(), "typeOfThis", term1259467);
        setField(term1259191, term1259191.getClass(), "typeOfThis", term1259373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1259191;
        try {
            callMethod(klass, "isSubtype", argTypes, term1258679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


