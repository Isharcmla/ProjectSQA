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

public class FunctionType_isSubtype_21010021581534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2240100;
     Object term2240760;

    public FunctionType_isSubtype_21010021581534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2244309 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2244308 = ((Class) term2244309).getDeclaredField((String) "ORDINARY");
        ((Field) term2244308).setAccessible(true);
        Object enum4003 = ((Field) term2244308).get((Object) null);
        Class<? extends Object> term2244600 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2244599 = ((Class) term2244600).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2244599).setAccessible(true);
        Object enum4004 = ((Field) term2244599).get((Object) null);
        term2240100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2240652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2240100, term2240100.getClass(), "kind", enum4003);
        setField(term2240652, term2240652.getClass(), "kind", enum4004);
        setField(term2240652, term2240652.getClass(), "call", null);
        setField(term2240100, term2240100.getClass(), "typeOfThis", term2240652);
        term2240760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2241090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2241184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2240760, term2240760.getClass(), "kind", enum4003);
        setField(term2241090, term2241090.getClass(), "kind", enum4004);
        setField(term2241090, term2241090.getClass(), "call", term2241184);
        setField(term2240760, term2240760.getClass(), "typeOfThis", term2241090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2240760;
        try {
            callMethod(klass, "isSubtype", argTypes, term2240100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


