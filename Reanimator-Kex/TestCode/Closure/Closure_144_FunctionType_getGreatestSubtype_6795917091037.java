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

public class FunctionType_getGreatestSubtype_6795917091037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1331858;
     Object term1332630;

    public FunctionType_getGreatestSubtype_6795917091037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1334035 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1334034 = ((Class) term1334035).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1334034).setAccessible(true);
        Object enum2388 = ((Field) term1334034).get((Object) null);
        term1331858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1332412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1332520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1331858, term1331858.getClass(), "kind", enum2388);
        setField(term1332412, term1332412.getClass(), "kind", enum2388);
        setField(term1332520, term1332520.getClass(), "kind", enum2388);
        setField(term1332412, term1332412.getClass(), "typeOfThis", term1332520);
        setField(term1331858, term1331858.getClass(), "typeOfThis", term1332412);
        Class<? extends Object> term1334335 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1334334 = ((Class) term1334335).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1334334).setAccessible(true);
        Object enum2389 = ((Field) term1334334).get((Object) null);
        term1332630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1332960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1333060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1332630, term1332630.getClass(), "kind", enum2388);
        setField(term1332960, term1332960.getClass(), "kind", enum2388);
        setField(term1333060, term1333060.getClass(), "kind", enum2389);
        setField(term1332960, term1332960.getClass(), "typeOfThis", term1333060);
        setField(term1332630, term1332630.getClass(), "typeOfThis", term1332960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1332630;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1331858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


