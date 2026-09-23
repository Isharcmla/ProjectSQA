package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151977;
     Object term152069;
     Object term152924;
     Object term152925;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151977 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term152069 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term152331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152069, term152069.getClass(), "type", 12);
        setIntField(term152161, term152161.getClass(), "type", -458765);
        setField(term152161, term152161.getClass(), "jsType", term152261);
        setField(term152069, term152069.getClass(), "first", term152161);
        setIntField(term152331, term152331.getClass(), "type", 12);
        setField(term152331, term152331.getClass(), "jsType", null);
        setField(term152069, term152069.getClass(), "last", term152331);
        term152924 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term152924, term152924.getClass(), "INEQ", null);
        setField(term152924, term152924.getClass(), "convention", null);
        setField(term152924, term152924.getClass(), "typeRegistry", null);
        setField(term152924, term152924.getClass(), "firstLink", null);
        setField(term152924, term152924.getClass(), "nextLink", null);
        setField(term152924, term152924.getClass(), "restrictUndefinedVisitor", null);
        setField(term152924, term152924.getClass(), "restrictNullVisitor", null);
        term152925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term152928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term152925, term152925.getClass(), "str", null);
        setIntField(term152925, term152925.getClass(), "type", 12);
        setField(term152925, term152925.getClass(), "next", null);
        setDoubleField(term152926, term152926.getClass(), "number", 0.0);
        setIntField(term152926, term152926.getClass(), "type", -458765);
        setField(term152926, term152926.getClass(), "next", null);
        setField(term152926, term152926.getClass(), "first", null);
        setField(term152926, term152926.getClass(), "last", null);
        setField(term152926, term152926.getClass(), "propListHead", null);
        setIntField(term152926, term152926.getClass(), "sourcePosition", 0);
        setField(term152927, term152927.getClass(), "call", null);
        setField(term152927, term152927.getClass(), "prototypeSlot", null);
        setField(term152927, term152927.getClass(), "kind", null);
        setField(term152927, term152927.getClass(), "typeOfThis", null);
        setField(term152927, term152927.getClass(), "source", null);
        setField(term152927, term152927.getClass(), "implementedInterfaces", null);
        setField(term152927, term152927.getClass(), "extendedInterfaces", null);
        setField(term152927, term152927.getClass(), "subTypes", null);
        setField(term152927, term152927.getClass(), "templateTypeNames", null);
        setField(term152927, term152927.getClass(), "className", null);
        setField(term152927, term152927.getClass(), "properties", null);
        setBooleanField(term152927, term152927.getClass(), "nativeType", false);
        setField(term152927, term152927.getClass(), "implicitPrototypeFallback", null);
        setField(term152927, term152927.getClass(), "ownerFunction", null);
        setBooleanField(term152927, term152927.getClass(), "prettyPrint", false);
        setBooleanField(term152927, term152927.getClass(), "visited", false);
        setField(term152927, term152927.getClass(), "docInfo", null);
        setBooleanField(term152927, term152927.getClass(), "unknown", false);
        setBooleanField(term152927, term152927.getClass(), "resolved", false);
        setField(term152927, term152927.getClass(), "resolveResult", null);
        setBooleanField(term152927, term152927.getClass(), "inTemplatedCheckVisit", false);
        setField(term152927, term152927.getClass(), "registry", null);
        setField(term152926, term152926.getClass(), "jsType", term152927);
        setField(term152926, term152926.getClass(), "parent", null);
        setField(term152925, term152925.getClass(), "first", term152926);
        setIntField(term152928, term152928.getClass(), "type", 12);
        setField(term152928, term152928.getClass(), "next", null);
        setField(term152928, term152928.getClass(), "first", null);
        setField(term152928, term152928.getClass(), "last", null);
        setField(term152928, term152928.getClass(), "propListHead", null);
        setIntField(term152928, term152928.getClass(), "sourcePosition", 0);
        setField(term152928, term152928.getClass(), "jsType", null);
        setField(term152928, term152928.getClass(), "parent", null);
        setField(term152925, term152925.getClass(), "last", term152928);
        setField(term152925, term152925.getClass(), "propListHead", null);
        setIntField(term152925, term152925.getClass(), "sourcePosition", 0);
        setField(term152925, term152925.getClass(), "jsType", null);
        setField(term152925, term152925.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term152069;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term151977, args);
        assertTrue(recursiveEquals(term151977, term152924));
        assertTrue(recursiveEquals(term152069, term152925));
        assertTrue(recursiveEquals(retValue, null));
    }

};


