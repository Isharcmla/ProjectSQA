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

public class FunctionType_isSubtype_21010021581517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2208469;
     Object term2209247;

    public FunctionType_isSubtype_21010021581517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2210578 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2210577 = ((Class) term2210578).getDeclaredField((String) "ORDINARY");
        ((Field) term2210577).setAccessible(true);
        Object enum3942 = ((Field) term2210577).get((Object) null);
        term2208469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2209013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2209137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term2208469, term2208469.getClass(), "kind", enum3942);
        setField(term2209013, term2209013.getClass(), "kind", enum3942);
        setField(term2209013, term2209013.getClass(), "typeOfThis", term2209137);
        setField(term2208469, term2208469.getClass(), "typeOfThis", term2209013);
        Class<? extends Object> term2210869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2210868 = ((Class) term2210869).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2210868).setAccessible(true);
        Object enum3943 = ((Field) term2210868).get((Object) null);
        term2209247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2209579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2209247, term2209247.getClass(), "kind", enum3942);
        setField(term2209579, term2209579.getClass(), "kind", enum3943);
        setField(term2209579, term2209579.getClass(), "typeOfThis", null);
        setField(term2209247, term2209247.getClass(), "typeOfThis", term2209579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2209247;
        try {
            callMethod(klass, "isSubtype", argTypes, term2208469, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


