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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290690;
     Object term290782;
     Object term291784;
     Object term291785;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290690 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term290782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term290970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term291062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term290782, term290782.getClass(), "type", 46);
        setIntField(term290874, term290874.getClass(), "type", 46);
        setField(term290874, term290874.getClass(), "jsType", term290970);
        setField(term290782, term290782.getClass(), "first", term290874);
        setIntField(term291062, term291062.getClass(), "type", 0);
        setField(term291062, term291062.getClass(), "jsType", null);
        setField(term290782, term290782.getClass(), "last", term291062);
        term291784 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term291784, term291784.getClass(), "INEQ", null);
        setField(term291784, term291784.getClass(), "convention", null);
        setField(term291784, term291784.getClass(), "typeRegistry", null);
        setField(term291784, term291784.getClass(), "firstLink", null);
        setField(term291784, term291784.getClass(), "nextLink", null);
        setField(term291784, term291784.getClass(), "restrictUndefinedVisitor", null);
        setField(term291784, term291784.getClass(), "restrictNullVisitor", null);
        term291785 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term291786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term291787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term291788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term291785, term291785.getClass(), "number", 0.0);
        setIntField(term291785, term291785.getClass(), "type", 46);
        setField(term291785, term291785.getClass(), "next", null);
        setDoubleField(term291786, term291786.getClass(), "number", 0.0);
        setIntField(term291786, term291786.getClass(), "type", 46);
        setField(term291786, term291786.getClass(), "next", null);
        setField(term291786, term291786.getClass(), "first", null);
        setField(term291786, term291786.getClass(), "last", null);
        setField(term291786, term291786.getClass(), "propListHead", null);
        setIntField(term291786, term291786.getClass(), "sourcePosition", 0);
        setBooleanField(term291787, term291787.getClass(), "resolved", false);
        setField(term291787, term291787.getClass(), "resolveResult", null);
        setBooleanField(term291787, term291787.getClass(), "inTemplatedCheckVisit", false);
        setField(term291787, term291787.getClass(), "registry", null);
        setField(term291786, term291786.getClass(), "jsType", term291787);
        setField(term291786, term291786.getClass(), "parent", null);
        setField(term291785, term291785.getClass(), "first", term291786);
        setField(term291788, term291788.getClass(), "str", null);
        setIntField(term291788, term291788.getClass(), "type", 0);
        setField(term291788, term291788.getClass(), "next", null);
        setField(term291788, term291788.getClass(), "first", null);
        setField(term291788, term291788.getClass(), "last", null);
        setField(term291788, term291788.getClass(), "propListHead", null);
        setIntField(term291788, term291788.getClass(), "sourcePosition", 0);
        setField(term291788, term291788.getClass(), "jsType", null);
        setField(term291788, term291788.getClass(), "parent", null);
        setField(term291785, term291785.getClass(), "last", term291788);
        setField(term291785, term291785.getClass(), "propListHead", null);
        setIntField(term291785, term291785.getClass(), "sourcePosition", 0);
        setField(term291785, term291785.getClass(), "jsType", null);
        setField(term291785, term291785.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term290782;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term290690, args);
        assertTrue(recursiveEquals(term290690, term291784));
        assertTrue(recursiveEquals(term290782, term291785));
        assertTrue(recursiveEquals(retValue, null));
    }

};


