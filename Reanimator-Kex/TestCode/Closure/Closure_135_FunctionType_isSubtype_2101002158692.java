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

public class FunctionType_isSubtype_2101002158692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628559;
     Object term629211;

    public FunctionType_isSubtype_2101002158692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term632433 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term632432 = ((Class) term632433).getDeclaredField((String) "INTERFACE");
        ((Field) term632432).setAccessible(true);
        Object enum1171 = ((Field) term632432).get((Object) null);
        Class<? extends Object> term632727 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term632726 = ((Class) term632727).getDeclaredField((String) "INTERFACE");
        ((Field) term632726).setAccessible(true);
        Object enum1172 = ((Field) term632726).get((Object) null);
        term628559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term629103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term628559, term628559.getClass(), "kind", enum1171);
        setField(term629103, term629103.getClass(), "kind", enum1172);
        setField(term628559, term628559.getClass(), "typeOfThis", term629103);
        Class<? extends Object> term633021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term633020 = ((Class) term633021).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term633020).setAccessible(true);
        Object enum1173 = ((Field) term633020).get((Object) null);
        term629211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term629541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term629211, term629211.getClass(), "kind", enum1171);
        setField(term629541, term629541.getClass(), "kind", enum1173);
        setField(term629211, term629211.getClass(), "typeOfThis", term629541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term629211;
        try {
            callMethod(klass, "isSubtype", argTypes, term628559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


