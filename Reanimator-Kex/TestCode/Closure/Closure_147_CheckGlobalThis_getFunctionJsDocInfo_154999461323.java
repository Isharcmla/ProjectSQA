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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7024;
     Object term7094;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7024 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term7094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7190 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7190, term7190.getClass(), "type", -30);
        setField(term7190, term7190.getClass(), "next", null);
        setField(term7094, term7094.getClass(), "propListHead", term7190);
        setIntField(term7260, term7260.getClass(), "type", 86);
        setField(term7094, term7094.getClass(), "parent", term7260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7094;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term7024, args);
    }

};


