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

public class FunctionType_isSubtype_21010021581123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1481139;
     Object term1481899;

    public FunctionType_isSubtype_21010021581123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1485863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1485862 = ((Class) term1485863).getDeclaredField((String) "ORDINARY");
        ((Field) term1485862).setAccessible(true);
        Object enum2650 = ((Field) term1485862).get((Object) null);
        Class<? extends Object> term1486154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1486153 = ((Class) term1486154).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1486153).setAccessible(true);
        Object enum2651 = ((Field) term1486153).get((Object) null);
        term1481139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1482279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1482333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1481139, term1481139.getClass(), "kind", enum2650);
        setField(term1482279, term1482279.getClass(), "kind", enum2651);
        setField(term1482279, term1482279.getClass(), "typeOfThis", term1482333);
        setField(term1482279, term1482279.getClass(), "call", null);
        setField(term1481139, term1481139.getClass(), "typeOfThis", term1482279);
        Class<? extends Object> term1486454 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1486453 = ((Class) term1486454).getDeclaredField((String) "INTERFACE");
        ((Field) term1486453).setAccessible(true);
        Object enum2652 = ((Field) term1486453).get((Object) null);
        term1481899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1482229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1482427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1481899, term1481899.getClass(), "kind", enum2650);
        setField(term1482229, term1482229.getClass(), "kind", enum2652);
        setField(term1482229, term1482229.getClass(), "typeOfThis", term1482279);
        setField(term1482229, term1482229.getClass(), "call", term1482427);
        setField(term1481899, term1481899.getClass(), "typeOfThis", term1482229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1481899;
        try {
            callMethod(klass, "isSubtype", argTypes, term1481139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


