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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17664;
     Object term17754;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17664 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term17754 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term17850 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17940 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term17850, term17850.getClass(), "type", -30);
        setField(term17850, term17850.getClass(), "next", null);
        setField(term17754, term17754.getClass(), "propListHead", term17850);
        setField(term17754, term17754.getClass(), "parent", term17940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17754;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term17664, args);
    }

};


