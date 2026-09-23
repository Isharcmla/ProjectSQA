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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_5726835331283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1604727;

    public FunctionType_getAllImplementedInterfaces_5726835331283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1607498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1607497 = ((Class) term1607498).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1607497).setAccessible(true);
        Object enum2994 = ((Field) term1607497).get((Object) null);
        Object term1605271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        ArrayList term1605153 = new ArrayList();
        ((ArrayList) term1605153).add(term1605271);
        ((ArrayList) term1605153).add("");
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        ((ArrayList) term1605153).add((Object)null);
        term1604727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1604993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1605101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1604727, term1604727.getClass(), "kind", enum2994);
        setField(term1604993, term1604993.getClass(), "implicitPrototype", term1605101);
        setField(term1604727, term1604727.getClass(), "prototype", term1604993);
        setField(term1604727, term1604727.getClass(), "implementedInterfaces", term1605153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term1604727, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


