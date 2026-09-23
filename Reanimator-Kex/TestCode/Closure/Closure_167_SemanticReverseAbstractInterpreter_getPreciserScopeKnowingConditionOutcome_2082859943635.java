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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180751;
     Object term180843;
     Object term181410;
     Object term181411;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180751 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term180843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term181095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term180843, term180843.getClass(), "type", 13);
        setIntField(term180935, term180935.getClass(), "type", 1);
        setField(term180935, term180935.getClass(), "jsType", term181025);
        setField(term180843, term180843.getClass(), "first", term180935);
        setIntField(term181095, term181095.getClass(), "type", -16386);
        setField(term181095, term181095.getClass(), "jsType", term181203);
        setField(term180843, term180843.getClass(), "last", term181095);
        term181410 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term181410, term181410.getClass(), "INEQ", null);
        setField(term181410, term181410.getClass(), "convention", null);
        setField(term181410, term181410.getClass(), "typeRegistry", null);
        setField(term181410, term181410.getClass(), "firstLink", null);
        setField(term181410, term181410.getClass(), "nextLink", null);
        setField(term181410, term181410.getClass(), "restrictUndefinedVisitor", null);
        setField(term181410, term181410.getClass(), "restrictNullVisitor", null);
        term181411 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term181413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term181414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term181411, term181411.getClass(), "str", null);
        setIntField(term181411, term181411.getClass(), "type", 13);
        setField(term181411, term181411.getClass(), "next", null);
        setDoubleField(term181412, term181412.getClass(), "number", 0.0);
        setIntField(term181412, term181412.getClass(), "type", 1);
        setField(term181412, term181412.getClass(), "next", null);
        setField(term181412, term181412.getClass(), "first", null);
        setField(term181412, term181412.getClass(), "last", null);
        setField(term181412, term181412.getClass(), "propListHead", null);
        setIntField(term181412, term181412.getClass(), "sourcePosition", 0);
        setBooleanField(term181413, term181413.getClass(), "resolved", false);
        setField(term181413, term181413.getClass(), "resolveResult", null);
        setBooleanField(term181413, term181413.getClass(), "inTemplatedCheckVisit", false);
        setField(term181413, term181413.getClass(), "registry", null);
        setField(term181412, term181412.getClass(), "jsType", term181413);
        setField(term181412, term181412.getClass(), "parent", null);
        setField(term181411, term181411.getClass(), "first", term181412);
        setIntField(term181414, term181414.getClass(), "type", -16386);
        setField(term181414, term181414.getClass(), "next", null);
        setField(term181414, term181414.getClass(), "first", null);
        setField(term181414, term181414.getClass(), "last", null);
        setField(term181414, term181414.getClass(), "propListHead", null);
        setIntField(term181414, term181414.getClass(), "sourcePosition", 0);
        setField(term181415, term181415.getClass(), "this$0", null);
        setField(term181415, term181415.getClass(), "call", null);
        setField(term181415, term181415.getClass(), "prototypeSlot", null);
        setField(term181415, term181415.getClass(), "kind", null);
        setField(term181415, term181415.getClass(), "typeOfThis", null);
        setField(term181415, term181415.getClass(), "source", null);
        setField(term181415, term181415.getClass(), "implementedInterfaces", null);
        setField(term181415, term181415.getClass(), "extendedInterfaces", null);
        setField(term181415, term181415.getClass(), "subTypes", null);
        setField(term181415, term181415.getClass(), "templateTypeNames", null);
        setField(term181415, term181415.getClass(), "className", null);
        setField(term181415, term181415.getClass(), "properties", null);
        setBooleanField(term181415, term181415.getClass(), "nativeType", false);
        setField(term181415, term181415.getClass(), "implicitPrototypeFallback", null);
        setField(term181415, term181415.getClass(), "ownerFunction", null);
        setBooleanField(term181415, term181415.getClass(), "prettyPrint", false);
        setBooleanField(term181415, term181415.getClass(), "visited", false);
        setField(term181415, term181415.getClass(), "docInfo", null);
        setBooleanField(term181415, term181415.getClass(), "unknown", false);
        setBooleanField(term181415, term181415.getClass(), "resolved", false);
        setField(term181415, term181415.getClass(), "resolveResult", null);
        setBooleanField(term181415, term181415.getClass(), "inTemplatedCheckVisit", false);
        setField(term181415, term181415.getClass(), "registry", null);
        setField(term181414, term181414.getClass(), "jsType", term181415);
        setField(term181414, term181414.getClass(), "parent", null);
        setField(term181411, term181411.getClass(), "last", term181414);
        setField(term181411, term181411.getClass(), "propListHead", null);
        setIntField(term181411, term181411.getClass(), "sourcePosition", 0);
        setField(term181411, term181411.getClass(), "jsType", null);
        setField(term181411, term181411.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term180843;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term180751, args);
        assertTrue(recursiveEquals(term180751, term181410));
        assertTrue(recursiveEquals(term180843, term181411));
        assertTrue(recursiveEquals(retValue, null));
    }

};


