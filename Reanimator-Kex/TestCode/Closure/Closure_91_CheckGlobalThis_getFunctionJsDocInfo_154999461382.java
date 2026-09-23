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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24439;
     Object term24531;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24439 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term24531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24627 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24719 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24627, term24627.getClass(), "type", -30);
        setField(term24627, term24627.getClass(), "next", null);
        setField(term24531, term24531.getClass(), "propListHead", term24627);
        setField(term24531, term24531.getClass(), "parent", term24719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24531;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term24439, args);
    }

};


