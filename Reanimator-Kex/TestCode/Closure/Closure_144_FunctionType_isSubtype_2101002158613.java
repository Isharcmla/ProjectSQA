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

public class FunctionType_isSubtype_2101002158613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595104;
     Object term595470;

    public FunctionType_isSubtype_2101002158613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term596660 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term596659 = ((Class) term596660).getDeclaredField((String) "ORDINARY");
        ((Field) term596659).setAccessible(true);
        Object enum1081 = ((Field) term596659).get((Object) null);
        term595104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term595360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term595104, term595104.getClass(), "kind", enum1081);
        setField(term595104, term595104.getClass(), "typeOfThis", term595360);
        Class<? extends Object> term596951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term596950 = ((Class) term596951).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term596950).setAccessible(true);
        Object enum1082 = ((Field) term596950).get((Object) null);
        term595470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term595726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term595470, term595470.getClass(), "kind", enum1082);
        setField(term595470, term595470.getClass(), "typeOfThis", term595726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term595470;
        try {
            callMethod(klass, "isSubtype", argTypes, term595104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


