package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3512474;
     Object term3512560;
     Object term3513963;
     Object term3513964;
     Object term3513855;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3512474 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3512560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3512652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3512744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3512836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3512944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3512560, term3512560.getClass(), "type", 37);
        setIntField(term3512652, term3512652.getClass(), "type", 35);
        setIntField(term3512836, term3512836.getClass(), "type", 40);
        setField(term3512836, term3512836.getClass(), "str", "");
        setField(term3512744, term3512744.getClass(), "next", term3512836);
        setIntField(term3512744, term3512744.getClass(), "type", 40);
        setField(term3512652, term3512652.getClass(), "first", term3512744);
        setIntField(term3512944, term3512944.getClass(), "type", 41);
        setField(term3512652, term3512652.getClass(), "next", term3512944);
        setField(term3512560, term3512560.getClass(), "first", term3512652);
        term3513963 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3513963, term3513963.getClass(), "currentTraversal", null);
        term3513964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3513965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3513967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3513964, term3513964.getClass(), "functionName", null);
        setBooleanField(term3513964, term3513964.getClass(), "itsNeedsActivation", false);
        setIntField(term3513964, term3513964.getClass(), "itsFunctionType", 0);
        setBooleanField(term3513964, term3513964.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3513964, term3513964.getClass(), "encodedSourceStart", 0);
        setIntField(term3513964, term3513964.getClass(), "encodedSourceEnd", 0);
        setField(term3513964, term3513964.getClass(), "sourceName", null);
        setIntField(term3513964, term3513964.getClass(), "baseLineno", 0);
        setIntField(term3513964, term3513964.getClass(), "endLineno", 0);
        setField(term3513964, term3513964.getClass(), "functions", null);
        setField(term3513964, term3513964.getClass(), "regexps", null);
        setField(term3513964, term3513964.getClass(), "itsVariables", null);
        setField(term3513964, term3513964.getClass(), "itsConst", null);
        setField(term3513964, term3513964.getClass(), "itsVariableNames", null);
        setIntField(term3513964, term3513964.getClass(), "varStart", 0);
        setField(term3513964, term3513964.getClass(), "compilerData", null);
        setIntField(term3513964, term3513964.getClass(), "type", 37);
        setField(term3513964, term3513964.getClass(), "next", null);
        setField(term3513965, term3513965.getClass(), "str", null);
        setIntField(term3513965, term3513965.getClass(), "type", 35);
        setIntField(term3513966, term3513966.getClass(), "type", 41);
        setField(term3513966, term3513966.getClass(), "next", null);
        setField(term3513966, term3513966.getClass(), "first", null);
        setField(term3513966, term3513966.getClass(), "last", null);
        setField(term3513966, term3513966.getClass(), "propListHead", null);
        setIntField(term3513966, term3513966.getClass(), "sourcePosition", 0);
        setField(term3513966, term3513966.getClass(), "jsType", null);
        setField(term3513966, term3513966.getClass(), "parent", null);
        setField(term3513965, term3513965.getClass(), "next", term3513966);
        setField(term3513967, term3513967.getClass(), "str", null);
        setIntField(term3513967, term3513967.getClass(), "type", 40);
        setField(term3513968, term3513968.getClass(), "str", "");
        setIntField(term3513968, term3513968.getClass(), "type", 40);
        setField(term3513968, term3513968.getClass(), "next", null);
        setField(term3513968, term3513968.getClass(), "first", null);
        setField(term3513968, term3513968.getClass(), "last", null);
        setField(term3513968, term3513968.getClass(), "propListHead", null);
        setIntField(term3513968, term3513968.getClass(), "sourcePosition", 0);
        setField(term3513968, term3513968.getClass(), "jsType", null);
        setField(term3513968, term3513968.getClass(), "parent", null);
        setField(term3513967, term3513967.getClass(), "next", term3513968);
        setField(term3513967, term3513967.getClass(), "first", null);
        setField(term3513967, term3513967.getClass(), "last", null);
        setField(term3513967, term3513967.getClass(), "propListHead", null);
        setIntField(term3513967, term3513967.getClass(), "sourcePosition", 0);
        setField(term3513967, term3513967.getClass(), "jsType", null);
        setField(term3513967, term3513967.getClass(), "parent", null);
        setField(term3513965, term3513965.getClass(), "first", term3513967);
        setField(term3513965, term3513965.getClass(), "last", null);
        setField(term3513965, term3513965.getClass(), "propListHead", null);
        setIntField(term3513965, term3513965.getClass(), "sourcePosition", 0);
        setField(term3513965, term3513965.getClass(), "jsType", null);
        setField(term3513965, term3513965.getClass(), "parent", null);
        setField(term3513964, term3513964.getClass(), "first", term3513965);
        setField(term3513964, term3513964.getClass(), "last", null);
        setField(term3513964, term3513964.getClass(), "propListHead", null);
        setIntField(term3513964, term3513964.getClass(), "sourcePosition", 0);
        setField(term3513964, term3513964.getClass(), "jsType", null);
        setField(term3513964, term3513964.getClass(), "parent", null);
        term3513855 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3513865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3513870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3513855, term3513855.getClass(), "functionName", null);
        setBooleanField(term3513855, term3513855.getClass(), "itsNeedsActivation", false);
        setIntField(term3513855, term3513855.getClass(), "itsFunctionType", 0);
        setBooleanField(term3513855, term3513855.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3513855, term3513855.getClass(), "encodedSourceStart", 0);
        setIntField(term3513855, term3513855.getClass(), "encodedSourceEnd", 0);
        setField(term3513855, term3513855.getClass(), "sourceName", null);
        setIntField(term3513855, term3513855.getClass(), "baseLineno", 0);
        setIntField(term3513855, term3513855.getClass(), "endLineno", 0);
        setField(term3513855, term3513855.getClass(), "functions", null);
        setField(term3513855, term3513855.getClass(), "regexps", null);
        setField(term3513855, term3513855.getClass(), "itsVariables", null);
        setField(term3513855, term3513855.getClass(), "itsConst", null);
        setField(term3513855, term3513855.getClass(), "itsVariableNames", null);
        setIntField(term3513855, term3513855.getClass(), "varStart", 0);
        setField(term3513855, term3513855.getClass(), "compilerData", null);
        setIntField(term3513855, term3513855.getClass(), "type", 37);
        setField(term3513855, term3513855.getClass(), "next", null);
        setField(term3513865, term3513865.getClass(), "str", null);
        setIntField(term3513865, term3513865.getClass(), "type", 35);
        setIntField(term3513867, term3513867.getClass(), "type", 41);
        setField(term3513867, term3513867.getClass(), "next", null);
        setField(term3513867, term3513867.getClass(), "first", null);
        setField(term3513867, term3513867.getClass(), "last", null);
        setField(term3513867, term3513867.getClass(), "propListHead", null);
        setIntField(term3513867, term3513867.getClass(), "sourcePosition", 0);
        setField(term3513867, term3513867.getClass(), "jsType", null);
        setField(term3513867, term3513867.getClass(), "parent", null);
        setField(term3513865, term3513865.getClass(), "next", term3513867);
        setField(term3513870, term3513870.getClass(), "str", null);
        setIntField(term3513870, term3513870.getClass(), "type", 40);
        setField(term3513872, term3513872.getClass(), "str", "");
        setIntField(term3513872, term3513872.getClass(), "type", 40);
        setField(term3513872, term3513872.getClass(), "next", null);
        setField(term3513872, term3513872.getClass(), "first", null);
        setField(term3513872, term3513872.getClass(), "last", null);
        setField(term3513872, term3513872.getClass(), "propListHead", null);
        setIntField(term3513872, term3513872.getClass(), "sourcePosition", 0);
        setField(term3513872, term3513872.getClass(), "jsType", null);
        setField(term3513872, term3513872.getClass(), "parent", null);
        setField(term3513870, term3513870.getClass(), "next", term3513872);
        setField(term3513870, term3513870.getClass(), "first", null);
        setField(term3513870, term3513870.getClass(), "last", null);
        setField(term3513870, term3513870.getClass(), "propListHead", null);
        setIntField(term3513870, term3513870.getClass(), "sourcePosition", 0);
        setField(term3513870, term3513870.getClass(), "jsType", null);
        setField(term3513870, term3513870.getClass(), "parent", null);
        setField(term3513865, term3513865.getClass(), "first", term3513870);
        setField(term3513865, term3513865.getClass(), "last", null);
        setField(term3513865, term3513865.getClass(), "propListHead", null);
        setIntField(term3513865, term3513865.getClass(), "sourcePosition", 0);
        setField(term3513865, term3513865.getClass(), "jsType", null);
        setField(term3513865, term3513865.getClass(), "parent", null);
        setField(term3513855, term3513855.getClass(), "first", term3513865);
        setField(term3513855, term3513855.getClass(), "last", null);
        setField(term3513855, term3513855.getClass(), "propListHead", null);
        setIntField(term3513855, term3513855.getClass(), "sourcePosition", 0);
        setField(term3513855, term3513855.getClass(), "jsType", null);
        setField(term3513855, term3513855.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3512560;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3512474, args);
        assertTrue(recursiveEquals(term3512474, term3513963));
        assertTrue(recursiveEquals(term3512560, term3513964));
        assertTrue(recursiveEquals(retValue, term3513855));
    }

};


