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

public class FunctionType_makesStructs_1497117839473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435409;

    public FunctionType_makesStructs_1497117839473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term437004 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term437003 = ((Class) term437004).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term437003).setAccessible(true);
        Object enum717 = ((Field) term437003).get((Object) null);
        Class<? extends Object> term437304 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term437303 = ((Class) term437304).getDeclaredField((String) "DICT");
        ((Field) term437303).setAccessible(true);
        Object enum718 = ((Field) term437303).get((Object) null);
        term435409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term435831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term435931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term436039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term435409, term435409.getClass(), "kind", enum717);
        setField(term435409, term435409.getClass(), "propAccess", enum718);
        setField(term435931, term435931.getClass(), "implicitPrototypeFallback", term436039);
        setField(term435831, term435831.getClass(), "type", term435931);
        setField(term435409, term435409.getClass(), "prototypeSlot", term435831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesStructs", argTypes, term435409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


