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

public class NamedType_getTypedefType_106686040133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28336;
     Object term28564;
     Object term28584;
     Object term28586;

    public NamedType_getTypedefType_106686040133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term28440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term28336, term28336.getClass(), "registry", term28440);
        term28564 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term28564, term28564.getClass(), "type", null);
        term28584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term28585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term28584, term28584.getClass(), "reference", null);
        setField(term28584, term28584.getClass(), "sourceName", null);
        setIntField(term28584, term28584.getClass(), "lineno", 0);
        setIntField(term28584, term28584.getClass(), "charno", 0);
        setField(term28584, term28584.getClass(), "validator", null);
        setField(term28584, term28584.getClass(), "propertyContinuations", null);
        setField(term28584, term28584.getClass(), "referencedType", null);
        setField(term28584, term28584.getClass(), "referencedObjType", null);
        setBooleanField(term28584, term28584.getClass(), "visited", false);
        setField(term28584, term28584.getClass(), "docInfo", null);
        setBooleanField(term28584, term28584.getClass(), "unknown", false);
        setBooleanField(term28584, term28584.getClass(), "resolved", true);
        setField(term28584, term28584.getClass(), "resolveResult", term28584);
        setField(term28584, term28584.getClass(), "templateKeys", null);
        setField(term28584, term28584.getClass(), "templatizedTypes", null);
        setBooleanField(term28584, term28584.getClass(), "inTemplatedCheckVisit", false);
        setField(term28585, term28585.getClass(), "reporter", null);
        setField(term28585, term28585.getClass(), "nativeTypes", null);
        setField(term28585, term28585.getClass(), "namesToTypes", null);
        setField(term28585, term28585.getClass(), "namespaces", null);
        setField(term28585, term28585.getClass(), "nonNullableTypeNames", null);
        setField(term28585, term28585.getClass(), "forwardDeclaredTypes", null);
        setField(term28585, term28585.getClass(), "typesIndexedByProperty", null);
        setField(term28585, term28585.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term28585, term28585.getClass(), "greatestSubtypeByProperty", null);
        setField(term28585, term28585.getClass(), "interfaceToImplementors", null);
        setField(term28585, term28585.getClass(), "unresolvedNamedTypes", null);
        setField(term28585, term28585.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term28585, term28585.getClass(), "lastGeneration", false);
        setField(term28585, term28585.getClass(), "templateTypes", null);
        setBooleanField(term28585, term28585.getClass(), "tolerateUndefinedValues", false);
        setField(term28585, term28585.getClass(), "resolveMode", null);
        setField(term28584, term28584.getClass(), "registry", term28585);
        term28586 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term28586, term28586.getClass(), "parent", null);
        setField(term28586, term28586.getClass(), "name", null);
        setField(term28586, term28586.getClass(), "type", null);
        setBooleanField(term28586, term28586.getClass(), "inferred", false);
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
        args[1] = term28564;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term28336, args);
        assertTrue(recursiveEquals(term28336, term28584));
        assertTrue(recursiveEquals(term28564, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


