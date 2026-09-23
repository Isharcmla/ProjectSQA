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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10227;
     Object term10313;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10227 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term10313 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term10409 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10495 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term10409, term10409.getClass(), "type", -30);
        setField(term10409, term10409.getClass(), "next", null);
        setField(term10313, term10313.getClass(), "propListHead", term10409);
        setField(term10313, term10313.getClass(), "parent", term10495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10313;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term10227, args);
    }

};


