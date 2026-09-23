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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388652;
     Object term388744;
     Object term389411;
     Object term389412;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388652 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term388744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term388836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term388936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term389028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term389128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term388744, term388744.getClass(), "type", 46);
        setIntField(term388836, term388836.getClass(), "type", 0);
        setField(term388836, term388836.getClass(), "jsType", term388936);
        setField(term388744, term388744.getClass(), "first", term388836);
        setIntField(term389028, term389028.getClass(), "type", 0);
        setField(term389028, term389028.getClass(), "jsType", term389128);
        setField(term388744, term388744.getClass(), "last", term389028);
        term389411 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term389411, term389411.getClass(), "INEQ", null);
        setField(term389411, term389411.getClass(), "convention", null);
        setField(term389411, term389411.getClass(), "typeRegistry", null);
        setField(term389411, term389411.getClass(), "firstLink", null);
        setField(term389411, term389411.getClass(), "nextLink", null);
        setField(term389411, term389411.getClass(), "restrictUndefinedVisitor", null);
        setField(term389411, term389411.getClass(), "restrictNullVisitor", null);
        term389412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term389413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term389414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term389415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term389416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term389412, term389412.getClass(), "str", null);
        setIntField(term389412, term389412.getClass(), "type", 46);
        setField(term389412, term389412.getClass(), "next", null);
        setField(term389413, term389413.getClass(), "str", null);
        setIntField(term389413, term389413.getClass(), "type", 0);
        setField(term389413, term389413.getClass(), "next", null);
        setField(term389413, term389413.getClass(), "first", null);
        setField(term389413, term389413.getClass(), "last", null);
        setField(term389413, term389413.getClass(), "propListHead", null);
        setIntField(term389413, term389413.getClass(), "sourcePosition", 0);
        setField(term389414, term389414.getClass(), "call", null);
        setField(term389414, term389414.getClass(), "prototypeSlot", null);
        setField(term389414, term389414.getClass(), "kind", null);
        setField(term389414, term389414.getClass(), "typeOfThis", null);
        setField(term389414, term389414.getClass(), "source", null);
        setField(term389414, term389414.getClass(), "implementedInterfaces", null);
        setField(term389414, term389414.getClass(), "extendedInterfaces", null);
        setField(term389414, term389414.getClass(), "subTypes", null);
        setField(term389414, term389414.getClass(), "templateTypeNames", null);
        setField(term389414, term389414.getClass(), "className", null);
        setField(term389414, term389414.getClass(), "properties", null);
        setBooleanField(term389414, term389414.getClass(), "nativeType", false);
        setField(term389414, term389414.getClass(), "implicitPrototypeFallback", null);
        setField(term389414, term389414.getClass(), "ownerFunction", null);
        setBooleanField(term389414, term389414.getClass(), "prettyPrint", false);
        setBooleanField(term389414, term389414.getClass(), "visited", false);
        setField(term389414, term389414.getClass(), "docInfo", null);
        setBooleanField(term389414, term389414.getClass(), "unknown", false);
        setBooleanField(term389414, term389414.getClass(), "resolved", false);
        setField(term389414, term389414.getClass(), "resolveResult", null);
        setBooleanField(term389414, term389414.getClass(), "inTemplatedCheckVisit", false);
        setField(term389414, term389414.getClass(), "registry", null);
        setField(term389413, term389413.getClass(), "jsType", term389414);
        setField(term389413, term389413.getClass(), "parent", null);
        setField(term389412, term389412.getClass(), "first", term389413);
        setDoubleField(term389415, term389415.getClass(), "number", 0.0);
        setIntField(term389415, term389415.getClass(), "type", 0);
        setField(term389415, term389415.getClass(), "next", null);
        setField(term389415, term389415.getClass(), "first", null);
        setField(term389415, term389415.getClass(), "last", null);
        setField(term389415, term389415.getClass(), "propListHead", null);
        setIntField(term389415, term389415.getClass(), "sourcePosition", 0);
        setField(term389416, term389416.getClass(), "call", null);
        setField(term389416, term389416.getClass(), "prototypeSlot", null);
        setField(term389416, term389416.getClass(), "kind", null);
        setField(term389416, term389416.getClass(), "typeOfThis", null);
        setField(term389416, term389416.getClass(), "source", null);
        setField(term389416, term389416.getClass(), "implementedInterfaces", null);
        setField(term389416, term389416.getClass(), "extendedInterfaces", null);
        setField(term389416, term389416.getClass(), "subTypes", null);
        setField(term389416, term389416.getClass(), "templateTypeNames", null);
        setField(term389416, term389416.getClass(), "className", null);
        setField(term389416, term389416.getClass(), "properties", null);
        setBooleanField(term389416, term389416.getClass(), "nativeType", false);
        setField(term389416, term389416.getClass(), "implicitPrototypeFallback", null);
        setField(term389416, term389416.getClass(), "ownerFunction", null);
        setBooleanField(term389416, term389416.getClass(), "prettyPrint", false);
        setBooleanField(term389416, term389416.getClass(), "visited", false);
        setField(term389416, term389416.getClass(), "docInfo", null);
        setBooleanField(term389416, term389416.getClass(), "unknown", false);
        setBooleanField(term389416, term389416.getClass(), "resolved", false);
        setField(term389416, term389416.getClass(), "resolveResult", null);
        setBooleanField(term389416, term389416.getClass(), "inTemplatedCheckVisit", false);
        setField(term389416, term389416.getClass(), "registry", null);
        setField(term389415, term389415.getClass(), "jsType", term389416);
        setField(term389415, term389415.getClass(), "parent", null);
        setField(term389412, term389412.getClass(), "last", term389415);
        setField(term389412, term389412.getClass(), "propListHead", null);
        setIntField(term389412, term389412.getClass(), "sourcePosition", 0);
        setField(term389412, term389412.getClass(), "jsType", null);
        setField(term389412, term389412.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term388744;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term388652, args);
        assertTrue(recursiveEquals(term388652, term389411));
        assertTrue(recursiveEquals(term388744, term389412));
        assertTrue(recursiveEquals(retValue, null));
    }

};


