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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271145;
     Object term271237;
     Object term271734;
     Object term271735;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271145 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term271237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term271609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term271237, term271237.getClass(), "type", 111);
        setIntField(term271421, term271421.getClass(), "type", 0);
        setField(term271421, term271421.getClass(), "jsType", term271517);
        setField(term271329, term271329.getClass(), "first", term271421);
        setField(term271237, term271237.getClass(), "parent", term271329);
        setIntField(term271609, term271609.getClass(), "type", 0);
        setField(term271609, term271609.getClass(), "jsType", null);
        setField(term271237, term271237.getClass(), "first", term271609);
        term271734 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term271734, term271734.getClass(), "INEQ", null);
        setField(term271734, term271734.getClass(), "convention", null);
        setField(term271734, term271734.getClass(), "typeRegistry", null);
        setField(term271734, term271734.getClass(), "firstLink", null);
        setField(term271734, term271734.getClass(), "nextLink", null);
        setField(term271734, term271734.getClass(), "restrictUndefinedVisitor", null);
        setField(term271734, term271734.getClass(), "restrictNullVisitor", null);
        term271735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term271737 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setDoubleField(term271735, term271735.getClass(), "number", 0.0);
        setIntField(term271735, term271735.getClass(), "type", 111);
        setField(term271735, term271735.getClass(), "next", null);
        setField(term271736, term271736.getClass(), "str", null);
        setIntField(term271736, term271736.getClass(), "type", 0);
        setField(term271736, term271736.getClass(), "next", null);
        setField(term271736, term271736.getClass(), "first", null);
        setField(term271736, term271736.getClass(), "last", null);
        setField(term271736, term271736.getClass(), "propListHead", null);
        setIntField(term271736, term271736.getClass(), "sourcePosition", 0);
        setField(term271736, term271736.getClass(), "jsType", null);
        setField(term271736, term271736.getClass(), "parent", null);
        setField(term271735, term271735.getClass(), "first", term271736);
        setField(term271735, term271735.getClass(), "last", null);
        setField(term271735, term271735.getClass(), "propListHead", null);
        setIntField(term271735, term271735.getClass(), "sourcePosition", 0);
        setField(term271735, term271735.getClass(), "jsType", null);
        setDoubleField(term271737, term271737.getClass(), "number", 0.0);
        setIntField(term271737, term271737.getClass(), "type", 0);
        setField(term271737, term271737.getClass(), "next", null);
        setDoubleField(term271738, term271738.getClass(), "number", 0.0);
        setIntField(term271738, term271738.getClass(), "type", 0);
        setField(term271738, term271738.getClass(), "next", null);
        setField(term271738, term271738.getClass(), "first", null);
        setField(term271738, term271738.getClass(), "last", null);
        setField(term271738, term271738.getClass(), "propListHead", null);
        setIntField(term271738, term271738.getClass(), "sourcePosition", 0);
        setBooleanField(term271739, term271739.getClass(), "resolved", false);
        setField(term271739, term271739.getClass(), "resolveResult", null);
        setBooleanField(term271739, term271739.getClass(), "inTemplatedCheckVisit", false);
        setField(term271739, term271739.getClass(), "registry", null);
        setField(term271738, term271738.getClass(), "jsType", term271739);
        setField(term271738, term271738.getClass(), "parent", null);
        setField(term271737, term271737.getClass(), "first", term271738);
        setField(term271737, term271737.getClass(), "last", null);
        setField(term271737, term271737.getClass(), "propListHead", null);
        setIntField(term271737, term271737.getClass(), "sourcePosition", 0);
        setField(term271737, term271737.getClass(), "jsType", null);
        setField(term271737, term271737.getClass(), "parent", null);
        setField(term271735, term271735.getClass(), "parent", term271737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term271237;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term271145, args);
        assertTrue(recursiveEquals(term271145, term271734));
        assertTrue(recursiveEquals(term271237, term271735));
        assertTrue(recursiveEquals(retValue, null));
    }

};


