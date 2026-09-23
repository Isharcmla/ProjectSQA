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

public class FunctionType_setPrototypeBasedOn_1012666130199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99999;
     Object term100251;

    public FunctionType_setPrototypeBasedOn_1012666130199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100253 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term100252 = ((Class) term100253).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term100252).setAccessible(true);
        Object enum193 = ((Field) term100252).get((Object) null);
        term99999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term99999, term99999.getClass(), "nativeType", false);
        setField(term99999, term99999.getClass(), "kind", enum193);
        term100251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term100251, term100251.getClass(), "className", null);
        setField(term100251, term100251.getClass(), "ownerFunction", null);
        setBooleanField(term100251, term100251.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term100251;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term99999, args);
    }

};


