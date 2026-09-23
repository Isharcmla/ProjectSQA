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

public class FunctionType_getGreatestSubtype_679591709667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676664;
     Object term677328;

    public FunctionType_getGreatestSubtype_679591709667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term678648 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term678647 = ((Class) term678648).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term678647).setAccessible(true);
        Object enum1222 = ((Field) term678647).get((Object) null);
        Class<? extends Object> term678948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term678947 = ((Class) term678948).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term678947).setAccessible(true);
        Object enum1223 = ((Field) term678947).get((Object) null);
        term676664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term677218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term676664, term676664.getClass(), "kind", enum1222);
        setField(term677218, term677218.getClass(), "kind", enum1223);
        setField(term676664, term676664.getClass(), "typeOfThis", term677218);
        term677328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term677650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term677328, term677328.getClass(), "kind", enum1222);
        setField(term677650, term677650.getClass(), "kind", enum1223);
        setField(term677328, term677328.getClass(), "typeOfThis", term677650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term677328;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term676664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


