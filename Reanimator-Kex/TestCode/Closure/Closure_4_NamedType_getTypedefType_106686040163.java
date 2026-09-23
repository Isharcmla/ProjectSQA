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

public class NamedType_getTypedefType_106686040163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39832;
     Object term40030;
     Object term40053;
     Object term40055;

    public NamedType_getTypedefType_106686040163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term39936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term39832, term39832.getClass(), "registry", term39936);
        term40030 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        setField(term40030, term40030.getClass(), "type", null);
        term40053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term40054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term40053, term40053.getClass(), "reference", null);
        setField(term40053, term40053.getClass(), "sourceName", null);
        setIntField(term40053, term40053.getClass(), "lineno", 0);
        setIntField(term40053, term40053.getClass(), "charno", 0);
        setField(term40053, term40053.getClass(), "validator", null);
        setField(term40053, term40053.getClass(), "propertyContinuations", null);
        setField(term40053, term40053.getClass(), "referencedType", null);
        setField(term40053, term40053.getClass(), "referencedObjType", null);
        setBooleanField(term40053, term40053.getClass(), "visited", false);
        setField(term40053, term40053.getClass(), "docInfo", null);
        setBooleanField(term40053, term40053.getClass(), "unknown", false);
        setBooleanField(term40053, term40053.getClass(), "resolved", true);
        setField(term40053, term40053.getClass(), "resolveResult", term40053);
        setField(term40053, term40053.getClass(), "templateKeys", null);
        setField(term40053, term40053.getClass(), "templatizedTypes", null);
        setBooleanField(term40053, term40053.getClass(), "inTemplatedCheckVisit", false);
        setField(term40054, term40054.getClass(), "reporter", null);
        setField(term40054, term40054.getClass(), "nativeTypes", null);
        setField(term40054, term40054.getClass(), "namesToTypes", null);
        setField(term40054, term40054.getClass(), "namespaces", null);
        setField(term40054, term40054.getClass(), "nonNullableTypeNames", null);
        setField(term40054, term40054.getClass(), "forwardDeclaredTypes", null);
        setField(term40054, term40054.getClass(), "typesIndexedByProperty", null);
        setField(term40054, term40054.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term40054, term40054.getClass(), "greatestSubtypeByProperty", null);
        setField(term40054, term40054.getClass(), "interfaceToImplementors", null);
        setField(term40054, term40054.getClass(), "unresolvedNamedTypes", null);
        setField(term40054, term40054.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term40054, term40054.getClass(), "lastGeneration", false);
        setField(term40054, term40054.getClass(), "templateTypes", null);
        setBooleanField(term40054, term40054.getClass(), "tolerateUndefinedValues", false);
        setField(term40054, term40054.getClass(), "resolveMode", null);
        setField(term40053, term40053.getClass(), "registry", term40054);
        term40055 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        setField(term40055, term40055.getClass(), "name", null);
        setField(term40055, term40055.getClass(), "nameNode", null);
        setField(term40055, term40055.getClass(), "type", null);
        setBooleanField(term40055, term40055.getClass(), "typeInferred", false);
        setField(term40055, term40055.getClass(), "input", null);
        setIntField(term40055, term40055.getClass(), "index", 0);
        setField(term40055, term40055.getClass(), "scope", null);
        setBooleanField(term40055, term40055.getClass(), "markedEscaped", false);
        setBooleanField(term40055, term40055.getClass(), "markedAssignedExactlyOnce", false);
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
        args[1] = term40030;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term39832, args);
        assertTrue(recursiveEquals(term39832, term40053));
        assertTrue(recursiveEquals(term40030, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


