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

public class FunctionType_supAndInfHelper_1603977104269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154966;
     Object term155520;

    public FunctionType_supAndInfHelper_1603977104269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158062 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term158061 = ((Class) term158062).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term158061).setAccessible(true);
        Object enum307 = ((Field) term158061).get((Object) null);
        term154966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term154966, term154966.getClass(), "kind", enum307);
        setField(term154966, term154966.getClass(), "typeOfThis", term154966);
        Class<? extends Object> term158362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term158361 = ((Class) term158362).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term158361).setAccessible(true);
        Object enum308 = ((Field) term158361).get((Object) null);
        term155520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term155520, term155520.getClass(), "kind", enum308);
        setField(term155520, term155520.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term155520;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term154966, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


