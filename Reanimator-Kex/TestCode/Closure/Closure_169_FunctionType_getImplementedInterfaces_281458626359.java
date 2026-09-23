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

public class FunctionType_getImplementedInterfaces_281458626359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328015;

    public FunctionType_getImplementedInterfaces_281458626359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term328867 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term328866 = ((Class) term328867).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term328866).setAccessible(true);
        Object enum568 = ((Field) term328866).get((Object) null);
        term328015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term328277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term328015, term328015.getClass(), "kind", enum568);
        setField(term328015, term328015.getClass(), "prototypeSlot", term328277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term328015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


