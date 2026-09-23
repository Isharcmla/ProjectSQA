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

public class FunctionType_isSubtype_2101002158811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815293;
     Object term816053;

    public FunctionType_isSubtype_2101002158811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term817489 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term817488 = ((Class) term817489).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term817488).setAccessible(true);
        Object enum1523 = ((Field) term817488).get((Object) null);
        term815293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term815845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term815945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term815293, term815293.getClass(), "kind", enum1523);
        setField(term815845, term815845.getClass(), "kind", enum1523);
        setField(term815845, term815845.getClass(), "typeOfThis", term815945);
        setField(term815293, term815293.getClass(), "typeOfThis", term815845);
        Class<? extends Object> term817789 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term817788 = ((Class) term817789).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term817788).setAccessible(true);
        Object enum1524 = ((Field) term817788).get((Object) null);
        term816053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term816235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term816477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term816053, term816053.getClass(), "kind", enum1524);
        setField(term816235, term816235.getClass(), "kind", enum1523);
        setField(term816235, term816235.getClass(), "typeOfThis", term816477);
        setField(term816053, term816053.getClass(), "typeOfThis", term816235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term816053;
        try {
            callMethod(klass, "isSubtype", argTypes, term815293, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


