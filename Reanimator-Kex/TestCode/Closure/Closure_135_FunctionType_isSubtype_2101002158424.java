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

public class FunctionType_isSubtype_2101002158424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277817;
     Object term278173;

    public FunctionType_isSubtype_2101002158424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term280609 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term280608 = ((Class) term280609).getDeclaredField((String) "ORDINARY");
        ((Field) term280608).setAccessible(true);
        Object enum510 = ((Field) term280608).get((Object) null);
        term277817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term278065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term277817, term277817.getClass(), "kind", enum510);
        setField(term277817, term277817.getClass(), "typeOfThis", term278065);
        Class<? extends Object> term280900 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term280899 = ((Class) term280900).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term280899).setAccessible(true);
        Object enum511 = ((Field) term280899).get((Object) null);
        term278173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term278173, term278173.getClass(), "kind", enum511);
        setField(term278173, term278173.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term278173;
        try {
            callMethod(klass, "isSubtype", argTypes, term277817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


