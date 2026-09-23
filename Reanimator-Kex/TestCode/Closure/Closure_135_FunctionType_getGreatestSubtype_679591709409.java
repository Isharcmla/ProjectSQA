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

public class FunctionType_getGreatestSubtype_679591709409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261209;
     Object term261677;

    public FunctionType_getGreatestSubtype_679591709409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term262886 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term262885 = ((Class) term262886).getDeclaredField((String) "ORDINARY");
        ((Field) term262885).setAccessible(true);
        Object enum474 = ((Field) term262885).get((Object) null);
        term261209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term261465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term261569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term261209, term261209.getClass(), "kind", enum474);
        setField(term261209, term261209.getClass(), "typeOfThis", term261465);
        setField(term261209, term261209.getClass(), "registry", term261569);
        Class<? extends Object> term263177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term263176 = ((Class) term263177).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term263176).setAccessible(true);
        Object enum475 = ((Field) term263176).get((Object) null);
        term261677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term261931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term261677, term261677.getClass(), "kind", enum475);
        setField(term261677, term261677.getClass(), "typeOfThis", term261931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term261677;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term261209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


