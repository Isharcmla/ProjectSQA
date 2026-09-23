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
import java.lang.Object;

public class JSType_isSubtype_437021077473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125451;
     Object term125633;
     Object term125785;
     Object term125787;

    public JSType_isSubtype_437021077473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term125539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term125451, term125451.getClass(), "referencedType", term125539);
        term125633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term125721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term125721, term125721.getClass(), "unknown", false);
        setField(term125633, term125633.getClass(), "referencedType", term125721);
        term125785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term125786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term125785, term125785.getClass(), "reference", null);
        setField(term125785, term125785.getClass(), "sourceName", null);
        setIntField(term125785, term125785.getClass(), "lineno", 0);
        setIntField(term125785, term125785.getClass(), "charno", 0);
        setBooleanField(term125785, term125785.getClass(), "forgiving", false);
        setField(term125786, term125786.getClass(), "leastSupertypeVisitor", null);
        setField(term125786, term125786.getClass(), "greatestSubtypeVisitor", null);
        setField(term125786, term125786.getClass(), "call", null);
        setField(term125786, term125786.getClass(), "prototype", null);
        setField(term125786, term125786.getClass(), "kind", null);
        setField(term125786, term125786.getClass(), "typeOfThis", null);
        setField(term125786, term125786.getClass(), "source", null);
        setField(term125786, term125786.getClass(), "implementedInterfaces", null);
        setField(term125786, term125786.getClass(), "subTypes", null);
        setField(term125786, term125786.getClass(), "templateTypeName", null);
        setField(term125786, term125786.getClass(), "className", null);
        setField(term125786, term125786.getClass(), "properties", null);
        setField(term125786, term125786.getClass(), "implicitPrototype", null);
        setBooleanField(term125786, term125786.getClass(), "nativeType", false);
        setBooleanField(term125786, term125786.getClass(), "prettyPrint", false);
        setBooleanField(term125786, term125786.getClass(), "visited", false);
        setField(term125786, term125786.getClass(), "docInfo", null);
        setBooleanField(term125786, term125786.getClass(), "unknown", false);
        setBooleanField(term125786, term125786.getClass(), "resolved", false);
        setField(term125786, term125786.getClass(), "resolveResult", null);
        setField(term125786, term125786.getClass(), "registry", null);
        setField(term125785, term125785.getClass(), "referencedType", term125786);
        setBooleanField(term125785, term125785.getClass(), "visited", false);
        setField(term125785, term125785.getClass(), "docInfo", null);
        setBooleanField(term125785, term125785.getClass(), "unknown", false);
        setBooleanField(term125785, term125785.getClass(), "resolved", false);
        setField(term125785, term125785.getClass(), "resolveResult", null);
        setField(term125785, term125785.getClass(), "registry", null);
        term125787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term125788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term125787, term125787.getClass(), "parameterType", null);
        setField(term125788, term125788.getClass(), "leastSupertypeVisitor", null);
        setField(term125788, term125788.getClass(), "greatestSubtypeVisitor", null);
        setField(term125788, term125788.getClass(), "call", null);
        setField(term125788, term125788.getClass(), "prototype", null);
        setField(term125788, term125788.getClass(), "kind", null);
        setField(term125788, term125788.getClass(), "typeOfThis", null);
        setField(term125788, term125788.getClass(), "source", null);
        setField(term125788, term125788.getClass(), "implementedInterfaces", null);
        setField(term125788, term125788.getClass(), "subTypes", null);
        setField(term125788, term125788.getClass(), "templateTypeName", null);
        setField(term125788, term125788.getClass(), "className", null);
        setField(term125788, term125788.getClass(), "properties", null);
        setField(term125788, term125788.getClass(), "implicitPrototype", null);
        setBooleanField(term125788, term125788.getClass(), "nativeType", false);
        setBooleanField(term125788, term125788.getClass(), "prettyPrint", false);
        setBooleanField(term125788, term125788.getClass(), "visited", false);
        setField(term125788, term125788.getClass(), "docInfo", null);
        setBooleanField(term125788, term125788.getClass(), "unknown", false);
        setBooleanField(term125788, term125788.getClass(), "resolved", false);
        setField(term125788, term125788.getClass(), "resolveResult", null);
        setField(term125788, term125788.getClass(), "registry", null);
        setField(term125787, term125787.getClass(), "referencedType", term125788);
        setBooleanField(term125787, term125787.getClass(), "visited", false);
        setField(term125787, term125787.getClass(), "docInfo", null);
        setBooleanField(term125787, term125787.getClass(), "unknown", false);
        setBooleanField(term125787, term125787.getClass(), "resolved", false);
        setField(term125787, term125787.getClass(), "resolveResult", null);
        setField(term125787, term125787.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term125451;
        args[1] = term125633;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term125451, term125785));
        assertTrue(recursiveEquals(term125633, term125787));
        assertTrue(recursiveEquals(retValue, true));
    }

};


