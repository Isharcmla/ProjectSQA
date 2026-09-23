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

public class NamedType_handleUnresolvedType_206329762298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94593;
     Object term94835;
     Object term145078;
     Object term145082;

    public NamedType_handleUnresolvedType_206329762298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term94697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term94697, term94697.getClass(), "lastGeneration", true);
        setField(term94593, term94593.getClass(), "registry", term94697);
        setField(term94593, term94593.getClass(), "reference", null);
        setField(term94593, term94593.getClass(), "sourceName", "");
        setIntField(term94593, term94593.getClass(), "lineno", 1);
        setIntField(term94593, term94593.getClass(), "charno", 0);
        term94835 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term94835, term94835.getClass(), "warnings", null);
        term145078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term145081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term145078, term145078.getClass(), "reference", null);
        setField(term145078, term145078.getClass(), "sourceName", "");
        setIntField(term145078, term145078.getClass(), "lineno", 1);
        setIntField(term145078, term145078.getClass(), "charno", 0);
        setField(term145078, term145078.getClass(), "validator", null);
        setField(term145078, term145078.getClass(), "propertyContinuations", null);
        setField(term145078, term145078.getClass(), "referencedType", null);
        setField(term145078, term145078.getClass(), "referencedObjType", null);
        setBooleanField(term145078, term145078.getClass(), "visited", false);
        setField(term145078, term145078.getClass(), "docInfo", null);
        setBooleanField(term145078, term145078.getClass(), "unknown", false);
        setBooleanField(term145078, term145078.getClass(), "resolved", true);
        setField(term145078, term145078.getClass(), "resolveResult", null);
        setField(term145078, term145078.getClass(), "templateKeys", null);
        setField(term145078, term145078.getClass(), "templatizedTypes", null);
        setBooleanField(term145078, term145078.getClass(), "inTemplatedCheckVisit", false);
        setField(term145081, term145081.getClass(), "reporter", null);
        setField(term145081, term145081.getClass(), "nativeTypes", null);
        setField(term145081, term145081.getClass(), "namesToTypes", null);
        setField(term145081, term145081.getClass(), "namespaces", null);
        setField(term145081, term145081.getClass(), "nonNullableTypeNames", null);
        setField(term145081, term145081.getClass(), "forwardDeclaredTypes", null);
        setField(term145081, term145081.getClass(), "typesIndexedByProperty", null);
        setField(term145081, term145081.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term145081, term145081.getClass(), "greatestSubtypeByProperty", null);
        setField(term145081, term145081.getClass(), "interfaceToImplementors", null);
        setField(term145081, term145081.getClass(), "unresolvedNamedTypes", null);
        setField(term145081, term145081.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term145081, term145081.getClass(), "lastGeneration", true);
        setField(term145081, term145081.getClass(), "templateTypes", null);
        setBooleanField(term145081, term145081.getClass(), "tolerateUndefinedValues", false);
        setField(term145081, term145081.getClass(), "resolveMode", null);
        setField(term145078, term145078.getClass(), "registry", term145081);
        ArrayList term145083 = new ArrayList();
        ((ArrayList) term145083).add("Bad type annotation. Unknown type null (#1)");
        term145082 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term145082, term145082.getClass(), "warnings", term145083);
        setField(term145082, term145082.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term94835;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term94593, args);
        assertTrue(recursiveEquals(term94593, term145078));
        assertTrue(recursiveEquals(term94835, term145082));
    }

};


