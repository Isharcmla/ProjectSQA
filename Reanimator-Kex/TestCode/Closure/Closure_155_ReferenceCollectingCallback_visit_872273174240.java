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

public class ReferenceCollectingCallback_visit_872273174240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57705;
     Object term57791;
     Object term57877;
     Object term58201;
     Object term58202;
     Object term58203;

    public ReferenceCollectingCallback_visit_872273174240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57705 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term57791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term57791, term57791.getClass(), "type", -39);
        term57877 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term58201 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term58201, term58201.getClass(), "referenceMap", null);
        setField(term58201, term58201.getClass(), "blockStack", null);
        setField(term58201, term58201.getClass(), "behavior", null);
        setField(term58201, term58201.getClass(), "compiler", null);
        setField(term58201, term58201.getClass(), "varFilter", null);
        term58202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58202, term58202.getClass(), "functionName", null);
        setBooleanField(term58202, term58202.getClass(), "itsNeedsActivation", false);
        setIntField(term58202, term58202.getClass(), "itsFunctionType", 0);
        setBooleanField(term58202, term58202.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58202, term58202.getClass(), "encodedSourceStart", 0);
        setIntField(term58202, term58202.getClass(), "encodedSourceEnd", 0);
        setField(term58202, term58202.getClass(), "sourceName", null);
        setIntField(term58202, term58202.getClass(), "baseLineno", 0);
        setIntField(term58202, term58202.getClass(), "endLineno", 0);
        setField(term58202, term58202.getClass(), "functions", null);
        setField(term58202, term58202.getClass(), "regexps", null);
        setField(term58202, term58202.getClass(), "itsVariables", null);
        setField(term58202, term58202.getClass(), "itsConst", null);
        setField(term58202, term58202.getClass(), "itsVariableNames", null);
        setIntField(term58202, term58202.getClass(), "varStart", 0);
        setField(term58202, term58202.getClass(), "compilerData", null);
        setIntField(term58202, term58202.getClass(), "type", -39);
        setField(term58202, term58202.getClass(), "next", null);
        setField(term58202, term58202.getClass(), "first", null);
        setField(term58202, term58202.getClass(), "last", null);
        setField(term58202, term58202.getClass(), "propListHead", null);
        setIntField(term58202, term58202.getClass(), "sourcePosition", 0);
        setField(term58202, term58202.getClass(), "jsType", null);
        setField(term58202, term58202.getClass(), "parent", null);
        term58203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58203, term58203.getClass(), "functionName", null);
        setBooleanField(term58203, term58203.getClass(), "itsNeedsActivation", false);
        setIntField(term58203, term58203.getClass(), "itsFunctionType", 0);
        setBooleanField(term58203, term58203.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58203, term58203.getClass(), "encodedSourceStart", 0);
        setIntField(term58203, term58203.getClass(), "encodedSourceEnd", 0);
        setField(term58203, term58203.getClass(), "sourceName", null);
        setIntField(term58203, term58203.getClass(), "baseLineno", 0);
        setIntField(term58203, term58203.getClass(), "endLineno", 0);
        setField(term58203, term58203.getClass(), "functions", null);
        setField(term58203, term58203.getClass(), "regexps", null);
        setField(term58203, term58203.getClass(), "itsVariables", null);
        setField(term58203, term58203.getClass(), "itsConst", null);
        setField(term58203, term58203.getClass(), "itsVariableNames", null);
        setIntField(term58203, term58203.getClass(), "varStart", 0);
        setField(term58203, term58203.getClass(), "compilerData", null);
        setIntField(term58203, term58203.getClass(), "type", 0);
        setField(term58203, term58203.getClass(), "next", null);
        setField(term58203, term58203.getClass(), "first", null);
        setField(term58203, term58203.getClass(), "last", null);
        setField(term58203, term58203.getClass(), "propListHead", null);
        setIntField(term58203, term58203.getClass(), "sourcePosition", 0);
        setField(term58203, term58203.getClass(), "jsType", null);
        setField(term58203, term58203.getClass(), "parent", null);
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
        args[1] = term57791;
        args[2] = term57877;
        callMethod(klass, "visit", argTypes, term57705, args);
        assertTrue(recursiveEquals(term57705, term58201));
        assertTrue(recursiveEquals(term57791, term58203));
        assertTrue(recursiveEquals(term57877, null));
    }

};


