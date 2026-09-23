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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126754;
     Object term126846;
     Object term127390;
     Object term127391;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126754 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term126846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term126938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term127234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term126846, term126846.getClass(), "type", 111);
        setIntField(term127030, term127030.getClass(), "type", 0);
        setField(term127030, term127030.getClass(), "jsType", term127142);
        setField(term126938, term126938.getClass(), "first", term127030);
        setField(term126846, term126846.getClass(), "parent", term126938);
        setIntField(term127234, term127234.getClass(), "type", 111);
        setField(term127234, term127234.getClass(), "jsType", null);
        setField(term126846, term126846.getClass(), "first", term127234);
        term127390 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term127390, term127390.getClass(), "INEQ", null);
        setField(term127390, term127390.getClass(), "convention", null);
        setField(term127390, term127390.getClass(), "typeRegistry", null);
        setField(term127390, term127390.getClass(), "firstLink", null);
        setField(term127390, term127390.getClass(), "nextLink", null);
        setField(term127390, term127390.getClass(), "restrictUndefinedVisitor", null);
        setField(term127390, term127390.getClass(), "restrictNullVisitor", null);
        term127391 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127392 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127394 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term127391, term127391.getClass(), "str", null);
        setIntField(term127391, term127391.getClass(), "type", 111);
        setField(term127391, term127391.getClass(), "next", null);
        setField(term127392, term127392.getClass(), "str", null);
        setIntField(term127392, term127392.getClass(), "type", 111);
        setField(term127392, term127392.getClass(), "next", null);
        setField(term127392, term127392.getClass(), "first", null);
        setField(term127392, term127392.getClass(), "last", null);
        setField(term127392, term127392.getClass(), "propListHead", null);
        setIntField(term127392, term127392.getClass(), "sourcePosition", 0);
        setField(term127392, term127392.getClass(), "jsType", null);
        setField(term127392, term127392.getClass(), "parent", null);
        setField(term127391, term127391.getClass(), "first", term127392);
        setField(term127391, term127391.getClass(), "last", null);
        setField(term127391, term127391.getClass(), "propListHead", null);
        setIntField(term127391, term127391.getClass(), "sourcePosition", 0);
        setField(term127391, term127391.getClass(), "jsType", null);
        setField(term127393, term127393.getClass(), "str", null);
        setIntField(term127393, term127393.getClass(), "type", 0);
        setField(term127393, term127393.getClass(), "next", null);
        setField(term127394, term127394.getClass(), "str", null);
        setIntField(term127394, term127394.getClass(), "type", 0);
        setField(term127394, term127394.getClass(), "next", null);
        setField(term127394, term127394.getClass(), "first", null);
        setField(term127394, term127394.getClass(), "last", null);
        setField(term127394, term127394.getClass(), "propListHead", null);
        setIntField(term127394, term127394.getClass(), "sourcePosition", 0);
        setField(term127395, term127395.getClass(), "constructor", null);
        setField(term127395, term127395.getClass(), "className", null);
        setField(term127395, term127395.getClass(), "properties", null);
        setBooleanField(term127395, term127395.getClass(), "nativeType", false);
        setField(term127395, term127395.getClass(), "implicitPrototypeFallback", null);
        setField(term127395, term127395.getClass(), "ownerFunction", null);
        setBooleanField(term127395, term127395.getClass(), "prettyPrint", false);
        setBooleanField(term127395, term127395.getClass(), "visited", false);
        setField(term127395, term127395.getClass(), "docInfo", null);
        setBooleanField(term127395, term127395.getClass(), "unknown", false);
        setBooleanField(term127395, term127395.getClass(), "resolved", false);
        setField(term127395, term127395.getClass(), "resolveResult", null);
        setBooleanField(term127395, term127395.getClass(), "inTemplatedCheckVisit", false);
        setField(term127395, term127395.getClass(), "registry", null);
        setField(term127394, term127394.getClass(), "jsType", term127395);
        setField(term127394, term127394.getClass(), "parent", null);
        setField(term127393, term127393.getClass(), "first", term127394);
        setField(term127393, term127393.getClass(), "last", null);
        setField(term127393, term127393.getClass(), "propListHead", null);
        setIntField(term127393, term127393.getClass(), "sourcePosition", 0);
        setField(term127393, term127393.getClass(), "jsType", null);
        setField(term127393, term127393.getClass(), "parent", null);
        setField(term127391, term127391.getClass(), "parent", term127393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term126846;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term126754, args);
        assertTrue(recursiveEquals(term126754, term127390));
        assertTrue(recursiveEquals(term126846, term127391));
        assertTrue(recursiveEquals(retValue, null));
    }

};


