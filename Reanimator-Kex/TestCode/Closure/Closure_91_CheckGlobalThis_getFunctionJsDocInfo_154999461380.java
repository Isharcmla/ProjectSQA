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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23840;
     Object term23932;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23840 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term23932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term24028 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term24028, term24028.getClass(), "type", -30);
        setField(term24028, term24028.getClass(), "next", null);
        setField(term23932, term23932.getClass(), "propListHead", term24028);
        setField(term23932, term23932.getClass(), "parent", term24120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23932;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term23840, args);
    }

};


