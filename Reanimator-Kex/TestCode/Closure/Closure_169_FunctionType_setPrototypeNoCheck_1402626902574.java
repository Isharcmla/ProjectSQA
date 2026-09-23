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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552956;
     Object term553568;

    public FunctionType_setPrototypeNoCheck_1402626902574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term554467 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term554466 = ((Class) term554467).getDeclaredField((String) "INTERFACE");
        ((Field) term554466).setAccessible(true);
        Object enum905 = ((Field) term554466).get((Object) null);
        ArrayList term553458 = new ArrayList();
        term552956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term553070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term553158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term553258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term553158, term553158.getClass(), "ownerFunction", term553258);
        setField(term553070, term553070.getClass(), "type", term553158);
        setField(term552956, term552956.getClass(), "prototypeSlot", term553070);
        setField(term552956, term552956.getClass(), "source", null);
        setField(term552956, term552956.getClass(), "kind", enum905);
        setField(term552956, term552956.getClass(), "extendedInterfaces", term553458);
        term553568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term553568, term553568.getClass(), "ownerFunction", null);
        setField(term553568, term553568.getClass(), "implicitPrototypeFallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term553568;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term552956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


