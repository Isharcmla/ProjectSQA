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

public class FunctionType_getGreatestSubtype_679591709531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472060;
     Object term472714;

    public FunctionType_getGreatestSubtype_679591709531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term474307 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term474306 = ((Class) term474307).getDeclaredField((String) "ORDINARY");
        ((Field) term474306).setAccessible(true);
        Object enum864 = ((Field) term474306).get((Object) null);
        term472060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term472604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term472060, term472060.getClass(), "kind", enum864);
        setField(term472604, term472604.getClass(), "kind", enum864);
        setField(term472060, term472060.getClass(), "typeOfThis", term472604);
        Class<? extends Object> term474598 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term474597 = ((Class) term474598).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term474597).setAccessible(true);
        Object enum865 = ((Field) term474597).get((Object) null);
        Class<? extends Object> term474898 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term474897 = ((Class) term474898).getDeclaredField((String) "INTERFACE");
        ((Field) term474897).setAccessible(true);
        Object enum866 = ((Field) term474897).get((Object) null);
        term472714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term472888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term472714, term472714.getClass(), "kind", enum865);
        setField(term472888, term472888.getClass(), "kind", enum866);
        setField(term472714, term472714.getClass(), "typeOfThis", term472888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term472714;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term472060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


