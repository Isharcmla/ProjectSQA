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

public class FunctionType_makesStructs_1497117839295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279060;

    public FunctionType_makesStructs_1497117839295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term280395 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term280394 = ((Class) term280395).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term280394).setAccessible(true);
        Object enum499 = ((Field) term280394).get((Object) null);
        Class<? extends Object> term280695 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term280694 = ((Class) term280695).getDeclaredField((String) "ANY");
        ((Field) term280694).setAccessible(true);
        Object enum500 = ((Field) term280694).get((Object) null);
        term279060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term279482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term279060, term279060.getClass(), "kind", enum499);
        setField(term279060, term279060.getClass(), "propAccess", enum500);
        setField(term279060, term279060.getClass(), "prototypeSlot", term279482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesStructs", argTypes, term279060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


