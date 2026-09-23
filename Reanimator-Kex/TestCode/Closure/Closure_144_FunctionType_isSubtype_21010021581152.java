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

public class FunctionType_isSubtype_21010021581152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1533664;
     Object term1534330;

    public FunctionType_isSubtype_21010021581152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1536199 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1536198 = ((Class) term1536199).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1536198).setAccessible(true);
        Object enum2739 = ((Field) term1536198).get((Object) null);
        term1533664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1534220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term1533664, term1533664.getClass(), "kind", enum2739);
        setField(term1533664, term1533664.getClass(), "typeOfThis", term1534220);
        term1534330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1534330, term1534330.getClass(), "kind", enum2739);
        setField(term1534330, term1534330.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1534330;
        try {
            callMethod(klass, "isSubtype", argTypes, term1533664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


