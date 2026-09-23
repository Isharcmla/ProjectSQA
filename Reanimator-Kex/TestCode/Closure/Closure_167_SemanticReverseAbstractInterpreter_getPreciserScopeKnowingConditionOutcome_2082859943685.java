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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198503;
     Object term198595;
     Object term199184;
     Object term199185;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198503 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term198595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term198969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term198595, term198595.getClass(), "type", 111);
        setIntField(term198779, term198779.getClass(), "type", 0);
        setField(term198779, term198779.getClass(), "jsType", term198877);
        setField(term198687, term198687.getClass(), "first", term198779);
        setField(term198595, term198595.getClass(), "parent", term198687);
        setIntField(term198969, term198969.getClass(), "type", 0);
        setField(term198969, term198969.getClass(), "jsType", term198877);
        setField(term198595, term198595.getClass(), "first", term198969);
        term199184 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term199184, term199184.getClass(), "INEQ", null);
        setField(term199184, term199184.getClass(), "convention", null);
        setField(term199184, term199184.getClass(), "typeRegistry", null);
        setField(term199184, term199184.getClass(), "firstLink", null);
        setField(term199184, term199184.getClass(), "nextLink", null);
        setField(term199184, term199184.getClass(), "restrictUndefinedVisitor", null);
        setField(term199184, term199184.getClass(), "restrictNullVisitor", null);
        term199185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term199188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term199185, term199185.getClass(), "str", null);
        setIntField(term199185, term199185.getClass(), "type", 111);
        setField(term199185, term199185.getClass(), "next", null);
        setDoubleField(term199186, term199186.getClass(), "number", 0.0);
        setIntField(term199186, term199186.getClass(), "type", 0);
        setField(term199186, term199186.getClass(), "next", null);
        setField(term199186, term199186.getClass(), "first", null);
        setField(term199186, term199186.getClass(), "last", null);
        setField(term199186, term199186.getClass(), "propListHead", null);
        setIntField(term199186, term199186.getClass(), "sourcePosition", 0);
        setBooleanField(term199187, term199187.getClass(), "isChecked", false);
        setBooleanField(term199187, term199187.getClass(), "visited", false);
        setField(term199187, term199187.getClass(), "docInfo", null);
        setBooleanField(term199187, term199187.getClass(), "unknown", false);
        setBooleanField(term199187, term199187.getClass(), "resolved", false);
        setField(term199187, term199187.getClass(), "resolveResult", null);
        setBooleanField(term199187, term199187.getClass(), "inTemplatedCheckVisit", false);
        setField(term199187, term199187.getClass(), "registry", null);
        setField(term199186, term199186.getClass(), "jsType", term199187);
        setField(term199186, term199186.getClass(), "parent", null);
        setField(term199185, term199185.getClass(), "first", term199186);
        setField(term199185, term199185.getClass(), "last", null);
        setField(term199185, term199185.getClass(), "propListHead", null);
        setIntField(term199185, term199185.getClass(), "sourcePosition", 0);
        setField(term199185, term199185.getClass(), "jsType", null);
        setField(term199188, term199188.getClass(), "str", null);
        setIntField(term199188, term199188.getClass(), "type", 0);
        setField(term199188, term199188.getClass(), "next", null);
        setDoubleField(term199189, term199189.getClass(), "number", 0.0);
        setIntField(term199189, term199189.getClass(), "type", 0);
        setField(term199189, term199189.getClass(), "next", null);
        setField(term199189, term199189.getClass(), "first", null);
        setField(term199189, term199189.getClass(), "last", null);
        setField(term199189, term199189.getClass(), "propListHead", null);
        setIntField(term199189, term199189.getClass(), "sourcePosition", 0);
        setField(term199189, term199189.getClass(), "jsType", term199187);
        setField(term199189, term199189.getClass(), "parent", null);
        setField(term199188, term199188.getClass(), "first", term199189);
        setField(term199188, term199188.getClass(), "last", null);
        setField(term199188, term199188.getClass(), "propListHead", null);
        setIntField(term199188, term199188.getClass(), "sourcePosition", 0);
        setField(term199188, term199188.getClass(), "jsType", null);
        setField(term199188, term199188.getClass(), "parent", null);
        setField(term199185, term199185.getClass(), "parent", term199188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term198595;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term198503, args);
        assertTrue(recursiveEquals(term198503, term199184));
        assertTrue(recursiveEquals(term198595, term199185));
        assertTrue(recursiveEquals(retValue, null));
    }

};


