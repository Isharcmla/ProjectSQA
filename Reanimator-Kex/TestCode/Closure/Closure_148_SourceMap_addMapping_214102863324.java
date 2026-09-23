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

public class SourceMap_addMapping_214102863324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3943;
     Object term4013;

    public SourceMap_addMapping_214102863324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3943 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        term4013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4109 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4109, term4109.getClass(), "type", -39);
        setField(term4109, term4109.getClass(), "next", term4109);
        setField(term4013, term4013.getClass(), "propListHead", term4109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Position");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Position");
        Object[] args = new Object[3];
        args[0] = term4013;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addMapping", argTypes, term3943, args);
    }

};


