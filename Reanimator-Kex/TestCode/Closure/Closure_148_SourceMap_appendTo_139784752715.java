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

public class SourceMap_appendTo_139784752715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357;

    public SourceMap_appendTo_139784752715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term358 = new ArrayList();
        term357 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term362 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term365 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term357, term357.getClass(), "mappings", term358);
        setIntField(term362, term362.getClass(), "lineNumber", 0);
        setIntField(term362, term362.getClass(), "characterIndex", 0);
        setField(term357, term357.getClass(), "offsetPosition", term362);
        setIntField(term365, term365.getClass(), "lineNumber", 0);
        setIntField(term365, term365.getClass(), "characterIndex", 0);
        setField(term357, term357.getClass(), "prefixPosition", term365);
        setField(term357, term357.getClass(), "lastSourceFile", "MxlszYVzRf");
        setField(term357, term357.getClass(), "lastSourceFileEscaped", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "oVcInYnLWB";
        try {
            callMethod(klass, "appendTo", argTypes, term357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


