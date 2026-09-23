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

public class FunctionType_isSubtype_2101002158567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454262;
     Object term454922;

    public FunctionType_isSubtype_2101002158567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term456457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term456456 = ((Class) term456457).getDeclaredField((String) "INTERFACE");
        ((Field) term456456).setAccessible(true);
        Object enum845 = ((Field) term456456).get((Object) null);
        Class<? extends Object> term456751 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term456750 = ((Class) term456751).getDeclaredField((String) "INTERFACE");
        ((Field) term456750).setAccessible(true);
        Object enum846 = ((Field) term456750).get((Object) null);
        term454262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term454814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term454262, term454262.getClass(), "kind", enum845);
        setField(term454814, term454814.getClass(), "kind", enum846);
        setField(term454262, term454262.getClass(), "typeOfThis", term454814);
        Class<? extends Object> term457045 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term457044 = ((Class) term457045).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term457044).setAccessible(true);
        Object enum847 = ((Field) term457044).get((Object) null);
        term454922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term455104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term454922, term454922.getClass(), "kind", enum847);
        setField(term454922, term454922.getClass(), "typeOfThis", term455104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term454922;
        try {
            callMethod(klass, "isSubtype", argTypes, term454262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


