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

public class ObjectType_cast_18699858683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11783;
     Object term11798;
     Object term11792;

    public ObjectType_cast_18699858683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term11798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term11798, term11798.getClass(), "className", null);
        setField(term11798, term11798.getClass(), "properties", null);
        setBooleanField(term11798, term11798.getClass(), "nativeType", false);
        setField(term11798, term11798.getClass(), "implicitPrototypeFallback", null);
        setField(term11798, term11798.getClass(), "ownerFunction", null);
        setBooleanField(term11798, term11798.getClass(), "prettyPrint", false);
        setBooleanField(term11798, term11798.getClass(), "visited", false);
        setField(term11798, term11798.getClass(), "docInfo", null);
        setBooleanField(term11798, term11798.getClass(), "unknown", false);
        setBooleanField(term11798, term11798.getClass(), "resolved", false);
        setField(term11798, term11798.getClass(), "resolveResult", null);
        setField(term11798, term11798.getClass(), "registry", null);
        term11792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term11792, term11792.getClass(), "className", null);
        setField(term11792, term11792.getClass(), "properties", null);
        setBooleanField(term11792, term11792.getClass(), "nativeType", false);
        setField(term11792, term11792.getClass(), "implicitPrototypeFallback", null);
        setField(term11792, term11792.getClass(), "ownerFunction", null);
        setBooleanField(term11792, term11792.getClass(), "prettyPrint", false);
        setBooleanField(term11792, term11792.getClass(), "visited", false);
        setField(term11792, term11792.getClass(), "docInfo", null);
        setBooleanField(term11792, term11792.getClass(), "unknown", false);
        setBooleanField(term11792, term11792.getClass(), "resolved", false);
        setField(term11792, term11792.getClass(), "resolveResult", null);
        setField(term11792, term11792.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term11783;
        Object retValue = callMethod(klass, "cast", argTypes, null, args);
        assertTrue(recursiveEquals(term11783, term11798));
        assertTrue(recursiveEquals(retValue, term11792));
    }

};


