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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class FunctionType_addRelatedInterfaces_784954428265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134840;
     Object term134948;
     Object term134960;
     Object term134961;

    public FunctionType_addRelatedInterfaces_784954428265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term134948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term134960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term134960, term134960.getClass(), "this$0", null);
        setField(term134960, term134960.getClass(), "call", null);
        setField(term134960, term134960.getClass(), "prototype", null);
        setField(term134960, term134960.getClass(), "kind", null);
        setField(term134960, term134960.getClass(), "typeOfThis", null);
        setField(term134960, term134960.getClass(), "source", null);
        setField(term134960, term134960.getClass(), "implementedInterfaces", null);
        setField(term134960, term134960.getClass(), "subTypes", null);
        setField(term134960, term134960.getClass(), "templateTypeName", null);
        setField(term134960, term134960.getClass(), "className", null);
        setField(term134960, term134960.getClass(), "properties", null);
        setField(term134960, term134960.getClass(), "implicitPrototype", null);
        setBooleanField(term134960, term134960.getClass(), "nativeType", false);
        setBooleanField(term134960, term134960.getClass(), "visited", false);
        setField(term134960, term134960.getClass(), "docInfo", null);
        setBooleanField(term134960, term134960.getClass(), "unknown", false);
        setBooleanField(term134960, term134960.getClass(), "resolved", false);
        setField(term134960, term134960.getClass(), "resolveResult", null);
        setField(term134960, term134960.getClass(), "registry", null);
        term134961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term134961, term134961.getClass(), "this$0", null);
        setField(term134961, term134961.getClass(), "call", null);
        setField(term134961, term134961.getClass(), "prototype", null);
        setField(term134961, term134961.getClass(), "kind", null);
        setField(term134961, term134961.getClass(), "typeOfThis", null);
        setField(term134961, term134961.getClass(), "source", null);
        setField(term134961, term134961.getClass(), "implementedInterfaces", null);
        setField(term134961, term134961.getClass(), "subTypes", null);
        setField(term134961, term134961.getClass(), "templateTypeName", null);
        setField(term134961, term134961.getClass(), "className", null);
        setField(term134961, term134961.getClass(), "properties", null);
        setField(term134961, term134961.getClass(), "implicitPrototype", null);
        setBooleanField(term134961, term134961.getClass(), "nativeType", false);
        setBooleanField(term134961, term134961.getClass(), "visited", false);
        setField(term134961, term134961.getClass(), "docInfo", null);
        setBooleanField(term134961, term134961.getClass(), "unknown", false);
        setBooleanField(term134961, term134961.getClass(), "resolved", false);
        setField(term134961, term134961.getClass(), "resolveResult", null);
        setField(term134961, term134961.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term134948;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term134840, args);
        assertTrue(recursiveEquals(term134840, term134960));
        assertTrue(recursiveEquals(term134948, term134961));
    }

};


