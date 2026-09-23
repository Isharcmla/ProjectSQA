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

public class FunctionType_isSubtype_2101002158947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1037194;
     Object term1037846;

    public FunctionType_isSubtype_2101002158947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1039438 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1039437 = ((Class) term1039438).getDeclaredField((String) "ORDINARY");
        ((Field) term1039437).setAccessible(true);
        Object enum1938 = ((Field) term1039437).get((Object) null);
        Class<? extends Object> term1039729 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1039728 = ((Class) term1039729).getDeclaredField((String) "INTERFACE");
        ((Field) term1039728).setAccessible(true);
        Object enum1939 = ((Field) term1039728).get((Object) null);
        term1037194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1037738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1037194, term1037194.getClass(), "kind", enum1938);
        setField(term1037738, term1037738.getClass(), "kind", enum1939);
        setField(term1037194, term1037194.getClass(), "typeOfThis", term1037738);
        Class<? extends Object> term1040023 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1040022 = ((Class) term1040023).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1040022).setAccessible(true);
        Object enum1940 = ((Field) term1040022).get((Object) null);
        term1037846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1038028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1037846, term1037846.getClass(), "kind", enum1940);
        setField(term1038028, term1038028.getClass(), "kind", enum1939);
        setField(term1037846, term1037846.getClass(), "typeOfThis", term1038028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1037846;
        try {
            callMethod(klass, "isSubtype", argTypes, term1037194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


