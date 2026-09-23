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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248020;
     Object term248112;
     Object term248739;
     Object term248740;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248020 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term248112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248204 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term248420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term248112, term248112.getClass(), "type", 46);
        setIntField(term248204, term248204.getClass(), "type", 34);
        setField(term248204, term248204.getClass(), "jsType", term248328);
        setField(term248112, term248112.getClass(), "first", term248204);
        setIntField(term248420, term248420.getClass(), "type", -8227);
        setField(term248420, term248420.getClass(), "jsType", term248508);
        setField(term248112, term248112.getClass(), "last", term248420);
        term248739 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term248739, term248739.getClass(), "INEQ", null);
        setField(term248739, term248739.getClass(), "convention", null);
        setField(term248739, term248739.getClass(), "typeRegistry", null);
        setField(term248739, term248739.getClass(), "firstLink", null);
        setField(term248739, term248739.getClass(), "nextLink", null);
        setField(term248739, term248739.getClass(), "restrictUndefinedVisitor", null);
        setField(term248739, term248739.getClass(), "restrictNullVisitor", null);
        term248740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term248743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term248744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setDoubleField(term248740, term248740.getClass(), "number", 0.0);
        setIntField(term248740, term248740.getClass(), "type", 46);
        setField(term248740, term248740.getClass(), "next", null);
        setField(term248741, term248741.getClass(), "str", null);
        setIntField(term248741, term248741.getClass(), "type", 34);
        setField(term248741, term248741.getClass(), "next", null);
        setField(term248741, term248741.getClass(), "first", null);
        setField(term248741, term248741.getClass(), "last", null);
        setField(term248741, term248741.getClass(), "propListHead", null);
        setIntField(term248741, term248741.getClass(), "sourcePosition", 0);
        setField(term248742, term248742.getClass(), "typeExpr", null);
        setField(term248742, term248742.getClass(), "sourceName", null);
        setBooleanField(term248742, term248742.getClass(), "isChecked", false);
        setBooleanField(term248742, term248742.getClass(), "visited", false);
        setField(term248742, term248742.getClass(), "docInfo", null);
        setBooleanField(term248742, term248742.getClass(), "unknown", false);
        setBooleanField(term248742, term248742.getClass(), "resolved", false);
        setField(term248742, term248742.getClass(), "resolveResult", null);
        setBooleanField(term248742, term248742.getClass(), "inTemplatedCheckVisit", false);
        setField(term248742, term248742.getClass(), "registry", null);
        setField(term248741, term248741.getClass(), "jsType", term248742);
        setField(term248741, term248741.getClass(), "parent", null);
        setField(term248740, term248740.getClass(), "first", term248741);
        setField(term248743, term248743.getClass(), "str", null);
        setIntField(term248743, term248743.getClass(), "type", -8227);
        setField(term248743, term248743.getClass(), "next", null);
        setField(term248743, term248743.getClass(), "first", null);
        setField(term248743, term248743.getClass(), "last", null);
        setField(term248743, term248743.getClass(), "propListHead", null);
        setIntField(term248743, term248743.getClass(), "sourcePosition", 0);
        setField(term248744, term248744.getClass(), "call", null);
        setField(term248744, term248744.getClass(), "prototypeSlot", null);
        setField(term248744, term248744.getClass(), "kind", null);
        setField(term248744, term248744.getClass(), "typeOfThis", null);
        setField(term248744, term248744.getClass(), "source", null);
        setField(term248744, term248744.getClass(), "implementedInterfaces", null);
        setField(term248744, term248744.getClass(), "extendedInterfaces", null);
        setField(term248744, term248744.getClass(), "subTypes", null);
        setField(term248744, term248744.getClass(), "templateTypeNames", null);
        setField(term248744, term248744.getClass(), "className", null);
        setField(term248744, term248744.getClass(), "properties", null);
        setBooleanField(term248744, term248744.getClass(), "nativeType", false);
        setField(term248744, term248744.getClass(), "implicitPrototypeFallback", null);
        setField(term248744, term248744.getClass(), "ownerFunction", null);
        setBooleanField(term248744, term248744.getClass(), "prettyPrint", false);
        setBooleanField(term248744, term248744.getClass(), "visited", false);
        setField(term248744, term248744.getClass(), "docInfo", null);
        setBooleanField(term248744, term248744.getClass(), "unknown", false);
        setBooleanField(term248744, term248744.getClass(), "resolved", false);
        setField(term248744, term248744.getClass(), "resolveResult", null);
        setBooleanField(term248744, term248744.getClass(), "inTemplatedCheckVisit", false);
        setField(term248744, term248744.getClass(), "registry", null);
        setField(term248743, term248743.getClass(), "jsType", term248744);
        setField(term248743, term248743.getClass(), "parent", null);
        setField(term248740, term248740.getClass(), "last", term248743);
        setField(term248740, term248740.getClass(), "propListHead", null);
        setIntField(term248740, term248740.getClass(), "sourcePosition", 0);
        setField(term248740, term248740.getClass(), "jsType", null);
        setField(term248740, term248740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term248112;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term248020, args);
        assertTrue(recursiveEquals(term248020, term248739));
        assertTrue(recursiveEquals(term248112, term248740));
        assertTrue(recursiveEquals(retValue, null));
    }

};


