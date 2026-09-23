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

public class NamedType_getTypedefType_106686040231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69662;
     Object term69862;
     Object term69882;
     Object term69884;

    public NamedType_getTypedefType_106686040231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term69766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69662, term69662.getClass(), "registry", term69766);
        term69862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setField(term69862, term69862.getClass(), "type", null);
        term69882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term69883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69882, term69882.getClass(), "reference", null);
        setField(term69882, term69882.getClass(), "sourceName", null);
        setIntField(term69882, term69882.getClass(), "lineno", 0);
        setIntField(term69882, term69882.getClass(), "charno", 0);
        setField(term69882, term69882.getClass(), "validator", null);
        setField(term69882, term69882.getClass(), "propertyContinuations", null);
        setField(term69882, term69882.getClass(), "referencedType", null);
        setField(term69882, term69882.getClass(), "referencedObjType", null);
        setBooleanField(term69882, term69882.getClass(), "visited", false);
        setField(term69882, term69882.getClass(), "docInfo", null);
        setBooleanField(term69882, term69882.getClass(), "unknown", false);
        setBooleanField(term69882, term69882.getClass(), "resolved", true);
        setField(term69882, term69882.getClass(), "resolveResult", term69882);
        setField(term69882, term69882.getClass(), "templateKeys", null);
        setField(term69882, term69882.getClass(), "templatizedTypes", null);
        setBooleanField(term69882, term69882.getClass(), "inTemplatedCheckVisit", false);
        setField(term69883, term69883.getClass(), "reporter", null);
        setField(term69883, term69883.getClass(), "nativeTypes", null);
        setField(term69883, term69883.getClass(), "namesToTypes", null);
        setField(term69883, term69883.getClass(), "namespaces", null);
        setField(term69883, term69883.getClass(), "nonNullableTypeNames", null);
        setField(term69883, term69883.getClass(), "forwardDeclaredTypes", null);
        setField(term69883, term69883.getClass(), "typesIndexedByProperty", null);
        setField(term69883, term69883.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term69883, term69883.getClass(), "greatestSubtypeByProperty", null);
        setField(term69883, term69883.getClass(), "interfaceToImplementors", null);
        setField(term69883, term69883.getClass(), "unresolvedNamedTypes", null);
        setField(term69883, term69883.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term69883, term69883.getClass(), "lastGeneration", false);
        setField(term69883, term69883.getClass(), "templateTypes", null);
        setBooleanField(term69883, term69883.getClass(), "tolerateUndefinedValues", false);
        setField(term69883, term69883.getClass(), "resolveMode", null);
        setField(term69882, term69882.getClass(), "registry", term69883);
        term69884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setField(term69884, term69884.getClass(), "name", null);
        setField(term69884, term69884.getClass(), "type", null);
        setBooleanField(term69884, term69884.getClass(), "inferred", false);
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
        args[1] = term69862;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term69662, args);
        assertTrue(recursiveEquals(term69662, term69882));
        assertTrue(recursiveEquals(term69862, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


