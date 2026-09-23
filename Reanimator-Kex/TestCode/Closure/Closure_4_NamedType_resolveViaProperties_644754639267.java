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

public class NamedType_resolveViaProperties_644754639267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87937;
     Object term88379;
     Object term88610;
     Object term88616;

    public NamedType_resolveViaProperties_644754639267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term88127 = new HashSet();
        term87937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term88079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term87937, term87937.getClass(), "reference", "");
        setBooleanField(term88079, term88079.getClass(), "lastGeneration", true);
        setField(term88079, term88079.getClass(), "forwardDeclaredTypes", term88127);
        setField(term87937, term87937.getClass(), "registry", term88079);
        setField(term87937, term87937.getClass(), "sourceName", null);
        setIntField(term87937, term87937.getClass(), "lineno", 0);
        setIntField(term87937, term87937.getClass(), "charno", 0);
        ArrayList term88431 = new ArrayList();
        term88379 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term88379, term88379.getClass(), "warnings", term88431);
        HashMap term88615 = new HashMap();
        Set<Object> term88621 =  ((Map) term88615).keySet();
        HashSet term88614 = new HashSet((Collection<? extends Object>) term88621);
        term88610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term88613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term88610, term88610.getClass(), "reference", "");
        setField(term88610, term88610.getClass(), "sourceName", null);
        setIntField(term88610, term88610.getClass(), "lineno", 0);
        setIntField(term88610, term88610.getClass(), "charno", 0);
        setField(term88610, term88610.getClass(), "validator", null);
        setField(term88610, term88610.getClass(), "propertyContinuations", null);
        setField(term88610, term88610.getClass(), "referencedType", null);
        setField(term88610, term88610.getClass(), "referencedObjType", null);
        setBooleanField(term88610, term88610.getClass(), "visited", false);
        setField(term88610, term88610.getClass(), "docInfo", null);
        setBooleanField(term88610, term88610.getClass(), "unknown", false);
        setBooleanField(term88610, term88610.getClass(), "resolved", true);
        setField(term88610, term88610.getClass(), "resolveResult", null);
        setField(term88610, term88610.getClass(), "templateKeys", null);
        setField(term88610, term88610.getClass(), "templatizedTypes", null);
        setBooleanField(term88610, term88610.getClass(), "inTemplatedCheckVisit", false);
        setField(term88613, term88613.getClass(), "reporter", null);
        setField(term88613, term88613.getClass(), "nativeTypes", null);
        setField(term88613, term88613.getClass(), "namesToTypes", null);
        setField(term88613, term88613.getClass(), "namespaces", null);
        setField(term88613, term88613.getClass(), "nonNullableTypeNames", null);
        setField(term88613, term88613.getClass(), "forwardDeclaredTypes", term88614);
        setField(term88613, term88613.getClass(), "typesIndexedByProperty", null);
        setField(term88613, term88613.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term88613, term88613.getClass(), "greatestSubtypeByProperty", null);
        setField(term88613, term88613.getClass(), "interfaceToImplementors", null);
        setField(term88613, term88613.getClass(), "unresolvedNamedTypes", null);
        setField(term88613, term88613.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term88613, term88613.getClass(), "lastGeneration", true);
        setField(term88613, term88613.getClass(), "templateTypes", null);
        setBooleanField(term88613, term88613.getClass(), "tolerateUndefinedValues", false);
        setField(term88613, term88613.getClass(), "resolveMode", null);
        setField(term88610, term88610.getClass(), "registry", term88613);
        ArrayList term88617 = new ArrayList();
        ((ArrayList) term88617).add("Bad type annotation. Unknown type ");
        term88616 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term88616, term88616.getClass(), "warnings", term88617);
        setField(term88616, term88616.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = term88379;
        args[1] = null;
        callMethod(klass, "resolveViaProperties", argTypes, term87937, args);
        assertTrue(recursiveEquals(term87937, term88610));
        assertTrue(recursiveEquals(term88379, term88616));
    }

};


