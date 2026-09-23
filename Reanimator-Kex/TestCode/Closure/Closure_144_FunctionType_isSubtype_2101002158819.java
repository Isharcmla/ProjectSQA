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

public class FunctionType_isSubtype_2101002158819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949073;
     Object term949727;

    public FunctionType_isSubtype_2101002158819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term950901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term950900 = ((Class) term950901).getDeclaredField((String) "INTERFACE");
        ((Field) term950900).setAccessible(true);
        Object enum1718 = ((Field) term950900).get((Object) null);
        Class<? extends Object> term951195 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term951194 = ((Class) term951195).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term951194).setAccessible(true);
        Object enum1719 = ((Field) term951194).get((Object) null);
        term949073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term949617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term949073, term949073.getClass(), "kind", enum1718);
        setField(term949617, term949617.getClass(), "kind", enum1719);
        setField(term949073, term949073.getClass(), "typeOfThis", term949617);
        term949727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term949909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term949727, term949727.getClass(), "kind", enum1719);
        setField(term949909, term949909.getClass(), "kind", enum1719);
        setField(term949727, term949727.getClass(), "typeOfThis", term949909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term949727;
        try {
            callMethod(klass, "isSubtype", argTypes, term949073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


