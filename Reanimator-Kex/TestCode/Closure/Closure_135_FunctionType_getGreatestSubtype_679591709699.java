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

public class FunctionType_getGreatestSubtype_679591709699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644511;
     Object term645167;

    public FunctionType_getGreatestSubtype_679591709699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term646169 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term646168 = ((Class) term646169).getDeclaredField((String) "INTERFACE");
        ((Field) term646168).setAccessible(true);
        Object enum1199 = ((Field) term646168).get((Object) null);
        term644511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term645059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term644511, term644511.getClass(), "kind", enum1199);
        setField(term644511, term644511.getClass(), "registry", term645059);
        Class<? extends Object> term646463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term646462 = ((Class) term646463).getDeclaredField((String) "INTERFACE");
        ((Field) term646462).setAccessible(true);
        Object enum1200 = ((Field) term646462).get((Object) null);
        term645167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term645167, term645167.getClass(), "kind", enum1200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term645167;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term644511, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


