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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class NamedType_resolveViaProperties_644754639303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99609;
     Object term100089;
     Object term146041;
     Object term146049;

    public NamedType_resolveViaProperties_644754639303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term99799 = new HashSet();
        term99609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term99751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term99609, term99609.getClass(), "reference", "");
        setBooleanField(term99751, term99751.getClass(), "lastGeneration", true);
        setField(term99751, term99751.getClass(), "forwardDeclaredTypes", term99799);
        setField(term99609, term99609.getClass(), "registry", term99751);
        setField(term99609, term99609.getClass(), "sourceName", "");
        setIntField(term99609, term99609.getClass(), "lineno", 0);
        setIntField(term99609, term99609.getClass(), "charno", 0);
        ArrayList term100141 = new ArrayList();
        term100089 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term100089, term100089.getClass(), "warnings", term100141);
        HashMap term146048 = new HashMap();
        Set<Object> term146054 =  ((Map) term146048).keySet();
        HashSet term146047 = new HashSet((Collection<? extends Object>) term146054);
        term146041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term146046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term146041, term146041.getClass(), "reference", "");
        setField(term146041, term146041.getClass(), "sourceName", "");
        setIntField(term146041, term146041.getClass(), "lineno", 0);
        setIntField(term146041, term146041.getClass(), "charno", 0);
        setField(term146041, term146041.getClass(), "validator", null);
        setField(term146041, term146041.getClass(), "propertyContinuations", null);
        setField(term146041, term146041.getClass(), "referencedType", null);
        setField(term146041, term146041.getClass(), "referencedObjType", null);
        setBooleanField(term146041, term146041.getClass(), "visited", false);
        setField(term146041, term146041.getClass(), "docInfo", null);
        setBooleanField(term146041, term146041.getClass(), "unknown", false);
        setBooleanField(term146041, term146041.getClass(), "resolved", true);
        setField(term146041, term146041.getClass(), "resolveResult", null);
        setField(term146041, term146041.getClass(), "templateKeys", null);
        setField(term146041, term146041.getClass(), "templatizedTypes", null);
        setBooleanField(term146041, term146041.getClass(), "inTemplatedCheckVisit", false);
        setField(term146046, term146046.getClass(), "reporter", null);
        setField(term146046, term146046.getClass(), "nativeTypes", null);
        setField(term146046, term146046.getClass(), "namesToTypes", null);
        setField(term146046, term146046.getClass(), "namespaces", null);
        setField(term146046, term146046.getClass(), "nonNullableTypeNames", null);
        setField(term146046, term146046.getClass(), "forwardDeclaredTypes", term146047);
        setField(term146046, term146046.getClass(), "typesIndexedByProperty", null);
        setField(term146046, term146046.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term146046, term146046.getClass(), "greatestSubtypeByProperty", null);
        setField(term146046, term146046.getClass(), "interfaceToImplementors", null);
        setField(term146046, term146046.getClass(), "unresolvedNamedTypes", null);
        setField(term146046, term146046.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term146046, term146046.getClass(), "lastGeneration", true);
        setField(term146046, term146046.getClass(), "templateTypes", null);
        setBooleanField(term146046, term146046.getClass(), "tolerateUndefinedValues", false);
        setField(term146046, term146046.getClass(), "resolveMode", null);
        setField(term146041, term146041.getClass(), "registry", term146046);
        ArrayList term146050 = new ArrayList();
        ((ArrayList) term146050).add("Bad type annotation. Unknown type ");
        term146049 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term146049, term146049.getClass(), "warnings", term146050);
        setField(term146049, term146049.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = term100089;
        args[1] = null;
        callMethod(klass, "resolveViaProperties", argTypes, term99609, args);
        assertTrue(recursiveEquals(term99609, term146041));
        assertTrue(recursiveEquals(term100089, term146049));
    }

};


