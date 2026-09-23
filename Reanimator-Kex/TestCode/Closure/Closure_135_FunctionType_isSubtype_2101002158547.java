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

public class FunctionType_isSubtype_2101002158547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422589;
     Object term423303;

    public FunctionType_isSubtype_2101002158547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term424912 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term424911 = ((Class) term424912).getDeclaredField((String) "INTERFACE");
        ((Field) term424911).setAccessible(true);
        Object enum782 = ((Field) term424911).get((Object) null);
        Class<? extends Object> term425206 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term425205 = ((Class) term425206).getDeclaredField((String) "INTERFACE");
        ((Field) term425205).setAccessible(true);
        Object enum783 = ((Field) term425205).get((Object) null);
        term422589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term423303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term423579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term422589, term422589.getClass(), "kind", enum782);
        setField(term423303, term423303.getClass(), "kind", enum782);
        setField(term423579, term423579.getClass(), "kind", enum783);
        setField(term423303, term423303.getClass(), "typeOfThis", term423579);
        setField(term422589, term422589.getClass(), "typeOfThis", term423303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term423303;
        try {
            callMethod(klass, "isSubtype", argTypes, term422589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


