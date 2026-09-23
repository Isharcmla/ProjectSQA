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

public class ObjectType_cast_18699858689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12147;
     Object term12175;
     Object term12169;

    public ObjectType_cast_18699858689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term12175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term12175, term12175.getClass(), "call", null);
        setField(term12175, term12175.getClass(), "prototypeSlot", null);
        setField(term12175, term12175.getClass(), "kind", null);
        setField(term12175, term12175.getClass(), "typeOfThis", null);
        setField(term12175, term12175.getClass(), "source", null);
        setField(term12175, term12175.getClass(), "implementedInterfaces", null);
        setField(term12175, term12175.getClass(), "extendedInterfaces", null);
        setField(term12175, term12175.getClass(), "subTypes", null);
        setField(term12175, term12175.getClass(), "templateTypeName", null);
        setField(term12175, term12175.getClass(), "className", null);
        setField(term12175, term12175.getClass(), "properties", null);
        setBooleanField(term12175, term12175.getClass(), "nativeType", false);
        setField(term12175, term12175.getClass(), "implicitPrototypeFallback", null);
        setField(term12175, term12175.getClass(), "ownerFunction", null);
        setBooleanField(term12175, term12175.getClass(), "prettyPrint", false);
        setBooleanField(term12175, term12175.getClass(), "visited", false);
        setField(term12175, term12175.getClass(), "docInfo", null);
        setBooleanField(term12175, term12175.getClass(), "unknown", false);
        setBooleanField(term12175, term12175.getClass(), "resolved", false);
        setField(term12175, term12175.getClass(), "resolveResult", null);
        setField(term12175, term12175.getClass(), "registry", null);
        term12169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term12169, term12169.getClass(), "call", null);
        setField(term12169, term12169.getClass(), "prototypeSlot", null);
        setField(term12169, term12169.getClass(), "kind", null);
        setField(term12169, term12169.getClass(), "typeOfThis", null);
        setField(term12169, term12169.getClass(), "source", null);
        setField(term12169, term12169.getClass(), "implementedInterfaces", null);
        setField(term12169, term12169.getClass(), "extendedInterfaces", null);
        setField(term12169, term12169.getClass(), "subTypes", null);
        setField(term12169, term12169.getClass(), "templateTypeName", null);
        setField(term12169, term12169.getClass(), "className", null);
        setField(term12169, term12169.getClass(), "properties", null);
        setBooleanField(term12169, term12169.getClass(), "nativeType", false);
        setField(term12169, term12169.getClass(), "implicitPrototypeFallback", null);
        setField(term12169, term12169.getClass(), "ownerFunction", null);
        setBooleanField(term12169, term12169.getClass(), "prettyPrint", false);
        setBooleanField(term12169, term12169.getClass(), "visited", false);
        setField(term12169, term12169.getClass(), "docInfo", null);
        setBooleanField(term12169, term12169.getClass(), "unknown", false);
        setBooleanField(term12169, term12169.getClass(), "resolved", false);
        setField(term12169, term12169.getClass(), "resolveResult", null);
        setField(term12169, term12169.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term12147;
        Object retValue = callMethod(klass, "cast", argTypes, null, args);
        assertTrue(recursiveEquals(term12147, term12175));
        assertTrue(recursiveEquals(retValue, term12169));
    }

};


