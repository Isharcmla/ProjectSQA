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

public class FunctionType_isSubtype_2101002158561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444291;
     Object term444951;

    public FunctionType_isSubtype_2101002158561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term446193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term446192 = ((Class) term446193).getDeclaredField((String) "INTERFACE");
        ((Field) term446192).setAccessible(true);
        Object enum824 = ((Field) term446192).get((Object) null);
        Class<? extends Object> term446487 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term446486 = ((Class) term446487).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term446486).setAccessible(true);
        Object enum825 = ((Field) term446486).get((Object) null);
        term444291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term444843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term444291, term444291.getClass(), "kind", enum824);
        setField(term444843, term444843.getClass(), "kind", enum825);
        setField(term444291, term444291.getClass(), "typeOfThis", term444843);
        term444951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term445133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term444951, term444951.getClass(), "kind", enum825);
        setField(term444951, term444951.getClass(), "typeOfThis", term445133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term444951;
        try {
            callMethod(klass, "isSubtype", argTypes, term444291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


