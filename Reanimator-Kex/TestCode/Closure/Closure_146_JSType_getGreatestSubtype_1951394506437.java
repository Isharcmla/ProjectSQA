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

public class JSType_getGreatestSubtype_1951394506437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111227;
     Object term111443;
     Object term111752;
     Object term111754;
     Object term111600;

    public JSType_getGreatestSubtype_1951394506437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term111345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term111345, term111345.getClass(), "unknown", false);
        setField(term111345, term111345.getClass(), "implicitPrototype", null);
        setField(term111227, term111227.getClass(), "referencedType", term111345);
        term111443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term111531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term111443, term111443.getClass(), "referencedType", term111531);
        term111752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term111753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term111752, term111752.getClass(), "indexType", null);
        setField(term111753, term111753.getClass(), "leastSupertypeVisitor", null);
        setField(term111753, term111753.getClass(), "greatestSubtypeVisitor", null);
        setField(term111753, term111753.getClass(), "call", null);
        setField(term111753, term111753.getClass(), "prototype", null);
        setField(term111753, term111753.getClass(), "kind", null);
        setField(term111753, term111753.getClass(), "typeOfThis", null);
        setField(term111753, term111753.getClass(), "source", null);
        setField(term111753, term111753.getClass(), "implementedInterfaces", null);
        setField(term111753, term111753.getClass(), "subTypes", null);
        setField(term111753, term111753.getClass(), "templateTypeName", null);
        setField(term111753, term111753.getClass(), "className", null);
        setField(term111753, term111753.getClass(), "properties", null);
        setField(term111753, term111753.getClass(), "implicitPrototype", null);
        setBooleanField(term111753, term111753.getClass(), "nativeType", false);
        setBooleanField(term111753, term111753.getClass(), "prettyPrint", false);
        setBooleanField(term111753, term111753.getClass(), "visited", false);
        setField(term111753, term111753.getClass(), "docInfo", null);
        setBooleanField(term111753, term111753.getClass(), "unknown", false);
        setBooleanField(term111753, term111753.getClass(), "resolved", false);
        setField(term111753, term111753.getClass(), "resolveResult", null);
        setField(term111753, term111753.getClass(), "registry", null);
        setField(term111752, term111752.getClass(), "referencedType", term111753);
        setBooleanField(term111752, term111752.getClass(), "visited", false);
        setField(term111752, term111752.getClass(), "docInfo", null);
        setBooleanField(term111752, term111752.getClass(), "unknown", false);
        setBooleanField(term111752, term111752.getClass(), "resolved", false);
        setField(term111752, term111752.getClass(), "resolveResult", null);
        setField(term111752, term111752.getClass(), "registry", null);
        term111754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term111755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term111754, term111754.getClass(), "indexType", null);
        setField(term111755, term111755.getClass(), "ownerFunction", null);
        setField(term111755, term111755.getClass(), "className", null);
        setField(term111755, term111755.getClass(), "properties", null);
        setField(term111755, term111755.getClass(), "implicitPrototype", null);
        setBooleanField(term111755, term111755.getClass(), "nativeType", false);
        setBooleanField(term111755, term111755.getClass(), "prettyPrint", false);
        setBooleanField(term111755, term111755.getClass(), "visited", false);
        setField(term111755, term111755.getClass(), "docInfo", null);
        setBooleanField(term111755, term111755.getClass(), "unknown", false);
        setBooleanField(term111755, term111755.getClass(), "resolved", false);
        setField(term111755, term111755.getClass(), "resolveResult", null);
        setField(term111755, term111755.getClass(), "registry", null);
        setField(term111754, term111754.getClass(), "referencedType", term111755);
        setBooleanField(term111754, term111754.getClass(), "visited", false);
        setField(term111754, term111754.getClass(), "docInfo", null);
        setBooleanField(term111754, term111754.getClass(), "unknown", false);
        setBooleanField(term111754, term111754.getClass(), "resolved", false);
        setField(term111754, term111754.getClass(), "resolveResult", null);
        setField(term111754, term111754.getClass(), "registry", null);
        term111600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term111601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term111600, term111600.getClass(), "indexType", null);
        setField(term111601, term111601.getClass(), "leastSupertypeVisitor", null);
        setField(term111601, term111601.getClass(), "greatestSubtypeVisitor", null);
        setField(term111601, term111601.getClass(), "call", null);
        setField(term111601, term111601.getClass(), "prototype", null);
        setField(term111601, term111601.getClass(), "kind", null);
        setField(term111601, term111601.getClass(), "typeOfThis", null);
        setField(term111601, term111601.getClass(), "source", null);
        setField(term111601, term111601.getClass(), "implementedInterfaces", null);
        setField(term111601, term111601.getClass(), "subTypes", null);
        setField(term111601, term111601.getClass(), "templateTypeName", null);
        setField(term111601, term111601.getClass(), "className", null);
        setField(term111601, term111601.getClass(), "properties", null);
        setField(term111601, term111601.getClass(), "implicitPrototype", null);
        setBooleanField(term111601, term111601.getClass(), "nativeType", false);
        setBooleanField(term111601, term111601.getClass(), "prettyPrint", false);
        setBooleanField(term111601, term111601.getClass(), "visited", false);
        setField(term111601, term111601.getClass(), "docInfo", null);
        setBooleanField(term111601, term111601.getClass(), "unknown", false);
        setBooleanField(term111601, term111601.getClass(), "resolved", false);
        setField(term111601, term111601.getClass(), "resolveResult", null);
        setField(term111601, term111601.getClass(), "registry", null);
        setField(term111600, term111600.getClass(), "referencedType", term111601);
        setBooleanField(term111600, term111600.getClass(), "visited", false);
        setField(term111600, term111600.getClass(), "docInfo", null);
        setBooleanField(term111600, term111600.getClass(), "unknown", false);
        setBooleanField(term111600, term111600.getClass(), "resolved", false);
        setField(term111600, term111600.getClass(), "resolveResult", null);
        setField(term111600, term111600.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term111227;
        args[1] = term111443;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term111227, term111752));
        assertTrue(recursiveEquals(term111443, term111754));
        assertTrue(recursiveEquals(retValue, term111600));
    }

};


