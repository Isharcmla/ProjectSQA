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

public class NamedType_getTypedefType_106686040301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97696;
     Object term98138;
     Object term98256;
     Object term145516;
     Object term145523;
     Object term145524;

    public NamedType_getTypedefType_106686040301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term97848 = new HashSet();
        ((HashSet) term97848).add((Object)null);
        term97696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term97800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term97800, term97800.getClass(), "lastGeneration", true);
        setField(term97800, term97800.getClass(), "forwardDeclaredTypes", term97848);
        setField(term97696, term97696.getClass(), "registry", term97800);
        setField(term97696, term97696.getClass(), "reference", "");
        setField(term97696, term97696.getClass(), "sourceName", null);
        setIntField(term97696, term97696.getClass(), "lineno", 0);
        setIntField(term97696, term97696.getClass(), "charno", 0);
        ArrayList term98164 = new ArrayList();
        ((ArrayList) term98164).add((Object)null);
        term98138 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term98138, term98138.getClass(), "warnings", term98164);
        term98256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term98256, term98256.getClass(), "type", null);
        HashMap term145521 = new HashMap();
        Set<Object> term145529 =  ((Map) term145521).keySet();
        HashSet term145520 = new HashSet((Collection<? extends Object>) term145529);
        term145516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term145519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term145516, term145516.getClass(), "reference", "");
        setField(term145516, term145516.getClass(), "sourceName", null);
        setIntField(term145516, term145516.getClass(), "lineno", 0);
        setIntField(term145516, term145516.getClass(), "charno", 0);
        setField(term145516, term145516.getClass(), "validator", null);
        setField(term145516, term145516.getClass(), "propertyContinuations", null);
        setField(term145516, term145516.getClass(), "referencedType", null);
        setField(term145516, term145516.getClass(), "referencedObjType", null);
        setBooleanField(term145516, term145516.getClass(), "visited", false);
        setField(term145516, term145516.getClass(), "docInfo", null);
        setBooleanField(term145516, term145516.getClass(), "unknown", false);
        setBooleanField(term145516, term145516.getClass(), "resolved", true);
        setField(term145516, term145516.getClass(), "resolveResult", null);
        setField(term145516, term145516.getClass(), "templateKeys", null);
        setField(term145516, term145516.getClass(), "templatizedTypes", null);
        setBooleanField(term145516, term145516.getClass(), "inTemplatedCheckVisit", false);
        setField(term145519, term145519.getClass(), "reporter", null);
        setField(term145519, term145519.getClass(), "nativeTypes", null);
        setField(term145519, term145519.getClass(), "namesToTypes", null);
        setField(term145519, term145519.getClass(), "namespaces", null);
        setField(term145519, term145519.getClass(), "nonNullableTypeNames", null);
        setField(term145519, term145519.getClass(), "forwardDeclaredTypes", term145520);
        setField(term145519, term145519.getClass(), "typesIndexedByProperty", null);
        setField(term145519, term145519.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term145519, term145519.getClass(), "greatestSubtypeByProperty", null);
        setField(term145519, term145519.getClass(), "interfaceToImplementors", null);
        setField(term145519, term145519.getClass(), "unresolvedNamedTypes", null);
        setField(term145519, term145519.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term145519, term145519.getClass(), "lastGeneration", true);
        setField(term145519, term145519.getClass(), "templateTypes", null);
        setBooleanField(term145519, term145519.getClass(), "tolerateUndefinedValues", false);
        setField(term145519, term145519.getClass(), "resolveMode", null);
        setField(term145516, term145516.getClass(), "registry", term145519);
        term145523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term145523, term145523.getClass(), "name", null);
        setField(term145523, term145523.getClass(), "type", null);
        setBooleanField(term145523, term145523.getClass(), "inferred", false);
        setField(term145523, term145523.getClass(), "propertyNode", null);
        setField(term145523, term145523.getClass(), "docInfo", null);
        ArrayList term145525 = new ArrayList();
        ((ArrayList) term145525).add((Object)null);
        ((ArrayList) term145525).add("Bad type annotation. Unknown type ");
        term145524 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term145524, term145524.getClass(), "warnings", term145525);
        setField(term145524, term145524.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term98138;
        args[1] = term98256;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term97696, args);
        assertTrue(recursiveEquals(term97696, term145516));
        assertTrue(recursiveEquals(term98138, term145523));
        assertTrue(recursiveEquals(term98256, term145524));
        assertTrue(recursiveEquals(retValue, null));
    }

};


