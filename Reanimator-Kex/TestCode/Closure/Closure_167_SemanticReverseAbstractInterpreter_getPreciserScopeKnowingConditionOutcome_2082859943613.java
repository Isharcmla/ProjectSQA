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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171993;
     Object term172209;
     Object term172756;
     Object term172758;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171993 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term172139 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        setField(term171993, term171993.getClass(), "INEQ", term172139);
        term172209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term172473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term172209, term172209.getClass(), "type", 15);
        setIntField(term172279, term172279.getClass(), "type", -560024496);
        setField(term172279, term172279.getClass(), "jsType", term172403);
        setField(term172209, term172209.getClass(), "first", term172279);
        setIntField(term172473, term172473.getClass(), "type", 15);
        setField(term172473, term172473.getClass(), "jsType", term172565);
        setField(term172209, term172209.getClass(), "last", term172473);
        term172756 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term172757 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        setField(term172756, term172756.getClass(), "INEQ", term172757);
        setField(term172756, term172756.getClass(), "convention", null);
        setField(term172756, term172756.getClass(), "typeRegistry", null);
        setField(term172756, term172756.getClass(), "firstLink", null);
        setField(term172756, term172756.getClass(), "nextLink", null);
        setField(term172756, term172756.getClass(), "restrictUndefinedVisitor", null);
        setField(term172756, term172756.getClass(), "restrictNullVisitor", null);
        term172758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term172761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term172758, term172758.getClass(), "type", 15);
        setField(term172758, term172758.getClass(), "next", null);
        setIntField(term172759, term172759.getClass(), "type", -560024496);
        setField(term172759, term172759.getClass(), "next", null);
        setField(term172759, term172759.getClass(), "first", null);
        setField(term172759, term172759.getClass(), "last", null);
        setField(term172759, term172759.getClass(), "propListHead", null);
        setIntField(term172759, term172759.getClass(), "sourcePosition", 0);
        setField(term172760, term172760.getClass(), "typeExpr", null);
        setField(term172760, term172760.getClass(), "sourceName", null);
        setBooleanField(term172760, term172760.getClass(), "isChecked", false);
        setBooleanField(term172760, term172760.getClass(), "visited", false);
        setField(term172760, term172760.getClass(), "docInfo", null);
        setBooleanField(term172760, term172760.getClass(), "unknown", false);
        setBooleanField(term172760, term172760.getClass(), "resolved", false);
        setField(term172760, term172760.getClass(), "resolveResult", null);
        setBooleanField(term172760, term172760.getClass(), "inTemplatedCheckVisit", false);
        setField(term172760, term172760.getClass(), "registry", null);
        setField(term172759, term172759.getClass(), "jsType", term172760);
        setField(term172759, term172759.getClass(), "parent", null);
        setField(term172758, term172758.getClass(), "first", term172759);
        setIntField(term172761, term172761.getClass(), "type", 15);
        setField(term172761, term172761.getClass(), "next", null);
        setField(term172761, term172761.getClass(), "first", null);
        setField(term172761, term172761.getClass(), "last", null);
        setField(term172761, term172761.getClass(), "propListHead", null);
        setIntField(term172761, term172761.getClass(), "sourcePosition", 0);
        setField(term172762, term172762.getClass(), "source", null);
        setField(term172762, term172762.getClass(), "elementsType", null);
        setField(term172762, term172762.getClass(), "elements", null);
        setField(term172762, term172762.getClass(), "className", null);
        setField(term172762, term172762.getClass(), "properties", null);
        setBooleanField(term172762, term172762.getClass(), "nativeType", false);
        setField(term172762, term172762.getClass(), "implicitPrototypeFallback", null);
        setField(term172762, term172762.getClass(), "ownerFunction", null);
        setBooleanField(term172762, term172762.getClass(), "prettyPrint", false);
        setBooleanField(term172762, term172762.getClass(), "visited", false);
        setField(term172762, term172762.getClass(), "docInfo", null);
        setBooleanField(term172762, term172762.getClass(), "unknown", false);
        setBooleanField(term172762, term172762.getClass(), "resolved", false);
        setField(term172762, term172762.getClass(), "resolveResult", null);
        setBooleanField(term172762, term172762.getClass(), "inTemplatedCheckVisit", false);
        setField(term172762, term172762.getClass(), "registry", null);
        setField(term172761, term172761.getClass(), "jsType", term172762);
        setField(term172761, term172761.getClass(), "parent", null);
        setField(term172758, term172758.getClass(), "last", term172761);
        setField(term172758, term172758.getClass(), "propListHead", null);
        setIntField(term172758, term172758.getClass(), "sourcePosition", 0);
        setField(term172758, term172758.getClass(), "jsType", null);
        setField(term172758, term172758.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term172209;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term171993, args);
        assertTrue(recursiveEquals(term171993, term172756));
        assertTrue(recursiveEquals(term172209, term172758));
        assertTrue(recursiveEquals(retValue, null));
    }

};


