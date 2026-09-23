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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200282;
     Object term200374;
     Object term200750;
     Object term200751;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200282 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term200374 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term200466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term200624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term200374, term200374.getClass(), "type", 45);
        setIntField(term200466, term200466.getClass(), "type", -458798);
        setField(term200466, term200466.getClass(), "jsType", term200554);
        setField(term200374, term200374.getClass(), "first", term200466);
        setIntField(term200624, term200624.getClass(), "type", 45);
        setField(term200624, term200624.getClass(), "jsType", null);
        setField(term200374, term200374.getClass(), "last", term200624);
        term200750 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term200750, term200750.getClass(), "INEQ", null);
        setField(term200750, term200750.getClass(), "convention", null);
        setField(term200750, term200750.getClass(), "typeRegistry", null);
        setField(term200750, term200750.getClass(), "firstLink", null);
        setField(term200750, term200750.getClass(), "nextLink", null);
        setField(term200750, term200750.getClass(), "restrictUndefinedVisitor", null);
        setField(term200750, term200750.getClass(), "restrictNullVisitor", null);
        term200751 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term200752 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term200754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term200751, term200751.getClass(), "str", null);
        setIntField(term200751, term200751.getClass(), "type", 45);
        setField(term200751, term200751.getClass(), "next", null);
        setDoubleField(term200752, term200752.getClass(), "number", 0.0);
        setIntField(term200752, term200752.getClass(), "type", -458798);
        setField(term200752, term200752.getClass(), "next", null);
        setField(term200752, term200752.getClass(), "first", null);
        setField(term200752, term200752.getClass(), "last", null);
        setField(term200752, term200752.getClass(), "propListHead", null);
        setIntField(term200752, term200752.getClass(), "sourcePosition", 0);
        setField(term200753, term200753.getClass(), "call", null);
        setField(term200753, term200753.getClass(), "prototypeSlot", null);
        setField(term200753, term200753.getClass(), "kind", null);
        setField(term200753, term200753.getClass(), "typeOfThis", null);
        setField(term200753, term200753.getClass(), "source", null);
        setField(term200753, term200753.getClass(), "implementedInterfaces", null);
        setField(term200753, term200753.getClass(), "extendedInterfaces", null);
        setField(term200753, term200753.getClass(), "subTypes", null);
        setField(term200753, term200753.getClass(), "templateTypeNames", null);
        setField(term200753, term200753.getClass(), "className", null);
        setField(term200753, term200753.getClass(), "properties", null);
        setBooleanField(term200753, term200753.getClass(), "nativeType", false);
        setField(term200753, term200753.getClass(), "implicitPrototypeFallback", null);
        setField(term200753, term200753.getClass(), "ownerFunction", null);
        setBooleanField(term200753, term200753.getClass(), "prettyPrint", false);
        setBooleanField(term200753, term200753.getClass(), "visited", false);
        setField(term200753, term200753.getClass(), "docInfo", null);
        setBooleanField(term200753, term200753.getClass(), "unknown", false);
        setBooleanField(term200753, term200753.getClass(), "resolved", false);
        setField(term200753, term200753.getClass(), "resolveResult", null);
        setBooleanField(term200753, term200753.getClass(), "inTemplatedCheckVisit", false);
        setField(term200753, term200753.getClass(), "registry", null);
        setField(term200752, term200752.getClass(), "jsType", term200753);
        setField(term200752, term200752.getClass(), "parent", null);
        setField(term200751, term200751.getClass(), "first", term200752);
        setIntField(term200754, term200754.getClass(), "type", 45);
        setField(term200754, term200754.getClass(), "next", null);
        setField(term200754, term200754.getClass(), "first", null);
        setField(term200754, term200754.getClass(), "last", null);
        setField(term200754, term200754.getClass(), "propListHead", null);
        setIntField(term200754, term200754.getClass(), "sourcePosition", 0);
        setField(term200754, term200754.getClass(), "jsType", null);
        setField(term200754, term200754.getClass(), "parent", null);
        setField(term200751, term200751.getClass(), "last", term200754);
        setField(term200751, term200751.getClass(), "propListHead", null);
        setIntField(term200751, term200751.getClass(), "sourcePosition", 0);
        setField(term200751, term200751.getClass(), "jsType", null);
        setField(term200751, term200751.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term200374;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term200282, args);
        assertTrue(recursiveEquals(term200282, term200750));
        assertTrue(recursiveEquals(term200374, term200751));
        assertTrue(recursiveEquals(retValue, null));
    }

};


