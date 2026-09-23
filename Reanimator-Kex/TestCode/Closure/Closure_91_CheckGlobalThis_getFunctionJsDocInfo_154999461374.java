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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21588;
     Object term21680;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21588 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term21680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21776 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21776, term21776.getClass(), "type", -30);
        setField(term21776, term21776.getClass(), "next", null);
        setField(term21680, term21680.getClass(), "propListHead", term21776);
        setIntField(term21868, term21868.getClass(), "type", 38);
        setField(term21868, term21868.getClass(), "propListHead", null);
        setField(term21868, term21868.getClass(), "parent", term21960);
        setField(term21680, term21680.getClass(), "parent", term21868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21680;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term21588, args);
    }

};


