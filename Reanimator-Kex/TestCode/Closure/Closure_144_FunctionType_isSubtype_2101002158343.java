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

public class FunctionType_isSubtype_2101002158343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238182;
     Object term238632;

    public FunctionType_isSubtype_2101002158343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239828 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239827 = ((Class) term239828).getDeclaredField((String) "ORDINARY");
        ((Field) term239827).setAccessible(true);
        Object enum445 = ((Field) term239827).get((Object) null);
        term238182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term238430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term238524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term238182, term238182.getClass(), "kind", enum445);
        setField(term238182, term238182.getClass(), "typeOfThis", term238430);
        setField(term238182, term238182.getClass(), "call", term238524);
        Class<? extends Object> term240119 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term240118 = ((Class) term240119).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term240118).setAccessible(true);
        Object enum446 = ((Field) term240118).get((Object) null);
        term238632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term238890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term238632, term238632.getClass(), "kind", enum446);
        setField(term238632, term238632.getClass(), "typeOfThis", term238890);
        setField(term238632, term238632.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term238632;
        try {
            callMethod(klass, "isSubtype", argTypes, term238182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


