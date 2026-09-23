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

public class FunctionType_isSubtype_21010021581520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211993;
     Object term2212647;

    public FunctionType_isSubtype_21010021581520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2216093 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2216092 = ((Class) term2216093).getDeclaredField((String) "INTERFACE");
        ((Field) term2216092).setAccessible(true);
        Object enum3951 = ((Field) term2216092).get((Object) null);
        Class<? extends Object> term2216387 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2216386 = ((Class) term2216387).getDeclaredField((String) "INTERFACE");
        ((Field) term2216386).setAccessible(true);
        Object enum3952 = ((Field) term2216386).get((Object) null);
        term2211993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2212537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2211993, term2211993.getClass(), "kind", enum3951);
        setField(term2212537, term2212537.getClass(), "kind", enum3952);
        setField(term2211993, term2211993.getClass(), "typeOfThis", term2212537);
        Class<? extends Object> term2216681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2216680 = ((Class) term2216681).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2216680).setAccessible(true);
        Object enum3953 = ((Field) term2216680).get((Object) null);
        term2212647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2212831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2212647, term2212647.getClass(), "kind", enum3953);
        setField(term2212831, term2212831.getClass(), "kind", enum3952);
        setField(term2212647, term2212647.getClass(), "typeOfThis", term2212831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2212647;
        try {
            callMethod(klass, "isSubtype", argTypes, term2211993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


