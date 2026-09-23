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
import java.util.HashMap;

public class FunctionType_defineProperty_1349755729213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100740;
     Object term100890;
     Object term100988;
     Object term100992;

    public FunctionType_defineProperty_1349755729213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term100890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        HashMap term100990 = new HashMap();
        term100988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term100989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term100991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term100988, term100988.getClass(), "call", null);
        setField(term100989, term100989.getClass(), "ownerFunction", term100988);
        setField(term100989, term100989.getClass(), "className", null);
        setField(term100989, term100989.getClass(), "properties", term100990);
        setField(term100991, term100991.getClass(), "constructor", null);
        setField(term100991, term100991.getClass(), "className", null);
        setField(term100991, term100991.getClass(), "properties", null);
        setField(term100991, term100991.getClass(), "implicitPrototype", null);
        setBooleanField(term100991, term100991.getClass(), "nativeType", false);
        setBooleanField(term100991, term100991.getClass(), "visited", false);
        setField(term100991, term100991.getClass(), "docInfo", null);
        setBooleanField(term100991, term100991.getClass(), "unknown", false);
        setBooleanField(term100991, term100991.getClass(), "resolved", false);
        setField(term100991, term100991.getClass(), "resolveResult", null);
        setField(term100991, term100991.getClass(), "registry", null);
        setField(term100989, term100989.getClass(), "implicitPrototype", term100991);
        setBooleanField(term100989, term100989.getClass(), "nativeType", false);
        setBooleanField(term100989, term100989.getClass(), "visited", false);
        setField(term100989, term100989.getClass(), "docInfo", null);
        setBooleanField(term100989, term100989.getClass(), "unknown", true);
        setBooleanField(term100989, term100989.getClass(), "resolved", false);
        setField(term100989, term100989.getClass(), "resolveResult", null);
        setField(term100989, term100989.getClass(), "registry", null);
        setField(term100988, term100988.getClass(), "prototype", term100989);
        setField(term100988, term100988.getClass(), "kind", null);
        setField(term100988, term100988.getClass(), "typeOfThis", null);
        setField(term100988, term100988.getClass(), "source", null);
        setField(term100988, term100988.getClass(), "implementedInterfaces", null);
        setField(term100988, term100988.getClass(), "subTypes", null);
        setField(term100988, term100988.getClass(), "templateTypeName", null);
        setField(term100988, term100988.getClass(), "className", null);
        setField(term100988, term100988.getClass(), "properties", null);
        setField(term100988, term100988.getClass(), "implicitPrototype", null);
        setBooleanField(term100988, term100988.getClass(), "nativeType", false);
        setBooleanField(term100988, term100988.getClass(), "visited", false);
        setField(term100988, term100988.getClass(), "docInfo", null);
        setBooleanField(term100988, term100988.getClass(), "unknown", false);
        setBooleanField(term100988, term100988.getClass(), "resolved", false);
        setField(term100988, term100988.getClass(), "resolveResult", null);
        setField(term100988, term100988.getClass(), "registry", null);
        term100992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term100992, term100992.getClass(), "constructor", null);
        setField(term100992, term100992.getClass(), "className", null);
        setField(term100992, term100992.getClass(), "properties", null);
        setField(term100992, term100992.getClass(), "implicitPrototype", null);
        setBooleanField(term100992, term100992.getClass(), "nativeType", false);
        setBooleanField(term100992, term100992.getClass(), "visited", false);
        setField(term100992, term100992.getClass(), "docInfo", null);
        setBooleanField(term100992, term100992.getClass(), "unknown", false);
        setBooleanField(term100992, term100992.getClass(), "resolved", false);
        setField(term100992, term100992.getClass(), "resolveResult", null);
        setField(term100992, term100992.getClass(), "registry", null);
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
        args[1] = term100890;
        args[2] = false;
        args[3] = false;
        callMethod(klass, "defineProperty", argTypes, term100740, args);
        assertTrue(recursiveEquals(term100740, term100988));
        assertTrue(recursiveEquals(term100890, "prototype"));
    }

};


