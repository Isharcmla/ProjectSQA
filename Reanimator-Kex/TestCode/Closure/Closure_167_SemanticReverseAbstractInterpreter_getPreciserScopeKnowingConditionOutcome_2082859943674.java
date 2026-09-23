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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194924;
     Object term195016;
     Object term195669;
     Object term195670;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194924 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term195016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term195108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term195292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term195016, term195016.getClass(), "type", 13);
        setIntField(term195108, term195108.getClass(), "type", -32768);
        setField(term195108, term195108.getClass(), "jsType", term195222);
        setField(term195016, term195016.getClass(), "first", term195108);
        setIntField(term195292, term195292.getClass(), "type", 13);
        setField(term195292, term195292.getClass(), "jsType", null);
        setField(term195016, term195016.getClass(), "last", term195292);
        term195669 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term195669, term195669.getClass(), "INEQ", null);
        setField(term195669, term195669.getClass(), "convention", null);
        setField(term195669, term195669.getClass(), "typeRegistry", null);
        setField(term195669, term195669.getClass(), "firstLink", null);
        setField(term195669, term195669.getClass(), "nextLink", null);
        setField(term195669, term195669.getClass(), "restrictUndefinedVisitor", null);
        setField(term195669, term195669.getClass(), "restrictNullVisitor", null);
        term195670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term195671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term195673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term195670, term195670.getClass(), "str", null);
        setIntField(term195670, term195670.getClass(), "type", 13);
        setField(term195670, term195670.getClass(), "next", null);
        setDoubleField(term195671, term195671.getClass(), "number", 0.0);
        setIntField(term195671, term195671.getClass(), "type", -32768);
        setField(term195671, term195671.getClass(), "next", null);
        setField(term195671, term195671.getClass(), "first", null);
        setField(term195671, term195671.getClass(), "last", null);
        setField(term195671, term195671.getClass(), "propListHead", null);
        setIntField(term195671, term195671.getClass(), "sourcePosition", 0);
        setField(term195672, term195672.getClass(), "className", null);
        setField(term195672, term195672.getClass(), "properties", null);
        setBooleanField(term195672, term195672.getClass(), "nativeType", false);
        setField(term195672, term195672.getClass(), "implicitPrototypeFallback", null);
        setField(term195672, term195672.getClass(), "ownerFunction", null);
        setBooleanField(term195672, term195672.getClass(), "prettyPrint", false);
        setBooleanField(term195672, term195672.getClass(), "visited", false);
        setField(term195672, term195672.getClass(), "docInfo", null);
        setBooleanField(term195672, term195672.getClass(), "unknown", false);
        setBooleanField(term195672, term195672.getClass(), "resolved", false);
        setField(term195672, term195672.getClass(), "resolveResult", null);
        setBooleanField(term195672, term195672.getClass(), "inTemplatedCheckVisit", false);
        setField(term195672, term195672.getClass(), "registry", null);
        setField(term195671, term195671.getClass(), "jsType", term195672);
        setField(term195671, term195671.getClass(), "parent", null);
        setField(term195670, term195670.getClass(), "first", term195671);
        setIntField(term195673, term195673.getClass(), "type", 13);
        setField(term195673, term195673.getClass(), "next", null);
        setField(term195673, term195673.getClass(), "first", null);
        setField(term195673, term195673.getClass(), "last", null);
        setField(term195673, term195673.getClass(), "propListHead", null);
        setIntField(term195673, term195673.getClass(), "sourcePosition", 0);
        setField(term195673, term195673.getClass(), "jsType", null);
        setField(term195673, term195673.getClass(), "parent", null);
        setField(term195670, term195670.getClass(), "last", term195673);
        setField(term195670, term195670.getClass(), "propListHead", null);
        setIntField(term195670, term195670.getClass(), "sourcePosition", 0);
        setField(term195670, term195670.getClass(), "jsType", null);
        setField(term195670, term195670.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term195016;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term194924, args);
        assertTrue(recursiveEquals(term194924, term195669));
        assertTrue(recursiveEquals(term195016, term195670));
        assertTrue(recursiveEquals(retValue, null));
    }

};


