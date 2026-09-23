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
import java.lang.Object;

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124854;
     Object term125164;
     Object term125490;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124854 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term124960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term125064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term124854, term124854.getClass(), "returnType", term124960);
        setField(term124854, term124854.getClass(), "typeRegistry", term125064);
        term125164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term125258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term125328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125258, term125258.getClass(), "returnType", null);
        setField(term125328, term125328.getClass(), "first", term125398);
        setField(term125258, term125258.getClass(), "parameters", term125328);
        setField(term125164, term125164.getClass(), "call", term125258);
        term125490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125582, term125582.getClass(), "next", term125652);
        setField(term125490, term125490.getClass(), "first", term125582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term125164;
        args[1] = term125490;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term124854, args);
    }

};


