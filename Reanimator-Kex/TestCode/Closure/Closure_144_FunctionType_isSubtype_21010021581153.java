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

public class FunctionType_isSubtype_21010021581153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535059;
     Object term1535411;

    public FunctionType_isSubtype_21010021581153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1537177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1537176 = ((Class) term1537177).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1537176).setAccessible(true);
        Object enum2741 = ((Field) term1537176).get((Object) null);
        term1535059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1535301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1535059, term1535059.getClass(), "kind", enum2741);
        setField(term1535059, term1535059.getClass(), "call", term1535301);
        term1535411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1535579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1535411, term1535411.getClass(), "kind", enum2741);
        setField(term1535411, term1535411.getClass(), "call", term1535579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1535411;
        try {
            callMethod(klass, "isSubtype", argTypes, term1535059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


