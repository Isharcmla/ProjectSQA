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

public class FunctionType_getGreatestSubtype_679591709961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063409;
     Object term1063973;

    public FunctionType_getGreatestSubtype_679591709961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1067183 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1067182 = ((Class) term1067183).getDeclaredField((String) "ORDINARY");
        ((Field) term1067182).setAccessible(true);
        Object enum1988 = ((Field) term1067182).get((Object) null);
        term1063409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1063665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1063761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1063865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1063409, term1063409.getClass(), "kind", enum1988);
        setField(term1063665, term1063665.getClass(), "kind", enum1988);
        setField(term1063665, term1063665.getClass(), "typeOfThis", term1063761);
        setField(term1063409, term1063409.getClass(), "typeOfThis", term1063665);
        setField(term1063409, term1063409.getClass(), "registry", term1063865);
        Class<? extends Object> term1067474 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1067473 = ((Class) term1067474).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1067473).setAccessible(true);
        Object enum1989 = ((Field) term1067473).get((Object) null);
        term1063973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1064231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1063973, term1063973.getClass(), "kind", enum1989);
        setField(term1064231, term1064231.getClass(), "kind", enum1989);
        setField(term1064231, term1064231.getClass(), "typeOfThis", null);
        setField(term1063973, term1063973.getClass(), "typeOfThis", term1064231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1063973;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1063409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


