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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235100;
     Object term235192;
     Object term235616;
     Object term235617;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235100 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term235192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term235380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term235472 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term235192, term235192.getClass(), "type", 46);
        setIntField(term235284, term235284.getClass(), "type", 0);
        setField(term235284, term235284.getClass(), "jsType", term235380);
        setField(term235192, term235192.getClass(), "first", term235284);
        setIntField(term235472, term235472.getClass(), "type", 46);
        setField(term235472, term235472.getClass(), "jsType", null);
        setField(term235192, term235192.getClass(), "last", term235472);
        term235616 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term235616, term235616.getClass(), "INEQ", null);
        setField(term235616, term235616.getClass(), "convention", null);
        setField(term235616, term235616.getClass(), "typeRegistry", null);
        setField(term235616, term235616.getClass(), "firstLink", null);
        setField(term235616, term235616.getClass(), "nextLink", null);
        setField(term235616, term235616.getClass(), "restrictUndefinedVisitor", null);
        setField(term235616, term235616.getClass(), "restrictNullVisitor", null);
        term235617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term235619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term235620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235617, term235617.getClass(), "str", null);
        setIntField(term235617, term235617.getClass(), "type", 46);
        setField(term235617, term235617.getClass(), "next", null);
        setDoubleField(term235618, term235618.getClass(), "number", 0.0);
        setIntField(term235618, term235618.getClass(), "type", 0);
        setField(term235618, term235618.getClass(), "next", null);
        setField(term235618, term235618.getClass(), "first", null);
        setField(term235618, term235618.getClass(), "last", null);
        setField(term235618, term235618.getClass(), "propListHead", null);
        setIntField(term235618, term235618.getClass(), "sourcePosition", 0);
        setField(term235619, term235619.getClass(), "properties", null);
        setBooleanField(term235619, term235619.getClass(), "declared", false);
        setBooleanField(term235619, term235619.getClass(), "isFrozen", false);
        setField(term235619, term235619.getClass(), "className", null);
        setField(term235619, term235619.getClass(), "properties", null);
        setBooleanField(term235619, term235619.getClass(), "nativeType", false);
        setField(term235619, term235619.getClass(), "implicitPrototypeFallback", null);
        setField(term235619, term235619.getClass(), "ownerFunction", null);
        setBooleanField(term235619, term235619.getClass(), "prettyPrint", false);
        setBooleanField(term235619, term235619.getClass(), "visited", false);
        setField(term235619, term235619.getClass(), "docInfo", null);
        setBooleanField(term235619, term235619.getClass(), "unknown", false);
        setBooleanField(term235619, term235619.getClass(), "resolved", false);
        setField(term235619, term235619.getClass(), "resolveResult", null);
        setBooleanField(term235619, term235619.getClass(), "inTemplatedCheckVisit", false);
        setField(term235619, term235619.getClass(), "registry", null);
        setField(term235618, term235618.getClass(), "jsType", term235619);
        setField(term235618, term235618.getClass(), "parent", null);
        setField(term235617, term235617.getClass(), "first", term235618);
        setField(term235620, term235620.getClass(), "str", null);
        setIntField(term235620, term235620.getClass(), "type", 46);
        setField(term235620, term235620.getClass(), "next", null);
        setField(term235620, term235620.getClass(), "first", null);
        setField(term235620, term235620.getClass(), "last", null);
        setField(term235620, term235620.getClass(), "propListHead", null);
        setIntField(term235620, term235620.getClass(), "sourcePosition", 0);
        setField(term235620, term235620.getClass(), "jsType", null);
        setField(term235620, term235620.getClass(), "parent", null);
        setField(term235617, term235617.getClass(), "last", term235620);
        setField(term235617, term235617.getClass(), "propListHead", null);
        setIntField(term235617, term235617.getClass(), "sourcePosition", 0);
        setField(term235617, term235617.getClass(), "jsType", null);
        setField(term235617, term235617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term235192;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term235100, args);
        assertTrue(recursiveEquals(term235100, term235616));
        assertTrue(recursiveEquals(term235192, term235617));
        assertTrue(recursiveEquals(retValue, null));
    }

};


