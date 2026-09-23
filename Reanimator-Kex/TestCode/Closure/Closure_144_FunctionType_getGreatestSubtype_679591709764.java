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

public class FunctionType_getGreatestSubtype_679591709764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848686;
     Object term849296;

    public FunctionType_getGreatestSubtype_679591709764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term853130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term853129 = ((Class) term853130).getDeclaredField((String) "ORDINARY");
        ((Field) term853129).setAccessible(true);
        Object enum1535 = ((Field) term853129).get((Object) null);
        Class<? extends Object> term853421 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term853420 = ((Class) term853421).getDeclaredField((String) "INTERFACE");
        ((Field) term853420).setAccessible(true);
        Object enum1536 = ((Field) term853420).get((Object) null);
        term848686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term849494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term849186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term848686, term848686.getClass(), "kind", enum1535);
        setField(term849494, term849494.getClass(), "kind", enum1536);
        setField(term848686, term848686.getClass(), "typeOfThis", term849494);
        setField(term848686, term848686.getClass(), "registry", term849186);
        Class<? extends Object> term853715 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term853714 = ((Class) term853715).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term853714).setAccessible(true);
        Object enum1537 = ((Field) term853714).get((Object) null);
        term849296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term849296, term849296.getClass(), "kind", enum1537);
        setField(term849296, term849296.getClass(), "typeOfThis", term849494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term849296;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term848686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


