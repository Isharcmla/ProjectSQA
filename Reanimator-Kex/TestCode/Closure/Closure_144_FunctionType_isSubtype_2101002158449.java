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

public class FunctionType_isSubtype_2101002158449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366257;
     Object term366615;

    public FunctionType_isSubtype_2101002158449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term367759 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term367758 = ((Class) term367759).getDeclaredField((String) "ORDINARY");
        ((Field) term367758).setAccessible(true);
        Object enum667 = ((Field) term367758).get((Object) null);
        term366257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term366505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term366257, term366257.getClass(), "kind", enum667);
        setField(term366257, term366257.getClass(), "typeOfThis", term366505);
        Class<? extends Object> term368050 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term368049 = ((Class) term368050).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term368049).setAccessible(true);
        Object enum668 = ((Field) term368049).get((Object) null);
        term366615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term366615, term366615.getClass(), "kind", enum668);
        setField(term366615, term366615.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term366615;
        try {
            callMethod(klass, "isSubtype", argTypes, term366257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


