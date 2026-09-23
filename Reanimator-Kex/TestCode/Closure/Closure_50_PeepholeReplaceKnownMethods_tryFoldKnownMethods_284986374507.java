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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3485654;
     Object term3485746;
     Object term3488031;
     Object term3488032;
     Object term3487675;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3485654 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3485746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3485838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3485930 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3486022 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3486146 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3485838, term3485838.getClass(), "type", 35);
        setIntField(term3486022, term3486022.getClass(), "type", 40);
        setField(term3486022, term3486022.getClass(), "str", "substring");
        setField(term3485930, term3485930.getClass(), "next", term3486022);
        setIntField(term3485930, term3485930.getClass(), "type", 40);
        setField(term3485838, term3485838.getClass(), "first", term3485930);
        setIntField(term3486146, term3486146.getClass(), "type", 40);
        setField(term3485838, term3485838.getClass(), "next", term3486146);
        setField(term3485746, term3485746.getClass(), "first", term3485838);
        setIntField(term3485746, term3485746.getClass(), "type", 37);
        term3488031 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3488031, term3488031.getClass(), "currentTraversal", null);
        term3488032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3488033 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3488034 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3488035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3488036 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3488032, term3488032.getClass(), "str", null);
        setIntField(term3488032, term3488032.getClass(), "type", 37);
        setField(term3488032, term3488032.getClass(), "next", null);
        setField(term3488033, term3488033.getClass(), "str", null);
        setIntField(term3488033, term3488033.getClass(), "type", 35);
        setField(term3488034, term3488034.getClass(), "functionName", null);
        setBooleanField(term3488034, term3488034.getClass(), "itsNeedsActivation", false);
        setIntField(term3488034, term3488034.getClass(), "itsFunctionType", 0);
        setBooleanField(term3488034, term3488034.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3488034, term3488034.getClass(), "encodedSourceStart", 0);
        setIntField(term3488034, term3488034.getClass(), "encodedSourceEnd", 0);
        setField(term3488034, term3488034.getClass(), "sourceName", null);
        setIntField(term3488034, term3488034.getClass(), "baseLineno", 0);
        setIntField(term3488034, term3488034.getClass(), "endLineno", 0);
        setField(term3488034, term3488034.getClass(), "functions", null);
        setField(term3488034, term3488034.getClass(), "regexps", null);
        setField(term3488034, term3488034.getClass(), "itsVariables", null);
        setField(term3488034, term3488034.getClass(), "itsConst", null);
        setField(term3488034, term3488034.getClass(), "itsVariableNames", null);
        setIntField(term3488034, term3488034.getClass(), "varStart", 0);
        setField(term3488034, term3488034.getClass(), "compilerData", null);
        setIntField(term3488034, term3488034.getClass(), "type", 40);
        setField(term3488034, term3488034.getClass(), "next", null);
        setField(term3488034, term3488034.getClass(), "first", null);
        setField(term3488034, term3488034.getClass(), "last", null);
        setField(term3488034, term3488034.getClass(), "propListHead", null);
        setIntField(term3488034, term3488034.getClass(), "sourcePosition", 0);
        setField(term3488034, term3488034.getClass(), "jsType", null);
        setField(term3488034, term3488034.getClass(), "parent", null);
        setField(term3488033, term3488033.getClass(), "next", term3488034);
        setField(term3488035, term3488035.getClass(), "str", null);
        setIntField(term3488035, term3488035.getClass(), "type", 40);
        setField(term3488036, term3488036.getClass(), "str", "");
        setIntField(term3488036, term3488036.getClass(), "type", 40);
        setField(term3488036, term3488036.getClass(), "next", null);
        setField(term3488036, term3488036.getClass(), "first", null);
        setField(term3488036, term3488036.getClass(), "last", null);
        setField(term3488036, term3488036.getClass(), "propListHead", null);
        setIntField(term3488036, term3488036.getClass(), "sourcePosition", 0);
        setField(term3488036, term3488036.getClass(), "jsType", null);
        setField(term3488036, term3488036.getClass(), "parent", null);
        setField(term3488035, term3488035.getClass(), "next", term3488036);
        setField(term3488035, term3488035.getClass(), "first", null);
        setField(term3488035, term3488035.getClass(), "last", null);
        setField(term3488035, term3488035.getClass(), "propListHead", null);
        setIntField(term3488035, term3488035.getClass(), "sourcePosition", 0);
        setField(term3488035, term3488035.getClass(), "jsType", null);
        setField(term3488035, term3488035.getClass(), "parent", null);
        setField(term3488033, term3488033.getClass(), "first", term3488035);
        setField(term3488033, term3488033.getClass(), "last", null);
        setField(term3488033, term3488033.getClass(), "propListHead", null);
        setIntField(term3488033, term3488033.getClass(), "sourcePosition", 0);
        setField(term3488033, term3488033.getClass(), "jsType", null);
        setField(term3488033, term3488033.getClass(), "parent", null);
        setField(term3488032, term3488032.getClass(), "first", term3488033);
        setField(term3488032, term3488032.getClass(), "last", null);
        setField(term3488032, term3488032.getClass(), "propListHead", null);
        setIntField(term3488032, term3488032.getClass(), "sourcePosition", 0);
        setField(term3488032, term3488032.getClass(), "jsType", null);
        setField(term3488032, term3488032.getClass(), "parent", null);
        term3487675 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3487690 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3487675, term3487675.getClass(), "str", null);
        setIntField(term3487675, term3487675.getClass(), "type", 37);
        setField(term3487675, term3487675.getClass(), "next", null);
        setField(term3487677, term3487677.getClass(), "str", null);
        setIntField(term3487677, term3487677.getClass(), "type", 35);
        setField(term3487679, term3487679.getClass(), "functionName", null);
        setBooleanField(term3487679, term3487679.getClass(), "itsNeedsActivation", false);
        setIntField(term3487679, term3487679.getClass(), "itsFunctionType", 0);
        setBooleanField(term3487679, term3487679.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3487679, term3487679.getClass(), "encodedSourceStart", 0);
        setIntField(term3487679, term3487679.getClass(), "encodedSourceEnd", 0);
        setField(term3487679, term3487679.getClass(), "sourceName", null);
        setIntField(term3487679, term3487679.getClass(), "baseLineno", 0);
        setIntField(term3487679, term3487679.getClass(), "endLineno", 0);
        setField(term3487679, term3487679.getClass(), "functions", null);
        setField(term3487679, term3487679.getClass(), "regexps", null);
        setField(term3487679, term3487679.getClass(), "itsVariables", null);
        setField(term3487679, term3487679.getClass(), "itsConst", null);
        setField(term3487679, term3487679.getClass(), "itsVariableNames", null);
        setIntField(term3487679, term3487679.getClass(), "varStart", 0);
        setField(term3487679, term3487679.getClass(), "compilerData", null);
        setIntField(term3487679, term3487679.getClass(), "type", 40);
        setField(term3487679, term3487679.getClass(), "next", null);
        setField(term3487679, term3487679.getClass(), "first", null);
        setField(term3487679, term3487679.getClass(), "last", null);
        setField(term3487679, term3487679.getClass(), "propListHead", null);
        setIntField(term3487679, term3487679.getClass(), "sourcePosition", 0);
        setField(term3487679, term3487679.getClass(), "jsType", null);
        setField(term3487679, term3487679.getClass(), "parent", null);
        setField(term3487677, term3487677.getClass(), "next", term3487679);
        setField(term3487690, term3487690.getClass(), "str", null);
        setIntField(term3487690, term3487690.getClass(), "type", 40);
        setField(term3487692, term3487692.getClass(), "str", "");
        setIntField(term3487692, term3487692.getClass(), "type", 40);
        setField(term3487692, term3487692.getClass(), "next", null);
        setField(term3487692, term3487692.getClass(), "first", null);
        setField(term3487692, term3487692.getClass(), "last", null);
        setField(term3487692, term3487692.getClass(), "propListHead", null);
        setIntField(term3487692, term3487692.getClass(), "sourcePosition", 0);
        setField(term3487692, term3487692.getClass(), "jsType", null);
        setField(term3487692, term3487692.getClass(), "parent", null);
        setField(term3487690, term3487690.getClass(), "next", term3487692);
        setField(term3487690, term3487690.getClass(), "first", null);
        setField(term3487690, term3487690.getClass(), "last", null);
        setField(term3487690, term3487690.getClass(), "propListHead", null);
        setIntField(term3487690, term3487690.getClass(), "sourcePosition", 0);
        setField(term3487690, term3487690.getClass(), "jsType", null);
        setField(term3487690, term3487690.getClass(), "parent", null);
        setField(term3487677, term3487677.getClass(), "first", term3487690);
        setField(term3487677, term3487677.getClass(), "last", null);
        setField(term3487677, term3487677.getClass(), "propListHead", null);
        setIntField(term3487677, term3487677.getClass(), "sourcePosition", 0);
        setField(term3487677, term3487677.getClass(), "jsType", null);
        setField(term3487677, term3487677.getClass(), "parent", null);
        setField(term3487675, term3487675.getClass(), "first", term3487677);
        setField(term3487675, term3487675.getClass(), "last", null);
        setField(term3487675, term3487675.getClass(), "propListHead", null);
        setIntField(term3487675, term3487675.getClass(), "sourcePosition", 0);
        setField(term3487675, term3487675.getClass(), "jsType", null);
        setField(term3487675, term3487675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3485746;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3485654, args);
        assertTrue(recursiveEquals(term3485654, term3488031));
        assertTrue(recursiveEquals(term3485746, term3488032));
        assertTrue(recursiveEquals(retValue, term3487675));
    }

};


