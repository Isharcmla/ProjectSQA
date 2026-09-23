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

public class FunctionType_getGreatestSubtype_679591709801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913978;
     Object term914340;

    public FunctionType_getGreatestSubtype_679591709801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term917570 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term917569 = ((Class) term917570).getDeclaredField((String) "INTERFACE");
        ((Field) term917569).setAccessible(true);
        Object enum1658 = ((Field) term917569).get((Object) null);
        term913978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term914230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term913978, term913978.getClass(), "kind", enum1658);
        setField(term913978, term913978.getClass(), "registry", term914230);
        Class<? extends Object> term917864 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term917863 = ((Class) term917864).getDeclaredField((String) "ORDINARY");
        ((Field) term917863).setAccessible(true);
        Object enum1659 = ((Field) term917863).get((Object) null);
        term914340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term914340, term914340.getClass(), "kind", enum1659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term914340;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term913978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


