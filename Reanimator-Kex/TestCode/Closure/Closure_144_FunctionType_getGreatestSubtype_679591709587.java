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

public class FunctionType_getGreatestSubtype_679591709587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556981;
     Object term557457;

    public FunctionType_getGreatestSubtype_679591709587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term558956 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term558955 = ((Class) term558956).getDeclaredField((String) "ORDINARY");
        ((Field) term558955).setAccessible(true);
        Object enum1016 = ((Field) term558955).get((Object) null);
        term556981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term557239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term557347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term556981, term556981.getClass(), "kind", enum1016);
        setField(term557239, term557239.getClass(), "kind", enum1016);
        setField(term557239, term557239.getClass(), "typeOfThis", term557347);
        setField(term556981, term556981.getClass(), "typeOfThis", term557239);
        Class<? extends Object> term559247 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term559246 = ((Class) term559247).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term559246).setAccessible(true);
        Object enum1017 = ((Field) term559246).get((Object) null);
        term557457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term557631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term557879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term557457, term557457.getClass(), "kind", enum1016);
        setField(term557631, term557631.getClass(), "kind", enum1017);
        setField(term557631, term557631.getClass(), "typeOfThis", term557879);
        setField(term557457, term557457.getClass(), "typeOfThis", term557631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term557457;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term556981, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


