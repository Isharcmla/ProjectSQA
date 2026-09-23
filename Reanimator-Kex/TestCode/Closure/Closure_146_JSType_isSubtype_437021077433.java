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

public class JSType_isSubtype_437021077433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110424;
     Object term110518;
     Object term110656;
     Object term110658;

    public JSType_isSubtype_437021077433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term110518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term110606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term110606, term110606.getClass(), "unknown", false);
        setField(term110518, term110518.getClass(), "referencedType", term110606);
        term110656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term110657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term110656, term110656.getClass(), "reference", null);
        setField(term110656, term110656.getClass(), "sourceName", null);
        setIntField(term110656, term110656.getClass(), "lineno", 0);
        setIntField(term110656, term110656.getClass(), "charno", 0);
        setBooleanField(term110656, term110656.getClass(), "forgiving", false);
        setField(term110657, term110657.getClass(), "leastSupertypeVisitor", null);
        setField(term110657, term110657.getClass(), "greatestSubtypeVisitor", null);
        setField(term110657, term110657.getClass(), "call", null);
        setField(term110657, term110657.getClass(), "prototype", null);
        setField(term110657, term110657.getClass(), "kind", null);
        setField(term110657, term110657.getClass(), "typeOfThis", null);
        setField(term110657, term110657.getClass(), "source", null);
        setField(term110657, term110657.getClass(), "implementedInterfaces", null);
        setField(term110657, term110657.getClass(), "subTypes", null);
        setField(term110657, term110657.getClass(), "templateTypeName", null);
        setField(term110657, term110657.getClass(), "className", null);
        setField(term110657, term110657.getClass(), "properties", null);
        setField(term110657, term110657.getClass(), "implicitPrototype", null);
        setBooleanField(term110657, term110657.getClass(), "nativeType", false);
        setBooleanField(term110657, term110657.getClass(), "prettyPrint", false);
        setBooleanField(term110657, term110657.getClass(), "visited", false);
        setField(term110657, term110657.getClass(), "docInfo", null);
        setBooleanField(term110657, term110657.getClass(), "unknown", false);
        setBooleanField(term110657, term110657.getClass(), "resolved", false);
        setField(term110657, term110657.getClass(), "resolveResult", null);
        setField(term110657, term110657.getClass(), "registry", null);
        setField(term110656, term110656.getClass(), "referencedType", term110657);
        setBooleanField(term110656, term110656.getClass(), "visited", false);
        setField(term110656, term110656.getClass(), "docInfo", null);
        setBooleanField(term110656, term110656.getClass(), "unknown", false);
        setBooleanField(term110656, term110656.getClass(), "resolved", false);
        setField(term110656, term110656.getClass(), "resolveResult", null);
        setField(term110656, term110656.getClass(), "registry", null);
        term110658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term110658, term110658.getClass(), "resolved", false);
        setField(term110658, term110658.getClass(), "resolveResult", null);
        setField(term110658, term110658.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term110424;
        args[1] = term110518;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term110424, term110656));
        assertTrue(recursiveEquals(term110518, term110658));
        assertTrue(recursiveEquals(retValue, false));
    }

};


