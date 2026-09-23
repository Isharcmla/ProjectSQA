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

public class FunctionType_isSubtype_2101002158417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323328;
     Object term323980;

    public FunctionType_isSubtype_2101002158417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term325530 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term325529 = ((Class) term325530).getDeclaredField((String) "ORDINARY");
        ((Field) term325529).setAccessible(true);
        Object enum591 = ((Field) term325529).get((Object) null);
        Class<? extends Object> term325821 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term325820 = ((Class) term325821).getDeclaredField((String) "INTERFACE");
        ((Field) term325820).setAccessible(true);
        Object enum592 = ((Field) term325820).get((Object) null);
        term323328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term323872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term323328, term323328.getClass(), "kind", enum591);
        setField(term323872, term323872.getClass(), "kind", enum592);
        setField(term323328, term323328.getClass(), "typeOfThis", term323872);
        Class<? extends Object> term326115 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term326114 = ((Class) term326115).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term326114).setAccessible(true);
        Object enum593 = ((Field) term326114).get((Object) null);
        term323980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term324164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term323980, term323980.getClass(), "kind", enum593);
        setField(term323980, term323980.getClass(), "typeOfThis", term324164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term323980;
        try {
            callMethod(klass, "isSubtype", argTypes, term323328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


