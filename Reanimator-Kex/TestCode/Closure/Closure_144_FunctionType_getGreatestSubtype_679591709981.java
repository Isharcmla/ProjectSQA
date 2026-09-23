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

public class FunctionType_getGreatestSubtype_679591709981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223890;
     Object term1224644;

    public FunctionType_getGreatestSubtype_679591709981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1227730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1227729 = ((Class) term1227730).getDeclaredField((String) "ORDINARY");
        ((Field) term1227729).setAccessible(true);
        Object enum2202 = ((Field) term1227729).get((Object) null);
        Class<? extends Object> term1228021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1228020 = ((Class) term1228021).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1228020).setAccessible(true);
        Object enum2203 = ((Field) term1228020).get((Object) null);
        term1223890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1225016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1225066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1223890, term1223890.getClass(), "kind", enum2202);
        setField(term1225016, term1225016.getClass(), "kind", enum2203);
        setField(term1225066, term1225066.getClass(), "kind", enum2203);
        setField(term1225016, term1225016.getClass(), "typeOfThis", term1225066);
        setField(term1223890, term1223890.getClass(), "typeOfThis", term1225016);
        term1224644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1224818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1224644, term1224644.getClass(), "kind", enum2203);
        setField(term1224818, term1224818.getClass(), "kind", enum2202);
        setField(term1224818, term1224818.getClass(), "typeOfThis", term1225016);
        setField(term1224644, term1224644.getClass(), "typeOfThis", term1224818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1224644;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1223890, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


