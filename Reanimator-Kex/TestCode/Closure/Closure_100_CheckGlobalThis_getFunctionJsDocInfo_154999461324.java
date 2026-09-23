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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8192;
     Object term8262;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8192 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term8262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8358 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8454 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8358, term8358.getClass(), "type", 29);
        setField(term8358, term8358.getClass(), "objectValue", term8454);
        setField(term8262, term8262.getClass(), "propListHead", term8358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8262;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term8192, args);
    }

};


