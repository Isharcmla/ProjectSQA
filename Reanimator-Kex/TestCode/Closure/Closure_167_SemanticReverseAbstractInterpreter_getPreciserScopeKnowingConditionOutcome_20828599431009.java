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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409528;
     Object term409620;
     Object term410366;
     Object term410367;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409528 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term409620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term409712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term409804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term409904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term409996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term410102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term409620, term409620.getClass(), "type", 111);
        setIntField(term409804, term409804.getClass(), "type", 0);
        setField(term409804, term409804.getClass(), "jsType", term409904);
        setField(term409712, term409712.getClass(), "first", term409804);
        setField(term409620, term409620.getClass(), "parent", term409712);
        setIntField(term409996, term409996.getClass(), "type", -201326593);
        setField(term409996, term409996.getClass(), "jsType", term410102);
        setField(term409620, term409620.getClass(), "first", term409996);
        term410366 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term410366, term410366.getClass(), "INEQ", null);
        setField(term410366, term410366.getClass(), "convention", null);
        setField(term410366, term410366.getClass(), "typeRegistry", null);
        setField(term410366, term410366.getClass(), "firstLink", null);
        setField(term410366, term410366.getClass(), "nextLink", null);
        setField(term410366, term410366.getClass(), "restrictUndefinedVisitor", null);
        setField(term410366, term410366.getClass(), "restrictNullVisitor", null);
        term410367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term410368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term410369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term410370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term410371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term410372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setDoubleField(term410367, term410367.getClass(), "number", 0.0);
        setIntField(term410367, term410367.getClass(), "type", 111);
        setField(term410367, term410367.getClass(), "next", null);
        setDoubleField(term410368, term410368.getClass(), "number", 0.0);
        setIntField(term410368, term410368.getClass(), "type", -201326593);
        setField(term410368, term410368.getClass(), "next", null);
        setField(term410368, term410368.getClass(), "first", null);
        setField(term410368, term410368.getClass(), "last", null);
        setField(term410368, term410368.getClass(), "propListHead", null);
        setIntField(term410368, term410368.getClass(), "sourcePosition", 0);
        setField(term410369, term410369.getClass(), "primitiveType", null);
        setField(term410369, term410369.getClass(), "primitiveObjectType", null);
        setField(term410369, term410369.getClass(), "name", null);
        setBooleanField(term410369, term410369.getClass(), "visited", false);
        setField(term410369, term410369.getClass(), "docInfo", null);
        setBooleanField(term410369, term410369.getClass(), "unknown", false);
        setBooleanField(term410369, term410369.getClass(), "resolved", false);
        setField(term410369, term410369.getClass(), "resolveResult", null);
        setBooleanField(term410369, term410369.getClass(), "inTemplatedCheckVisit", false);
        setField(term410369, term410369.getClass(), "registry", null);
        setField(term410368, term410368.getClass(), "jsType", term410369);
        setField(term410368, term410368.getClass(), "parent", null);
        setField(term410367, term410367.getClass(), "first", term410368);
        setField(term410367, term410367.getClass(), "last", null);
        setField(term410367, term410367.getClass(), "propListHead", null);
        setIntField(term410367, term410367.getClass(), "sourcePosition", 0);
        setField(term410367, term410367.getClass(), "jsType", null);
        setDoubleField(term410370, term410370.getClass(), "number", 0.0);
        setIntField(term410370, term410370.getClass(), "type", 0);
        setField(term410370, term410370.getClass(), "next", null);
        setField(term410371, term410371.getClass(), "str", null);
        setIntField(term410371, term410371.getClass(), "type", 0);
        setField(term410371, term410371.getClass(), "next", null);
        setField(term410371, term410371.getClass(), "first", null);
        setField(term410371, term410371.getClass(), "last", null);
        setField(term410371, term410371.getClass(), "propListHead", null);
        setIntField(term410371, term410371.getClass(), "sourcePosition", 0);
        setField(term410372, term410372.getClass(), "call", null);
        setField(term410372, term410372.getClass(), "prototypeSlot", null);
        setField(term410372, term410372.getClass(), "kind", null);
        setField(term410372, term410372.getClass(), "typeOfThis", null);
        setField(term410372, term410372.getClass(), "source", null);
        setField(term410372, term410372.getClass(), "implementedInterfaces", null);
        setField(term410372, term410372.getClass(), "extendedInterfaces", null);
        setField(term410372, term410372.getClass(), "subTypes", null);
        setField(term410372, term410372.getClass(), "templateTypeNames", null);
        setField(term410372, term410372.getClass(), "className", null);
        setField(term410372, term410372.getClass(), "properties", null);
        setBooleanField(term410372, term410372.getClass(), "nativeType", false);
        setField(term410372, term410372.getClass(), "implicitPrototypeFallback", null);
        setField(term410372, term410372.getClass(), "ownerFunction", null);
        setBooleanField(term410372, term410372.getClass(), "prettyPrint", false);
        setBooleanField(term410372, term410372.getClass(), "visited", false);
        setField(term410372, term410372.getClass(), "docInfo", null);
        setBooleanField(term410372, term410372.getClass(), "unknown", false);
        setBooleanField(term410372, term410372.getClass(), "resolved", false);
        setField(term410372, term410372.getClass(), "resolveResult", null);
        setBooleanField(term410372, term410372.getClass(), "inTemplatedCheckVisit", false);
        setField(term410372, term410372.getClass(), "registry", null);
        setField(term410371, term410371.getClass(), "jsType", term410372);
        setField(term410371, term410371.getClass(), "parent", null);
        setField(term410370, term410370.getClass(), "first", term410371);
        setField(term410370, term410370.getClass(), "last", null);
        setField(term410370, term410370.getClass(), "propListHead", null);
        setIntField(term410370, term410370.getClass(), "sourcePosition", 0);
        setField(term410370, term410370.getClass(), "jsType", null);
        setField(term410370, term410370.getClass(), "parent", null);
        setField(term410367, term410367.getClass(), "parent", term410370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term409620;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term409528, args);
        assertTrue(recursiveEquals(term409528, term410366));
        assertTrue(recursiveEquals(term409620, term410367));
        assertTrue(recursiveEquals(retValue, null));
    }

};


