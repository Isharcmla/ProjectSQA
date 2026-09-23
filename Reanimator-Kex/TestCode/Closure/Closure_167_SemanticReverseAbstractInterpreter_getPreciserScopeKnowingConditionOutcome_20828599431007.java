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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408687;
     Object term408779;
     Object term409312;
     Object term409313;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408687 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term408779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term408871 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term408963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term409055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term409153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setIntField(term408779, term408779.getClass(), "type", 46);
        setIntField(term408871, term408871.getClass(), "type", 1);
        setField(term408871, term408871.getClass(), "jsType", term408963);
        setField(term408779, term408779.getClass(), "first", term408871);
        setIntField(term409055, term409055.getClass(), "type", 46);
        setField(term409055, term409055.getClass(), "jsType", term409153);
        setField(term408779, term408779.getClass(), "last", term409055);
        term409312 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term409312, term409312.getClass(), "INEQ", null);
        setField(term409312, term409312.getClass(), "convention", null);
        setField(term409312, term409312.getClass(), "typeRegistry", null);
        setField(term409312, term409312.getClass(), "firstLink", null);
        setField(term409312, term409312.getClass(), "nextLink", null);
        setField(term409312, term409312.getClass(), "restrictUndefinedVisitor", null);
        setField(term409312, term409312.getClass(), "restrictNullVisitor", null);
        term409313 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term409314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term409315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term409316 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term409317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setDoubleField(term409313, term409313.getClass(), "number", 0.0);
        setIntField(term409313, term409313.getClass(), "type", 46);
        setField(term409313, term409313.getClass(), "next", null);
        setDoubleField(term409314, term409314.getClass(), "number", 0.0);
        setIntField(term409314, term409314.getClass(), "type", 1);
        setField(term409314, term409314.getClass(), "next", null);
        setField(term409314, term409314.getClass(), "first", null);
        setField(term409314, term409314.getClass(), "last", null);
        setField(term409314, term409314.getClass(), "propListHead", null);
        setIntField(term409314, term409314.getClass(), "sourcePosition", 0);
        setBooleanField(term409315, term409315.getClass(), "resolved", false);
        setField(term409315, term409315.getClass(), "resolveResult", null);
        setBooleanField(term409315, term409315.getClass(), "inTemplatedCheckVisit", false);
        setField(term409315, term409315.getClass(), "registry", null);
        setField(term409314, term409314.getClass(), "jsType", term409315);
        setField(term409314, term409314.getClass(), "parent", null);
        setField(term409313, term409313.getClass(), "first", term409314);
        setDoubleField(term409316, term409316.getClass(), "number", 0.0);
        setIntField(term409316, term409316.getClass(), "type", 46);
        setField(term409316, term409316.getClass(), "next", null);
        setField(term409316, term409316.getClass(), "first", null);
        setField(term409316, term409316.getClass(), "last", null);
        setField(term409316, term409316.getClass(), "propListHead", null);
        setIntField(term409316, term409316.getClass(), "sourcePosition", 0);
        setBooleanField(term409317, term409317.getClass(), "resolved", false);
        setField(term409317, term409317.getClass(), "resolveResult", null);
        setBooleanField(term409317, term409317.getClass(), "inTemplatedCheckVisit", false);
        setField(term409317, term409317.getClass(), "registry", null);
        setField(term409316, term409316.getClass(), "jsType", term409317);
        setField(term409316, term409316.getClass(), "parent", null);
        setField(term409313, term409313.getClass(), "last", term409316);
        setField(term409313, term409313.getClass(), "propListHead", null);
        setIntField(term409313, term409313.getClass(), "sourcePosition", 0);
        setField(term409313, term409313.getClass(), "jsType", null);
        setField(term409313, term409313.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term408779;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term408687, args);
        assertTrue(recursiveEquals(term408687, term409312));
        assertTrue(recursiveEquals(term408779, term409313));
        assertTrue(recursiveEquals(retValue, null));
    }

};


