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

public class FunctionType_isSubtype_2101002158933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146696;
     Object term1147356;

    public FunctionType_isSubtype_2101002158933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1148624 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1148623 = ((Class) term1148624).getDeclaredField((String) "ORDINARY");
        ((Field) term1148623).setAccessible(true);
        Object enum2064 = ((Field) term1148623).get((Object) null);
        Class<? extends Object> term1148915 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1148914 = ((Class) term1148915).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1148914).setAccessible(true);
        Object enum2065 = ((Field) term1148914).get((Object) null);
        term1146696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1147632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1146696, term1146696.getClass(), "kind", enum2064);
        setField(term1147632, term1147632.getClass(), "kind", enum2065);
        setField(term1146696, term1146696.getClass(), "typeOfThis", term1147632);
        term1147356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1147356, term1147356.getClass(), "kind", enum2064);
        setField(term1147356, term1147356.getClass(), "typeOfThis", term1147632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1147356;
        try {
            callMethod(klass, "isSubtype", argTypes, term1146696, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


