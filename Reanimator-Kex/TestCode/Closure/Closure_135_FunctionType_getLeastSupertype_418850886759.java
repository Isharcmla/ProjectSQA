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

public class FunctionType_getLeastSupertype_418850886759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729584;
     Object term730350;

    public FunctionType_getLeastSupertype_418850886759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term733157 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term733156 = ((Class) term733157).getDeclaredField((String) "INTERFACE");
        ((Field) term733156).setAccessible(true);
        Object enum1362 = ((Field) term733156).get((Object) null);
        term729584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term730138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term730242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term729584, term729584.getClass(), "kind", enum1362);
        setField(term730138, term730138.getClass(), "kind", enum1362);
        setField(term729584, term729584.getClass(), "typeOfThis", term730138);
        setField(term729584, term729584.getClass(), "registry", term730242);
        Class<? extends Object> term733451 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term733450 = ((Class) term733451).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term733450).setAccessible(true);
        Object enum1363 = ((Field) term733450).get((Object) null);
        Class<? extends Object> term733751 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term733750 = ((Class) term733751).getDeclaredField((String) "INTERFACE");
        ((Field) term733750).setAccessible(true);
        Object enum1364 = ((Field) term733750).get((Object) null);
        term730350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term730524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term730350, term730350.getClass(), "kind", enum1363);
        setField(term730524, term730524.getClass(), "kind", enum1364);
        setField(term730350, term730350.getClass(), "typeOfThis", term730524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term730350;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term729584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


