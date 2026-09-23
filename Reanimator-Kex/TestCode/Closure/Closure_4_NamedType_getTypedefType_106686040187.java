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

public class NamedType_getTypedefType_106686040187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46071;
     Object term46279;
     Object term46307;
     Object term46309;

    public NamedType_getTypedefType_106686040187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term46175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term46071, term46071.getClass(), "registry", term46175);
        term46279 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term46307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term46308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term46307, term46307.getClass(), "reference", null);
        setField(term46307, term46307.getClass(), "sourceName", null);
        setIntField(term46307, term46307.getClass(), "lineno", 0);
        setIntField(term46307, term46307.getClass(), "charno", 0);
        setField(term46307, term46307.getClass(), "validator", null);
        setField(term46307, term46307.getClass(), "propertyContinuations", null);
        setField(term46307, term46307.getClass(), "referencedType", null);
        setField(term46307, term46307.getClass(), "referencedObjType", null);
        setBooleanField(term46307, term46307.getClass(), "visited", false);
        setField(term46307, term46307.getClass(), "docInfo", null);
        setBooleanField(term46307, term46307.getClass(), "unknown", false);
        setBooleanField(term46307, term46307.getClass(), "resolved", true);
        setField(term46307, term46307.getClass(), "resolveResult", term46307);
        setField(term46307, term46307.getClass(), "templateKeys", null);
        setField(term46307, term46307.getClass(), "templatizedTypes", null);
        setBooleanField(term46307, term46307.getClass(), "inTemplatedCheckVisit", false);
        setField(term46308, term46308.getClass(), "reporter", null);
        setField(term46308, term46308.getClass(), "nativeTypes", null);
        setField(term46308, term46308.getClass(), "namesToTypes", null);
        setField(term46308, term46308.getClass(), "namespaces", null);
        setField(term46308, term46308.getClass(), "nonNullableTypeNames", null);
        setField(term46308, term46308.getClass(), "forwardDeclaredTypes", null);
        setField(term46308, term46308.getClass(), "typesIndexedByProperty", null);
        setField(term46308, term46308.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term46308, term46308.getClass(), "greatestSubtypeByProperty", null);
        setField(term46308, term46308.getClass(), "interfaceToImplementors", null);
        setField(term46308, term46308.getClass(), "unresolvedNamedTypes", null);
        setField(term46308, term46308.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term46308, term46308.getClass(), "lastGeneration", false);
        setField(term46308, term46308.getClass(), "templateTypes", null);
        setBooleanField(term46308, term46308.getClass(), "tolerateUndefinedValues", false);
        setField(term46308, term46308.getClass(), "resolveMode", null);
        setField(term46307, term46307.getClass(), "registry", term46308);
        term46309 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term46309, term46309.getClass(), "baseName", null);
        setField(term46309, term46309.getClass(), "parent", null);
        setField(term46309, term46309.getClass(), "props", null);
        setField(term46309, term46309.getClass(), "declaration", null);
        setField(term46309, term46309.getClass(), "refs", null);
        setField(term46309, term46309.getClass(), "type", null);
        setBooleanField(term46309, term46309.getClass(), "declaredType", false);
        setBooleanField(term46309, term46309.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term46309, term46309.getClass(), "globalSets", 0);
        setIntField(term46309, term46309.getClass(), "localSets", 0);
        setIntField(term46309, term46309.getClass(), "aliasingGets", 0);
        setIntField(term46309, term46309.getClass(), "totalGets", 0);
        setIntField(term46309, term46309.getClass(), "callGets", 0);
        setIntField(term46309, term46309.getClass(), "deleteProps", 0);
        setBooleanField(term46309, term46309.getClass(), "inExterns", false);
        setField(term46309, term46309.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term46279;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term46071, args);
        assertTrue(recursiveEquals(term46071, term46307));
        assertTrue(recursiveEquals(term46279, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


