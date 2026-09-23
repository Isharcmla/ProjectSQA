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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14354;
     Object term14424;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14354 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term14424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14520 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14520, term14520.getClass(), "type", 29);
        setField(term14520, term14520.getClass(), "objectValue", null);
        setField(term14424, term14424.getClass(), "propListHead", term14520);
        setIntField(term14590, term14590.getClass(), "type", 86);
        setField(term14424, term14424.getClass(), "parent", term14590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14424;
        callMethod(klass, "getFunctionJsDocInfo", argTypes, term14354, args);
    }

};


