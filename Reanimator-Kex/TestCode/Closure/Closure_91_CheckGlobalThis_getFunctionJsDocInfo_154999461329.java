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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8706;
     Object term8776;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8706 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term8776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8872 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8872, term8872.getClass(), "type", 29);
        setField(term8872, term8872.getClass(), "objectValue", null);
        setField(term8776, term8776.getClass(), "propListHead", term8872);
        setIntField(term8942, term8942.getClass(), "type", 38);
        setField(term8776, term8776.getClass(), "parent", term8942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8776;
        try {
            callMethod(klass, "getFunctionJsDocInfo", argTypes, term8706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


