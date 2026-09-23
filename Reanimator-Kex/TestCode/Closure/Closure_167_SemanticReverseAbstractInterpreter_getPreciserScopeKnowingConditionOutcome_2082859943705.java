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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205130;
     Object term205222;
     Object term205621;
     Object term205622;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205130 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term205222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term205508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term205222, term205222.getClass(), "type", 12);
        setIntField(term205314, term205314.getClass(), "type", -458765);
        setField(term205314, term205314.getClass(), "jsType", term205438);
        setField(term205222, term205222.getClass(), "first", term205314);
        setIntField(term205508, term205508.getClass(), "type", 12);
        setField(term205508, term205508.getClass(), "jsType", null);
        setField(term205222, term205222.getClass(), "last", term205508);
        term205621 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term205621, term205621.getClass(), "INEQ", null);
        setField(term205621, term205621.getClass(), "convention", null);
        setField(term205621, term205621.getClass(), "typeRegistry", null);
        setField(term205621, term205621.getClass(), "firstLink", null);
        setField(term205621, term205621.getClass(), "nextLink", null);
        setField(term205621, term205621.getClass(), "restrictUndefinedVisitor", null);
        setField(term205621, term205621.getClass(), "restrictNullVisitor", null);
        term205622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term205625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term205622, term205622.getClass(), "number", 0.0);
        setIntField(term205622, term205622.getClass(), "type", 12);
        setField(term205622, term205622.getClass(), "next", null);
        setField(term205623, term205623.getClass(), "str", null);
        setIntField(term205623, term205623.getClass(), "type", -458765);
        setField(term205623, term205623.getClass(), "next", null);
        setField(term205623, term205623.getClass(), "first", null);
        setField(term205623, term205623.getClass(), "last", null);
        setField(term205623, term205623.getClass(), "propListHead", null);
        setIntField(term205623, term205623.getClass(), "sourcePosition", 0);
        setField(term205624, term205624.getClass(), "typeExpr", null);
        setField(term205624, term205624.getClass(), "sourceName", null);
        setBooleanField(term205624, term205624.getClass(), "isChecked", false);
        setBooleanField(term205624, term205624.getClass(), "visited", false);
        setField(term205624, term205624.getClass(), "docInfo", null);
        setBooleanField(term205624, term205624.getClass(), "unknown", false);
        setBooleanField(term205624, term205624.getClass(), "resolved", false);
        setField(term205624, term205624.getClass(), "resolveResult", null);
        setBooleanField(term205624, term205624.getClass(), "inTemplatedCheckVisit", false);
        setField(term205624, term205624.getClass(), "registry", null);
        setField(term205623, term205623.getClass(), "jsType", term205624);
        setField(term205623, term205623.getClass(), "parent", null);
        setField(term205622, term205622.getClass(), "first", term205623);
        setIntField(term205625, term205625.getClass(), "type", 12);
        setField(term205625, term205625.getClass(), "next", null);
        setField(term205625, term205625.getClass(), "first", null);
        setField(term205625, term205625.getClass(), "last", null);
        setField(term205625, term205625.getClass(), "propListHead", null);
        setIntField(term205625, term205625.getClass(), "sourcePosition", 0);
        setField(term205625, term205625.getClass(), "jsType", null);
        setField(term205625, term205625.getClass(), "parent", null);
        setField(term205622, term205622.getClass(), "last", term205625);
        setField(term205622, term205622.getClass(), "propListHead", null);
        setIntField(term205622, term205622.getClass(), "sourcePosition", 0);
        setField(term205622, term205622.getClass(), "jsType", null);
        setField(term205622, term205622.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term205222;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term205130, args);
        assertTrue(recursiveEquals(term205130, term205621));
        assertTrue(recursiveEquals(term205222, term205622));
        assertTrue(recursiveEquals(retValue, null));
    }

};


