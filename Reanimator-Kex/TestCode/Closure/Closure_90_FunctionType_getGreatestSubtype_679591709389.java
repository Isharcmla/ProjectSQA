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

public class FunctionType_getGreatestSubtype_679591709389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288233;
     Object term288585;

    public FunctionType_getGreatestSubtype_679591709389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289686 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term289685 = ((Class) term289686).getDeclaredField((String) "ORDINARY");
        ((Field) term289685).setAccessible(true);
        Object enum501 = ((Field) term289685).get((Object) null);
        term288233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term288475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term288233, term288233.getClass(), "kind", enum501);
        setField(term288233, term288233.getClass(), "typeOfThis", term288475);
        Class<? extends Object> term289977 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term289976 = ((Class) term289977).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term289976).setAccessible(true);
        Object enum502 = ((Field) term289976).get((Object) null);
        term288585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term288585, term288585.getClass(), "kind", enum502);
        setField(term288585, term288585.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term288585;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term288233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


