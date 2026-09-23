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

public class FunctionType_isSubtype_21010021581189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1601858;
     Object term1602512;

    public FunctionType_isSubtype_21010021581189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1604172 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1604171 = ((Class) term1604172).getDeclaredField((String) "ORDINARY");
        ((Field) term1604171).setAccessible(true);
        Object enum2864 = ((Field) term1604171).get((Object) null);
        Class<? extends Object> term1604463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1604462 = ((Class) term1604463).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1604462).setAccessible(true);
        Object enum2865 = ((Field) term1604462).get((Object) null);
        term1601858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1602402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1601858, term1601858.getClass(), "kind", enum2864);
        setField(term1602402, term1602402.getClass(), "kind", enum2865);
        setField(term1601858, term1601858.getClass(), "typeOfThis", term1602402);
        Class<? extends Object> term1604763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1604762 = ((Class) term1604763).getDeclaredField((String) "INTERFACE");
        ((Field) term1604762).setAccessible(true);
        Object enum2866 = ((Field) term1604762).get((Object) null);
        term1602512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1602844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1602512, term1602512.getClass(), "kind", enum2864);
        setField(term1602844, term1602844.getClass(), "kind", enum2866);
        setField(term1602512, term1602512.getClass(), "typeOfThis", term1602844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1602512;
        try {
            callMethod(klass, "isSubtype", argTypes, term1601858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


