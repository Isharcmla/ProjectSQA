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

public class TypedScopeCreator_getBestJSDocInfo_31142267246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12651;

    public TypedScopeCreator_getBestJSDocInfo_31142267246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12747 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12843 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12747, term12747.getClass(), "type", 29);
        setField(term12747, term12747.getClass(), "objectValue", term12843);
        setField(term12651, term12651.getClass(), "propListHead", term12747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12651;
        callMethod(klass, "getBestJSDocInfo", argTypes, null, args);
    }

};


