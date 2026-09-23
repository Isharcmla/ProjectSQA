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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137212;
     Object term137304;
     Object term137862;
     Object term137863;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137212 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term137304 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term137688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term137304, term137304.getClass(), "type", 111);
        setIntField(term137488, term137488.getClass(), "type", 0);
        setField(term137488, term137488.getClass(), "jsType", term137596);
        setField(term137396, term137396.getClass(), "first", term137488);
        setField(term137304, term137304.getClass(), "parent", term137396);
        setIntField(term137688, term137688.getClass(), "type", 111);
        setField(term137688, term137688.getClass(), "jsType", null);
        setField(term137304, term137304.getClass(), "first", term137688);
        term137862 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term137862, term137862.getClass(), "INEQ", null);
        setField(term137862, term137862.getClass(), "convention", null);
        setField(term137862, term137862.getClass(), "typeRegistry", null);
        setField(term137862, term137862.getClass(), "firstLink", null);
        setField(term137862, term137862.getClass(), "nextLink", null);
        setField(term137862, term137862.getClass(), "restrictUndefinedVisitor", null);
        setField(term137862, term137862.getClass(), "restrictNullVisitor", null);
        term137863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137865 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setDoubleField(term137863, term137863.getClass(), "number", 0.0);
        setIntField(term137863, term137863.getClass(), "type", 111);
        setField(term137863, term137863.getClass(), "next", null);
        setDoubleField(term137864, term137864.getClass(), "number", 0.0);
        setIntField(term137864, term137864.getClass(), "type", 111);
        setField(term137864, term137864.getClass(), "next", null);
        setField(term137864, term137864.getClass(), "first", null);
        setField(term137864, term137864.getClass(), "last", null);
        setField(term137864, term137864.getClass(), "propListHead", null);
        setIntField(term137864, term137864.getClass(), "sourcePosition", 0);
        setField(term137864, term137864.getClass(), "jsType", null);
        setField(term137864, term137864.getClass(), "parent", null);
        setField(term137863, term137863.getClass(), "first", term137864);
        setField(term137863, term137863.getClass(), "last", null);
        setField(term137863, term137863.getClass(), "propListHead", null);
        setIntField(term137863, term137863.getClass(), "sourcePosition", 0);
        setField(term137863, term137863.getClass(), "jsType", null);
        setDoubleField(term137865, term137865.getClass(), "number", 0.0);
        setIntField(term137865, term137865.getClass(), "type", 0);
        setField(term137865, term137865.getClass(), "next", null);
        setDoubleField(term137866, term137866.getClass(), "number", 0.0);
        setIntField(term137866, term137866.getClass(), "type", 0);
        setField(term137866, term137866.getClass(), "next", null);
        setField(term137866, term137866.getClass(), "first", null);
        setField(term137866, term137866.getClass(), "last", null);
        setField(term137866, term137866.getClass(), "propListHead", null);
        setIntField(term137866, term137866.getClass(), "sourcePosition", 0);
        setField(term137867, term137867.getClass(), "this$0", null);
        setField(term137867, term137867.getClass(), "call", null);
        setField(term137867, term137867.getClass(), "prototypeSlot", null);
        setField(term137867, term137867.getClass(), "kind", null);
        setField(term137867, term137867.getClass(), "typeOfThis", null);
        setField(term137867, term137867.getClass(), "source", null);
        setField(term137867, term137867.getClass(), "implementedInterfaces", null);
        setField(term137867, term137867.getClass(), "extendedInterfaces", null);
        setField(term137867, term137867.getClass(), "subTypes", null);
        setField(term137867, term137867.getClass(), "templateTypeNames", null);
        setField(term137867, term137867.getClass(), "className", null);
        setField(term137867, term137867.getClass(), "properties", null);
        setBooleanField(term137867, term137867.getClass(), "nativeType", false);
        setField(term137867, term137867.getClass(), "implicitPrototypeFallback", null);
        setField(term137867, term137867.getClass(), "ownerFunction", null);
        setBooleanField(term137867, term137867.getClass(), "prettyPrint", false);
        setBooleanField(term137867, term137867.getClass(), "visited", false);
        setField(term137867, term137867.getClass(), "docInfo", null);
        setBooleanField(term137867, term137867.getClass(), "unknown", false);
        setBooleanField(term137867, term137867.getClass(), "resolved", false);
        setField(term137867, term137867.getClass(), "resolveResult", null);
        setBooleanField(term137867, term137867.getClass(), "inTemplatedCheckVisit", false);
        setField(term137867, term137867.getClass(), "registry", null);
        setField(term137866, term137866.getClass(), "jsType", term137867);
        setField(term137866, term137866.getClass(), "parent", null);
        setField(term137865, term137865.getClass(), "first", term137866);
        setField(term137865, term137865.getClass(), "last", null);
        setField(term137865, term137865.getClass(), "propListHead", null);
        setIntField(term137865, term137865.getClass(), "sourcePosition", 0);
        setField(term137865, term137865.getClass(), "jsType", null);
        setField(term137865, term137865.getClass(), "parent", null);
        setField(term137863, term137863.getClass(), "parent", term137865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term137304;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term137212, args);
        assertTrue(recursiveEquals(term137212, term137862));
        assertTrue(recursiveEquals(term137304, term137863));
        assertTrue(recursiveEquals(retValue, null));
    }

};


