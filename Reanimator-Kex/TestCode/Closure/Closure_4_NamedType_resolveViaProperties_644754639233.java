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

public class NamedType_resolveViaProperties_644754639233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72182;
     Object term72624;
     Object term72803;
     Object term72809;

    public NamedType_resolveViaProperties_644754639233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term72372 = new HashSet();
        term72182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term72324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term72182, term72182.getClass(), "reference", "");
        setBooleanField(term72324, term72324.getClass(), "lastGeneration", true);
        setField(term72324, term72324.getClass(), "forwardDeclaredTypes", term72372);
        setField(term72182, term72182.getClass(), "registry", term72324);
        setField(term72182, term72182.getClass(), "sourceName", null);
        setIntField(term72182, term72182.getClass(), "lineno", 0);
        setIntField(term72182, term72182.getClass(), "charno", 0);
        term72624 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        HashMap term72808 = new HashMap();
        Set<Object> term72814 =  ((Map) term72808).keySet();
        HashSet term72807 = new HashSet((Collection<? extends Object>) term72814);
        term72803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term72806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term72803, term72803.getClass(), "reference", "");
        setField(term72803, term72803.getClass(), "sourceName", null);
        setIntField(term72803, term72803.getClass(), "lineno", 0);
        setIntField(term72803, term72803.getClass(), "charno", 0);
        setField(term72803, term72803.getClass(), "validator", null);
        setField(term72803, term72803.getClass(), "propertyContinuations", null);
        setField(term72803, term72803.getClass(), "referencedType", null);
        setField(term72803, term72803.getClass(), "referencedObjType", null);
        setBooleanField(term72803, term72803.getClass(), "visited", false);
        setField(term72803, term72803.getClass(), "docInfo", null);
        setBooleanField(term72803, term72803.getClass(), "unknown", false);
        setBooleanField(term72803, term72803.getClass(), "resolved", true);
        setField(term72803, term72803.getClass(), "resolveResult", null);
        setField(term72803, term72803.getClass(), "templateKeys", null);
        setField(term72803, term72803.getClass(), "templatizedTypes", null);
        setBooleanField(term72803, term72803.getClass(), "inTemplatedCheckVisit", false);
        setField(term72806, term72806.getClass(), "reporter", null);
        setField(term72806, term72806.getClass(), "nativeTypes", null);
        setField(term72806, term72806.getClass(), "namesToTypes", null);
        setField(term72806, term72806.getClass(), "namespaces", null);
        setField(term72806, term72806.getClass(), "nonNullableTypeNames", null);
        setField(term72806, term72806.getClass(), "forwardDeclaredTypes", term72807);
        setField(term72806, term72806.getClass(), "typesIndexedByProperty", null);
        setField(term72806, term72806.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term72806, term72806.getClass(), "greatestSubtypeByProperty", null);
        setField(term72806, term72806.getClass(), "interfaceToImplementors", null);
        setField(term72806, term72806.getClass(), "unresolvedNamedTypes", null);
        setField(term72806, term72806.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term72806, term72806.getClass(), "lastGeneration", true);
        setField(term72806, term72806.getClass(), "templateTypes", null);
        setBooleanField(term72806, term72806.getClass(), "tolerateUndefinedValues", false);
        setField(term72806, term72806.getClass(), "resolveMode", null);
        setField(term72803, term72803.getClass(), "registry", term72806);
        ArrayList term72810 = new ArrayList();
        ((ArrayList) term72810).add("Bad type annotation. Unknown type ");
        term72809 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term72809, term72809.getClass(), "warnings", term72810);
        setField(term72809, term72809.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = term72624;
        args[1] = null;
        callMethod(klass, "resolveViaProperties", argTypes, term72182, args);
        assertTrue(recursiveEquals(term72182, term72803));
        assertTrue(recursiveEquals(term72624, term72809));
    }

};


