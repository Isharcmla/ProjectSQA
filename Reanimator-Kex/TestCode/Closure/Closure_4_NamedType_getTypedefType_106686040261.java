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

public class NamedType_getTypedefType_106686040261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84912;
     Object term85354;
     Object term85498;
     Object term85688;
     Object term85694;
     Object term85695;

    public NamedType_getTypedefType_106686040261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term85064 = new HashSet();
        term84912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term85016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term85016, term85016.getClass(), "lastGeneration", true);
        setField(term85016, term85016.getClass(), "forwardDeclaredTypes", term85064);
        setField(term84912, term84912.getClass(), "registry", term85016);
        setField(term84912, term84912.getClass(), "reference", null);
        setField(term84912, term84912.getClass(), "sourceName", "");
        setIntField(term84912, term84912.getClass(), "lineno", 0);
        setIntField(term84912, term84912.getClass(), "charno", 0);
        ArrayList term85406 = new ArrayList();
        term85354 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term85354, term85354.getClass(), "warnings", term85406);
        term85498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term85498, term85498.getClass(), "type", null);
        HashMap term85693 = new HashMap();
        Set<Object> term85700 =  ((Map) term85693).keySet();
        HashSet term85692 = new HashSet((Collection<? extends Object>) term85700);
        term85688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term85691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term85688, term85688.getClass(), "reference", null);
        setField(term85688, term85688.getClass(), "sourceName", "");
        setIntField(term85688, term85688.getClass(), "lineno", 0);
        setIntField(term85688, term85688.getClass(), "charno", 0);
        setField(term85688, term85688.getClass(), "validator", null);
        setField(term85688, term85688.getClass(), "propertyContinuations", null);
        setField(term85688, term85688.getClass(), "referencedType", null);
        setField(term85688, term85688.getClass(), "referencedObjType", null);
        setBooleanField(term85688, term85688.getClass(), "visited", false);
        setField(term85688, term85688.getClass(), "docInfo", null);
        setBooleanField(term85688, term85688.getClass(), "unknown", false);
        setBooleanField(term85688, term85688.getClass(), "resolved", true);
        setField(term85688, term85688.getClass(), "resolveResult", null);
        setField(term85688, term85688.getClass(), "templateKeys", null);
        setField(term85688, term85688.getClass(), "templatizedTypes", null);
        setBooleanField(term85688, term85688.getClass(), "inTemplatedCheckVisit", false);
        setField(term85691, term85691.getClass(), "reporter", null);
        setField(term85691, term85691.getClass(), "nativeTypes", null);
        setField(term85691, term85691.getClass(), "namesToTypes", null);
        setField(term85691, term85691.getClass(), "namespaces", null);
        setField(term85691, term85691.getClass(), "nonNullableTypeNames", null);
        setField(term85691, term85691.getClass(), "forwardDeclaredTypes", term85692);
        setField(term85691, term85691.getClass(), "typesIndexedByProperty", null);
        setField(term85691, term85691.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term85691, term85691.getClass(), "greatestSubtypeByProperty", null);
        setField(term85691, term85691.getClass(), "interfaceToImplementors", null);
        setField(term85691, term85691.getClass(), "unresolvedNamedTypes", null);
        setField(term85691, term85691.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term85691, term85691.getClass(), "lastGeneration", true);
        setField(term85691, term85691.getClass(), "templateTypes", null);
        setBooleanField(term85691, term85691.getClass(), "tolerateUndefinedValues", false);
        setField(term85691, term85691.getClass(), "resolveMode", null);
        setField(term85688, term85688.getClass(), "registry", term85691);
        term85694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term85694, term85694.getClass(), "name", null);
        setField(term85694, term85694.getClass(), "type", null);
        setBooleanField(term85694, term85694.getClass(), "inferred", false);
        setField(term85694, term85694.getClass(), "propertyNode", null);
        setField(term85694, term85694.getClass(), "docInfo", null);
        ArrayList term85696 = new ArrayList();
        ((ArrayList) term85696).add("Bad type annotation. Unknown type null");
        term85695 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term85695, term85695.getClass(), "warnings", term85696);
        setField(term85695, term85695.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term85354;
        args[1] = term85498;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term84912, args);
        assertTrue(recursiveEquals(term84912, term85688));
        assertTrue(recursiveEquals(term85354, term85694));
        assertTrue(recursiveEquals(term85498, term85695));
        assertTrue(recursiveEquals(retValue, null));
    }

};


