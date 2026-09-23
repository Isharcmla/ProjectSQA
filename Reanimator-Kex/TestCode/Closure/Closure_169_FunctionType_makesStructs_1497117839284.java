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

public class FunctionType_makesStructs_1497117839284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270375;

    public FunctionType_makesStructs_1497117839284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term272044 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272043 = ((Class) term272044).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term272043).setAccessible(true);
        Object enum484 = ((Field) term272043).get((Object) null);
        Class<? extends Object> term272344 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term272343 = ((Class) term272344).getDeclaredField((String) "DICT");
        ((Field) term272343).setAccessible(true);
        Object enum485 = ((Field) term272343).get((Object) null);
        term270375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term270787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term270375, term270375.getClass(), "kind", enum484);
        setField(term270375, term270375.getClass(), "propAccess", enum485);
        setField(term270375, term270375.getClass(), "prototypeSlot", null);
        setField(term270375, term270375.getClass(), "className", null);
        setField(term270375, term270375.getClass(), "ownerFunction", null);
        setField(term270375, term270375.getClass(), "registry", term270787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesStructs", argTypes, term270375, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


