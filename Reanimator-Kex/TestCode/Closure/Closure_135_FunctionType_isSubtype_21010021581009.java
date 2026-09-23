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

public class FunctionType_isSubtype_21010021581009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138891;
     Object term1139347;

    public FunctionType_isSubtype_21010021581009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1142960 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1142959 = ((Class) term1142960).getDeclaredField((String) "ORDINARY");
        ((Field) term1142959).setAccessible(true);
        Object enum2125 = ((Field) term1142959).get((Object) null);
        term1138891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1139139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1139239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1138891, term1138891.getClass(), "kind", enum2125);
        setField(term1139139, term1139139.getClass(), "kind", enum2125);
        setField(term1139139, term1139139.getClass(), "typeOfThis", term1139239);
        setField(term1138891, term1138891.getClass(), "typeOfThis", term1139139);
        Class<? extends Object> term1143251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1143250 = ((Class) term1143251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1143250).setAccessible(true);
        Object enum2126 = ((Field) term1143250).get((Object) null);
        term1139347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1139529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1139347, term1139347.getClass(), "kind", enum2125);
        setField(term1139529, term1139529.getClass(), "kind", enum2126);
        setField(term1139529, term1139529.getClass(), "typeOfThis", null);
        setField(term1139347, term1139347.getClass(), "typeOfThis", term1139529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1139347;
        try {
            callMethod(klass, "isSubtype", argTypes, term1138891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


