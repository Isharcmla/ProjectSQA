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

public class FunctionType_getLeastSupertype_4188508861499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1970176;
     Object term1970932;

    public FunctionType_getLeastSupertype_4188508861499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1971898 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1971897 = ((Class) term1971898).getDeclaredField((String) "ORDINARY");
        ((Field) term1971897).setAccessible(true);
        Object enum3673 = ((Field) term1971897).get((Object) null);
        term1970176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1970730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1970824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1970176, term1970176.getClass(), "kind", enum3673);
        setField(term1970730, term1970730.getClass(), "kind", enum3673);
        setField(term1970730, term1970730.getClass(), "typeOfThis", term1970824);
        setField(term1970176, term1970176.getClass(), "typeOfThis", term1970730);
        term1970932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1971254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1970932, term1970932.getClass(), "kind", enum3673);
        setField(term1971254, term1971254.getClass(), "kind", enum3673);
        setField(term1971254, term1971254.getClass(), "typeOfThis", null);
        setField(term1970932, term1970932.getClass(), "typeOfThis", term1971254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1970932;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1970176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


