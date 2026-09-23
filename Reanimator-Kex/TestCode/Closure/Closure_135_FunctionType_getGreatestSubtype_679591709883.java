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

public class FunctionType_getGreatestSubtype_679591709883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term934056;
     Object term934524;

    public FunctionType_getGreatestSubtype_679591709883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term937677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term937676 = ((Class) term937677).getDeclaredField((String) "ORDINARY");
        ((Field) term937676).setAccessible(true);
        Object enum1746 = ((Field) term937676).get((Object) null);
        term934056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term934312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term934416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term934056, term934056.getClass(), "kind", enum1746);
        setField(term934056, term934056.getClass(), "typeOfThis", term934312);
        setField(term934056, term934056.getClass(), "registry", term934416);
        Class<? extends Object> term937968 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term937967 = ((Class) term937968).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term937967).setAccessible(true);
        Object enum1747 = ((Field) term937967).get((Object) null);
        term934524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term934786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term934524, term934524.getClass(), "kind", enum1747);
        setField(term934524, term934524.getClass(), "typeOfThis", term934786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term934524;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term934056, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


