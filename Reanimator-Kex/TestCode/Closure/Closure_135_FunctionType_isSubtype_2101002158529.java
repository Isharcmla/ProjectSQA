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

public class FunctionType_isSubtype_2101002158529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398276;
     Object term398632;

    public FunctionType_isSubtype_2101002158529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term399769 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term399768 = ((Class) term399769).getDeclaredField((String) "ORDINARY");
        ((Field) term399768).setAccessible(true);
        Object enum735 = ((Field) term399768).get((Object) null);
        term398276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term398524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term398276, term398276.getClass(), "kind", enum735);
        setField(term398276, term398276.getClass(), "typeOfThis", term398524);
        Class<? extends Object> term400060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term400059 = ((Class) term400060).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term400059).setAccessible(true);
        Object enum736 = ((Field) term400059).get((Object) null);
        term398632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term398632, term398632.getClass(), "kind", enum736);
        setField(term398632, term398632.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term398632;
        try {
            callMethod(klass, "isSubtype", argTypes, term398276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


