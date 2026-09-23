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

public class FunctionType_isSubtype_2101002158589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484851;
     Object term485503;

    public FunctionType_isSubtype_2101002158589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term486661 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term486660 = ((Class) term486661).getDeclaredField((String) "ORDINARY");
        ((Field) term486660).setAccessible(true);
        Object enum899 = ((Field) term486660).get((Object) null);
        term484851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term485395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term484851, term484851.getClass(), "kind", enum899);
        setField(term484851, term484851.getClass(), "typeOfThis", term485395);
        Class<? extends Object> term486952 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term486951 = ((Class) term486952).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term486951).setAccessible(true);
        Object enum900 = ((Field) term486951).get((Object) null);
        term485503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term485677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term485503, term485503.getClass(), "kind", enum900);
        setField(term485503, term485503.getClass(), "typeOfThis", term485677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term485503;
        try {
            callMethod(klass, "isSubtype", argTypes, term484851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


