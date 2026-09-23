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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12194;
     Object term12264;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12194 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term12264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12360 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12360, term12360.getClass(), "type", -30);
        setField(term12360, term12360.getClass(), "next", null);
        setField(term12264, term12264.getClass(), "propListHead", term12360);
        setIntField(term12430, term12430.getClass(), "type", 38);
        setField(term12430, term12430.getClass(), "propListHead", null);
        setIntField(term12500, term12500.getClass(), "type", 118);
        setField(term12430, term12430.getClass(), "parent", term12500);
        setField(term12264, term12264.getClass(), "parent", term12430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12264;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term12194, args);
    }

};


