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

public class FunctionType_getGreatestSubtype_679591709453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372074;
     Object term372734;

    public FunctionType_getGreatestSubtype_679591709453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term373749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term373748 = ((Class) term373749).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term373748).setAccessible(true);
        Object enum635 = ((Field) term373748).get((Object) null);
        term372074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term372624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term372074, term372074.getClass(), "kind", enum635);
        setField(term372074, term372074.getClass(), "typeOfThis", term372624);
        Class<? extends Object> term374049 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term374048 = ((Class) term374049).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term374048).setAccessible(true);
        Object enum636 = ((Field) term374048).get((Object) null);
        term372734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term372734, term372734.getClass(), "kind", enum636);
        setField(term372734, term372734.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term372734;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term372074, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


