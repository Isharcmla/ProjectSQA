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

public class FunctionType_isSubtype_2101002158919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996802;
     Object term997158;

    public FunctionType_isSubtype_2101002158919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term998455 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term998454 = ((Class) term998455).getDeclaredField((String) "ORDINARY");
        ((Field) term998454).setAccessible(true);
        Object enum1864 = ((Field) term998454).get((Object) null);
        term996802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term997050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term996802, term996802.getClass(), "kind", enum1864);
        setField(term997050, term997050.getClass(), "kind", enum1864);
        setField(term996802, term996802.getClass(), "typeOfThis", term997050);
        Class<? extends Object> term998746 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term998745 = ((Class) term998746).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term998745).setAccessible(true);
        Object enum1865 = ((Field) term998745).get((Object) null);
        term997158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term997340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term997158, term997158.getClass(), "kind", enum1864);
        setField(term997340, term997340.getClass(), "kind", enum1865);
        setField(term997158, term997158.getClass(), "typeOfThis", term997340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term997158;
        try {
            callMethod(klass, "isSubtype", argTypes, term996802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


