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

public class FunctionType_isSubtype_21010021581389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1967204;
     Object term1967802;

    public FunctionType_isSubtype_21010021581389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1969325 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1969324 = ((Class) term1969325).getDeclaredField((String) "ORDINARY");
        ((Field) term1969324).setAccessible(true);
        Object enum3490 = ((Field) term1969324).get((Object) null);
        Class<? extends Object> term1969616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1969615 = ((Class) term1969616).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1969615).setAccessible(true);
        Object enum3491 = ((Field) term1969615).get((Object) null);
        term1967204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1967452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1967694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1967204, term1967204.getClass(), "kind", enum3490);
        setField(term1967452, term1967452.getClass(), "kind", enum3491);
        setField(term1967452, term1967452.getClass(), "call", term1967694);
        setField(term1967204, term1967204.getClass(), "typeOfThis", term1967452);
        term1967802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1967984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1967802, term1967802.getClass(), "kind", enum3490);
        setField(term1967984, term1967984.getClass(), "kind", enum3491);
        setField(term1967984, term1967984.getClass(), "call", null);
        setField(term1967802, term1967802.getClass(), "typeOfThis", term1967984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1967802;
        try {
            callMethod(klass, "isSubtype", argTypes, term1967204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


