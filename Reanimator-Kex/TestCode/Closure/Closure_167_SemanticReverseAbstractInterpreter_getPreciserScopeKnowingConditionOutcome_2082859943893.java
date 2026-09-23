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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283074;
     Object term283166;
     Object term283757;
     Object term283758;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283074 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term283166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term283258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term283382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term283474 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term283566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term283166, term283166.getClass(), "type", 12);
        setIntField(term283258, term283258.getClass(), "type", 34);
        setField(term283258, term283258.getClass(), "jsType", term283382);
        setField(term283166, term283166.getClass(), "first", term283258);
        setIntField(term283474, term283474.getClass(), "type", -8227);
        setField(term283474, term283474.getClass(), "jsType", term283566);
        setField(term283166, term283166.getClass(), "last", term283474);
        term283757 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term283757, term283757.getClass(), "INEQ", null);
        setField(term283757, term283757.getClass(), "convention", null);
        setField(term283757, term283757.getClass(), "typeRegistry", null);
        setField(term283757, term283757.getClass(), "firstLink", null);
        setField(term283757, term283757.getClass(), "nextLink", null);
        setField(term283757, term283757.getClass(), "restrictUndefinedVisitor", null);
        setField(term283757, term283757.getClass(), "restrictNullVisitor", null);
        term283758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term283759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term283760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term283761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term283762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setDoubleField(term283758, term283758.getClass(), "number", 0.0);
        setIntField(term283758, term283758.getClass(), "type", 12);
        setField(term283758, term283758.getClass(), "next", null);
        setField(term283759, term283759.getClass(), "str", null);
        setIntField(term283759, term283759.getClass(), "type", 34);
        setField(term283759, term283759.getClass(), "next", null);
        setField(term283759, term283759.getClass(), "first", null);
        setField(term283759, term283759.getClass(), "last", null);
        setField(term283759, term283759.getClass(), "propListHead", null);
        setIntField(term283759, term283759.getClass(), "sourcePosition", 0);
        setField(term283760, term283760.getClass(), "typeExpr", null);
        setField(term283760, term283760.getClass(), "sourceName", null);
        setBooleanField(term283760, term283760.getClass(), "isChecked", false);
        setBooleanField(term283760, term283760.getClass(), "visited", false);
        setField(term283760, term283760.getClass(), "docInfo", null);
        setBooleanField(term283760, term283760.getClass(), "unknown", false);
        setBooleanField(term283760, term283760.getClass(), "resolved", false);
        setField(term283760, term283760.getClass(), "resolveResult", null);
        setBooleanField(term283760, term283760.getClass(), "inTemplatedCheckVisit", false);
        setField(term283760, term283760.getClass(), "registry", null);
        setField(term283759, term283759.getClass(), "jsType", term283760);
        setField(term283759, term283759.getClass(), "parent", null);
        setField(term283758, term283758.getClass(), "first", term283759);
        setField(term283761, term283761.getClass(), "str", null);
        setIntField(term283761, term283761.getClass(), "type", -8227);
        setField(term283761, term283761.getClass(), "next", null);
        setField(term283761, term283761.getClass(), "first", null);
        setField(term283761, term283761.getClass(), "last", null);
        setField(term283761, term283761.getClass(), "propListHead", null);
        setIntField(term283761, term283761.getClass(), "sourcePosition", 0);
        setBooleanField(term283762, term283762.getClass(), "resolved", false);
        setField(term283762, term283762.getClass(), "resolveResult", null);
        setBooleanField(term283762, term283762.getClass(), "inTemplatedCheckVisit", false);
        setField(term283762, term283762.getClass(), "registry", null);
        setField(term283761, term283761.getClass(), "jsType", term283762);
        setField(term283761, term283761.getClass(), "parent", null);
        setField(term283758, term283758.getClass(), "last", term283761);
        setField(term283758, term283758.getClass(), "propListHead", null);
        setIntField(term283758, term283758.getClass(), "sourcePosition", 0);
        setField(term283758, term283758.getClass(), "jsType", null);
        setField(term283758, term283758.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term283166;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term283074, args);
        assertTrue(recursiveEquals(term283074, term283757));
        assertTrue(recursiveEquals(term283166, term283758));
        assertTrue(recursiveEquals(retValue, null));
    }

};


