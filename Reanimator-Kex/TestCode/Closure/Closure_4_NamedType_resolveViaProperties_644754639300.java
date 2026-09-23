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

public class NamedType_resolveViaProperties_644754639300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95941;
     Object term96439;
     Object term145286;
     Object term145292;

    public NamedType_resolveViaProperties_644754639300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term96131 = new HashSet();
        term95941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term96083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term95941, term95941.getClass(), "reference", "");
        setBooleanField(term96083, term96083.getClass(), "lastGeneration", true);
        setField(term96083, term96083.getClass(), "forwardDeclaredTypes", term96131);
        setField(term95941, term95941.getClass(), "registry", term96083);
        setField(term95941, term95941.getClass(), "sourceName", null);
        setIntField(term95941, term95941.getClass(), "lineno", 0);
        setIntField(term95941, term95941.getClass(), "charno", 0);
        term96439 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        HashMap term145291 = new HashMap();
        Set<Object> term145295 =  ((Map) term145291).keySet();
        HashSet term145290 = new HashSet((Collection<? extends Object>) term145295);
        term145286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term145289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term145286, term145286.getClass(), "reference", "");
        setField(term145286, term145286.getClass(), "sourceName", null);
        setIntField(term145286, term145286.getClass(), "lineno", 0);
        setIntField(term145286, term145286.getClass(), "charno", 0);
        setField(term145286, term145286.getClass(), "validator", null);
        setField(term145286, term145286.getClass(), "propertyContinuations", null);
        setField(term145286, term145286.getClass(), "referencedType", null);
        setField(term145286, term145286.getClass(), "referencedObjType", null);
        setBooleanField(term145286, term145286.getClass(), "visited", false);
        setField(term145286, term145286.getClass(), "docInfo", null);
        setBooleanField(term145286, term145286.getClass(), "unknown", false);
        setBooleanField(term145286, term145286.getClass(), "resolved", true);
        setField(term145286, term145286.getClass(), "resolveResult", null);
        setField(term145286, term145286.getClass(), "templateKeys", null);
        setField(term145286, term145286.getClass(), "templatizedTypes", null);
        setBooleanField(term145286, term145286.getClass(), "inTemplatedCheckVisit", false);
        setField(term145289, term145289.getClass(), "reporter", null);
        setField(term145289, term145289.getClass(), "nativeTypes", null);
        setField(term145289, term145289.getClass(), "namesToTypes", null);
        setField(term145289, term145289.getClass(), "namespaces", null);
        setField(term145289, term145289.getClass(), "nonNullableTypeNames", null);
        setField(term145289, term145289.getClass(), "forwardDeclaredTypes", term145290);
        setField(term145289, term145289.getClass(), "typesIndexedByProperty", null);
        setField(term145289, term145289.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term145289, term145289.getClass(), "greatestSubtypeByProperty", null);
        setField(term145289, term145289.getClass(), "interfaceToImplementors", null);
        setField(term145289, term145289.getClass(), "unresolvedNamedTypes", null);
        setField(term145289, term145289.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term145289, term145289.getClass(), "lastGeneration", true);
        setField(term145289, term145289.getClass(), "templateTypes", null);
        setBooleanField(term145289, term145289.getClass(), "tolerateUndefinedValues", false);
        setField(term145289, term145289.getClass(), "resolveMode", null);
        setField(term145286, term145286.getClass(), "registry", term145289);
        term145292 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = term96439;
        args[1] = null;
        callMethod(klass, "resolveViaProperties", argTypes, term95941, args);
        assertTrue(recursiveEquals(term95941, term145286));
        assertTrue(recursiveEquals(term96439, term145292));
    }

};


