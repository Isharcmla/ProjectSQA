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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_422855684730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194261;
     Object term194401;
     Object term194487;
     Object term194819;
     Object term194823;
     Object term194824;

    public ReferenceCollectingCallback_shouldTraverse_422855684730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term194315 = new ArrayDeque();
        term194261 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term194261, term194261.getClass(), "blockStack", term194315);
        term194401 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term194401, term194401.getClass(), "type", 111);
        term194487 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term194487, term194487.getClass(), "type", 111);
        ArrayDeque term194820 = new ArrayDeque();
        term194819 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term194819, term194819.getClass(), "referenceMap", null);
        setField(term194819, term194819.getClass(), "blockStack", term194820);
        setField(term194819, term194819.getClass(), "behavior", null);
        setField(term194819, term194819.getClass(), "compiler", null);
        setField(term194819, term194819.getClass(), "varFilter", null);
        term194823 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term194823, term194823.getClass(), "functionName", null);
        setBooleanField(term194823, term194823.getClass(), "itsNeedsActivation", false);
        setIntField(term194823, term194823.getClass(), "itsFunctionType", 0);
        setBooleanField(term194823, term194823.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term194823, term194823.getClass(), "encodedSourceStart", 0);
        setIntField(term194823, term194823.getClass(), "encodedSourceEnd", 0);
        setField(term194823, term194823.getClass(), "sourceName", null);
        setIntField(term194823, term194823.getClass(), "baseLineno", 0);
        setIntField(term194823, term194823.getClass(), "endLineno", 0);
        setField(term194823, term194823.getClass(), "functions", null);
        setField(term194823, term194823.getClass(), "regexps", null);
        setField(term194823, term194823.getClass(), "itsVariables", null);
        setField(term194823, term194823.getClass(), "itsConst", null);
        setField(term194823, term194823.getClass(), "itsVariableNames", null);
        setIntField(term194823, term194823.getClass(), "varStart", 0);
        setField(term194823, term194823.getClass(), "compilerData", null);
        setIntField(term194823, term194823.getClass(), "type", 111);
        setField(term194823, term194823.getClass(), "next", null);
        setField(term194823, term194823.getClass(), "first", null);
        setField(term194823, term194823.getClass(), "last", null);
        setField(term194823, term194823.getClass(), "propListHead", null);
        setIntField(term194823, term194823.getClass(), "sourcePosition", 0);
        setField(term194823, term194823.getClass(), "jsType", null);
        setField(term194823, term194823.getClass(), "parent", null);
        term194824 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term194824, term194824.getClass(), "functionName", null);
        setBooleanField(term194824, term194824.getClass(), "itsNeedsActivation", false);
        setIntField(term194824, term194824.getClass(), "itsFunctionType", 0);
        setBooleanField(term194824, term194824.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term194824, term194824.getClass(), "encodedSourceStart", 0);
        setIntField(term194824, term194824.getClass(), "encodedSourceEnd", 0);
        setField(term194824, term194824.getClass(), "sourceName", null);
        setIntField(term194824, term194824.getClass(), "baseLineno", 0);
        setIntField(term194824, term194824.getClass(), "endLineno", 0);
        setField(term194824, term194824.getClass(), "functions", null);
        setField(term194824, term194824.getClass(), "regexps", null);
        setField(term194824, term194824.getClass(), "itsVariables", null);
        setField(term194824, term194824.getClass(), "itsConst", null);
        setField(term194824, term194824.getClass(), "itsVariableNames", null);
        setIntField(term194824, term194824.getClass(), "varStart", 0);
        setField(term194824, term194824.getClass(), "compilerData", null);
        setIntField(term194824, term194824.getClass(), "type", 111);
        setField(term194824, term194824.getClass(), "next", null);
        setField(term194824, term194824.getClass(), "first", null);
        setField(term194824, term194824.getClass(), "last", null);
        setField(term194824, term194824.getClass(), "propListHead", null);
        setIntField(term194824, term194824.getClass(), "sourcePosition", 0);
        setField(term194824, term194824.getClass(), "jsType", null);
        setField(term194824, term194824.getClass(), "parent", null);
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
        args[1] = term194401;
        args[2] = term194487;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term194261, args);
        assertTrue(recursiveEquals(term194261, term194819));
        assertTrue(recursiveEquals(term194401, term194824));
        assertTrue(recursiveEquals(term194487, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


