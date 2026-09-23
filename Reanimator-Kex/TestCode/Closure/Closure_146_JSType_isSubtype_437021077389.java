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

public class JSType_isSubtype_437021077389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93359;
     Object term93657;
     Object term93709;
     Object term93710;

    public JSType_isSubtype_437021077389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term93469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term93557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term93469, term93469.getClass(), "referencedType", term93557);
        setField(term93359, term93359.getClass(), "referencedType", term93469);
        term93657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term93657, term93657.getClass(), "unknown", false);
        term93709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term93709, term93709.getClass(), "call", null);
        setField(term93709, term93709.getClass(), "prototype", null);
        setField(term93709, term93709.getClass(), "kind", null);
        setField(term93709, term93709.getClass(), "typeOfThis", null);
        setField(term93709, term93709.getClass(), "source", null);
        setField(term93709, term93709.getClass(), "implementedInterfaces", null);
        setField(term93709, term93709.getClass(), "subTypes", null);
        setField(term93709, term93709.getClass(), "templateTypeName", null);
        setField(term93709, term93709.getClass(), "className", null);
        setField(term93709, term93709.getClass(), "properties", null);
        setField(term93709, term93709.getClass(), "implicitPrototype", null);
        setBooleanField(term93709, term93709.getClass(), "nativeType", false);
        setBooleanField(term93709, term93709.getClass(), "prettyPrint", false);
        setBooleanField(term93709, term93709.getClass(), "visited", false);
        setField(term93709, term93709.getClass(), "docInfo", null);
        setBooleanField(term93709, term93709.getClass(), "unknown", false);
        setBooleanField(term93709, term93709.getClass(), "resolved", false);
        setField(term93709, term93709.getClass(), "resolveResult", null);
        setField(term93709, term93709.getClass(), "registry", null);
        term93710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term93711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term93712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term93710, term93710.getClass(), "parameterType", null);
        setField(term93711, term93711.getClass(), "parameterType", null);
        setField(term93712, term93712.getClass(), "leastSupertypeVisitor", null);
        setField(term93712, term93712.getClass(), "greatestSubtypeVisitor", null);
        setField(term93712, term93712.getClass(), "call", null);
        setField(term93712, term93712.getClass(), "prototype", null);
        setField(term93712, term93712.getClass(), "kind", null);
        setField(term93712, term93712.getClass(), "typeOfThis", null);
        setField(term93712, term93712.getClass(), "source", null);
        setField(term93712, term93712.getClass(), "implementedInterfaces", null);
        setField(term93712, term93712.getClass(), "subTypes", null);
        setField(term93712, term93712.getClass(), "templateTypeName", null);
        setField(term93712, term93712.getClass(), "className", null);
        setField(term93712, term93712.getClass(), "properties", null);
        setField(term93712, term93712.getClass(), "implicitPrototype", null);
        setBooleanField(term93712, term93712.getClass(), "nativeType", false);
        setBooleanField(term93712, term93712.getClass(), "prettyPrint", false);
        setBooleanField(term93712, term93712.getClass(), "visited", false);
        setField(term93712, term93712.getClass(), "docInfo", null);
        setBooleanField(term93712, term93712.getClass(), "unknown", false);
        setBooleanField(term93712, term93712.getClass(), "resolved", false);
        setField(term93712, term93712.getClass(), "resolveResult", null);
        setField(term93712, term93712.getClass(), "registry", null);
        setField(term93711, term93711.getClass(), "referencedType", term93712);
        setBooleanField(term93711, term93711.getClass(), "visited", false);
        setField(term93711, term93711.getClass(), "docInfo", null);
        setBooleanField(term93711, term93711.getClass(), "unknown", false);
        setBooleanField(term93711, term93711.getClass(), "resolved", false);
        setField(term93711, term93711.getClass(), "resolveResult", null);
        setField(term93711, term93711.getClass(), "registry", null);
        setField(term93710, term93710.getClass(), "referencedType", term93711);
        setBooleanField(term93710, term93710.getClass(), "visited", false);
        setField(term93710, term93710.getClass(), "docInfo", null);
        setBooleanField(term93710, term93710.getClass(), "unknown", false);
        setBooleanField(term93710, term93710.getClass(), "resolved", false);
        setField(term93710, term93710.getClass(), "resolveResult", null);
        setField(term93710, term93710.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term93359;
        args[1] = term93657;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term93359, term93709));
        assertTrue(recursiveEquals(term93657, term93710));
        assertTrue(recursiveEquals(retValue, false));
    }

};


