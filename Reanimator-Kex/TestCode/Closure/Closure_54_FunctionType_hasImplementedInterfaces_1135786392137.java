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
import java.util.ArrayList;

public class FunctionType_hasImplementedInterfaces_1135786392137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68621;
     Object term68690;

    public FunctionType_hasImplementedInterfaces_1135786392137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term68673 = new ArrayList();
        term68621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term68621, term68621.getClass(), "implementedInterfaces", term68673);
        ArrayList term68691 = new ArrayList();
        term68690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term68690, term68690.getClass(), "call", null);
        setField(term68690, term68690.getClass(), "prototype", null);
        setField(term68690, term68690.getClass(), "prototypeSlot", null);
        setField(term68690, term68690.getClass(), "kind", null);
        setField(term68690, term68690.getClass(), "typeOfThis", null);
        setField(term68690, term68690.getClass(), "source", null);
        setField(term68690, term68690.getClass(), "implementedInterfaces", term68691);
        setField(term68690, term68690.getClass(), "extendedInterfaces", null);
        setField(term68690, term68690.getClass(), "subTypes", null);
        setField(term68690, term68690.getClass(), "templateTypeName", null);
        setField(term68690, term68690.getClass(), "className", null);
        setField(term68690, term68690.getClass(), "properties", null);
        setBooleanField(term68690, term68690.getClass(), "nativeType", false);
        setField(term68690, term68690.getClass(), "implicitPrototypeFallback", null);
        setField(term68690, term68690.getClass(), "ownerFunction", null);
        setBooleanField(term68690, term68690.getClass(), "prettyPrint", false);
        setBooleanField(term68690, term68690.getClass(), "visited", false);
        setField(term68690, term68690.getClass(), "docInfo", null);
        setBooleanField(term68690, term68690.getClass(), "unknown", false);
        setBooleanField(term68690, term68690.getClass(), "resolved", false);
        setField(term68690, term68690.getClass(), "resolveResult", null);
        setField(term68690, term68690.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasImplementedInterfaces", argTypes, term68621, args);
        assertTrue(recursiveEquals(term68621, term68690));
        assertTrue(recursiveEquals(retValue, false));
    }

};


