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

public class FunctionType_isSubtype_2101002158729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683398;
     Object term684058;

    public FunctionType_isSubtype_2101002158729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term684957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term684956 = ((Class) term684957).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term684956).setAccessible(true);
        Object enum1269 = ((Field) term684956).get((Object) null);
        term683398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term683950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term683398, term683398.getClass(), "kind", enum1269);
        setField(term683398, term683398.getClass(), "typeOfThis", term683950);
        term684058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term684058, term684058.getClass(), "kind", enum1269);
        setField(term684058, term684058.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term684058;
        try {
            callMethod(klass, "isSubtype", argTypes, term683398, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


