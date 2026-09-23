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

public class FunctionType_isSubtype_2101002158587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481249;
     Object term481901;

    public FunctionType_isSubtype_2101002158587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term483143 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term483142 = ((Class) term483143).getDeclaredField((String) "INTERFACE");
        ((Field) term483142).setAccessible(true);
        Object enum892 = ((Field) term483142).get((Object) null);
        Class<? extends Object> term483437 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term483436 = ((Class) term483437).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term483436).setAccessible(true);
        Object enum893 = ((Field) term483436).get((Object) null);
        term481249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term481793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term481249, term481249.getClass(), "kind", enum892);
        setField(term481793, term481793.getClass(), "kind", enum893);
        setField(term481249, term481249.getClass(), "typeOfThis", term481793);
        term481901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term482083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term481901, term481901.getClass(), "kind", enum893);
        setField(term481901, term481901.getClass(), "typeOfThis", term482083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term481901;
        try {
            callMethod(klass, "isSubtype", argTypes, term481249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


