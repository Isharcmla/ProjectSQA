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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228904;
     Object term228996;
     Object term229410;
     Object term229411;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228904 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term228996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term229088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term229288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term228996, term228996.getClass(), "type", 46);
        setIntField(term229088, term229088.getClass(), "type", 1078385728);
        setField(term229088, term229088.getClass(), "jsType", term229196);
        setField(term228996, term228996.getClass(), "first", term229088);
        setIntField(term229288, term229288.getClass(), "type", -1078385729);
        setField(term229288, term229288.getClass(), "jsType", null);
        setField(term228996, term228996.getClass(), "last", term229288);
        term229410 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term229410, term229410.getClass(), "INEQ", null);
        setField(term229410, term229410.getClass(), "convention", null);
        setField(term229410, term229410.getClass(), "typeRegistry", null);
        setField(term229410, term229410.getClass(), "firstLink", null);
        setField(term229410, term229410.getClass(), "nextLink", null);
        setField(term229410, term229410.getClass(), "restrictUndefinedVisitor", null);
        setField(term229410, term229410.getClass(), "restrictNullVisitor", null);
        term229411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term229412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term229414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term229411, term229411.getClass(), "number", 0.0);
        setIntField(term229411, term229411.getClass(), "type", 46);
        setField(term229411, term229411.getClass(), "next", null);
        setField(term229412, term229412.getClass(), "str", null);
        setIntField(term229412, term229412.getClass(), "type", 1078385728);
        setField(term229412, term229412.getClass(), "next", null);
        setField(term229412, term229412.getClass(), "first", null);
        setField(term229412, term229412.getClass(), "last", null);
        setField(term229412, term229412.getClass(), "propListHead", null);
        setIntField(term229412, term229412.getClass(), "sourcePosition", 0);
        setField(term229413, term229413.getClass(), "this$0", null);
        setField(term229413, term229413.getClass(), "call", null);
        setField(term229413, term229413.getClass(), "prototypeSlot", null);
        setField(term229413, term229413.getClass(), "kind", null);
        setField(term229413, term229413.getClass(), "typeOfThis", null);
        setField(term229413, term229413.getClass(), "source", null);
        setField(term229413, term229413.getClass(), "implementedInterfaces", null);
        setField(term229413, term229413.getClass(), "extendedInterfaces", null);
        setField(term229413, term229413.getClass(), "subTypes", null);
        setField(term229413, term229413.getClass(), "templateTypeNames", null);
        setField(term229413, term229413.getClass(), "className", null);
        setField(term229413, term229413.getClass(), "properties", null);
        setBooleanField(term229413, term229413.getClass(), "nativeType", false);
        setField(term229413, term229413.getClass(), "implicitPrototypeFallback", null);
        setField(term229413, term229413.getClass(), "ownerFunction", null);
        setBooleanField(term229413, term229413.getClass(), "prettyPrint", false);
        setBooleanField(term229413, term229413.getClass(), "visited", false);
        setField(term229413, term229413.getClass(), "docInfo", null);
        setBooleanField(term229413, term229413.getClass(), "unknown", false);
        setBooleanField(term229413, term229413.getClass(), "resolved", false);
        setField(term229413, term229413.getClass(), "resolveResult", null);
        setBooleanField(term229413, term229413.getClass(), "inTemplatedCheckVisit", false);
        setField(term229413, term229413.getClass(), "registry", null);
        setField(term229412, term229412.getClass(), "jsType", term229413);
        setField(term229412, term229412.getClass(), "parent", null);
        setField(term229411, term229411.getClass(), "first", term229412);
        setField(term229414, term229414.getClass(), "str", null);
        setIntField(term229414, term229414.getClass(), "type", -1078385729);
        setField(term229414, term229414.getClass(), "next", null);
        setField(term229414, term229414.getClass(), "first", null);
        setField(term229414, term229414.getClass(), "last", null);
        setField(term229414, term229414.getClass(), "propListHead", null);
        setIntField(term229414, term229414.getClass(), "sourcePosition", 0);
        setField(term229414, term229414.getClass(), "jsType", null);
        setField(term229414, term229414.getClass(), "parent", null);
        setField(term229411, term229411.getClass(), "last", term229414);
        setField(term229411, term229411.getClass(), "propListHead", null);
        setIntField(term229411, term229411.getClass(), "sourcePosition", 0);
        setField(term229411, term229411.getClass(), "jsType", null);
        setField(term229411, term229411.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term228996;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term228904, args);
        assertTrue(recursiveEquals(term228904, term229410));
        assertTrue(recursiveEquals(term228996, term229411));
        assertTrue(recursiveEquals(retValue, null));
    }

};


