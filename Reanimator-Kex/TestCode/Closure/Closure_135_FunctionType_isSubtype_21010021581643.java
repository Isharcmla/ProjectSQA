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

public class FunctionType_isSubtype_21010021581643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210613;
     Object term2211267;

    public FunctionType_isSubtype_21010021581643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2214816 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2214815 = ((Class) term2214816).getDeclaredField((String) "INTERFACE");
        ((Field) term2214815).setAccessible(true);
        Object enum4126 = ((Field) term2214815).get((Object) null);
        Class<? extends Object> term2215110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2215109 = ((Class) term2215110).getDeclaredField((String) "INTERFACE");
        ((Field) term2215109).setAccessible(true);
        Object enum4127 = ((Field) term2215109).get((Object) null);
        term2210613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2211157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2210613, term2210613.getClass(), "kind", enum4126);
        setField(term2211157, term2211157.getClass(), "kind", enum4127);
        setField(term2210613, term2210613.getClass(), "typeOfThis", term2211157);
        Class<? extends Object> term2215404 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2215403 = ((Class) term2215404).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2215403).setAccessible(true);
        Object enum4128 = ((Field) term2215403).get((Object) null);
        term2211267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2211449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2211267, term2211267.getClass(), "kind", enum4128);
        setField(term2211267, term2211267.getClass(), "typeOfThis", term2211449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2211267;
        try {
            callMethod(klass, "isSubtype", argTypes, term2210613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


