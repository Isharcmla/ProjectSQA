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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17259;
     Object term17351;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17259 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term17351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17447 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17447, term17447.getClass(), "type", 29);
        setField(term17447, term17447.getClass(), "objectValue", null);
        setField(term17351, term17351.getClass(), "propListHead", term17447);
        setField(term17351, term17351.getClass(), "parent", term17539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17351;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term17259, args);
    }

};


