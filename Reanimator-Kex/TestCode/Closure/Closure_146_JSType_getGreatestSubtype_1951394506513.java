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

public class JSType_getGreatestSubtype_1951394506513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141333;
     Object term141549;
     Object term141791;
     Object term141793;
     Object term141639;

    public JSType_getGreatestSubtype_1951394506513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term141451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term141451, term141451.getClass(), "unknown", false);
        setField(term141333, term141333.getClass(), "referencedType", term141451);
        term141549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term141637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term141637, term141637.getClass(), "unknown", false);
        setField(term141549, term141549.getClass(), "referencedType", term141637);
        term141791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term141792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term141791, term141791.getClass(), "indexType", null);
        setField(term141792, term141792.getClass(), "leastSupertypeVisitor", null);
        setField(term141792, term141792.getClass(), "greatestSubtypeVisitor", null);
        setField(term141792, term141792.getClass(), "call", null);
        setField(term141792, term141792.getClass(), "prototype", null);
        setField(term141792, term141792.getClass(), "kind", null);
        setField(term141792, term141792.getClass(), "typeOfThis", null);
        setField(term141792, term141792.getClass(), "source", null);
        setField(term141792, term141792.getClass(), "implementedInterfaces", null);
        setField(term141792, term141792.getClass(), "subTypes", null);
        setField(term141792, term141792.getClass(), "templateTypeName", null);
        setField(term141792, term141792.getClass(), "className", null);
        setField(term141792, term141792.getClass(), "properties", null);
        setField(term141792, term141792.getClass(), "implicitPrototype", null);
        setBooleanField(term141792, term141792.getClass(), "nativeType", false);
        setBooleanField(term141792, term141792.getClass(), "prettyPrint", false);
        setBooleanField(term141792, term141792.getClass(), "visited", false);
        setField(term141792, term141792.getClass(), "docInfo", null);
        setBooleanField(term141792, term141792.getClass(), "unknown", false);
        setBooleanField(term141792, term141792.getClass(), "resolved", false);
        setField(term141792, term141792.getClass(), "resolveResult", null);
        setField(term141792, term141792.getClass(), "registry", null);
        setField(term141791, term141791.getClass(), "referencedType", term141792);
        setBooleanField(term141791, term141791.getClass(), "visited", false);
        setField(term141791, term141791.getClass(), "docInfo", null);
        setBooleanField(term141791, term141791.getClass(), "unknown", false);
        setBooleanField(term141791, term141791.getClass(), "resolved", false);
        setField(term141791, term141791.getClass(), "resolveResult", null);
        setField(term141791, term141791.getClass(), "registry", null);
        term141793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term141794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term141793, term141793.getClass(), "indexType", null);
        setField(term141794, term141794.getClass(), "ownerFunction", null);
        setField(term141794, term141794.getClass(), "className", null);
        setField(term141794, term141794.getClass(), "properties", null);
        setField(term141794, term141794.getClass(), "implicitPrototype", null);
        setBooleanField(term141794, term141794.getClass(), "nativeType", false);
        setBooleanField(term141794, term141794.getClass(), "prettyPrint", false);
        setBooleanField(term141794, term141794.getClass(), "visited", false);
        setField(term141794, term141794.getClass(), "docInfo", null);
        setBooleanField(term141794, term141794.getClass(), "unknown", false);
        setBooleanField(term141794, term141794.getClass(), "resolved", false);
        setField(term141794, term141794.getClass(), "resolveResult", null);
        setField(term141794, term141794.getClass(), "registry", null);
        setField(term141793, term141793.getClass(), "referencedType", term141794);
        setBooleanField(term141793, term141793.getClass(), "visited", false);
        setField(term141793, term141793.getClass(), "docInfo", null);
        setBooleanField(term141793, term141793.getClass(), "unknown", false);
        setBooleanField(term141793, term141793.getClass(), "resolved", false);
        setField(term141793, term141793.getClass(), "resolveResult", null);
        setField(term141793, term141793.getClass(), "registry", null);
        term141639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term141640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term141639, term141639.getClass(), "indexType", null);
        setField(term141640, term141640.getClass(), "leastSupertypeVisitor", null);
        setField(term141640, term141640.getClass(), "greatestSubtypeVisitor", null);
        setField(term141640, term141640.getClass(), "call", null);
        setField(term141640, term141640.getClass(), "prototype", null);
        setField(term141640, term141640.getClass(), "kind", null);
        setField(term141640, term141640.getClass(), "typeOfThis", null);
        setField(term141640, term141640.getClass(), "source", null);
        setField(term141640, term141640.getClass(), "implementedInterfaces", null);
        setField(term141640, term141640.getClass(), "subTypes", null);
        setField(term141640, term141640.getClass(), "templateTypeName", null);
        setField(term141640, term141640.getClass(), "className", null);
        setField(term141640, term141640.getClass(), "properties", null);
        setField(term141640, term141640.getClass(), "implicitPrototype", null);
        setBooleanField(term141640, term141640.getClass(), "nativeType", false);
        setBooleanField(term141640, term141640.getClass(), "prettyPrint", false);
        setBooleanField(term141640, term141640.getClass(), "visited", false);
        setField(term141640, term141640.getClass(), "docInfo", null);
        setBooleanField(term141640, term141640.getClass(), "unknown", false);
        setBooleanField(term141640, term141640.getClass(), "resolved", false);
        setField(term141640, term141640.getClass(), "resolveResult", null);
        setField(term141640, term141640.getClass(), "registry", null);
        setField(term141639, term141639.getClass(), "referencedType", term141640);
        setBooleanField(term141639, term141639.getClass(), "visited", false);
        setField(term141639, term141639.getClass(), "docInfo", null);
        setBooleanField(term141639, term141639.getClass(), "unknown", false);
        setBooleanField(term141639, term141639.getClass(), "resolved", false);
        setField(term141639, term141639.getClass(), "resolveResult", null);
        setField(term141639, term141639.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term141333;
        args[1] = term141549;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term141333, term141791));
        assertTrue(recursiveEquals(term141549, term141793));
        assertTrue(recursiveEquals(retValue, term141639));
    }

};


