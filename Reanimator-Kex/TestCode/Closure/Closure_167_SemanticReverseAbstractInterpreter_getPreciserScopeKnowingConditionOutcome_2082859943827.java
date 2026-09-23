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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254372;
     Object term254464;
     Object term254882;
     Object term254883;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254372 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term254464 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term254756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term254464, term254464.getClass(), "type", 45);
        setIntField(term254556, term254556.getClass(), "type", 0);
        setField(term254556, term254556.getClass(), "jsType", term254664);
        setField(term254464, term254464.getClass(), "first", term254556);
        setIntField(term254756, term254756.getClass(), "type", 0);
        setField(term254756, term254756.getClass(), "jsType", null);
        setField(term254464, term254464.getClass(), "last", term254756);
        term254882 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term254882, term254882.getClass(), "INEQ", null);
        setField(term254882, term254882.getClass(), "convention", null);
        setField(term254882, term254882.getClass(), "typeRegistry", null);
        setField(term254882, term254882.getClass(), "firstLink", null);
        setField(term254882, term254882.getClass(), "nextLink", null);
        setField(term254882, term254882.getClass(), "restrictUndefinedVisitor", null);
        setField(term254882, term254882.getClass(), "restrictNullVisitor", null);
        term254883 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term254886 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term254883, term254883.getClass(), "str", null);
        setIntField(term254883, term254883.getClass(), "type", 45);
        setField(term254883, term254883.getClass(), "next", null);
        setField(term254884, term254884.getClass(), "str", null);
        setIntField(term254884, term254884.getClass(), "type", 0);
        setField(term254884, term254884.getClass(), "next", null);
        setField(term254884, term254884.getClass(), "first", null);
        setField(term254884, term254884.getClass(), "last", null);
        setField(term254884, term254884.getClass(), "propListHead", null);
        setIntField(term254884, term254884.getClass(), "sourcePosition", 0);
        setField(term254885, term254885.getClass(), "this$0", null);
        setField(term254885, term254885.getClass(), "call", null);
        setField(term254885, term254885.getClass(), "prototypeSlot", null);
        setField(term254885, term254885.getClass(), "kind", null);
        setField(term254885, term254885.getClass(), "typeOfThis", null);
        setField(term254885, term254885.getClass(), "source", null);
        setField(term254885, term254885.getClass(), "implementedInterfaces", null);
        setField(term254885, term254885.getClass(), "extendedInterfaces", null);
        setField(term254885, term254885.getClass(), "subTypes", null);
        setField(term254885, term254885.getClass(), "templateTypeNames", null);
        setField(term254885, term254885.getClass(), "className", null);
        setField(term254885, term254885.getClass(), "properties", null);
        setBooleanField(term254885, term254885.getClass(), "nativeType", false);
        setField(term254885, term254885.getClass(), "implicitPrototypeFallback", null);
        setField(term254885, term254885.getClass(), "ownerFunction", null);
        setBooleanField(term254885, term254885.getClass(), "prettyPrint", false);
        setBooleanField(term254885, term254885.getClass(), "visited", false);
        setField(term254885, term254885.getClass(), "docInfo", null);
        setBooleanField(term254885, term254885.getClass(), "unknown", false);
        setBooleanField(term254885, term254885.getClass(), "resolved", false);
        setField(term254885, term254885.getClass(), "resolveResult", null);
        setBooleanField(term254885, term254885.getClass(), "inTemplatedCheckVisit", false);
        setField(term254885, term254885.getClass(), "registry", null);
        setField(term254884, term254884.getClass(), "jsType", term254885);
        setField(term254884, term254884.getClass(), "parent", null);
        setField(term254883, term254883.getClass(), "first", term254884);
        setDoubleField(term254886, term254886.getClass(), "number", 0.0);
        setIntField(term254886, term254886.getClass(), "type", 0);
        setField(term254886, term254886.getClass(), "next", null);
        setField(term254886, term254886.getClass(), "first", null);
        setField(term254886, term254886.getClass(), "last", null);
        setField(term254886, term254886.getClass(), "propListHead", null);
        setIntField(term254886, term254886.getClass(), "sourcePosition", 0);
        setField(term254886, term254886.getClass(), "jsType", null);
        setField(term254886, term254886.getClass(), "parent", null);
        setField(term254883, term254883.getClass(), "last", term254886);
        setField(term254883, term254883.getClass(), "propListHead", null);
        setIntField(term254883, term254883.getClass(), "sourcePosition", 0);
        setField(term254883, term254883.getClass(), "jsType", null);
        setField(term254883, term254883.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term254464;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term254372, args);
        assertTrue(recursiveEquals(term254372, term254882));
        assertTrue(recursiveEquals(term254464, term254883));
        assertTrue(recursiveEquals(retValue, null));
    }

};


