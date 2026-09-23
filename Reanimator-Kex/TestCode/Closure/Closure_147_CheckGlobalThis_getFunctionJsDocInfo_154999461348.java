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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13144;
     Object term13236;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13144 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term13236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term13332 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term13332, term13332.getClass(), "type", -30);
        setField(term13332, term13332.getClass(), "next", null);
        setField(term13236, term13236.getClass(), "propListHead", term13332);
        setField(term13236, term13236.getClass(), "parent", term13424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13236;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term13144, args);
    }

};


