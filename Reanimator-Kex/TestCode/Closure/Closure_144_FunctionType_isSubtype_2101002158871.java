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

public class FunctionType_isSubtype_2101002158871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041911;
     Object term1042527;

    public FunctionType_isSubtype_2101002158871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1044361 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1044360 = ((Class) term1044361).getDeclaredField((String) "ORDINARY");
        ((Field) term1044360).setAccessible(true);
        Object enum1884 = ((Field) term1044360).get((Object) null);
        Class<? extends Object> term1044652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1044651 = ((Class) term1044652).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1044651).setAccessible(true);
        Object enum1885 = ((Field) term1044651).get((Object) null);
        term1041911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1042159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1042417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1041911, term1041911.getClass(), "kind", enum1884);
        setField(term1042159, term1042159.getClass(), "kind", enum1885);
        setField(term1042159, term1042159.getClass(), "typeOfThis", term1042417);
        setField(term1042159, term1042159.getClass(), "call", null);
        setField(term1041911, term1041911.getClass(), "typeOfThis", term1042159);
        term1042527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1042709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1042817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1042911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1042527, term1042527.getClass(), "kind", enum1884);
        setField(term1042709, term1042709.getClass(), "kind", enum1884);
        setField(term1042709, term1042709.getClass(), "typeOfThis", term1042817);
        setField(term1042709, term1042709.getClass(), "call", term1042911);
        setField(term1042527, term1042527.getClass(), "typeOfThis", term1042709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1042527;
        try {
            callMethod(klass, "isSubtype", argTypes, term1041911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


