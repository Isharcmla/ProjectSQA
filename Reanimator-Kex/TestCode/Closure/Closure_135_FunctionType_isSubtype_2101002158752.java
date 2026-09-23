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

public class FunctionType_isSubtype_2101002158752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718528;
     Object term719188;

    public FunctionType_isSubtype_2101002158752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term722211 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term722210 = ((Class) term722211).getDeclaredField((String) "INTERFACE");
        ((Field) term722210).setAccessible(true);
        Object enum1341 = ((Field) term722210).get((Object) null);
        Class<? extends Object> term722505 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term722504 = ((Class) term722505).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term722504).setAccessible(true);
        Object enum1342 = ((Field) term722504).get((Object) null);
        term718528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term719080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term718528, term718528.getClass(), "kind", enum1341);
        setField(term719080, term719080.getClass(), "kind", enum1342);
        setField(term718528, term718528.getClass(), "typeOfThis", term719080);
        term719188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term719518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term719188, term719188.getClass(), "kind", enum1341);
        setField(term719518, term719518.getClass(), "kind", enum1341);
        setField(term719188, term719188.getClass(), "typeOfThis", term719518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term719188;
        try {
            callMethod(klass, "isSubtype", argTypes, term718528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


