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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186926;
     Object term187018;
     Object term187395;
     Object term187396;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186926 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term187018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term187204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term187296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term187018, term187018.getClass(), "type", 45);
        setIntField(term187110, term187110.getClass(), "type", 0);
        setField(term187110, term187110.getClass(), "jsType", term187204);
        setField(term187018, term187018.getClass(), "first", term187110);
        setIntField(term187296, term187296.getClass(), "type", 45);
        setField(term187296, term187296.getClass(), "jsType", null);
        setField(term187018, term187018.getClass(), "last", term187296);
        term187395 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term187395, term187395.getClass(), "INEQ", null);
        setField(term187395, term187395.getClass(), "convention", null);
        setField(term187395, term187395.getClass(), "typeRegistry", null);
        setField(term187395, term187395.getClass(), "firstLink", null);
        setField(term187395, term187395.getClass(), "nextLink", null);
        setField(term187395, term187395.getClass(), "restrictUndefinedVisitor", null);
        setField(term187395, term187395.getClass(), "restrictNullVisitor", null);
        term187396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term187398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term187399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term187396, term187396.getClass(), "str", null);
        setIntField(term187396, term187396.getClass(), "type", 45);
        setField(term187396, term187396.getClass(), "next", null);
        setDoubleField(term187397, term187397.getClass(), "number", 0.0);
        setIntField(term187397, term187397.getClass(), "type", 0);
        setField(term187397, term187397.getClass(), "next", null);
        setField(term187397, term187397.getClass(), "first", null);
        setField(term187397, term187397.getClass(), "last", null);
        setField(term187397, term187397.getClass(), "propListHead", null);
        setIntField(term187397, term187397.getClass(), "sourcePosition", 0);
        setField(term187398, term187398.getClass(), "alternates", null);
        setIntField(term187398, term187398.getClass(), "hashcode", 0);
        setBooleanField(term187398, term187398.getClass(), "resolved", false);
        setField(term187398, term187398.getClass(), "resolveResult", null);
        setBooleanField(term187398, term187398.getClass(), "inTemplatedCheckVisit", false);
        setField(term187398, term187398.getClass(), "registry", null);
        setField(term187397, term187397.getClass(), "jsType", term187398);
        setField(term187397, term187397.getClass(), "parent", null);
        setField(term187396, term187396.getClass(), "first", term187397);
        setField(term187399, term187399.getClass(), "str", null);
        setIntField(term187399, term187399.getClass(), "type", 45);
        setField(term187399, term187399.getClass(), "next", null);
        setField(term187399, term187399.getClass(), "first", null);
        setField(term187399, term187399.getClass(), "last", null);
        setField(term187399, term187399.getClass(), "propListHead", null);
        setIntField(term187399, term187399.getClass(), "sourcePosition", 0);
        setField(term187399, term187399.getClass(), "jsType", null);
        setField(term187399, term187399.getClass(), "parent", null);
        setField(term187396, term187396.getClass(), "last", term187399);
        setField(term187396, term187396.getClass(), "propListHead", null);
        setIntField(term187396, term187396.getClass(), "sourcePosition", 0);
        setField(term187396, term187396.getClass(), "jsType", null);
        setField(term187396, term187396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term187018;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term186926, args);
        assertTrue(recursiveEquals(term186926, term187395));
        assertTrue(recursiveEquals(term187018, term187396));
        assertTrue(recursiveEquals(retValue, null));
    }

};


