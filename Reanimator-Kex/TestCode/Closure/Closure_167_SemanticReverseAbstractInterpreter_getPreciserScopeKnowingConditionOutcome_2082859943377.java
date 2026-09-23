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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99001;
     Object term99071;
     Object term99440;
     Object term99441;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99001 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term99071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term99319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99071, term99071.getClass(), "type", 12);
        setIntField(term99141, term99141.getClass(), "type", 12);
        setField(term99141, term99141.getClass(), "jsType", term99249);
        setField(term99071, term99071.getClass(), "first", term99141);
        setIntField(term99319, term99319.getClass(), "type", 12);
        setField(term99319, term99319.getClass(), "jsType", null);
        setField(term99071, term99071.getClass(), "last", term99319);
        term99440 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term99440, term99440.getClass(), "INEQ", null);
        setField(term99440, term99440.getClass(), "convention", null);
        setField(term99440, term99440.getClass(), "typeRegistry", null);
        setField(term99440, term99440.getClass(), "firstLink", null);
        setField(term99440, term99440.getClass(), "nextLink", null);
        setField(term99440, term99440.getClass(), "restrictUndefinedVisitor", null);
        setField(term99440, term99440.getClass(), "restrictNullVisitor", null);
        term99441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term99444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99441, term99441.getClass(), "type", 12);
        setField(term99441, term99441.getClass(), "next", null);
        setIntField(term99442, term99442.getClass(), "type", 12);
        setField(term99442, term99442.getClass(), "next", null);
        setField(term99442, term99442.getClass(), "first", null);
        setField(term99442, term99442.getClass(), "last", null);
        setField(term99442, term99442.getClass(), "propListHead", null);
        setIntField(term99442, term99442.getClass(), "sourcePosition", 0);
        setField(term99443, term99443.getClass(), "this$0", null);
        setField(term99443, term99443.getClass(), "call", null);
        setField(term99443, term99443.getClass(), "prototypeSlot", null);
        setField(term99443, term99443.getClass(), "kind", null);
        setField(term99443, term99443.getClass(), "typeOfThis", null);
        setField(term99443, term99443.getClass(), "source", null);
        setField(term99443, term99443.getClass(), "implementedInterfaces", null);
        setField(term99443, term99443.getClass(), "extendedInterfaces", null);
        setField(term99443, term99443.getClass(), "subTypes", null);
        setField(term99443, term99443.getClass(), "templateTypeNames", null);
        setField(term99443, term99443.getClass(), "className", null);
        setField(term99443, term99443.getClass(), "properties", null);
        setBooleanField(term99443, term99443.getClass(), "nativeType", false);
        setField(term99443, term99443.getClass(), "implicitPrototypeFallback", null);
        setField(term99443, term99443.getClass(), "ownerFunction", null);
        setBooleanField(term99443, term99443.getClass(), "prettyPrint", false);
        setBooleanField(term99443, term99443.getClass(), "visited", false);
        setField(term99443, term99443.getClass(), "docInfo", null);
        setBooleanField(term99443, term99443.getClass(), "unknown", false);
        setBooleanField(term99443, term99443.getClass(), "resolved", false);
        setField(term99443, term99443.getClass(), "resolveResult", null);
        setBooleanField(term99443, term99443.getClass(), "inTemplatedCheckVisit", false);
        setField(term99443, term99443.getClass(), "registry", null);
        setField(term99442, term99442.getClass(), "jsType", term99443);
        setField(term99442, term99442.getClass(), "parent", null);
        setField(term99441, term99441.getClass(), "first", term99442);
        setIntField(term99444, term99444.getClass(), "type", 12);
        setField(term99444, term99444.getClass(), "next", null);
        setField(term99444, term99444.getClass(), "first", null);
        setField(term99444, term99444.getClass(), "last", null);
        setField(term99444, term99444.getClass(), "propListHead", null);
        setIntField(term99444, term99444.getClass(), "sourcePosition", 0);
        setField(term99444, term99444.getClass(), "jsType", null);
        setField(term99444, term99444.getClass(), "parent", null);
        setField(term99441, term99441.getClass(), "last", term99444);
        setField(term99441, term99441.getClass(), "propListHead", null);
        setIntField(term99441, term99441.getClass(), "sourcePosition", 0);
        setField(term99441, term99441.getClass(), "jsType", null);
        setField(term99441, term99441.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term99071;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term99001, args);
        assertTrue(recursiveEquals(term99001, term99440));
        assertTrue(recursiveEquals(term99071, term99441));
        assertTrue(recursiveEquals(retValue, null));
    }

};


