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

public class ReferenceCollectingCallback_shouldTraverse_4228556841012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257457;
     Object term257543;
     Object term257635;
     Object term257741;
     Object term257742;
     Object term257743;

    public ReferenceCollectingCallback_shouldTraverse_4228556841012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257457 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term257543 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term257635 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term257635, term257635.getClass(), "type", 4);
        term257741 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term257741, term257741.getClass(), "referenceMap", null);
        setField(term257741, term257741.getClass(), "blockStack", null);
        setField(term257741, term257741.getClass(), "behavior", null);
        setField(term257741, term257741.getClass(), "compiler", null);
        setField(term257741, term257741.getClass(), "varFilter", null);
        term257742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term257742, term257742.getClass(), "str", null);
        setIntField(term257742, term257742.getClass(), "type", 4);
        setField(term257742, term257742.getClass(), "next", null);
        setField(term257742, term257742.getClass(), "first", null);
        setField(term257742, term257742.getClass(), "last", null);
        setField(term257742, term257742.getClass(), "propListHead", null);
        setIntField(term257742, term257742.getClass(), "sourcePosition", 0);
        setField(term257742, term257742.getClass(), "jsType", null);
        setField(term257742, term257742.getClass(), "parent", null);
        term257743 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term257743, term257743.getClass(), "functionName", null);
        setBooleanField(term257743, term257743.getClass(), "itsNeedsActivation", false);
        setIntField(term257743, term257743.getClass(), "itsFunctionType", 0);
        setBooleanField(term257743, term257743.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term257743, term257743.getClass(), "encodedSourceStart", 0);
        setIntField(term257743, term257743.getClass(), "encodedSourceEnd", 0);
        setField(term257743, term257743.getClass(), "sourceName", null);
        setIntField(term257743, term257743.getClass(), "baseLineno", 0);
        setIntField(term257743, term257743.getClass(), "endLineno", 0);
        setField(term257743, term257743.getClass(), "functions", null);
        setField(term257743, term257743.getClass(), "regexps", null);
        setField(term257743, term257743.getClass(), "itsVariables", null);
        setField(term257743, term257743.getClass(), "itsConst", null);
        setField(term257743, term257743.getClass(), "itsVariableNames", null);
        setIntField(term257743, term257743.getClass(), "varStart", 0);
        setField(term257743, term257743.getClass(), "compilerData", null);
        setIntField(term257743, term257743.getClass(), "type", 0);
        setField(term257743, term257743.getClass(), "next", null);
        setField(term257743, term257743.getClass(), "first", null);
        setField(term257743, term257743.getClass(), "last", null);
        setField(term257743, term257743.getClass(), "propListHead", null);
        setIntField(term257743, term257743.getClass(), "sourcePosition", 0);
        setField(term257743, term257743.getClass(), "jsType", null);
        setField(term257743, term257743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term257543;
        args[2] = term257635;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term257457, args);
        assertTrue(recursiveEquals(term257457, term257741));
        assertTrue(recursiveEquals(term257543, term257743));
        assertTrue(recursiveEquals(term257635, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


