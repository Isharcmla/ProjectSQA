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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypedScopeCreator_getBestJSDocInfo_31142267236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10376;
     Object term10588;

    public TypedScopeCreator_getBestJSDocInfo_31142267236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10472 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10472, term10472.getClass(), "type", -30);
        setField(term10472, term10472.getClass(), "next", null);
        setField(term10376, term10376.getClass(), "propListHead", term10472);
        setField(term10376, term10376.getClass(), "parent", term10376);
        term10588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10589 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10588, term10588.getClass(), "type", 0);
        setField(term10588, term10588.getClass(), "next", null);
        setField(term10588, term10588.getClass(), "first", null);
        setField(term10588, term10588.getClass(), "last", null);
        setField(term10589, term10589.getClass(), "next", null);
        setIntField(term10589, term10589.getClass(), "type", -30);
        setIntField(term10589, term10589.getClass(), "intValue", 0);
        setField(term10589, term10589.getClass(), "objectValue", null);
        setField(term10588, term10588.getClass(), "propListHead", term10589);
        setIntField(term10588, term10588.getClass(), "sourcePosition", 0);
        setField(term10588, term10588.getClass(), "jsType", null);
        setField(term10588, term10588.getClass(), "parent", term10588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10376;
        Object retValue = callMethod(klass, "getBestJSDocInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term10376, term10588));
        assertTrue(recursiveEquals(retValue, null));
    }

};


