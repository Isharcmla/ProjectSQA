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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

public class NamedType_getTypedefType_106686040225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66598;
     Object term67002;
     Object term67094;
     Object term67279;
     Object term67283;
     Object term67284;

    public NamedType_getTypedefType_106686040225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term66750 = new HashSet();
        term66598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term66702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term66702, term66702.getClass(), "lastGeneration", true);
        setField(term66702, term66702.getClass(), "forwardDeclaredTypes", term66750);
        setField(term66598, term66598.getClass(), "registry", term66702);
        setField(term66598, term66598.getClass(), "reference", null);
        setField(term66598, term66598.getClass(), "sourceName", null);
        setIntField(term66598, term66598.getClass(), "lineno", 0);
        setIntField(term66598, term66598.getClass(), "charno", 0);
        term67002 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        term67094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term67094, term67094.getClass(), "type", null);
        HashMap term67282 = new HashMap();
        Set<Object> term67289 =  ((Map) term67282).keySet();
        HashSet term67281 = new HashSet((Collection<? extends Object>) term67289);
        term67279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term67280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term67279, term67279.getClass(), "reference", null);
        setField(term67279, term67279.getClass(), "sourceName", null);
        setIntField(term67279, term67279.getClass(), "lineno", 0);
        setIntField(term67279, term67279.getClass(), "charno", 0);
        setField(term67279, term67279.getClass(), "validator", null);
        setField(term67279, term67279.getClass(), "propertyContinuations", null);
        setField(term67279, term67279.getClass(), "referencedType", null);
        setField(term67279, term67279.getClass(), "referencedObjType", null);
        setBooleanField(term67279, term67279.getClass(), "visited", false);
        setField(term67279, term67279.getClass(), "docInfo", null);
        setBooleanField(term67279, term67279.getClass(), "unknown", false);
        setBooleanField(term67279, term67279.getClass(), "resolved", true);
        setField(term67279, term67279.getClass(), "resolveResult", null);
        setField(term67279, term67279.getClass(), "templateKeys", null);
        setField(term67279, term67279.getClass(), "templatizedTypes", null);
        setBooleanField(term67279, term67279.getClass(), "inTemplatedCheckVisit", false);
        setField(term67280, term67280.getClass(), "reporter", null);
        setField(term67280, term67280.getClass(), "nativeTypes", null);
        setField(term67280, term67280.getClass(), "namesToTypes", null);
        setField(term67280, term67280.getClass(), "namespaces", null);
        setField(term67280, term67280.getClass(), "nonNullableTypeNames", null);
        setField(term67280, term67280.getClass(), "forwardDeclaredTypes", term67281);
        setField(term67280, term67280.getClass(), "typesIndexedByProperty", null);
        setField(term67280, term67280.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term67280, term67280.getClass(), "greatestSubtypeByProperty", null);
        setField(term67280, term67280.getClass(), "interfaceToImplementors", null);
        setField(term67280, term67280.getClass(), "unresolvedNamedTypes", null);
        setField(term67280, term67280.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term67280, term67280.getClass(), "lastGeneration", true);
        setField(term67280, term67280.getClass(), "templateTypes", null);
        setBooleanField(term67280, term67280.getClass(), "tolerateUndefinedValues", false);
        setField(term67280, term67280.getClass(), "resolveMode", null);
        setField(term67279, term67279.getClass(), "registry", term67280);
        term67283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term67283, term67283.getClass(), "name", null);
        setField(term67283, term67283.getClass(), "type", null);
        setBooleanField(term67283, term67283.getClass(), "inferred", false);
        setField(term67283, term67283.getClass(), "propertyNode", null);
        setField(term67283, term67283.getClass(), "docInfo", null);
        ArrayList term67285 = new ArrayList();
        ((ArrayList) term67285).add("Bad type annotation. Unknown type null");
        term67284 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term67284, term67284.getClass(), "warnings", term67285);
        setField(term67284, term67284.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term67002;
        args[1] = term67094;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term66598, args);
        assertTrue(recursiveEquals(term66598, term67279));
        assertTrue(recursiveEquals(term67002, term67283));
        assertTrue(recursiveEquals(term67094, term67284));
        assertTrue(recursiveEquals(retValue, null));
    }

};


