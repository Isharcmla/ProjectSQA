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

public class FunctionType_getLeastSupertype_418850886401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304483;
     Object term304951;

    public FunctionType_getLeastSupertype_418850886401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term306350 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term306349 = ((Class) term306350).getDeclaredField((String) "ORDINARY");
        ((Field) term306349).setAccessible(true);
        Object enum528 = ((Field) term306349).get((Object) null);
        term304483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term304731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term304841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term304483, term304483.getClass(), "kind", enum528);
        setField(term304731, term304731.getClass(), "kind", enum528);
        setField(term304731, term304731.getClass(), "typeOfThis", term304841);
        setField(term304483, term304483.getClass(), "typeOfThis", term304731);
        Class<? extends Object> term306641 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term306640 = ((Class) term306641).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term306640).setAccessible(true);
        Object enum529 = ((Field) term306640).get((Object) null);
        term304951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term305125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term304951, term304951.getClass(), "kind", enum528);
        setField(term305125, term305125.getClass(), "kind", enum529);
        setField(term305125, term305125.getClass(), "typeOfThis", null);
        setField(term304951, term304951.getClass(), "typeOfThis", term305125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term304951;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term304483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


