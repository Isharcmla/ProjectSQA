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

public class FunctionType_isSubtype_21010021581555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2274015;
     Object term2274763;

    public FunctionType_isSubtype_21010021581555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2276039 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2276038 = ((Class) term2276039).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2276038).setAccessible(true);
        Object enum4059 = ((Field) term2276038).get((Object) null);
        term2274015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2274567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2274655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2274015, term2274015.getClass(), "kind", enum4059);
        setField(term2274567, term2274567.getClass(), "kind", enum4059);
        setField(term2274567, term2274567.getClass(), "typeOfThis", term2274655);
        setField(term2274567, term2274567.getClass(), "call", null);
        setField(term2274015, term2274015.getClass(), "typeOfThis", term2274567);
        term2274763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2275093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2275187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2274763, term2274763.getClass(), "kind", enum4059);
        setField(term2275093, term2275093.getClass(), "kind", enum4059);
        setField(term2275093, term2275093.getClass(), "typeOfThis", null);
        setField(term2275093, term2275093.getClass(), "call", term2275187);
        setField(term2274763, term2274763.getClass(), "typeOfThis", term2275093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2274763;
        try {
            callMethod(klass, "isSubtype", argTypes, term2274015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


