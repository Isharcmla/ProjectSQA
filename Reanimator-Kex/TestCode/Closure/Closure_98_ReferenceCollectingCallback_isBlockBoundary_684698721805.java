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

public class ReferenceCollectingCallback_isBlockBoundary_684698721805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213706;
     Object term213721;

    public ReferenceCollectingCallback_isBlockBoundary_684698721805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213706 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term213706, term213706.getClass(), "type", 77);
        term213721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term213721, term213721.getClass(), "functionName", null);
        setBooleanField(term213721, term213721.getClass(), "itsNeedsActivation", false);
        setIntField(term213721, term213721.getClass(), "itsFunctionType", 0);
        setBooleanField(term213721, term213721.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term213721, term213721.getClass(), "encodedSourceStart", 0);
        setIntField(term213721, term213721.getClass(), "encodedSourceEnd", 0);
        setField(term213721, term213721.getClass(), "sourceName", null);
        setIntField(term213721, term213721.getClass(), "baseLineno", 0);
        setIntField(term213721, term213721.getClass(), "endLineno", 0);
        setField(term213721, term213721.getClass(), "functions", null);
        setField(term213721, term213721.getClass(), "regexps", null);
        setField(term213721, term213721.getClass(), "itsVariables", null);
        setField(term213721, term213721.getClass(), "itsConst", null);
        setField(term213721, term213721.getClass(), "itsVariableNames", null);
        setIntField(term213721, term213721.getClass(), "varStart", 0);
        setField(term213721, term213721.getClass(), "compilerData", null);
        setIntField(term213721, term213721.getClass(), "type", 77);
        setField(term213721, term213721.getClass(), "next", null);
        setField(term213721, term213721.getClass(), "first", null);
        setField(term213721, term213721.getClass(), "last", null);
        setField(term213721, term213721.getClass(), "propListHead", null);
        setIntField(term213721, term213721.getClass(), "sourcePosition", 0);
        setField(term213721, term213721.getClass(), "jsType", null);
        setField(term213721, term213721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term213706;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term213706, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


