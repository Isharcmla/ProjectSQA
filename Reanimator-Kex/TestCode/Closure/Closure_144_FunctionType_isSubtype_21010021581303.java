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

public class FunctionType_isSubtype_21010021581303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809038;
     Object term1809504;

    public FunctionType_isSubtype_21010021581303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1810516 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1810515 = ((Class) term1810516).getDeclaredField((String) "ORDINARY");
        ((Field) term1810515).setAccessible(true);
        Object enum3215 = ((Field) term1810515).get((Object) null);
        term1809038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1809286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1809396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1809038, term1809038.getClass(), "kind", enum3215);
        setField(term1809286, term1809286.getClass(), "kind", enum3215);
        setField(term1809286, term1809286.getClass(), "typeOfThis", term1809396);
        setField(term1809038, term1809038.getClass(), "typeOfThis", term1809286);
        term1809504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1809686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1809504, term1809504.getClass(), "kind", enum3215);
        setField(term1809686, term1809686.getClass(), "kind", enum3215);
        setField(term1809686, term1809686.getClass(), "typeOfThis", null);
        setField(term1809504, term1809504.getClass(), "typeOfThis", term1809686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1809504;
        try {
            callMethod(klass, "isSubtype", argTypes, term1809038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


