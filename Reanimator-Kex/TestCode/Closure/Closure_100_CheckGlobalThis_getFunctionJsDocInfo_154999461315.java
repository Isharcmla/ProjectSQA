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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckGlobalThis_getFunctionJsDocInfo_154999461315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5630;
     Object term5700;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5630 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term5700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5796 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5796, term5796.getClass(), "type", 29);
        setField(term5700, term5700.getClass(), "propListHead", term5796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5700;
        try {
            callMethod(klass, "getFunctionJsDocInfo", argTypes, term5630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


