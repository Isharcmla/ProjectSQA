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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295255;
     Object term295347;
     Object term295958;
     Object term295959;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295255 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term295347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term295711 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term295347, term295347.getClass(), "type", 111);
        setIntField(term295531, term295531.getClass(), "type", -1838535544);
        setField(term295531, term295531.getClass(), "jsType", term295619);
        setField(term295439, term295439.getClass(), "first", term295531);
        setField(term295347, term295347.getClass(), "parent", term295439);
        setIntField(term295711, term295711.getClass(), "type", 1838273399);
        setField(term295711, term295711.getClass(), "jsType", term295619);
        setField(term295347, term295347.getClass(), "first", term295711);
        term295958 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term295958, term295958.getClass(), "INEQ", null);
        setField(term295958, term295958.getClass(), "convention", null);
        setField(term295958, term295958.getClass(), "typeRegistry", null);
        setField(term295958, term295958.getClass(), "firstLink", null);
        setField(term295958, term295958.getClass(), "nextLink", null);
        setField(term295958, term295958.getClass(), "restrictUndefinedVisitor", null);
        setField(term295958, term295958.getClass(), "restrictNullVisitor", null);
        term295959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295960 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term295961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term295962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term295963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term295959, term295959.getClass(), "number", 0.0);
        setIntField(term295959, term295959.getClass(), "type", 111);
        setField(term295959, term295959.getClass(), "next", null);
        setField(term295960, term295960.getClass(), "str", null);
        setIntField(term295960, term295960.getClass(), "type", 1838273399);
        setField(term295960, term295960.getClass(), "next", null);
        setField(term295960, term295960.getClass(), "first", null);
        setField(term295960, term295960.getClass(), "last", null);
        setField(term295960, term295960.getClass(), "propListHead", null);
        setIntField(term295960, term295960.getClass(), "sourcePosition", 0);
        setField(term295961, term295961.getClass(), "call", null);
        setField(term295961, term295961.getClass(), "prototypeSlot", null);
        setField(term295961, term295961.getClass(), "kind", null);
        setField(term295961, term295961.getClass(), "typeOfThis", null);
        setField(term295961, term295961.getClass(), "source", null);
        setField(term295961, term295961.getClass(), "implementedInterfaces", null);
        setField(term295961, term295961.getClass(), "extendedInterfaces", null);
        setField(term295961, term295961.getClass(), "subTypes", null);
        setField(term295961, term295961.getClass(), "templateTypeNames", null);
        setField(term295961, term295961.getClass(), "className", null);
        setField(term295961, term295961.getClass(), "properties", null);
        setBooleanField(term295961, term295961.getClass(), "nativeType", false);
        setField(term295961, term295961.getClass(), "implicitPrototypeFallback", null);
        setField(term295961, term295961.getClass(), "ownerFunction", null);
        setBooleanField(term295961, term295961.getClass(), "prettyPrint", false);
        setBooleanField(term295961, term295961.getClass(), "visited", false);
        setField(term295961, term295961.getClass(), "docInfo", null);
        setBooleanField(term295961, term295961.getClass(), "unknown", false);
        setBooleanField(term295961, term295961.getClass(), "resolved", false);
        setField(term295961, term295961.getClass(), "resolveResult", null);
        setBooleanField(term295961, term295961.getClass(), "inTemplatedCheckVisit", false);
        setField(term295961, term295961.getClass(), "registry", null);
        setField(term295960, term295960.getClass(), "jsType", term295961);
        setField(term295960, term295960.getClass(), "parent", null);
        setField(term295959, term295959.getClass(), "first", term295960);
        setField(term295959, term295959.getClass(), "last", null);
        setField(term295959, term295959.getClass(), "propListHead", null);
        setIntField(term295959, term295959.getClass(), "sourcePosition", 0);
        setField(term295959, term295959.getClass(), "jsType", null);
        setDoubleField(term295962, term295962.getClass(), "number", 0.0);
        setIntField(term295962, term295962.getClass(), "type", 0);
        setField(term295962, term295962.getClass(), "next", null);
        setDoubleField(term295963, term295963.getClass(), "number", 0.0);
        setIntField(term295963, term295963.getClass(), "type", -1838535544);
        setField(term295963, term295963.getClass(), "next", null);
        setField(term295963, term295963.getClass(), "first", null);
        setField(term295963, term295963.getClass(), "last", null);
        setField(term295963, term295963.getClass(), "propListHead", null);
        setIntField(term295963, term295963.getClass(), "sourcePosition", 0);
        setField(term295963, term295963.getClass(), "jsType", term295961);
        setField(term295963, term295963.getClass(), "parent", null);
        setField(term295962, term295962.getClass(), "first", term295963);
        setField(term295962, term295962.getClass(), "last", null);
        setField(term295962, term295962.getClass(), "propListHead", null);
        setIntField(term295962, term295962.getClass(), "sourcePosition", 0);
        setField(term295962, term295962.getClass(), "jsType", null);
        setField(term295962, term295962.getClass(), "parent", null);
        setField(term295959, term295959.getClass(), "parent", term295962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term295347;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term295255, args);
        assertTrue(recursiveEquals(term295255, term295958));
        assertTrue(recursiveEquals(term295347, term295959));
        assertTrue(recursiveEquals(retValue, null));
    }

};


