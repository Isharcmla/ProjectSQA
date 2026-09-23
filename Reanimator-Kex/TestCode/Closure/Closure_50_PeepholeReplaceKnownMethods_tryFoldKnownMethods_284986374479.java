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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3469105;
     Object term3469197;
     Object term3470734;
     Object term3470735;
     Object term3470473;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3469105 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3469197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3469289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3469381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3469473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3469597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3469289, term3469289.getClass(), "type", 35);
        setIntField(term3469473, term3469473.getClass(), "type", 40);
        setField(term3469473, term3469473.getClass(), "str", "");
        setField(term3469381, term3469381.getClass(), "next", term3469473);
        setIntField(term3469381, term3469381.getClass(), "type", 40);
        setField(term3469289, term3469289.getClass(), "first", term3469381);
        setIntField(term3469597, term3469597.getClass(), "type", 41);
        setField(term3469289, term3469289.getClass(), "next", term3469597);
        setField(term3469197, term3469197.getClass(), "first", term3469289);
        setIntField(term3469197, term3469197.getClass(), "type", 37);
        term3470734 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3470734, term3470734.getClass(), "currentTraversal", null);
        term3470735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3470738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3470735, term3470735.getClass(), "str", null);
        setIntField(term3470735, term3470735.getClass(), "type", 37);
        setField(term3470735, term3470735.getClass(), "next", null);
        setField(term3470736, term3470736.getClass(), "str", null);
        setIntField(term3470736, term3470736.getClass(), "type", 35);
        setField(term3470737, term3470737.getClass(), "functionName", null);
        setBooleanField(term3470737, term3470737.getClass(), "itsNeedsActivation", false);
        setIntField(term3470737, term3470737.getClass(), "itsFunctionType", 0);
        setBooleanField(term3470737, term3470737.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3470737, term3470737.getClass(), "encodedSourceStart", 0);
        setIntField(term3470737, term3470737.getClass(), "encodedSourceEnd", 0);
        setField(term3470737, term3470737.getClass(), "sourceName", null);
        setIntField(term3470737, term3470737.getClass(), "baseLineno", 0);
        setIntField(term3470737, term3470737.getClass(), "endLineno", 0);
        setField(term3470737, term3470737.getClass(), "functions", null);
        setField(term3470737, term3470737.getClass(), "regexps", null);
        setField(term3470737, term3470737.getClass(), "itsVariables", null);
        setField(term3470737, term3470737.getClass(), "itsConst", null);
        setField(term3470737, term3470737.getClass(), "itsVariableNames", null);
        setIntField(term3470737, term3470737.getClass(), "varStart", 0);
        setField(term3470737, term3470737.getClass(), "compilerData", null);
        setIntField(term3470737, term3470737.getClass(), "type", 41);
        setField(term3470737, term3470737.getClass(), "next", null);
        setField(term3470737, term3470737.getClass(), "first", null);
        setField(term3470737, term3470737.getClass(), "last", null);
        setField(term3470737, term3470737.getClass(), "propListHead", null);
        setIntField(term3470737, term3470737.getClass(), "sourcePosition", 0);
        setField(term3470737, term3470737.getClass(), "jsType", null);
        setField(term3470737, term3470737.getClass(), "parent", null);
        setField(term3470736, term3470736.getClass(), "next", term3470737);
        setField(term3470738, term3470738.getClass(), "str", null);
        setIntField(term3470738, term3470738.getClass(), "type", 40);
        setField(term3470739, term3470739.getClass(), "str", "");
        setIntField(term3470739, term3470739.getClass(), "type", 40);
        setField(term3470739, term3470739.getClass(), "next", null);
        setField(term3470739, term3470739.getClass(), "first", null);
        setField(term3470739, term3470739.getClass(), "last", null);
        setField(term3470739, term3470739.getClass(), "propListHead", null);
        setIntField(term3470739, term3470739.getClass(), "sourcePosition", 0);
        setField(term3470739, term3470739.getClass(), "jsType", null);
        setField(term3470739, term3470739.getClass(), "parent", null);
        setField(term3470738, term3470738.getClass(), "next", term3470739);
        setField(term3470738, term3470738.getClass(), "first", null);
        setField(term3470738, term3470738.getClass(), "last", null);
        setField(term3470738, term3470738.getClass(), "propListHead", null);
        setIntField(term3470738, term3470738.getClass(), "sourcePosition", 0);
        setField(term3470738, term3470738.getClass(), "jsType", null);
        setField(term3470738, term3470738.getClass(), "parent", null);
        setField(term3470736, term3470736.getClass(), "first", term3470738);
        setField(term3470736, term3470736.getClass(), "last", null);
        setField(term3470736, term3470736.getClass(), "propListHead", null);
        setIntField(term3470736, term3470736.getClass(), "sourcePosition", 0);
        setField(term3470736, term3470736.getClass(), "jsType", null);
        setField(term3470736, term3470736.getClass(), "parent", null);
        setField(term3470735, term3470735.getClass(), "first", term3470736);
        setField(term3470735, term3470735.getClass(), "last", null);
        setField(term3470735, term3470735.getClass(), "propListHead", null);
        setIntField(term3470735, term3470735.getClass(), "sourcePosition", 0);
        setField(term3470735, term3470735.getClass(), "jsType", null);
        setField(term3470735, term3470735.getClass(), "parent", null);
        term3470473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3470488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3470473, term3470473.getClass(), "str", null);
        setIntField(term3470473, term3470473.getClass(), "type", 37);
        setField(term3470473, term3470473.getClass(), "next", null);
        setField(term3470475, term3470475.getClass(), "str", null);
        setIntField(term3470475, term3470475.getClass(), "type", 35);
        setField(term3470477, term3470477.getClass(), "functionName", null);
        setBooleanField(term3470477, term3470477.getClass(), "itsNeedsActivation", false);
        setIntField(term3470477, term3470477.getClass(), "itsFunctionType", 0);
        setBooleanField(term3470477, term3470477.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3470477, term3470477.getClass(), "encodedSourceStart", 0);
        setIntField(term3470477, term3470477.getClass(), "encodedSourceEnd", 0);
        setField(term3470477, term3470477.getClass(), "sourceName", null);
        setIntField(term3470477, term3470477.getClass(), "baseLineno", 0);
        setIntField(term3470477, term3470477.getClass(), "endLineno", 0);
        setField(term3470477, term3470477.getClass(), "functions", null);
        setField(term3470477, term3470477.getClass(), "regexps", null);
        setField(term3470477, term3470477.getClass(), "itsVariables", null);
        setField(term3470477, term3470477.getClass(), "itsConst", null);
        setField(term3470477, term3470477.getClass(), "itsVariableNames", null);
        setIntField(term3470477, term3470477.getClass(), "varStart", 0);
        setField(term3470477, term3470477.getClass(), "compilerData", null);
        setIntField(term3470477, term3470477.getClass(), "type", 41);
        setField(term3470477, term3470477.getClass(), "next", null);
        setField(term3470477, term3470477.getClass(), "first", null);
        setField(term3470477, term3470477.getClass(), "last", null);
        setField(term3470477, term3470477.getClass(), "propListHead", null);
        setIntField(term3470477, term3470477.getClass(), "sourcePosition", 0);
        setField(term3470477, term3470477.getClass(), "jsType", null);
        setField(term3470477, term3470477.getClass(), "parent", null);
        setField(term3470475, term3470475.getClass(), "next", term3470477);
        setField(term3470488, term3470488.getClass(), "str", null);
        setIntField(term3470488, term3470488.getClass(), "type", 40);
        setField(term3470490, term3470490.getClass(), "str", "");
        setIntField(term3470490, term3470490.getClass(), "type", 40);
        setField(term3470490, term3470490.getClass(), "next", null);
        setField(term3470490, term3470490.getClass(), "first", null);
        setField(term3470490, term3470490.getClass(), "last", null);
        setField(term3470490, term3470490.getClass(), "propListHead", null);
        setIntField(term3470490, term3470490.getClass(), "sourcePosition", 0);
        setField(term3470490, term3470490.getClass(), "jsType", null);
        setField(term3470490, term3470490.getClass(), "parent", null);
        setField(term3470488, term3470488.getClass(), "next", term3470490);
        setField(term3470488, term3470488.getClass(), "first", null);
        setField(term3470488, term3470488.getClass(), "last", null);
        setField(term3470488, term3470488.getClass(), "propListHead", null);
        setIntField(term3470488, term3470488.getClass(), "sourcePosition", 0);
        setField(term3470488, term3470488.getClass(), "jsType", null);
        setField(term3470488, term3470488.getClass(), "parent", null);
        setField(term3470475, term3470475.getClass(), "first", term3470488);
        setField(term3470475, term3470475.getClass(), "last", null);
        setField(term3470475, term3470475.getClass(), "propListHead", null);
        setIntField(term3470475, term3470475.getClass(), "sourcePosition", 0);
        setField(term3470475, term3470475.getClass(), "jsType", null);
        setField(term3470475, term3470475.getClass(), "parent", null);
        setField(term3470473, term3470473.getClass(), "first", term3470475);
        setField(term3470473, term3470473.getClass(), "last", null);
        setField(term3470473, term3470473.getClass(), "propListHead", null);
        setIntField(term3470473, term3470473.getClass(), "sourcePosition", 0);
        setField(term3470473, term3470473.getClass(), "jsType", null);
        setField(term3470473, term3470473.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3469197;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3469105, args);
        assertTrue(recursiveEquals(term3469105, term3470734));
        assertTrue(recursiveEquals(term3469197, term3470735));
        assertTrue(recursiveEquals(retValue, term3470473));
    }

};


