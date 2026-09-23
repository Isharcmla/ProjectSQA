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

public class ReferenceCollectingCallback_shouldTraverse_422855684276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65780;
     Object term65866;
     Object term65952;
     Object term65990;
     Object term65991;
     Object term65992;

    public ReferenceCollectingCallback_shouldTraverse_422855684276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65780 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term65866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term65952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term65952, term65952.getClass(), "type", 2);
        term65990 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term65990, term65990.getClass(), "referenceMap", null);
        setField(term65990, term65990.getClass(), "blockStack", null);
        setField(term65990, term65990.getClass(), "behavior", null);
        setField(term65990, term65990.getClass(), "compiler", null);
        setField(term65990, term65990.getClass(), "varFilter", null);
        term65991 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term65991, term65991.getClass(), "functionName", null);
        setBooleanField(term65991, term65991.getClass(), "itsNeedsActivation", false);
        setIntField(term65991, term65991.getClass(), "itsFunctionType", 0);
        setBooleanField(term65991, term65991.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term65991, term65991.getClass(), "encodedSourceStart", 0);
        setIntField(term65991, term65991.getClass(), "encodedSourceEnd", 0);
        setField(term65991, term65991.getClass(), "sourceName", null);
        setIntField(term65991, term65991.getClass(), "baseLineno", 0);
        setIntField(term65991, term65991.getClass(), "endLineno", 0);
        setField(term65991, term65991.getClass(), "functions", null);
        setField(term65991, term65991.getClass(), "regexps", null);
        setField(term65991, term65991.getClass(), "itsVariables", null);
        setField(term65991, term65991.getClass(), "itsConst", null);
        setField(term65991, term65991.getClass(), "itsVariableNames", null);
        setIntField(term65991, term65991.getClass(), "varStart", 0);
        setField(term65991, term65991.getClass(), "compilerData", null);
        setIntField(term65991, term65991.getClass(), "type", 2);
        setField(term65991, term65991.getClass(), "next", null);
        setField(term65991, term65991.getClass(), "first", null);
        setField(term65991, term65991.getClass(), "last", null);
        setField(term65991, term65991.getClass(), "propListHead", null);
        setIntField(term65991, term65991.getClass(), "sourcePosition", 0);
        setField(term65991, term65991.getClass(), "jsType", null);
        setField(term65991, term65991.getClass(), "parent", null);
        term65992 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term65992, term65992.getClass(), "functionName", null);
        setBooleanField(term65992, term65992.getClass(), "itsNeedsActivation", false);
        setIntField(term65992, term65992.getClass(), "itsFunctionType", 0);
        setBooleanField(term65992, term65992.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term65992, term65992.getClass(), "encodedSourceStart", 0);
        setIntField(term65992, term65992.getClass(), "encodedSourceEnd", 0);
        setField(term65992, term65992.getClass(), "sourceName", null);
        setIntField(term65992, term65992.getClass(), "baseLineno", 0);
        setIntField(term65992, term65992.getClass(), "endLineno", 0);
        setField(term65992, term65992.getClass(), "functions", null);
        setField(term65992, term65992.getClass(), "regexps", null);
        setField(term65992, term65992.getClass(), "itsVariables", null);
        setField(term65992, term65992.getClass(), "itsConst", null);
        setField(term65992, term65992.getClass(), "itsVariableNames", null);
        setIntField(term65992, term65992.getClass(), "varStart", 0);
        setField(term65992, term65992.getClass(), "compilerData", null);
        setIntField(term65992, term65992.getClass(), "type", 0);
        setField(term65992, term65992.getClass(), "next", null);
        setField(term65992, term65992.getClass(), "first", null);
        setField(term65992, term65992.getClass(), "last", null);
        setField(term65992, term65992.getClass(), "propListHead", null);
        setIntField(term65992, term65992.getClass(), "sourcePosition", 0);
        setField(term65992, term65992.getClass(), "jsType", null);
        setField(term65992, term65992.getClass(), "parent", null);
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
        args[1] = term65866;
        args[2] = term65952;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term65780, args);
        assertTrue(recursiveEquals(term65780, term65990));
        assertTrue(recursiveEquals(term65866, term65992));
        assertTrue(recursiveEquals(term65952, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


