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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121656;
     Object term121748;
     Object term123158;
     Object term123159;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121656 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term121748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term121840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term122038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term121748, term121748.getClass(), "type", 45);
        setIntField(term121840, term121840.getClass(), "type", 1078385728);
        setField(term121840, term121840.getClass(), "jsType", term121946);
        setField(term121748, term121748.getClass(), "first", term121840);
        setIntField(term122038, term122038.getClass(), "type", -1078385729);
        setField(term122038, term122038.getClass(), "jsType", null);
        setField(term121748, term121748.getClass(), "last", term122038);
        term123158 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term123158, term123158.getClass(), "INEQ", null);
        setField(term123158, term123158.getClass(), "convention", null);
        setField(term123158, term123158.getClass(), "typeRegistry", null);
        setField(term123158, term123158.getClass(), "firstLink", null);
        setField(term123158, term123158.getClass(), "nextLink", null);
        setField(term123158, term123158.getClass(), "restrictUndefinedVisitor", null);
        setField(term123158, term123158.getClass(), "restrictNullVisitor", null);
        term123159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term123162 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term123159, term123159.getClass(), "str", null);
        setIntField(term123159, term123159.getClass(), "type", 45);
        setField(term123159, term123159.getClass(), "next", null);
        setDoubleField(term123160, term123160.getClass(), "number", 0.0);
        setIntField(term123160, term123160.getClass(), "type", 1078385728);
        setField(term123160, term123160.getClass(), "next", null);
        setField(term123160, term123160.getClass(), "first", null);
        setField(term123160, term123160.getClass(), "last", null);
        setField(term123160, term123160.getClass(), "propListHead", null);
        setIntField(term123160, term123160.getClass(), "sourcePosition", 0);
        setField(term123161, term123161.getClass(), "primitiveType", null);
        setField(term123161, term123161.getClass(), "primitiveObjectType", null);
        setField(term123161, term123161.getClass(), "name", null);
        setBooleanField(term123161, term123161.getClass(), "visited", false);
        setField(term123161, term123161.getClass(), "docInfo", null);
        setBooleanField(term123161, term123161.getClass(), "unknown", false);
        setBooleanField(term123161, term123161.getClass(), "resolved", false);
        setField(term123161, term123161.getClass(), "resolveResult", null);
        setBooleanField(term123161, term123161.getClass(), "inTemplatedCheckVisit", false);
        setField(term123161, term123161.getClass(), "registry", null);
        setField(term123160, term123160.getClass(), "jsType", term123161);
        setField(term123160, term123160.getClass(), "parent", null);
        setField(term123159, term123159.getClass(), "first", term123160);
        setDoubleField(term123162, term123162.getClass(), "number", 0.0);
        setIntField(term123162, term123162.getClass(), "type", -1078385729);
        setField(term123162, term123162.getClass(), "next", null);
        setField(term123162, term123162.getClass(), "first", null);
        setField(term123162, term123162.getClass(), "last", null);
        setField(term123162, term123162.getClass(), "propListHead", null);
        setIntField(term123162, term123162.getClass(), "sourcePosition", 0);
        setField(term123162, term123162.getClass(), "jsType", null);
        setField(term123162, term123162.getClass(), "parent", null);
        setField(term123159, term123159.getClass(), "last", term123162);
        setField(term123159, term123159.getClass(), "propListHead", null);
        setIntField(term123159, term123159.getClass(), "sourcePosition", 0);
        setField(term123159, term123159.getClass(), "jsType", null);
        setField(term123159, term123159.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term121748;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term121656, args);
        assertTrue(recursiveEquals(term121656, term123158));
        assertTrue(recursiveEquals(term121748, term123159));
        assertTrue(recursiveEquals(retValue, null));
    }

};


