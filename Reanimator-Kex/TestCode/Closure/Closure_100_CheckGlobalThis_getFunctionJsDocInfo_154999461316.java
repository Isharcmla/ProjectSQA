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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6174;
     Object term6244;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6174 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term6244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6340 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6340, term6340.getClass(), "type", -30);
        setField(term6340, term6340.getClass(), "next", term6340);
        setField(term6244, term6244.getClass(), "propListHead", term6340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6244;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term6174, args);
    }

};


