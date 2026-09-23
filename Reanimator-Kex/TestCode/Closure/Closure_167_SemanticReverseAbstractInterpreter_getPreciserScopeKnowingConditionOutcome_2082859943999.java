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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405498;
     Object term405590;
     Object term406010;
     Object term406011;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405498 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term405590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term405682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term405780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term405872 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term405590, term405590.getClass(), "type", 45);
        setIntField(term405682, term405682.getClass(), "type", 1401358867);
        setField(term405682, term405682.getClass(), "jsType", term405780);
        setField(term405590, term405590.getClass(), "first", term405682);
        setIntField(term405872, term405872.getClass(), "type", -1401400116);
        setField(term405872, term405872.getClass(), "jsType", term405780);
        setField(term405590, term405590.getClass(), "last", term405872);
        term406010 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term406010, term406010.getClass(), "INEQ", null);
        setField(term406010, term406010.getClass(), "convention", null);
        setField(term406010, term406010.getClass(), "typeRegistry", null);
        setField(term406010, term406010.getClass(), "firstLink", null);
        setField(term406010, term406010.getClass(), "nextLink", null);
        setField(term406010, term406010.getClass(), "restrictUndefinedVisitor", null);
        setField(term406010, term406010.getClass(), "restrictNullVisitor", null);
        term406011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term406012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term406013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term406014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term406011, term406011.getClass(), "str", null);
        setIntField(term406011, term406011.getClass(), "type", 45);
        setField(term406011, term406011.getClass(), "next", null);
        setDoubleField(term406012, term406012.getClass(), "number", 0.0);
        setIntField(term406012, term406012.getClass(), "type", 1401358867);
        setField(term406012, term406012.getClass(), "next", null);
        setField(term406012, term406012.getClass(), "first", null);
        setField(term406012, term406012.getClass(), "last", null);
        setField(term406012, term406012.getClass(), "propListHead", null);
        setIntField(term406012, term406012.getClass(), "sourcePosition", 0);
        setBooleanField(term406013, term406013.getClass(), "resolved", false);
        setField(term406013, term406013.getClass(), "resolveResult", null);
        setBooleanField(term406013, term406013.getClass(), "inTemplatedCheckVisit", false);
        setField(term406013, term406013.getClass(), "registry", null);
        setField(term406012, term406012.getClass(), "jsType", term406013);
        setField(term406012, term406012.getClass(), "parent", null);
        setField(term406011, term406011.getClass(), "first", term406012);
        setDoubleField(term406014, term406014.getClass(), "number", 0.0);
        setIntField(term406014, term406014.getClass(), "type", -1401400116);
        setField(term406014, term406014.getClass(), "next", null);
        setField(term406014, term406014.getClass(), "first", null);
        setField(term406014, term406014.getClass(), "last", null);
        setField(term406014, term406014.getClass(), "propListHead", null);
        setIntField(term406014, term406014.getClass(), "sourcePosition", 0);
        setField(term406014, term406014.getClass(), "jsType", term406013);
        setField(term406014, term406014.getClass(), "parent", null);
        setField(term406011, term406011.getClass(), "last", term406014);
        setField(term406011, term406011.getClass(), "propListHead", null);
        setIntField(term406011, term406011.getClass(), "sourcePosition", 0);
        setField(term406011, term406011.getClass(), "jsType", null);
        setField(term406011, term406011.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term405590;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term405498, args);
        assertTrue(recursiveEquals(term405498, term406010));
        assertTrue(recursiveEquals(term405590, term406011));
        assertTrue(recursiveEquals(retValue, null));
    }

};


