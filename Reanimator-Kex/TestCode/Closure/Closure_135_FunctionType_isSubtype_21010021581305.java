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

public class FunctionType_isSubtype_21010021581305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1641785;
     Object term1642437;

    public FunctionType_isSubtype_21010021581305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1644386 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1644385 = ((Class) term1644386).getDeclaredField((String) "ORDINARY");
        ((Field) term1644385).setAccessible(true);
        Object enum3063 = ((Field) term1644385).get((Object) null);
        Class<? extends Object> term1644677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1644676 = ((Class) term1644677).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1644676).setAccessible(true);
        Object enum3064 = ((Field) term1644676).get((Object) null);
        term1641785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1642329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1641785, term1641785.getClass(), "kind", enum3063);
        setField(term1642329, term1642329.getClass(), "kind", enum3064);
        setField(term1641785, term1641785.getClass(), "typeOfThis", term1642329);
        Class<? extends Object> term1644977 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1644976 = ((Class) term1644977).getDeclaredField((String) "INTERFACE");
        ((Field) term1644976).setAccessible(true);
        Object enum3065 = ((Field) term1644976).get((Object) null);
        term1642437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1642767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1642437, term1642437.getClass(), "kind", enum3063);
        setField(term1642767, term1642767.getClass(), "kind", enum3065);
        setField(term1642437, term1642437.getClass(), "typeOfThis", term1642767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1642437;
        try {
            callMethod(klass, "isSubtype", argTypes, term1641785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


