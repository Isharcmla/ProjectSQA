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

public class FunctionType_isSubtype_21010021581031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1173021;
     Object term1173791;

    public FunctionType_isSubtype_21010021581031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1175103 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1175102 = ((Class) term1175103).getDeclaredField((String) "ORDINARY");
        ((Field) term1175102).setAccessible(true);
        Object enum2187 = ((Field) term1175102).get((Object) null);
        term1173021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1173573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1173683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1173021, term1173021.getClass(), "kind", enum2187);
        setField(term1173573, term1173573.getClass(), "kind", enum2187);
        setField(term1173573, term1173573.getClass(), "typeOfThis", term1173683);
        setField(term1173021, term1173021.getClass(), "typeOfThis", term1173573);
        Class<? extends Object> term1175394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1175393 = ((Class) term1175394).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1175393).setAccessible(true);
        Object enum2188 = ((Field) term1175393).get((Object) null);
        term1173791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1173973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1173791, term1173791.getClass(), "kind", enum2188);
        setField(term1173973, term1173973.getClass(), "kind", enum2187);
        setField(term1173973, term1173973.getClass(), "typeOfThis", null);
        setField(term1173791, term1173791.getClass(), "typeOfThis", term1173973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1173791;
        try {
            callMethod(klass, "isSubtype", argTypes, term1173021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


