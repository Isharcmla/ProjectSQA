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

public class FunctionType_getGreatestSubtype_6795917091529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233266;
     Object term2234038;

    public FunctionType_getGreatestSubtype_6795917091529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2235394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2235393 = ((Class) term2235394).getDeclaredField((String) "ORDINARY");
        ((Field) term2235393).setAccessible(true);
        Object enum3988 = ((Field) term2235393).get((Object) null);
        Class<? extends Object> term2235685 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2235684 = ((Class) term2235685).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2235684).setAccessible(true);
        Object enum3989 = ((Field) term2235684).get((Object) null);
        term2233266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2233820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2234414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2233266, term2233266.getClass(), "kind", enum3988);
        setField(term2233820, term2233820.getClass(), "kind", enum3988);
        setField(term2234414, term2234414.getClass(), "kind", enum3989);
        setField(term2234414, term2234414.getClass(), "typeOfThis", null);
        setField(term2233820, term2233820.getClass(), "typeOfThis", term2234414);
        setField(term2233266, term2233266.getClass(), "typeOfThis", term2233820);
        term2234038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2234360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2234038, term2234038.getClass(), "kind", enum3988);
        setField(term2234360, term2234360.getClass(), "kind", enum3988);
        setField(term2234360, term2234360.getClass(), "typeOfThis", term2234414);
        setField(term2234038, term2234038.getClass(), "typeOfThis", term2234360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2234038;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2233266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


