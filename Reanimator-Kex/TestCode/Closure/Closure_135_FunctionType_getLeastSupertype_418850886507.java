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

public class FunctionType_getLeastSupertype_418850886507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372671;
     Object term373129;

    public FunctionType_getLeastSupertype_418850886507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term374479 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term374478 = ((Class) term374479).getDeclaredField((String) "ORDINARY");
        ((Field) term374478).setAccessible(true);
        Object enum685 = ((Field) term374478).get((Object) null);
        term372671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term372929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term373021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term372671, term372671.getClass(), "kind", enum685);
        setField(term372929, term372929.getClass(), "kind", enum685);
        setField(term372929, term372929.getClass(), "typeOfThis", term373021);
        setField(term372671, term372671.getClass(), "typeOfThis", term372929);
        Class<? extends Object> term374770 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term374769 = ((Class) term374770).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term374769).setAccessible(true);
        Object enum686 = ((Field) term374769).get((Object) null);
        term373129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term373377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term373129, term373129.getClass(), "kind", enum686);
        setField(term373377, term373377.getClass(), "kind", enum685);
        setField(term373377, term373377.getClass(), "typeOfThis", null);
        setField(term373129, term373129.getClass(), "typeOfThis", term373377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term373129;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term372671, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


