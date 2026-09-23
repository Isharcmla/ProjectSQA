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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243529;
     Object term243621;
     Object term244173;
     Object term244174;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243529 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term243621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term243713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term243805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term244011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term243621, term243621.getClass(), "type", 111);
        setIntField(term243805, term243805.getClass(), "type", 0);
        setField(term243805, term243805.getClass(), "jsType", term243919);
        setField(term243713, term243713.getClass(), "first", term243805);
        setField(term243621, term243621.getClass(), "parent", term243713);
        setIntField(term244011, term244011.getClass(), "type", -1431654433);
        setField(term244011, term244011.getClass(), "jsType", null);
        setField(term243621, term243621.getClass(), "first", term244011);
        term244173 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term244173, term244173.getClass(), "INEQ", null);
        setField(term244173, term244173.getClass(), "convention", null);
        setField(term244173, term244173.getClass(), "typeRegistry", null);
        setField(term244173, term244173.getClass(), "firstLink", null);
        setField(term244173, term244173.getClass(), "nextLink", null);
        setField(term244173, term244173.getClass(), "restrictUndefinedVisitor", null);
        setField(term244173, term244173.getClass(), "restrictNullVisitor", null);
        term244174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244175 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244177 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setDoubleField(term244174, term244174.getClass(), "number", 0.0);
        setIntField(term244174, term244174.getClass(), "type", 111);
        setField(term244174, term244174.getClass(), "next", null);
        setField(term244175, term244175.getClass(), "str", null);
        setIntField(term244175, term244175.getClass(), "type", -1431654433);
        setField(term244175, term244175.getClass(), "next", null);
        setField(term244175, term244175.getClass(), "first", null);
        setField(term244175, term244175.getClass(), "last", null);
        setField(term244175, term244175.getClass(), "propListHead", null);
        setIntField(term244175, term244175.getClass(), "sourcePosition", 0);
        setField(term244175, term244175.getClass(), "jsType", null);
        setField(term244175, term244175.getClass(), "parent", null);
        setField(term244174, term244174.getClass(), "first", term244175);
        setField(term244174, term244174.getClass(), "last", null);
        setField(term244174, term244174.getClass(), "propListHead", null);
        setIntField(term244174, term244174.getClass(), "sourcePosition", 0);
        setField(term244174, term244174.getClass(), "jsType", null);
        setDoubleField(term244176, term244176.getClass(), "number", 0.0);
        setIntField(term244176, term244176.getClass(), "type", 0);
        setField(term244176, term244176.getClass(), "next", null);
        setField(term244177, term244177.getClass(), "str", null);
        setIntField(term244177, term244177.getClass(), "type", 0);
        setField(term244177, term244177.getClass(), "next", null);
        setField(term244177, term244177.getClass(), "first", null);
        setField(term244177, term244177.getClass(), "last", null);
        setField(term244177, term244177.getClass(), "propListHead", null);
        setIntField(term244177, term244177.getClass(), "sourcePosition", 0);
        setField(term244178, term244178.getClass(), "className", null);
        setField(term244178, term244178.getClass(), "properties", null);
        setBooleanField(term244178, term244178.getClass(), "nativeType", false);
        setField(term244178, term244178.getClass(), "implicitPrototypeFallback", null);
        setField(term244178, term244178.getClass(), "ownerFunction", null);
        setBooleanField(term244178, term244178.getClass(), "prettyPrint", false);
        setBooleanField(term244178, term244178.getClass(), "visited", false);
        setField(term244178, term244178.getClass(), "docInfo", null);
        setBooleanField(term244178, term244178.getClass(), "unknown", false);
        setBooleanField(term244178, term244178.getClass(), "resolved", false);
        setField(term244178, term244178.getClass(), "resolveResult", null);
        setBooleanField(term244178, term244178.getClass(), "inTemplatedCheckVisit", false);
        setField(term244178, term244178.getClass(), "registry", null);
        setField(term244177, term244177.getClass(), "jsType", term244178);
        setField(term244177, term244177.getClass(), "parent", null);
        setField(term244176, term244176.getClass(), "first", term244177);
        setField(term244176, term244176.getClass(), "last", null);
        setField(term244176, term244176.getClass(), "propListHead", null);
        setIntField(term244176, term244176.getClass(), "sourcePosition", 0);
        setField(term244176, term244176.getClass(), "jsType", null);
        setField(term244176, term244176.getClass(), "parent", null);
        setField(term244174, term244174.getClass(), "parent", term244176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term243621;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term243529, args);
        assertTrue(recursiveEquals(term243529, term244173));
        assertTrue(recursiveEquals(term243621, term244174));
        assertTrue(recursiveEquals(retValue, null));
    }

};


