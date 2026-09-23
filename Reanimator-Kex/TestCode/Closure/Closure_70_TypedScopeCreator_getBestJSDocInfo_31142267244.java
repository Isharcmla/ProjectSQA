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

public class TypedScopeCreator_getBestJSDocInfo_31142267244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12314;

    public TypedScopeCreator_getBestJSDocInfo_31142267244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12410 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12410, term12410.getClass(), "type", -30);
        setField(term12410, term12410.getClass(), "next", term12410);
        setField(term12314, term12314.getClass(), "propListHead", term12410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12314;
        callMethod(klass, "getBestJSDocInfo", argTypes, null, args);
    }

};


