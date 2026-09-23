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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3733426;
     Object term3733512;
     Object term3737954;
     Object term3737955;
     Object term3734421;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3733426 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3733512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3733604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3733696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3733788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3733918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3733512, term3733512.getClass(), "type", 37);
        setIntField(term3733604, term3733604.getClass(), "type", 33);
        setIntField(term3733788, term3733788.getClass(), "type", 40);
        setField(term3733788, term3733788.getClass(), "str", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term3733696, term3733696.getClass(), "next", term3733788);
        setIntField(term3733696, term3733696.getClass(), "type", 40);
        setField(term3733604, term3733604.getClass(), "first", term3733696);
        setIntField(term3733918, term3733918.getClass(), "type", 44);
        setField(term3733604, term3733604.getClass(), "next", term3733918);
        setField(term3733512, term3733512.getClass(), "first", term3733604);
        term3737954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3737954, term3737954.getClass(), "currentTraversal", null);
        term3737955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3737956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3737957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3737958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3737959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3737955, term3737955.getClass(), "functionName", null);
        setBooleanField(term3737955, term3737955.getClass(), "itsNeedsActivation", false);
        setIntField(term3737955, term3737955.getClass(), "itsFunctionType", 0);
        setBooleanField(term3737955, term3737955.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3737955, term3737955.getClass(), "encodedSourceStart", 0);
        setIntField(term3737955, term3737955.getClass(), "encodedSourceEnd", 0);
        setField(term3737955, term3737955.getClass(), "sourceName", null);
        setIntField(term3737955, term3737955.getClass(), "baseLineno", 0);
        setIntField(term3737955, term3737955.getClass(), "endLineno", 0);
        setField(term3737955, term3737955.getClass(), "functions", null);
        setField(term3737955, term3737955.getClass(), "regexps", null);
        setField(term3737955, term3737955.getClass(), "itsVariables", null);
        setField(term3737955, term3737955.getClass(), "itsConst", null);
        setField(term3737955, term3737955.getClass(), "itsVariableNames", null);
        setIntField(term3737955, term3737955.getClass(), "varStart", 0);
        setField(term3737955, term3737955.getClass(), "compilerData", null);
        setIntField(term3737955, term3737955.getClass(), "type", 37);
        setField(term3737955, term3737955.getClass(), "next", null);
        setField(term3737956, term3737956.getClass(), "str", null);
        setIntField(term3737956, term3737956.getClass(), "type", 33);
        setDoubleField(term3737957, term3737957.getClass(), "number", 0.0);
        setIntField(term3737957, term3737957.getClass(), "type", 44);
        setField(term3737957, term3737957.getClass(), "next", null);
        setField(term3737957, term3737957.getClass(), "first", null);
        setField(term3737957, term3737957.getClass(), "last", null);
        setField(term3737957, term3737957.getClass(), "propListHead", null);
        setIntField(term3737957, term3737957.getClass(), "sourcePosition", 0);
        setField(term3737957, term3737957.getClass(), "jsType", null);
        setField(term3737957, term3737957.getClass(), "parent", null);
        setField(term3737956, term3737956.getClass(), "next", term3737957);
        setField(term3737958, term3737958.getClass(), "str", null);
        setIntField(term3737958, term3737958.getClass(), "type", 40);
        setField(term3737959, term3737959.getClass(), "str", "");
        setIntField(term3737959, term3737959.getClass(), "type", 40);
        setField(term3737959, term3737959.getClass(), "next", null);
        setField(term3737959, term3737959.getClass(), "first", null);
        setField(term3737959, term3737959.getClass(), "last", null);
        setField(term3737959, term3737959.getClass(), "propListHead", null);
        setIntField(term3737959, term3737959.getClass(), "sourcePosition", 0);
        setField(term3737959, term3737959.getClass(), "jsType", null);
        setField(term3737959, term3737959.getClass(), "parent", null);
        setField(term3737958, term3737958.getClass(), "next", term3737959);
        setField(term3737958, term3737958.getClass(), "first", null);
        setField(term3737958, term3737958.getClass(), "last", null);
        setField(term3737958, term3737958.getClass(), "propListHead", null);
        setIntField(term3737958, term3737958.getClass(), "sourcePosition", 0);
        setField(term3737958, term3737958.getClass(), "jsType", null);
        setField(term3737958, term3737958.getClass(), "parent", null);
        setField(term3737956, term3737956.getClass(), "first", term3737958);
        setField(term3737956, term3737956.getClass(), "last", null);
        setField(term3737956, term3737956.getClass(), "propListHead", null);
        setIntField(term3737956, term3737956.getClass(), "sourcePosition", 0);
        setField(term3737956, term3737956.getClass(), "jsType", null);
        setField(term3737956, term3737956.getClass(), "parent", null);
        setField(term3737955, term3737955.getClass(), "first", term3737956);
        setField(term3737955, term3737955.getClass(), "last", null);
        setField(term3737955, term3737955.getClass(), "propListHead", null);
        setIntField(term3737955, term3737955.getClass(), "sourcePosition", 0);
        setField(term3737955, term3737955.getClass(), "jsType", null);
        setField(term3737955, term3737955.getClass(), "parent", null);
        term3734421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3734431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3734433 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3734437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3734439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3734421, term3734421.getClass(), "functionName", null);
        setBooleanField(term3734421, term3734421.getClass(), "itsNeedsActivation", false);
        setIntField(term3734421, term3734421.getClass(), "itsFunctionType", 0);
        setBooleanField(term3734421, term3734421.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3734421, term3734421.getClass(), "encodedSourceStart", 0);
        setIntField(term3734421, term3734421.getClass(), "encodedSourceEnd", 0);
        setField(term3734421, term3734421.getClass(), "sourceName", null);
        setIntField(term3734421, term3734421.getClass(), "baseLineno", 0);
        setIntField(term3734421, term3734421.getClass(), "endLineno", 0);
        setField(term3734421, term3734421.getClass(), "functions", null);
        setField(term3734421, term3734421.getClass(), "regexps", null);
        setField(term3734421, term3734421.getClass(), "itsVariables", null);
        setField(term3734421, term3734421.getClass(), "itsConst", null);
        setField(term3734421, term3734421.getClass(), "itsVariableNames", null);
        setIntField(term3734421, term3734421.getClass(), "varStart", 0);
        setField(term3734421, term3734421.getClass(), "compilerData", null);
        setIntField(term3734421, term3734421.getClass(), "type", 37);
        setField(term3734421, term3734421.getClass(), "next", null);
        setField(term3734431, term3734431.getClass(), "str", null);
        setIntField(term3734431, term3734431.getClass(), "type", 33);
        setDoubleField(term3734433, term3734433.getClass(), "number", 0.0);
        setIntField(term3734433, term3734433.getClass(), "type", 44);
        setField(term3734433, term3734433.getClass(), "next", null);
        setField(term3734433, term3734433.getClass(), "first", null);
        setField(term3734433, term3734433.getClass(), "last", null);
        setField(term3734433, term3734433.getClass(), "propListHead", null);
        setIntField(term3734433, term3734433.getClass(), "sourcePosition", 0);
        setField(term3734433, term3734433.getClass(), "jsType", null);
        setField(term3734433, term3734433.getClass(), "parent", null);
        setField(term3734431, term3734431.getClass(), "next", term3734433);
        setField(term3734437, term3734437.getClass(), "str", null);
        setIntField(term3734437, term3734437.getClass(), "type", 40);
        setField(term3734439, term3734439.getClass(), "str", "");
        setIntField(term3734439, term3734439.getClass(), "type", 40);
        setField(term3734439, term3734439.getClass(), "next", null);
        setField(term3734439, term3734439.getClass(), "first", null);
        setField(term3734439, term3734439.getClass(), "last", null);
        setField(term3734439, term3734439.getClass(), "propListHead", null);
        setIntField(term3734439, term3734439.getClass(), "sourcePosition", 0);
        setField(term3734439, term3734439.getClass(), "jsType", null);
        setField(term3734439, term3734439.getClass(), "parent", null);
        setField(term3734437, term3734437.getClass(), "next", term3734439);
        setField(term3734437, term3734437.getClass(), "first", null);
        setField(term3734437, term3734437.getClass(), "last", null);
        setField(term3734437, term3734437.getClass(), "propListHead", null);
        setIntField(term3734437, term3734437.getClass(), "sourcePosition", 0);
        setField(term3734437, term3734437.getClass(), "jsType", null);
        setField(term3734437, term3734437.getClass(), "parent", null);
        setField(term3734431, term3734431.getClass(), "first", term3734437);
        setField(term3734431, term3734431.getClass(), "last", null);
        setField(term3734431, term3734431.getClass(), "propListHead", null);
        setIntField(term3734431, term3734431.getClass(), "sourcePosition", 0);
        setField(term3734431, term3734431.getClass(), "jsType", null);
        setField(term3734431, term3734431.getClass(), "parent", null);
        setField(term3734421, term3734421.getClass(), "first", term3734431);
        setField(term3734421, term3734421.getClass(), "last", null);
        setField(term3734421, term3734421.getClass(), "propListHead", null);
        setIntField(term3734421, term3734421.getClass(), "sourcePosition", 0);
        setField(term3734421, term3734421.getClass(), "jsType", null);
        setField(term3734421, term3734421.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3733512;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3733426, args);
        assertTrue(recursiveEquals(term3733426, term3737954));
        assertTrue(recursiveEquals(term3733512, term3737955));
        assertTrue(recursiveEquals(retValue, term3734421));
    }

};


