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

public class FunctionType_isSubtype_2101002158861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021550;
     Object term1022312;

    public FunctionType_isSubtype_2101002158861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1023577 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1023576 = ((Class) term1023577).getDeclaredField((String) "ORDINARY");
        ((Field) term1023576).setAccessible(true);
        Object enum1848 = ((Field) term1023576).get((Object) null);
        term1021550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1022094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1022204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1021550, term1021550.getClass(), "kind", enum1848);
        setField(term1022094, term1022094.getClass(), "kind", enum1848);
        setField(term1022094, term1022094.getClass(), "typeOfThis", term1022204);
        setField(term1021550, term1021550.getClass(), "typeOfThis", term1022094);
        Class<? extends Object> term1023868 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1023867 = ((Class) term1023868).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1023867).setAccessible(true);
        Object enum1849 = ((Field) term1023867).get((Object) null);
        term1022312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1022642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1022312, term1022312.getClass(), "kind", enum1848);
        setField(term1022642, term1022642.getClass(), "kind", enum1849);
        setField(term1022642, term1022642.getClass(), "typeOfThis", null);
        setField(term1022312, term1022312.getClass(), "typeOfThis", term1022642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1022312;
        try {
            callMethod(klass, "isSubtype", argTypes, term1021550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


