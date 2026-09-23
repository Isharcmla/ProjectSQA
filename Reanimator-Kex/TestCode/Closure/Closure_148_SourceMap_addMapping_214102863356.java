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

public class SourceMap_addMapping_214102863356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62690;
     Object term62760;

    public SourceMap_addMapping_214102863356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62690 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        term62760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62856 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term62856, term62856.getClass(), "type", 38);
        setField(term62760, term62760.getClass(), "propListHead", term62856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Position");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Position");
        Object[] args = new Object[3];
        args[0] = term62760;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addMapping", argTypes, term62690, args);
    }

};


