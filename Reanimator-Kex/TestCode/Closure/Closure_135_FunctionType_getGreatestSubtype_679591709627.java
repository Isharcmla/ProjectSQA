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

public class FunctionType_getGreatestSubtype_679591709627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543698;
     Object term543954;

    public FunctionType_getGreatestSubtype_679591709627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term544647 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term544646 = ((Class) term544647).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term544646).setAccessible(true);
        Object enum1004 = ((Field) term544646).get((Object) null);
        term543698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term543698, term543698.getClass(), "kind", enum1004);
        term543954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term543954, term543954.getClass(), "kind", enum1004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term543954;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term543698, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


