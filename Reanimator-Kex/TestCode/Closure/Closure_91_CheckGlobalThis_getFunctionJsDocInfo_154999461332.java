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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckGlobalThis_getFunctionJsDocInfo_154999461332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9338;
     Object term9408;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9338 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term9408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9504 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9600 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9504, term9504.getClass(), "type", 29);
        setField(term9504, term9504.getClass(), "objectValue", term9600);
        setField(term9408, term9408.getClass(), "propListHead", term9504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9408;
        try {
            callMethod(klass, "getFunctionJsDocInfo", argTypes, term9338, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


