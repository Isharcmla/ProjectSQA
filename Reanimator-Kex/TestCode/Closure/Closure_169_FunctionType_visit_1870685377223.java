package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class FunctionType_visit_1870685377223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232832;
     Object term232976;
     Object term232992;
     Object term232993;
     Object term232977;

    public FunctionType_visit_1870685377223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term232976 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$2"));
        term232992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term232992, term232992.getClass(), "call", null);
        setField(term232992, term232992.getClass(), "prototypeSlot", null);
        setField(term232992, term232992.getClass(), "kind", null);
        setField(term232992, term232992.getClass(), "propAccess", null);
        setField(term232992, term232992.getClass(), "typeOfThis", null);
        setField(term232992, term232992.getClass(), "source", null);
        setField(term232992, term232992.getClass(), "implementedInterfaces", null);
        setField(term232992, term232992.getClass(), "extendedInterfaces", null);
        setField(term232992, term232992.getClass(), "subTypes", null);
        setField(term232992, term232992.getClass(), "templateTypeNames", null);
        setField(term232992, term232992.getClass(), "className", null);
        setField(term232992, term232992.getClass(), "properties", null);
        setBooleanField(term232992, term232992.getClass(), "nativeType", false);
        setField(term232992, term232992.getClass(), "implicitPrototypeFallback", null);
        setField(term232992, term232992.getClass(), "ownerFunction", null);
        setBooleanField(term232992, term232992.getClass(), "prettyPrint", false);
        setBooleanField(term232992, term232992.getClass(), "visited", false);
        setField(term232992, term232992.getClass(), "docInfo", null);
        setBooleanField(term232992, term232992.getClass(), "unknown", false);
        setBooleanField(term232992, term232992.getClass(), "resolved", false);
        setField(term232992, term232992.getClass(), "resolveResult", null);
        setBooleanField(term232992, term232992.getClass(), "inTemplatedCheckVisit", false);
        setField(term232992, term232992.getClass(), "registry", null);
        term232993 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$2"));
        setField(term232993, term232993.getClass(), "this$0", null);
        setField(term232993, term232993.getClass(), "this$0", null);
        term232977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term232977, term232977.getClass(), "call", null);
        setField(term232977, term232977.getClass(), "prototypeSlot", null);
        setField(term232977, term232977.getClass(), "kind", null);
        setField(term232977, term232977.getClass(), "propAccess", null);
        setField(term232977, term232977.getClass(), "typeOfThis", null);
        setField(term232977, term232977.getClass(), "source", null);
        setField(term232977, term232977.getClass(), "implementedInterfaces", null);
        setField(term232977, term232977.getClass(), "extendedInterfaces", null);
        setField(term232977, term232977.getClass(), "subTypes", null);
        setField(term232977, term232977.getClass(), "templateTypeNames", null);
        setField(term232977, term232977.getClass(), "className", null);
        setField(term232977, term232977.getClass(), "properties", null);
        setBooleanField(term232977, term232977.getClass(), "nativeType", false);
        setField(term232977, term232977.getClass(), "implicitPrototypeFallback", null);
        setField(term232977, term232977.getClass(), "ownerFunction", null);
        setBooleanField(term232977, term232977.getClass(), "prettyPrint", false);
        setBooleanField(term232977, term232977.getClass(), "visited", false);
        setField(term232977, term232977.getClass(), "docInfo", null);
        setBooleanField(term232977, term232977.getClass(), "unknown", false);
        setBooleanField(term232977, term232977.getClass(), "resolved", false);
        setField(term232977, term232977.getClass(), "resolveResult", null);
        setBooleanField(term232977, term232977.getClass(), "inTemplatedCheckVisit", false);
        setField(term232977, term232977.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term232976;
        Object retValue = callMethod(klass, "visit", argTypes, term232832, args);
        assertTrue(recursiveEquals(term232832, term232992));
        assertTrue(recursiveEquals(term232976, term232993));
        assertTrue(recursiveEquals(retValue, term232977));
    }

};


