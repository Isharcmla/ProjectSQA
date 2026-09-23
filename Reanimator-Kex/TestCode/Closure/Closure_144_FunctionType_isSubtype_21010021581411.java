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

public class FunctionType_isSubtype_21010021581411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2008031;
     Object term2008683;

    public FunctionType_isSubtype_21010021581411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2009946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2009945 = ((Class) term2009946).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2009945).setAccessible(true);
        Object enum3567 = ((Field) term2009945).get((Object) null);
        Class<? extends Object> term2010246 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2010245 = ((Class) term2010246).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2010245).setAccessible(true);
        Object enum3568 = ((Field) term2010245).get((Object) null);
        term2008031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2008575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2008031, term2008031.getClass(), "kind", enum3567);
        setField(term2008575, term2008575.getClass(), "kind", enum3568);
        setField(term2008031, term2008031.getClass(), "typeOfThis", term2008575);
        term2008683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2009013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2008683, term2008683.getClass(), "kind", enum3567);
        setField(term2009013, term2009013.getClass(), "kind", enum3567);
        setField(term2008683, term2008683.getClass(), "typeOfThis", term2009013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2008683;
        try {
            callMethod(klass, "isSubtype", argTypes, term2008031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


