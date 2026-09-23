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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7374;
     Object term7444;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7374 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term7444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7540 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7540, term7540.getClass(), "type", 29);
        setField(term7444, term7444.getClass(), "propListHead", term7540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7444;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term7374, args);
    }

};


