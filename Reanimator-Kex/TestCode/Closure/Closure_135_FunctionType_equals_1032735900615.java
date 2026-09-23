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

public class FunctionType_equals_1032735900615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523608;
     Object term523956;

    public FunctionType_equals_1032735900615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term525008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term525007 = ((Class) term525008).getDeclaredField((String) "ORDINARY");
        ((Field) term525007).setAccessible(true);
        Object enum970 = ((Field) term525007).get((Object) null);
        term523608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term523856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term523608, term523608.getClass(), "kind", enum970);
        setField(term523608, term523608.getClass(), "typeOfThis", term523856);
        Class<? extends Object> term525299 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term525298 = ((Class) term525299).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term525298).setAccessible(true);
        Object enum971 = ((Field) term525298).get((Object) null);
        term523956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term523956, term523956.getClass(), "kind", enum971);
        setField(term523956, term523956.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term523956;
        try {
            callMethod(klass, "equals", argTypes, term523608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


