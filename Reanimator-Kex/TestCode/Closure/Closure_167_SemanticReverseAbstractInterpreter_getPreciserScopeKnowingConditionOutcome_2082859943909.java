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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294450;
     Object term294542;
     Object term295041;
     Object term295042;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294450 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term294542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term294634 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term294726 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term294850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term294542, term294542.getClass(), "type", 111);
        setIntField(term294726, term294726.getClass(), "type", -112);
        setField(term294726, term294726.getClass(), "jsType", term294850);
        setField(term294634, term294634.getClass(), "first", term294726);
        setField(term294542, term294542.getClass(), "parent", term294634);
        setField(term294542, term294542.getClass(), "first", term294542);
        setField(term294542, term294542.getClass(), "jsType", null);
        term295041 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term295041, term295041.getClass(), "INEQ", null);
        setField(term295041, term295041.getClass(), "convention", null);
        setField(term295041, term295041.getClass(), "typeRegistry", null);
        setField(term295041, term295041.getClass(), "firstLink", null);
        setField(term295041, term295041.getClass(), "nextLink", null);
        setField(term295041, term295041.getClass(), "restrictUndefinedVisitor", null);
        setField(term295041, term295041.getClass(), "restrictNullVisitor", null);
        term295042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term295043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term295044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term295042, term295042.getClass(), "str", null);
        setIntField(term295042, term295042.getClass(), "type", 111);
        setField(term295042, term295042.getClass(), "next", null);
        setField(term295042, term295042.getClass(), "first", term295042);
        setField(term295042, term295042.getClass(), "last", null);
        setField(term295042, term295042.getClass(), "propListHead", null);
        setIntField(term295042, term295042.getClass(), "sourcePosition", 0);
        setField(term295042, term295042.getClass(), "jsType", null);
        setField(term295043, term295043.getClass(), "str", null);
        setIntField(term295043, term295043.getClass(), "type", 0);
        setField(term295043, term295043.getClass(), "next", null);
        setDoubleField(term295044, term295044.getClass(), "number", 0.0);
        setIntField(term295044, term295044.getClass(), "type", -112);
        setField(term295044, term295044.getClass(), "next", null);
        setField(term295044, term295044.getClass(), "first", null);
        setField(term295044, term295044.getClass(), "last", null);
        setField(term295044, term295044.getClass(), "propListHead", null);
        setIntField(term295044, term295044.getClass(), "sourcePosition", 0);
        setField(term295045, term295045.getClass(), "typeExpr", null);
        setField(term295045, term295045.getClass(), "sourceName", null);
        setBooleanField(term295045, term295045.getClass(), "isChecked", false);
        setBooleanField(term295045, term295045.getClass(), "visited", false);
        setField(term295045, term295045.getClass(), "docInfo", null);
        setBooleanField(term295045, term295045.getClass(), "unknown", false);
        setBooleanField(term295045, term295045.getClass(), "resolved", false);
        setField(term295045, term295045.getClass(), "resolveResult", null);
        setBooleanField(term295045, term295045.getClass(), "inTemplatedCheckVisit", false);
        setField(term295045, term295045.getClass(), "registry", null);
        setField(term295044, term295044.getClass(), "jsType", term295045);
        setField(term295044, term295044.getClass(), "parent", null);
        setField(term295043, term295043.getClass(), "first", term295044);
        setField(term295043, term295043.getClass(), "last", null);
        setField(term295043, term295043.getClass(), "propListHead", null);
        setIntField(term295043, term295043.getClass(), "sourcePosition", 0);
        setField(term295043, term295043.getClass(), "jsType", null);
        setField(term295043, term295043.getClass(), "parent", null);
        setField(term295042, term295042.getClass(), "parent", term295043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term294542;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term294450, args);
        assertTrue(recursiveEquals(term294450, term295041));
        assertTrue(recursiveEquals(term294542, term295042));
        assertTrue(recursiveEquals(retValue, null));
    }

};


