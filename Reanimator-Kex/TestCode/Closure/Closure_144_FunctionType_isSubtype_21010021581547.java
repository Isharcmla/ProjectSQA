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

public class FunctionType_isSubtype_21010021581547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2262989;
     Object term2263341;

    public FunctionType_isSubtype_21010021581547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2264198 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2264197 = ((Class) term2264198).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2264197).setAccessible(true);
        Object enum4041 = ((Field) term2264197).get((Object) null);
        term2262989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2263231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2262989, term2262989.getClass(), "kind", enum4041);
        setField(term2262989, term2262989.getClass(), "call", term2263231);
        term2263341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2263509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2263341, term2263341.getClass(), "kind", enum4041);
        setField(term2263341, term2263341.getClass(), "call", term2263509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2263341;
        try {
            callMethod(klass, "isSubtype", argTypes, term2262989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


