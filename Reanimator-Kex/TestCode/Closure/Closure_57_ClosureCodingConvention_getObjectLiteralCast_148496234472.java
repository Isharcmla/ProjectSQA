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

public class ClosureCodingConvention_getObjectLiteralCast_148496234472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155301;
     Object term155393;
     Object term155712;
     Object term155713;

    public ClosureCodingConvention_getObjectLiteralCast_148496234472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155301 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term155393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term155393, term155393.getClass(), "type", 37);
        setField(term155393, term155393.getClass(), "first", term155479);
        term155712 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term155712, term155712.getClass(), "propertyTestFunctions", null);
        term155713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155713, term155713.getClass(), "str", null);
        setIntField(term155713, term155713.getClass(), "type", 37);
        setField(term155713, term155713.getClass(), "next", null);
        setField(term155714, term155714.getClass(), "functionName", null);
        setBooleanField(term155714, term155714.getClass(), "itsNeedsActivation", false);
        setIntField(term155714, term155714.getClass(), "itsFunctionType", 0);
        setBooleanField(term155714, term155714.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155714, term155714.getClass(), "encodedSourceStart", 0);
        setIntField(term155714, term155714.getClass(), "encodedSourceEnd", 0);
        setField(term155714, term155714.getClass(), "sourceName", null);
        setIntField(term155714, term155714.getClass(), "baseLineno", 0);
        setIntField(term155714, term155714.getClass(), "endLineno", 0);
        setField(term155714, term155714.getClass(), "functions", null);
        setField(term155714, term155714.getClass(), "regexps", null);
        setField(term155714, term155714.getClass(), "itsVariables", null);
        setField(term155714, term155714.getClass(), "itsConst", null);
        setField(term155714, term155714.getClass(), "itsVariableNames", null);
        setIntField(term155714, term155714.getClass(), "varStart", 0);
        setField(term155714, term155714.getClass(), "compilerData", null);
        setIntField(term155714, term155714.getClass(), "type", 0);
        setField(term155714, term155714.getClass(), "next", null);
        setField(term155714, term155714.getClass(), "first", null);
        setField(term155714, term155714.getClass(), "last", null);
        setField(term155714, term155714.getClass(), "propListHead", null);
        setIntField(term155714, term155714.getClass(), "sourcePosition", 0);
        setField(term155714, term155714.getClass(), "jsType", null);
        setField(term155714, term155714.getClass(), "parent", null);
        setField(term155713, term155713.getClass(), "first", term155714);
        setField(term155713, term155713.getClass(), "last", null);
        setField(term155713, term155713.getClass(), "propListHead", null);
        setIntField(term155713, term155713.getClass(), "sourcePosition", 0);
        setField(term155713, term155713.getClass(), "jsType", null);
        setField(term155713, term155713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term155393;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term155301, args);
        assertTrue(recursiveEquals(term155301, term155712));
        assertTrue(recursiveEquals(term155393, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


