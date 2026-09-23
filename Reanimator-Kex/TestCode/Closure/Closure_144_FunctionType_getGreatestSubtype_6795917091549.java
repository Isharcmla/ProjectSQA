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

public class FunctionType_getGreatestSubtype_6795917091549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265382;
     Object term2266046;

    public FunctionType_getGreatestSubtype_6795917091549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2267162 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2267161 = ((Class) term2267162).getDeclaredField((String) "ORDINARY");
        ((Field) term2267161).setAccessible(true);
        Object enum4045 = ((Field) term2267161).get((Object) null);
        term2265382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2265640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2265748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2265842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term2265936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2265382, term2265382.getClass(), "kind", enum4045);
        setField(term2265640, term2265640.getClass(), "kind", enum4045);
        setField(term2265748, term2265748.getClass(), "kind", enum4045);
        setField(term2265748, term2265748.getClass(), "typeOfThis", term2265842);
        setField(term2265640, term2265640.getClass(), "typeOfThis", term2265748);
        setField(term2265382, term2265382.getClass(), "typeOfThis", term2265640);
        setField(term2265382, term2265382.getClass(), "call", term2265936);
        term2266046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2266220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2266320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2266046, term2266046.getClass(), "kind", enum4045);
        setField(term2266220, term2266220.getClass(), "kind", enum4045);
        setField(term2266320, term2266320.getClass(), "kind", enum4045);
        setField(term2266320, term2266320.getClass(), "typeOfThis", null);
        setField(term2266220, term2266220.getClass(), "typeOfThis", term2266320);
        setField(term2266046, term2266046.getClass(), "typeOfThis", term2266220);
        setField(term2266046, term2266046.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2266046;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2265382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


