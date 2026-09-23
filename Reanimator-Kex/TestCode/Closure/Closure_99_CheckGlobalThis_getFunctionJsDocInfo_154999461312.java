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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5266;
     Object term5336;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5266 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term5336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5432 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5432, term5432.getClass(), "type", -30);
        setField(term5432, term5432.getClass(), "next", null);
        setField(term5336, term5336.getClass(), "propListHead", term5432);
        setField(term5336, term5336.getClass(), "parent", term5502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5336;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term5266, args);
    }

};


