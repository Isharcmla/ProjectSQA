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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25116;
     Object term25206;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25116 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term25206 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term25302 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term25372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25462 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term25302, term25302.getClass(), "type", -30);
        setField(term25302, term25302.getClass(), "next", null);
        setField(term25206, term25206.getClass(), "propListHead", term25302);
        setIntField(term25372, term25372.getClass(), "type", 38);
        setField(term25372, term25372.getClass(), "propListHead", null);
        setField(term25372, term25372.getClass(), "parent", term25462);
        setField(term25206, term25206.getClass(), "parent", term25372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25206;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term25116, args);
    }

};


