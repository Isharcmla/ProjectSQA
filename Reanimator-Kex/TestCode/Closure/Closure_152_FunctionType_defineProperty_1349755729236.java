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
import java.lang.Object;

public class FunctionType_defineProperty_1349755729236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121033;
     Object term121185;
     Object term123600;
     Object term123604;

    public FunctionType_defineProperty_1349755729236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term121185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term123600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term123601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term123602 = newInstance(Class.forName("java.util.TreeMap"));
        Object term123603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term123600, term123600.getClass(), "call", null);
        setField(term123601, term123601.getClass(), "ownerFunction", term123600);
        setField(term123601, term123601.getClass(), "className", null);
        setField(term123602, term123602.getClass(), "comparator", null);
        setField(term123602, term123602.getClass(), "root", null);
        setIntField(term123602, term123602.getClass(), "size", 0);
        setIntField(term123602, term123602.getClass(), "modCount", 0);
        setField(term123602, term123602.getClass(), "entrySet", null);
        setField(term123602, term123602.getClass(), "navigableKeySet", null);
        setField(term123602, term123602.getClass(), "descendingMap", null);
        setField(term123602, term123602.getClass(), "keySet", null);
        setField(term123602, term123602.getClass(), "values", null);
        setField(term123601, term123601.getClass(), "properties", term123602);
        setBooleanField(term123601, term123601.getClass(), "nativeType", false);
        setField(term123603, term123603.getClass(), "className", null);
        setField(term123603, term123603.getClass(), "properties", null);
        setBooleanField(term123603, term123603.getClass(), "nativeType", false);
        setField(term123603, term123603.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term123603, term123603.getClass(), "prettyPrint", false);
        setBooleanField(term123603, term123603.getClass(), "visited", false);
        setField(term123603, term123603.getClass(), "docInfo", null);
        setBooleanField(term123603, term123603.getClass(), "unknown", false);
        setBooleanField(term123603, term123603.getClass(), "resolved", false);
        setField(term123603, term123603.getClass(), "resolveResult", null);
        setField(term123603, term123603.getClass(), "registry", null);
        setField(term123601, term123601.getClass(), "implicitPrototypeFallback", term123603);
        setBooleanField(term123601, term123601.getClass(), "prettyPrint", false);
        setBooleanField(term123601, term123601.getClass(), "visited", false);
        setField(term123601, term123601.getClass(), "docInfo", null);
        setBooleanField(term123601, term123601.getClass(), "unknown", true);
        setBooleanField(term123601, term123601.getClass(), "resolved", false);
        setField(term123601, term123601.getClass(), "resolveResult", null);
        setField(term123601, term123601.getClass(), "registry", null);
        setField(term123600, term123600.getClass(), "prototype", term123601);
        setField(term123600, term123600.getClass(), "kind", null);
        setField(term123600, term123600.getClass(), "typeOfThis", null);
        setField(term123600, term123600.getClass(), "source", null);
        setField(term123600, term123600.getClass(), "implementedInterfaces", null);
        setField(term123600, term123600.getClass(), "subTypes", null);
        setField(term123600, term123600.getClass(), "templateTypeName", null);
        setField(term123600, term123600.getClass(), "className", null);
        setField(term123600, term123600.getClass(), "properties", null);
        setBooleanField(term123600, term123600.getClass(), "nativeType", false);
        setField(term123600, term123600.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term123600, term123600.getClass(), "prettyPrint", false);
        setBooleanField(term123600, term123600.getClass(), "visited", false);
        setField(term123600, term123600.getClass(), "docInfo", null);
        setBooleanField(term123600, term123600.getClass(), "unknown", false);
        setBooleanField(term123600, term123600.getClass(), "resolved", false);
        setField(term123600, term123600.getClass(), "resolveResult", null);
        setField(term123600, term123600.getClass(), "registry", null);
        term123604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term123604, term123604.getClass(), "className", null);
        setField(term123604, term123604.getClass(), "properties", null);
        setBooleanField(term123604, term123604.getClass(), "nativeType", false);
        setField(term123604, term123604.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term123604, term123604.getClass(), "prettyPrint", false);
        setBooleanField(term123604, term123604.getClass(), "visited", false);
        setField(term123604, term123604.getClass(), "docInfo", null);
        setBooleanField(term123604, term123604.getClass(), "unknown", false);
        setBooleanField(term123604, term123604.getClass(), "resolved", false);
        setField(term123604, term123604.getClass(), "resolveResult", null);
        setField(term123604, term123604.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "prototype";
        args[1] = term121185;
        args[2] = false;
        args[3] = false;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term121033, args);
        assertTrue(recursiveEquals(term121033, term123600));
        assertTrue(recursiveEquals(term121185, "prototype"));
        assertTrue(recursiveEquals(retValue, true));
    }

};


