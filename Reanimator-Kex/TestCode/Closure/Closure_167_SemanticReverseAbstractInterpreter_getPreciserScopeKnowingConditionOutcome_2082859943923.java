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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357257;
     Object term357349;
     Object term357976;
     Object term357977;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357257 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term357349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term357441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term357533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term357657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term357749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term357349, term357349.getClass(), "type", 111);
        setIntField(term357533, term357533.getClass(), "type", 0);
        setField(term357533, term357533.getClass(), "jsType", term357657);
        setField(term357441, term357441.getClass(), "first", term357533);
        setField(term357349, term357349.getClass(), "parent", term357441);
        setIntField(term357749, term357749.getClass(), "type", 0);
        setField(term357749, term357749.getClass(), "jsType", term357657);
        setField(term357349, term357349.getClass(), "first", term357749);
        term357976 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term357976, term357976.getClass(), "INEQ", null);
        setField(term357976, term357976.getClass(), "convention", null);
        setField(term357976, term357976.getClass(), "typeRegistry", null);
        setField(term357976, term357976.getClass(), "firstLink", null);
        setField(term357976, term357976.getClass(), "nextLink", null);
        setField(term357976, term357976.getClass(), "restrictUndefinedVisitor", null);
        setField(term357976, term357976.getClass(), "restrictNullVisitor", null);
        term357977 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term357978 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term357979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term357980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term357981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term357977, term357977.getClass(), "str", null);
        setIntField(term357977, term357977.getClass(), "type", 111);
        setField(term357977, term357977.getClass(), "next", null);
        setDoubleField(term357978, term357978.getClass(), "number", 0.0);
        setIntField(term357978, term357978.getClass(), "type", 0);
        setField(term357978, term357978.getClass(), "next", null);
        setField(term357978, term357978.getClass(), "first", null);
        setField(term357978, term357978.getClass(), "last", null);
        setField(term357978, term357978.getClass(), "propListHead", null);
        setIntField(term357978, term357978.getClass(), "sourcePosition", 0);
        setField(term357979, term357979.getClass(), "typeExpr", null);
        setField(term357979, term357979.getClass(), "sourceName", null);
        setBooleanField(term357979, term357979.getClass(), "isChecked", false);
        setBooleanField(term357979, term357979.getClass(), "visited", false);
        setField(term357979, term357979.getClass(), "docInfo", null);
        setBooleanField(term357979, term357979.getClass(), "unknown", false);
        setBooleanField(term357979, term357979.getClass(), "resolved", false);
        setField(term357979, term357979.getClass(), "resolveResult", null);
        setBooleanField(term357979, term357979.getClass(), "inTemplatedCheckVisit", false);
        setField(term357979, term357979.getClass(), "registry", null);
        setField(term357978, term357978.getClass(), "jsType", term357979);
        setField(term357978, term357978.getClass(), "parent", null);
        setField(term357977, term357977.getClass(), "first", term357978);
        setField(term357977, term357977.getClass(), "last", null);
        setField(term357977, term357977.getClass(), "propListHead", null);
        setIntField(term357977, term357977.getClass(), "sourcePosition", 0);
        setField(term357977, term357977.getClass(), "jsType", null);
        setField(term357980, term357980.getClass(), "str", null);
        setIntField(term357980, term357980.getClass(), "type", 0);
        setField(term357980, term357980.getClass(), "next", null);
        setDoubleField(term357981, term357981.getClass(), "number", 0.0);
        setIntField(term357981, term357981.getClass(), "type", 0);
        setField(term357981, term357981.getClass(), "next", null);
        setField(term357981, term357981.getClass(), "first", null);
        setField(term357981, term357981.getClass(), "last", null);
        setField(term357981, term357981.getClass(), "propListHead", null);
        setIntField(term357981, term357981.getClass(), "sourcePosition", 0);
        setField(term357981, term357981.getClass(), "jsType", term357979);
        setField(term357981, term357981.getClass(), "parent", null);
        setField(term357980, term357980.getClass(), "first", term357981);
        setField(term357980, term357980.getClass(), "last", null);
        setField(term357980, term357980.getClass(), "propListHead", null);
        setIntField(term357980, term357980.getClass(), "sourcePosition", 0);
        setField(term357980, term357980.getClass(), "jsType", null);
        setField(term357980, term357980.getClass(), "parent", null);
        setField(term357977, term357977.getClass(), "parent", term357980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term357349;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term357257, args);
        assertTrue(recursiveEquals(term357257, term357976));
        assertTrue(recursiveEquals(term357349, term357977));
        assertTrue(recursiveEquals(retValue, null));
    }

};


