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

public class FunctionType_isSubtype_21010021581241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535021;
     Object term1535683;

    public FunctionType_isSubtype_21010021581241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1536841 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1536840 = ((Class) term1536841).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1536840).setAccessible(true);
        Object enum2867 = ((Field) term1536840).get((Object) null);
        term1535021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1535575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1535021, term1535021.getClass(), "kind", enum2867);
        setField(term1535021, term1535021.getClass(), "typeOfThis", term1535575);
        Class<? extends Object> term1537141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1537140 = ((Class) term1537141).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1537140).setAccessible(true);
        Object enum2868 = ((Field) term1537140).get((Object) null);
        term1535683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1535857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1535683, term1535683.getClass(), "kind", enum2868);
        setField(term1535683, term1535683.getClass(), "typeOfThis", term1535857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1535683;
        try {
            callMethod(klass, "isSubtype", argTypes, term1535021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


