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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6660;
     Object term6730;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6660 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term6730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6826 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6826, term6826.getClass(), "type", -30);
        setField(term6826, term6826.getClass(), "next", null);
        setField(term6730, term6730.getClass(), "propListHead", term6826);
        setIntField(term6896, term6896.getClass(), "type", 38);
        setField(term6730, term6730.getClass(), "parent", term6896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6730;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term6660, args);
    }

};


