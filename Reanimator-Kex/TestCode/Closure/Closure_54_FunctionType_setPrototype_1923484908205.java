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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototype_1923484908205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104306;
     Object term104864;

    public FunctionType_setPrototype_1923484908205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term104865 = ((Class) term104866).getDeclaredField((String) "ORDINARY");
        ((Field) term104865).setAccessible(true);
        Object enum195 = ((Field) term104865).get((Object) null);
        term104306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term104306, term104306.getClass(), "kind", enum195);
        setField(term104306, term104306.getClass(), "prototype", null);
        setField(term104306, term104306.getClass(), "prototypeSlot", null);
        term104864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term104864, term104864.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Object[] args = new Object[1];
        args[0] = term104864;
        callMethod(klass, "setPrototype", argTypes, term104306, args);
    }

};


