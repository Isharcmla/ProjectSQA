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

public class NamedType_getTypedefType_106686040131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28006;
     Object term28202;
     Object term28222;
     Object term28224;

    public NamedType_getTypedefType_106686040131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term28110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term28006, term28006.getClass(), "registry", term28110);
        term28202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term28202, term28202.getClass(), "type", null);
        term28222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term28223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term28222, term28222.getClass(), "reference", null);
        setField(term28222, term28222.getClass(), "sourceName", null);
        setIntField(term28222, term28222.getClass(), "lineno", 0);
        setIntField(term28222, term28222.getClass(), "charno", 0);
        setField(term28222, term28222.getClass(), "validator", null);
        setField(term28222, term28222.getClass(), "propertyContinuations", null);
        setField(term28222, term28222.getClass(), "referencedType", null);
        setField(term28222, term28222.getClass(), "referencedObjType", null);
        setBooleanField(term28222, term28222.getClass(), "visited", false);
        setField(term28222, term28222.getClass(), "docInfo", null);
        setBooleanField(term28222, term28222.getClass(), "unknown", false);
        setBooleanField(term28222, term28222.getClass(), "resolved", true);
        setField(term28222, term28222.getClass(), "resolveResult", term28222);
        setField(term28222, term28222.getClass(), "templateKeys", null);
        setField(term28222, term28222.getClass(), "templatizedTypes", null);
        setBooleanField(term28222, term28222.getClass(), "inTemplatedCheckVisit", false);
        setField(term28223, term28223.getClass(), "reporter", null);
        setField(term28223, term28223.getClass(), "nativeTypes", null);
        setField(term28223, term28223.getClass(), "namesToTypes", null);
        setField(term28223, term28223.getClass(), "namespaces", null);
        setField(term28223, term28223.getClass(), "nonNullableTypeNames", null);
        setField(term28223, term28223.getClass(), "forwardDeclaredTypes", null);
        setField(term28223, term28223.getClass(), "typesIndexedByProperty", null);
        setField(term28223, term28223.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term28223, term28223.getClass(), "greatestSubtypeByProperty", null);
        setField(term28223, term28223.getClass(), "interfaceToImplementors", null);
        setField(term28223, term28223.getClass(), "unresolvedNamedTypes", null);
        setField(term28223, term28223.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term28223, term28223.getClass(), "lastGeneration", false);
        setField(term28223, term28223.getClass(), "templateTypes", null);
        setBooleanField(term28223, term28223.getClass(), "tolerateUndefinedValues", false);
        setField(term28223, term28223.getClass(), "resolveMode", null);
        setField(term28222, term28222.getClass(), "registry", term28223);
        term28224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term28224, term28224.getClass(), "name", null);
        setField(term28224, term28224.getClass(), "type", null);
        setBooleanField(term28224, term28224.getClass(), "inferred", false);
        setField(term28224, term28224.getClass(), "propertyNode", null);
        setField(term28224, term28224.getClass(), "docInfo", null);
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
        args[1] = term28202;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term28006, args);
        assertTrue(recursiveEquals(term28006, term28222));
        assertTrue(recursiveEquals(term28202, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


