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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3685237;
     Object term3685323;
     Object term3685981;
     Object term3685982;
     Object term3685760;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3685237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3685323 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3685415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685507 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3685323, term3685323.getClass(), "type", 37);
        setIntField(term3685415, term3685415.getClass(), "type", 35);
        setIntField(term3685599, term3685599.getClass(), "type", 40);
        setField(term3685599, term3685599.getClass(), "str", "indexOf");
        setField(term3685507, term3685507.getClass(), "next", term3685599);
        setIntField(term3685507, term3685507.getClass(), "type", 40);
        setField(term3685507, term3685507.getClass(), "str", null);
        setField(term3685415, term3685415.getClass(), "first", term3685507);
        setIntField(term3685729, term3685729.getClass(), "type", 41);
        setField(term3685729, term3685729.getClass(), "next", term3685599);
        setField(term3685415, term3685415.getClass(), "next", term3685729);
        setField(term3685323, term3685323.getClass(), "first", term3685415);
        term3685981 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3685981, term3685981.getClass(), "currentTraversal", null);
        term3685982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3685983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3685982, term3685982.getClass(), "functionName", null);
        setBooleanField(term3685982, term3685982.getClass(), "itsNeedsActivation", false);
        setIntField(term3685982, term3685982.getClass(), "itsFunctionType", 0);
        setBooleanField(term3685982, term3685982.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3685982, term3685982.getClass(), "encodedSourceStart", 0);
        setIntField(term3685982, term3685982.getClass(), "encodedSourceEnd", 0);
        setField(term3685982, term3685982.getClass(), "sourceName", null);
        setIntField(term3685982, term3685982.getClass(), "baseLineno", 0);
        setIntField(term3685982, term3685982.getClass(), "endLineno", 0);
        setField(term3685982, term3685982.getClass(), "functions", null);
        setField(term3685982, term3685982.getClass(), "regexps", null);
        setField(term3685982, term3685982.getClass(), "itsVariables", null);
        setField(term3685982, term3685982.getClass(), "itsConst", null);
        setField(term3685982, term3685982.getClass(), "itsVariableNames", null);
        setIntField(term3685982, term3685982.getClass(), "varStart", 0);
        setField(term3685982, term3685982.getClass(), "compilerData", null);
        setIntField(term3685982, term3685982.getClass(), "type", 37);
        setField(term3685982, term3685982.getClass(), "next", null);
        setField(term3685983, term3685983.getClass(), "str", null);
        setIntField(term3685983, term3685983.getClass(), "type", 35);
        setField(term3685984, term3685984.getClass(), "str", null);
        setIntField(term3685984, term3685984.getClass(), "type", 41);
        setField(term3685985, term3685985.getClass(), "str", "");
        setIntField(term3685985, term3685985.getClass(), "type", 40);
        setField(term3685985, term3685985.getClass(), "next", null);
        setField(term3685985, term3685985.getClass(), "first", null);
        setField(term3685985, term3685985.getClass(), "last", null);
        setField(term3685985, term3685985.getClass(), "propListHead", null);
        setIntField(term3685985, term3685985.getClass(), "sourcePosition", 0);
        setField(term3685985, term3685985.getClass(), "jsType", null);
        setField(term3685985, term3685985.getClass(), "parent", null);
        setField(term3685984, term3685984.getClass(), "next", term3685985);
        setField(term3685984, term3685984.getClass(), "first", null);
        setField(term3685984, term3685984.getClass(), "last", null);
        setField(term3685984, term3685984.getClass(), "propListHead", null);
        setIntField(term3685984, term3685984.getClass(), "sourcePosition", 0);
        setField(term3685984, term3685984.getClass(), "jsType", null);
        setField(term3685984, term3685984.getClass(), "parent", null);
        setField(term3685983, term3685983.getClass(), "next", term3685984);
        setField(term3685987, term3685987.getClass(), "str", null);
        setIntField(term3685987, term3685987.getClass(), "type", 40);
        setField(term3685987, term3685987.getClass(), "next", term3685985);
        setField(term3685987, term3685987.getClass(), "first", null);
        setField(term3685987, term3685987.getClass(), "last", null);
        setField(term3685987, term3685987.getClass(), "propListHead", null);
        setIntField(term3685987, term3685987.getClass(), "sourcePosition", 0);
        setField(term3685987, term3685987.getClass(), "jsType", null);
        setField(term3685987, term3685987.getClass(), "parent", null);
        setField(term3685983, term3685983.getClass(), "first", term3685987);
        setField(term3685983, term3685983.getClass(), "last", null);
        setField(term3685983, term3685983.getClass(), "propListHead", null);
        setIntField(term3685983, term3685983.getClass(), "sourcePosition", 0);
        setField(term3685983, term3685983.getClass(), "jsType", null);
        setField(term3685983, term3685983.getClass(), "parent", null);
        setField(term3685982, term3685982.getClass(), "first", term3685983);
        setField(term3685982, term3685982.getClass(), "last", null);
        setField(term3685982, term3685982.getClass(), "propListHead", null);
        setIntField(term3685982, term3685982.getClass(), "sourcePosition", 0);
        setField(term3685982, term3685982.getClass(), "jsType", null);
        setField(term3685982, term3685982.getClass(), "parent", null);
        term3685760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3685770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3685779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3685760, term3685760.getClass(), "functionName", null);
        setBooleanField(term3685760, term3685760.getClass(), "itsNeedsActivation", false);
        setIntField(term3685760, term3685760.getClass(), "itsFunctionType", 0);
        setBooleanField(term3685760, term3685760.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3685760, term3685760.getClass(), "encodedSourceStart", 0);
        setIntField(term3685760, term3685760.getClass(), "encodedSourceEnd", 0);
        setField(term3685760, term3685760.getClass(), "sourceName", null);
        setIntField(term3685760, term3685760.getClass(), "baseLineno", 0);
        setIntField(term3685760, term3685760.getClass(), "endLineno", 0);
        setField(term3685760, term3685760.getClass(), "functions", null);
        setField(term3685760, term3685760.getClass(), "regexps", null);
        setField(term3685760, term3685760.getClass(), "itsVariables", null);
        setField(term3685760, term3685760.getClass(), "itsConst", null);
        setField(term3685760, term3685760.getClass(), "itsVariableNames", null);
        setIntField(term3685760, term3685760.getClass(), "varStart", 0);
        setField(term3685760, term3685760.getClass(), "compilerData", null);
        setIntField(term3685760, term3685760.getClass(), "type", 37);
        setField(term3685760, term3685760.getClass(), "next", null);
        setField(term3685770, term3685770.getClass(), "str", null);
        setIntField(term3685770, term3685770.getClass(), "type", 35);
        setField(term3685772, term3685772.getClass(), "str", null);
        setIntField(term3685772, term3685772.getClass(), "type", 41);
        setField(term3685774, term3685774.getClass(), "str", "");
        setIntField(term3685774, term3685774.getClass(), "type", 40);
        setField(term3685774, term3685774.getClass(), "next", null);
        setField(term3685774, term3685774.getClass(), "first", null);
        setField(term3685774, term3685774.getClass(), "last", null);
        setField(term3685774, term3685774.getClass(), "propListHead", null);
        setIntField(term3685774, term3685774.getClass(), "sourcePosition", 0);
        setField(term3685774, term3685774.getClass(), "jsType", null);
        setField(term3685774, term3685774.getClass(), "parent", null);
        setField(term3685772, term3685772.getClass(), "next", term3685774);
        setField(term3685772, term3685772.getClass(), "first", null);
        setField(term3685772, term3685772.getClass(), "last", null);
        setField(term3685772, term3685772.getClass(), "propListHead", null);
        setIntField(term3685772, term3685772.getClass(), "sourcePosition", 0);
        setField(term3685772, term3685772.getClass(), "jsType", null);
        setField(term3685772, term3685772.getClass(), "parent", null);
        setField(term3685770, term3685770.getClass(), "next", term3685772);
        setField(term3685779, term3685779.getClass(), "str", null);
        setIntField(term3685779, term3685779.getClass(), "type", 40);
        setField(term3685779, term3685779.getClass(), "next", term3685774);
        setField(term3685779, term3685779.getClass(), "first", null);
        setField(term3685779, term3685779.getClass(), "last", null);
        setField(term3685779, term3685779.getClass(), "propListHead", null);
        setIntField(term3685779, term3685779.getClass(), "sourcePosition", 0);
        setField(term3685779, term3685779.getClass(), "jsType", null);
        setField(term3685779, term3685779.getClass(), "parent", null);
        setField(term3685770, term3685770.getClass(), "first", term3685779);
        setField(term3685770, term3685770.getClass(), "last", null);
        setField(term3685770, term3685770.getClass(), "propListHead", null);
        setIntField(term3685770, term3685770.getClass(), "sourcePosition", 0);
        setField(term3685770, term3685770.getClass(), "jsType", null);
        setField(term3685770, term3685770.getClass(), "parent", null);
        setField(term3685760, term3685760.getClass(), "first", term3685770);
        setField(term3685760, term3685760.getClass(), "last", null);
        setField(term3685760, term3685760.getClass(), "propListHead", null);
        setIntField(term3685760, term3685760.getClass(), "sourcePosition", 0);
        setField(term3685760, term3685760.getClass(), "jsType", null);
        setField(term3685760, term3685760.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3685323;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3685237, args);
        assertTrue(recursiveEquals(term3685237, term3685981));
        assertTrue(recursiveEquals(term3685323, term3685982));
        assertTrue(recursiveEquals(retValue, term3685760));
    }

};


