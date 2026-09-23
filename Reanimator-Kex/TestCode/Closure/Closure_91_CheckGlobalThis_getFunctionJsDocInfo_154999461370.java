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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20495;
     Object term20581;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20495 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term20581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term20677 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20677, term20677.getClass(), "type", -30);
        setField(term20677, term20677.getClass(), "next", null);
        setField(term20581, term20581.getClass(), "propListHead", term20677);
        setField(term20581, term20581.getClass(), "parent", term20763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20581;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term20495, args);
    }

};


