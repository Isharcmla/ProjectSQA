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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class SourceMap_appendTo_139784752712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public SourceMap_appendTo_139784752712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term116 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term116, term116.getClass(), "prefix", "");
        setField(term116, term116.getClass(), "replacement", "");
        Object term119 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term119, term119.getClass(), "prefix", "");
        setField(term119, term119.getClass(), "replacement", "");
        Object term122 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term122, term122.getClass(), "prefix", "");
        setField(term122, term122.getClass(), "replacement", "");
        ArrayList term114 = new ArrayList();
        ((ArrayList) term114).add(term116);
        ((ArrayList) term114).add(term119);
        ((ArrayList) term114).add(term122);
        HashMap term127 = new HashMap();
        term113 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term113, term113.getClass(), "generator", null);
        setField(term113, term113.getClass(), "prefixMappings", term114);
        setField(term113, term113.getClass(), "sourceLocationFixupCache", term127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "dWRymuLBtr";
        try {
            callMethod(klass, "appendTo", argTypes, term113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


