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

public class FunctionType_isSubtype_21010021581573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2091492;
     Object term2092262;

    public FunctionType_isSubtype_21010021581573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2094727 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2094726 = ((Class) term2094727).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2094726).setAccessible(true);
        Object enum3898 = ((Field) term2094726).get((Object) null);
        term2091492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2092044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2092154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2091492, term2091492.getClass(), "kind", enum3898);
        setField(term2092044, term2092044.getClass(), "kind", enum3898);
        setField(term2092044, term2092044.getClass(), "typeOfThis", term2092154);
        setField(term2091492, term2091492.getClass(), "typeOfThis", term2092044);
        Class<? extends Object> term2095027 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2095026 = ((Class) term2095027).getDeclaredField((String) "INTERFACE");
        ((Field) term2095026).setAccessible(true);
        Object enum3899 = ((Field) term2095026).get((Object) null);
        term2092262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2092592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2092702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2092262, term2092262.getClass(), "kind", enum3898);
        setField(term2092592, term2092592.getClass(), "kind", enum3899);
        setField(term2092592, term2092592.getClass(), "typeOfThis", term2092702);
        setField(term2092262, term2092262.getClass(), "typeOfThis", term2092592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2092262;
        try {
            callMethod(klass, "isSubtype", argTypes, term2091492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


