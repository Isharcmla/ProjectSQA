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

public class ObjectType_cast_18699858691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12296;
     Object term12311;
     Object term12305;

    public ObjectType_cast_18699858691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        term12311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term12311, term12311.getClass(), "constructor", null);
        setField(term12311, term12311.getClass(), "className", null);
        setField(term12311, term12311.getClass(), "properties", null);
        setBooleanField(term12311, term12311.getClass(), "nativeType", false);
        setField(term12311, term12311.getClass(), "implicitPrototypeFallback", null);
        setField(term12311, term12311.getClass(), "ownerFunction", null);
        setBooleanField(term12311, term12311.getClass(), "prettyPrint", false);
        setBooleanField(term12311, term12311.getClass(), "visited", false);
        setField(term12311, term12311.getClass(), "docInfo", null);
        setBooleanField(term12311, term12311.getClass(), "unknown", false);
        setBooleanField(term12311, term12311.getClass(), "resolved", false);
        setField(term12311, term12311.getClass(), "resolveResult", null);
        setField(term12311, term12311.getClass(), "registry", null);
        term12305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term12305, term12305.getClass(), "constructor", null);
        setField(term12305, term12305.getClass(), "className", null);
        setField(term12305, term12305.getClass(), "properties", null);
        setBooleanField(term12305, term12305.getClass(), "nativeType", false);
        setField(term12305, term12305.getClass(), "implicitPrototypeFallback", null);
        setField(term12305, term12305.getClass(), "ownerFunction", null);
        setBooleanField(term12305, term12305.getClass(), "prettyPrint", false);
        setBooleanField(term12305, term12305.getClass(), "visited", false);
        setField(term12305, term12305.getClass(), "docInfo", null);
        setBooleanField(term12305, term12305.getClass(), "unknown", false);
        setBooleanField(term12305, term12305.getClass(), "resolved", false);
        setField(term12305, term12305.getClass(), "resolveResult", null);
        setField(term12305, term12305.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term12296;
        Object retValue = callMethod(klass, "cast", argTypes, null, args);
        assertTrue(recursiveEquals(term12296, term12311));
        assertTrue(recursiveEquals(retValue, term12305));
    }

};


