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

public class FunctionType_getLeastSupertype_418850886931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1015981;
     Object term1016643;

    public FunctionType_getLeastSupertype_418850886931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1017761 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1017760 = ((Class) term1017761).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1017760).setAccessible(true);
        Object enum1897 = ((Field) term1017760).get((Object) null);
        term1015981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1016535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1015981, term1015981.getClass(), "kind", enum1897);
        setField(term1015981, term1015981.getClass(), "typeOfThis", term1016535);
        Class<? extends Object> term1018061 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1018060 = ((Class) term1018061).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1018060).setAccessible(true);
        Object enum1898 = ((Field) term1018060).get((Object) null);
        term1016643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1016825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1016643, term1016643.getClass(), "kind", enum1898);
        setField(term1016643, term1016643.getClass(), "typeOfThis", term1016825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1016643;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1015981, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


