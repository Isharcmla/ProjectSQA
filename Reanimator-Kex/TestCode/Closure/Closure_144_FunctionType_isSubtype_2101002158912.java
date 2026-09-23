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

public class FunctionType_isSubtype_2101002158912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111007;
     Object term1111747;

    public FunctionType_isSubtype_2101002158912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1114291 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1114290 = ((Class) term1114291).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1114290).setAccessible(true);
        Object enum2002 = ((Field) term1114290).get((Object) null);
        term1111007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1111551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1111639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1111007, term1111007.getClass(), "kind", enum2002);
        setField(term1111551, term1111551.getClass(), "kind", enum2002);
        setField(term1111551, term1111551.getClass(), "typeOfThis", term1111639);
        setField(term1111007, term1111007.getClass(), "typeOfThis", term1111551);
        term1111747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1112077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1112177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1111747, term1111747.getClass(), "kind", enum2002);
        setField(term1112077, term1112077.getClass(), "kind", enum2002);
        setField(term1112077, term1112077.getClass(), "typeOfThis", term1112177);
        setField(term1111747, term1111747.getClass(), "typeOfThis", term1112077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1111747;
        try {
            callMethod(klass, "isSubtype", argTypes, term1111007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


