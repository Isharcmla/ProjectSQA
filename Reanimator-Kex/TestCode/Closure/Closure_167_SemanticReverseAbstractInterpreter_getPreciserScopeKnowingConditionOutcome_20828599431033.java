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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493166;
     Object term493258;
     Object term493665;
     Object term493666;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493166 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term493258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term493350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term493440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term493532 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term493258, term493258.getClass(), "type", 45);
        setIntField(term493350, term493350.getClass(), "type", 0);
        setField(term493350, term493350.getClass(), "jsType", term493440);
        setField(term493258, term493258.getClass(), "first", term493350);
        setIntField(term493532, term493532.getClass(), "type", 0);
        setField(term493532, term493532.getClass(), "jsType", term493440);
        setField(term493258, term493258.getClass(), "last", term493532);
        term493665 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term493665, term493665.getClass(), "INEQ", null);
        setField(term493665, term493665.getClass(), "convention", null);
        setField(term493665, term493665.getClass(), "typeRegistry", null);
        setField(term493665, term493665.getClass(), "firstLink", null);
        setField(term493665, term493665.getClass(), "nextLink", null);
        setField(term493665, term493665.getClass(), "restrictUndefinedVisitor", null);
        setField(term493665, term493665.getClass(), "restrictNullVisitor", null);
        term493666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term493667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term493668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term493669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term493666, term493666.getClass(), "str", null);
        setIntField(term493666, term493666.getClass(), "type", 45);
        setField(term493666, term493666.getClass(), "next", null);
        setField(term493667, term493667.getClass(), "str", null);
        setIntField(term493667, term493667.getClass(), "type", 0);
        setField(term493667, term493667.getClass(), "next", null);
        setField(term493667, term493667.getClass(), "first", null);
        setField(term493667, term493667.getClass(), "last", null);
        setField(term493667, term493667.getClass(), "propListHead", null);
        setIntField(term493667, term493667.getClass(), "sourcePosition", 0);
        setBooleanField(term493668, term493668.getClass(), "resolved", false);
        setField(term493668, term493668.getClass(), "resolveResult", null);
        setBooleanField(term493668, term493668.getClass(), "inTemplatedCheckVisit", false);
        setField(term493668, term493668.getClass(), "registry", null);
        setField(term493667, term493667.getClass(), "jsType", term493668);
        setField(term493667, term493667.getClass(), "parent", null);
        setField(term493666, term493666.getClass(), "first", term493667);
        setDoubleField(term493669, term493669.getClass(), "number", 0.0);
        setIntField(term493669, term493669.getClass(), "type", 0);
        setField(term493669, term493669.getClass(), "next", null);
        setField(term493669, term493669.getClass(), "first", null);
        setField(term493669, term493669.getClass(), "last", null);
        setField(term493669, term493669.getClass(), "propListHead", null);
        setIntField(term493669, term493669.getClass(), "sourcePosition", 0);
        setField(term493669, term493669.getClass(), "jsType", term493668);
        setField(term493669, term493669.getClass(), "parent", null);
        setField(term493666, term493666.getClass(), "last", term493669);
        setField(term493666, term493666.getClass(), "propListHead", null);
        setIntField(term493666, term493666.getClass(), "sourcePosition", 0);
        setField(term493666, term493666.getClass(), "jsType", null);
        setField(term493666, term493666.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term493258;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term493166, args);
        assertTrue(recursiveEquals(term493166, term493665));
        assertTrue(recursiveEquals(term493258, term493666));
        assertTrue(recursiveEquals(retValue, null));
    }

};


