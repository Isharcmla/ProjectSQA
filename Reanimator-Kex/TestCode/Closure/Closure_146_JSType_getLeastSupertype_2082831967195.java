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

public class JSType_getLeastSupertype_2082831967195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25592;
     Object term25788;
     Object term26202;
     Object term26203;
     Object term26105;

    public JSType_getLeastSupertype_2082831967195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term25696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term25592, term25592.getClass(), "registry", term25696);
        term25788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term26202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term26202, term26202.getClass(), "resolved", false);
        setField(term26202, term26202.getClass(), "resolveResult", null);
        setField(term26202, term26202.getClass(), "registry", null);
        term26203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term26204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term26203, term26203.getClass(), "leastSupertypeVisitor", null);
        setField(term26203, term26203.getClass(), "greatestSubtypeVisitor", null);
        setField(term26203, term26203.getClass(), "call", null);
        setField(term26203, term26203.getClass(), "prototype", null);
        setField(term26203, term26203.getClass(), "kind", null);
        setField(term26203, term26203.getClass(), "typeOfThis", null);
        setField(term26203, term26203.getClass(), "source", null);
        setField(term26203, term26203.getClass(), "implementedInterfaces", null);
        setField(term26203, term26203.getClass(), "subTypes", null);
        setField(term26203, term26203.getClass(), "templateTypeName", null);
        setField(term26203, term26203.getClass(), "className", null);
        setField(term26203, term26203.getClass(), "properties", null);
        setField(term26203, term26203.getClass(), "implicitPrototype", null);
        setBooleanField(term26203, term26203.getClass(), "nativeType", false);
        setBooleanField(term26203, term26203.getClass(), "prettyPrint", false);
        setBooleanField(term26203, term26203.getClass(), "visited", false);
        setField(term26203, term26203.getClass(), "docInfo", null);
        setBooleanField(term26203, term26203.getClass(), "unknown", false);
        setBooleanField(term26203, term26203.getClass(), "resolved", false);
        setField(term26203, term26203.getClass(), "resolveResult", null);
        setField(term26204, term26204.getClass(), "reporter", null);
        setField(term26204, term26204.getClass(), "nativeTypes", null);
        setField(term26204, term26204.getClass(), "namesToTypes", null);
        setField(term26204, term26204.getClass(), "namespaces", null);
        setField(term26204, term26204.getClass(), "enumTypeNames", null);
        setField(term26204, term26204.getClass(), "forwardDeclaredTypes", null);
        setField(term26204, term26204.getClass(), "typesIndexedByProperty", null);
        setField(term26204, term26204.getClass(), "greatestSubtypeByProperty", null);
        setField(term26204, term26204.getClass(), "interfaceToImplementors", null);
        setField(term26204, term26204.getClass(), "unresolvedNamedTypes", null);
        setField(term26204, term26204.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term26204, term26204.getClass(), "lastGeneration", false);
        setField(term26204, term26204.getClass(), "templateTypeName", null);
        setField(term26204, term26204.getClass(), "templateType", null);
        setBooleanField(term26204, term26204.getClass(), "tolerateUndefinedValues", false);
        setField(term26204, term26204.getClass(), "resolveMode", null);
        setField(term26203, term26203.getClass(), "registry", term26204);
        term26105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term26105, term26105.getClass(), "resolved", false);
        setField(term26105, term26105.getClass(), "resolveResult", null);
        setField(term26105, term26105.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term25592;
        args[1] = term25788;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term25592, term26202));
        assertTrue(recursiveEquals(term25788, term26203));
        assertTrue(recursiveEquals(retValue, term26105));
    }

};


