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

public class FunctionType_isSubtype_21010021581048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352753;
     Object term1353219;

    public FunctionType_isSubtype_21010021581048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1355697 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1355696 = ((Class) term1355697).getDeclaredField((String) "ORDINARY");
        ((Field) term1355696).setAccessible(true);
        Object enum2427 = ((Field) term1355696).get((Object) null);
        term1352753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1353001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1353111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1352753, term1352753.getClass(), "kind", enum2427);
        setField(term1353001, term1353001.getClass(), "kind", enum2427);
        setField(term1353001, term1353001.getClass(), "typeOfThis", term1353111);
        setField(term1352753, term1352753.getClass(), "typeOfThis", term1353001);
        term1353219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1353401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1353501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1353219, term1353219.getClass(), "kind", enum2427);
        setField(term1353401, term1353401.getClass(), "kind", enum2427);
        setField(term1353401, term1353401.getClass(), "typeOfThis", term1353501);
        setField(term1353219, term1353219.getClass(), "typeOfThis", term1353401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1353219;
        try {
            callMethod(klass, "isSubtype", argTypes, term1352753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


