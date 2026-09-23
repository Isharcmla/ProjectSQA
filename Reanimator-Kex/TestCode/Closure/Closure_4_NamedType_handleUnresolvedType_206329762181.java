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
import java.util.ArrayList;

public class NamedType_handleUnresolvedType_206329762181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44469;
     Object term44673;
     Object term44878;
     Object term44880;

    public NamedType_handleUnresolvedType_206329762181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term44573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term44573, term44573.getClass(), "lastGeneration", true);
        setField(term44469, term44469.getClass(), "registry", term44573);
        setField(term44469, term44469.getClass(), "reference", null);
        setField(term44469, term44469.getClass(), "sourceName", null);
        setIntField(term44469, term44469.getClass(), "lineno", 0);
        setIntField(term44469, term44469.getClass(), "charno", 0);
        ArrayList term44725 = new ArrayList();
        term44673 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term44673, term44673.getClass(), "warnings", term44725);
        term44878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term44879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term44878, term44878.getClass(), "reference", null);
        setField(term44878, term44878.getClass(), "sourceName", null);
        setIntField(term44878, term44878.getClass(), "lineno", 0);
        setIntField(term44878, term44878.getClass(), "charno", 0);
        setField(term44878, term44878.getClass(), "validator", null);
        setField(term44878, term44878.getClass(), "propertyContinuations", null);
        setField(term44878, term44878.getClass(), "referencedType", null);
        setField(term44878, term44878.getClass(), "referencedObjType", null);
        setBooleanField(term44878, term44878.getClass(), "visited", false);
        setField(term44878, term44878.getClass(), "docInfo", null);
        setBooleanField(term44878, term44878.getClass(), "unknown", false);
        setBooleanField(term44878, term44878.getClass(), "resolved", true);
        setField(term44878, term44878.getClass(), "resolveResult", null);
        setField(term44878, term44878.getClass(), "templateKeys", null);
        setField(term44878, term44878.getClass(), "templatizedTypes", null);
        setBooleanField(term44878, term44878.getClass(), "inTemplatedCheckVisit", false);
        setField(term44879, term44879.getClass(), "reporter", null);
        setField(term44879, term44879.getClass(), "nativeTypes", null);
        setField(term44879, term44879.getClass(), "namesToTypes", null);
        setField(term44879, term44879.getClass(), "namespaces", null);
        setField(term44879, term44879.getClass(), "nonNullableTypeNames", null);
        setField(term44879, term44879.getClass(), "forwardDeclaredTypes", null);
        setField(term44879, term44879.getClass(), "typesIndexedByProperty", null);
        setField(term44879, term44879.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term44879, term44879.getClass(), "greatestSubtypeByProperty", null);
        setField(term44879, term44879.getClass(), "interfaceToImplementors", null);
        setField(term44879, term44879.getClass(), "unresolvedNamedTypes", null);
        setField(term44879, term44879.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term44879, term44879.getClass(), "lastGeneration", true);
        setField(term44879, term44879.getClass(), "templateTypes", null);
        setBooleanField(term44879, term44879.getClass(), "tolerateUndefinedValues", false);
        setField(term44879, term44879.getClass(), "resolveMode", null);
        setField(term44878, term44878.getClass(), "registry", term44879);
        ArrayList term44881 = new ArrayList();
        ((ArrayList) term44881).add("Bad type annotation. Unknown type null");
        term44880 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term44880, term44880.getClass(), "warnings", term44881);
        setField(term44880, term44880.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term44673;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term44469, args);
        assertTrue(recursiveEquals(term44469, term44878));
        assertTrue(recursiveEquals(term44673, term44880));
    }

};


