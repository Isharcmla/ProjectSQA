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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22485;
     Object term22571;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22485 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term22571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term22667 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term22753 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term22839 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term22667, term22667.getClass(), "type", -30);
        setField(term22667, term22667.getClass(), "next", null);
        setField(term22571, term22571.getClass(), "propListHead", term22667);
        setIntField(term22753, term22753.getClass(), "type", 38);
        setField(term22753, term22753.getClass(), "propListHead", null);
        setField(term22753, term22753.getClass(), "parent", term22839);
        setField(term22571, term22571.getClass(), "parent", term22753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22571;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term22485, args);
    }

};


