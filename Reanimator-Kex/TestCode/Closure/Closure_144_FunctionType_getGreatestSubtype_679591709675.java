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

public class FunctionType_getGreatestSubtype_679591709675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692273;
     Object term693045;

    public FunctionType_getGreatestSubtype_679591709675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term694764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term694763 = ((Class) term694764).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term694763).setAccessible(true);
        Object enum1248 = ((Field) term694763).get((Object) null);
        term692273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term692827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term692935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term692273, term692273.getClass(), "kind", enum1248);
        setField(term692827, term692827.getClass(), "kind", enum1248);
        setField(term692935, term692935.getClass(), "kind", enum1248);
        setField(term692827, term692827.getClass(), "typeOfThis", term692935);
        setField(term692273, term692273.getClass(), "typeOfThis", term692827);
        Class<? extends Object> term695064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term695063 = ((Class) term695064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term695063).setAccessible(true);
        Object enum1249 = ((Field) term695063).get((Object) null);
        Class<? extends Object> term695364 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term695363 = ((Class) term695364).getDeclaredField((String) "INTERFACE");
        ((Field) term695363).setAccessible(true);
        Object enum1250 = ((Field) term695363).get((Object) null);
        term693045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term693219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term693467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term693045, term693045.getClass(), "kind", enum1249);
        setField(term693219, term693219.getClass(), "kind", enum1248);
        setField(term693467, term693467.getClass(), "kind", enum1250);
        setField(term693219, term693219.getClass(), "typeOfThis", term693467);
        setField(term693045, term693045.getClass(), "typeOfThis", term693219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term693045;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term692273, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


