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

public class FunctionType_isSubtype_2101002158782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767974;
     Object term768436;

    public FunctionType_isSubtype_2101002158782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term772207 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term772206 = ((Class) term772207).getDeclaredField((String) "ORDINARY");
        ((Field) term772206).setAccessible(true);
        Object enum1436 = ((Field) term772206).get((Object) null);
        term767974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term768222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term768328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term767974, term767974.getClass(), "kind", enum1436);
        setField(term768222, term768222.getClass(), "kind", enum1436);
        setField(term768222, term768222.getClass(), "typeOfThis", term768328);
        setField(term768222, term768222.getClass(), "call", null);
        setField(term767974, term767974.getClass(), "typeOfThis", term768222);
        Class<? extends Object> term772498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term772497 = ((Class) term772498).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term772497).setAccessible(true);
        Object enum1437 = ((Field) term772497).get((Object) null);
        term768436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term768618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term768860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term768436, term768436.getClass(), "kind", enum1436);
        setField(term768618, term768618.getClass(), "kind", enum1437);
        setField(term768618, term768618.getClass(), "typeOfThis", null);
        setField(term768618, term768618.getClass(), "call", term768860);
        setField(term768436, term768436.getClass(), "typeOfThis", term768618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term768436;
        try {
            callMethod(klass, "isSubtype", argTypes, term767974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


