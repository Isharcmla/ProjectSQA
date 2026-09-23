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

public class TypedScopeCreator_getBestJSDocInfo_31142267251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13591;

    public TypedScopeCreator_getBestJSDocInfo_31142267251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13687 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13687, term13687.getClass(), "type", 29);
        setField(term13687, term13687.getClass(), "objectValue", null);
        setField(term13591, term13591.getClass(), "propListHead", term13687);
        setField(term13591, term13591.getClass(), "parent", term13591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13591;
        callMethod(klass, "getBestJSDocInfo", argTypes, null, args);
    }

};


