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

public class FunctionType_isSubtype_21010021581044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342965;
     Object term1343617;

    public FunctionType_isSubtype_21010021581044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1347669 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1347668 = ((Class) term1347669).getDeclaredField((String) "ORDINARY");
        ((Field) term1347668).setAccessible(true);
        Object enum2411 = ((Field) term1347668).get((Object) null);
        Class<? extends Object> term1347960 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1347959 = ((Class) term1347960).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1347959).setAccessible(true);
        Object enum2412 = ((Field) term1347959).get((Object) null);
        term1342965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1343997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1342965, term1342965.getClass(), "kind", enum2411);
        setField(term1343997, term1343997.getClass(), "kind", enum2412);
        setField(term1343997, term1343997.getClass(), "typeOfThis", null);
        setField(term1343997, term1343997.getClass(), "call", null);
        setField(term1342965, term1342965.getClass(), "typeOfThis", term1343997);
        Class<? extends Object> term1348260 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1348259 = ((Class) term1348260).getDeclaredField((String) "INTERFACE");
        ((Field) term1348259).setAccessible(true);
        Object enum2413 = ((Field) term1348259).get((Object) null);
        term1343617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1343947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1344091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1343617, term1343617.getClass(), "kind", enum2411);
        setField(term1343947, term1343947.getClass(), "kind", enum2413);
        setField(term1343947, term1343947.getClass(), "typeOfThis", term1343997);
        setField(term1343947, term1343947.getClass(), "call", term1344091);
        setField(term1343617, term1343617.getClass(), "typeOfThis", term1343947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1343617;
        try {
            callMethod(klass, "isSubtype", argTypes, term1342965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


