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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11141;
     Object term11211;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11141 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term11211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11307 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11307, term11307.getClass(), "type", -30);
        setField(term11307, term11307.getClass(), "next", term11307);
        setField(term11211, term11211.getClass(), "propListHead", term11307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11211;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term11141, args);
    }

};


