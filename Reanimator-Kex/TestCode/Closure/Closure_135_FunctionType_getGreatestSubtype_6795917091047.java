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

public class FunctionType_getGreatestSubtype_6795917091047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198039;
     Object term1198699;

    public FunctionType_getGreatestSubtype_6795917091047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1199863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1199862 = ((Class) term1199863).getDeclaredField((String) "INTERFACE");
        ((Field) term1199862).setAccessible(true);
        Object enum2234 = ((Field) term1199862).get((Object) null);
        Class<? extends Object> term1200157 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1200156 = ((Class) term1200157).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1200156).setAccessible(true);
        Object enum2235 = ((Field) term1200156).get((Object) null);
        term1198039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1198591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1198039, term1198039.getClass(), "kind", enum2234);
        setField(term1198591, term1198591.getClass(), "kind", enum2235);
        setField(term1198039, term1198039.getClass(), "typeOfThis", term1198591);
        term1198699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1198873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1198699, term1198699.getClass(), "kind", enum2235);
        setField(term1198699, term1198699.getClass(), "typeOfThis", term1198873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1198699;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1198039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


