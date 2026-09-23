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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197165;
     Object term197257;
     Object term197668;
     Object term197669;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197165 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term197257 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term197349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term197449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term197541 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term197257, term197257.getClass(), "type", 46);
        setIntField(term197349, term197349.getClass(), "type", 46);
        setField(term197349, term197349.getClass(), "jsType", term197449);
        setField(term197257, term197257.getClass(), "first", term197349);
        setIntField(term197541, term197541.getClass(), "type", 0);
        setField(term197541, term197541.getClass(), "jsType", null);
        setField(term197257, term197257.getClass(), "last", term197541);
        term197668 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term197668, term197668.getClass(), "INEQ", null);
        setField(term197668, term197668.getClass(), "convention", null);
        setField(term197668, term197668.getClass(), "typeRegistry", null);
        setField(term197668, term197668.getClass(), "firstLink", null);
        setField(term197668, term197668.getClass(), "nextLink", null);
        setField(term197668, term197668.getClass(), "restrictUndefinedVisitor", null);
        setField(term197668, term197668.getClass(), "restrictNullVisitor", null);
        term197669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term197670 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term197671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term197672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term197669, term197669.getClass(), "number", 0.0);
        setIntField(term197669, term197669.getClass(), "type", 46);
        setField(term197669, term197669.getClass(), "next", null);
        setDoubleField(term197670, term197670.getClass(), "number", 0.0);
        setIntField(term197670, term197670.getClass(), "type", 46);
        setField(term197670, term197670.getClass(), "next", null);
        setField(term197670, term197670.getClass(), "first", null);
        setField(term197670, term197670.getClass(), "last", null);
        setField(term197670, term197670.getClass(), "propListHead", null);
        setIntField(term197670, term197670.getClass(), "sourcePosition", 0);
        setField(term197671, term197671.getClass(), "call", null);
        setField(term197671, term197671.getClass(), "prototypeSlot", null);
        setField(term197671, term197671.getClass(), "kind", null);
        setField(term197671, term197671.getClass(), "typeOfThis", null);
        setField(term197671, term197671.getClass(), "source", null);
        setField(term197671, term197671.getClass(), "implementedInterfaces", null);
        setField(term197671, term197671.getClass(), "extendedInterfaces", null);
        setField(term197671, term197671.getClass(), "subTypes", null);
        setField(term197671, term197671.getClass(), "templateTypeNames", null);
        setField(term197671, term197671.getClass(), "className", null);
        setField(term197671, term197671.getClass(), "properties", null);
        setBooleanField(term197671, term197671.getClass(), "nativeType", false);
        setField(term197671, term197671.getClass(), "implicitPrototypeFallback", null);
        setField(term197671, term197671.getClass(), "ownerFunction", null);
        setBooleanField(term197671, term197671.getClass(), "prettyPrint", false);
        setBooleanField(term197671, term197671.getClass(), "visited", false);
        setField(term197671, term197671.getClass(), "docInfo", null);
        setBooleanField(term197671, term197671.getClass(), "unknown", false);
        setBooleanField(term197671, term197671.getClass(), "resolved", false);
        setField(term197671, term197671.getClass(), "resolveResult", null);
        setBooleanField(term197671, term197671.getClass(), "inTemplatedCheckVisit", false);
        setField(term197671, term197671.getClass(), "registry", null);
        setField(term197670, term197670.getClass(), "jsType", term197671);
        setField(term197670, term197670.getClass(), "parent", null);
        setField(term197669, term197669.getClass(), "first", term197670);
        setField(term197672, term197672.getClass(), "str", null);
        setIntField(term197672, term197672.getClass(), "type", 0);
        setField(term197672, term197672.getClass(), "next", null);
        setField(term197672, term197672.getClass(), "first", null);
        setField(term197672, term197672.getClass(), "last", null);
        setField(term197672, term197672.getClass(), "propListHead", null);
        setIntField(term197672, term197672.getClass(), "sourcePosition", 0);
        setField(term197672, term197672.getClass(), "jsType", null);
        setField(term197672, term197672.getClass(), "parent", null);
        setField(term197669, term197669.getClass(), "last", term197672);
        setField(term197669, term197669.getClass(), "propListHead", null);
        setIntField(term197669, term197669.getClass(), "sourcePosition", 0);
        setField(term197669, term197669.getClass(), "jsType", null);
        setField(term197669, term197669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term197257;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term197165, args);
        assertTrue(recursiveEquals(term197165, term197668));
        assertTrue(recursiveEquals(term197257, term197669));
        assertTrue(recursiveEquals(retValue, null));
    }

};


