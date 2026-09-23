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

public class FunctionType_isSubtype_2101002158899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959824;
     Object term960436;

    public FunctionType_isSubtype_2101002158899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term962316 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term962315 = ((Class) term962316).getDeclaredField((String) "ORDINARY");
        ((Field) term962315).setAccessible(true);
        Object enum1793 = ((Field) term962315).get((Object) null);
        Class<? extends Object> term962607 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term962606 = ((Class) term962607).getDeclaredField((String) "INTERFACE");
        ((Field) term962606).setAccessible(true);
        Object enum1794 = ((Field) term962606).get((Object) null);
        term959824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term960072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term960328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term959824, term959824.getClass(), "kind", enum1793);
        setField(term960072, term960072.getClass(), "kind", enum1794);
        setField(term960072, term960072.getClass(), "typeOfThis", term960328);
        setField(term959824, term959824.getClass(), "typeOfThis", term960072);
        Class<? extends Object> term962901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term962900 = ((Class) term962901).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term962900).setAccessible(true);
        Object enum1795 = ((Field) term962900).get((Object) null);
        term960436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term960618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term960436, term960436.getClass(), "kind", enum1793);
        setField(term960618, term960618.getClass(), "kind", enum1795);
        setField(term960618, term960618.getClass(), "typeOfThis", null);
        setField(term960436, term960436.getClass(), "typeOfThis", term960618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term960436;
        try {
            callMethod(klass, "isSubtype", argTypes, term959824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


