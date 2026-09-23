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

public class FunctionType_visit_1870685377193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87050;
     Object term87184;
     Object term87196;
     Object term87197;
     Object term87185;

    public FunctionType_visit_1870685377193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term87184 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$3"));
        term87196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term87196, term87196.getClass(), "call", null);
        setField(term87196, term87196.getClass(), "prototype", null);
        setField(term87196, term87196.getClass(), "kind", null);
        setField(term87196, term87196.getClass(), "typeOfThis", null);
        setField(term87196, term87196.getClass(), "source", null);
        setField(term87196, term87196.getClass(), "implementedInterfaces", null);
        setField(term87196, term87196.getClass(), "subTypes", null);
        setField(term87196, term87196.getClass(), "templateTypeName", null);
        setField(term87196, term87196.getClass(), "className", null);
        setField(term87196, term87196.getClass(), "properties", null);
        setField(term87196, term87196.getClass(), "implicitPrototype", null);
        setBooleanField(term87196, term87196.getClass(), "nativeType", false);
        setBooleanField(term87196, term87196.getClass(), "visited", false);
        setField(term87196, term87196.getClass(), "docInfo", null);
        setBooleanField(term87196, term87196.getClass(), "unknown", false);
        setBooleanField(term87196, term87196.getClass(), "resolved", false);
        setField(term87196, term87196.getClass(), "resolveResult", null);
        setField(term87196, term87196.getClass(), "registry", null);
        term87197 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$3"));
        setField(term87197, term87197.getClass(), "this$0", null);
        setField(term87197, term87197.getClass(), "this$0", null);
        term87185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term87185, term87185.getClass(), "call", null);
        setField(term87185, term87185.getClass(), "prototype", null);
        setField(term87185, term87185.getClass(), "kind", null);
        setField(term87185, term87185.getClass(), "typeOfThis", null);
        setField(term87185, term87185.getClass(), "source", null);
        setField(term87185, term87185.getClass(), "implementedInterfaces", null);
        setField(term87185, term87185.getClass(), "subTypes", null);
        setField(term87185, term87185.getClass(), "templateTypeName", null);
        setField(term87185, term87185.getClass(), "className", null);
        setField(term87185, term87185.getClass(), "properties", null);
        setField(term87185, term87185.getClass(), "implicitPrototype", null);
        setBooleanField(term87185, term87185.getClass(), "nativeType", false);
        setBooleanField(term87185, term87185.getClass(), "visited", false);
        setField(term87185, term87185.getClass(), "docInfo", null);
        setBooleanField(term87185, term87185.getClass(), "unknown", false);
        setBooleanField(term87185, term87185.getClass(), "resolved", false);
        setField(term87185, term87185.getClass(), "resolveResult", null);
        setField(term87185, term87185.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term87184;
        Object retValue = callMethod(klass, "visit", argTypes, term87050, args);
        assertTrue(recursiveEquals(term87050, term87196));
        assertTrue(recursiveEquals(term87184, term87197));
        assertTrue(recursiveEquals(retValue, term87185));
    }

};


