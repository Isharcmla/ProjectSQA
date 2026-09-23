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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4762;
     Object term4832;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4762 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term4832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4928 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4928, term4928.getClass(), "type", -30);
        setField(term4928, term4928.getClass(), "next", term4928);
        setField(term4832, term4832.getClass(), "propListHead", term4928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4832;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term4762, args);
    }

};


