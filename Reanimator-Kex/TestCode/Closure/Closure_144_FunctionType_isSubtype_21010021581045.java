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

public class FunctionType_isSubtype_21010021581045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345244;
     Object term1345844;

    public FunctionType_isSubtype_21010021581045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1350720 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1350719 = ((Class) term1350720).getDeclaredField((String) "ORDINARY");
        ((Field) term1350719).setAccessible(true);
        Object enum2419 = ((Field) term1350719).get((Object) null);
        Class<? extends Object> term1351011 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1351010 = ((Class) term1351011).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1351010).setAccessible(true);
        Object enum2420 = ((Field) term1351010).get((Object) null);
        term1345244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1345492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1345734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1345244, term1345244.getClass(), "kind", enum2419);
        setField(term1345492, term1345492.getClass(), "kind", enum2420);
        setField(term1345492, term1345492.getClass(), "call", term1345734);
        setField(term1345244, term1345244.getClass(), "typeOfThis", term1345492);
        term1345844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1346028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1346196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1345844, term1345844.getClass(), "kind", enum2419);
        setField(term1346028, term1346028.getClass(), "kind", enum2420);
        setField(term1346028, term1346028.getClass(), "call", term1346196);
        setField(term1345844, term1345844.getClass(), "typeOfThis", term1346028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1345844;
        try {
            callMethod(klass, "isSubtype", argTypes, term1345244, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


