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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9166;
     Object term9256;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9166 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term9256 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term9352 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9442 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term9352, term9352.getClass(), "type", -30);
        setField(term9352, term9352.getClass(), "next", null);
        setField(term9256, term9256.getClass(), "propListHead", term9352);
        setField(term9256, term9256.getClass(), "parent", term9442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9256;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term9166, args);
    }

};


