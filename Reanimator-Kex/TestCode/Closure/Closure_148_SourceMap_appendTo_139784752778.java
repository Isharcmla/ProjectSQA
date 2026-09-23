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
import java.util.ArrayList;
import java.lang.Object;

public class SourceMap_appendTo_139784752778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77022;
     Object term77192;

    public SourceMap_appendTo_139784752778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term77074 = new ArrayList();
        term77022 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term77154 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term77022, term77022.getClass(), "mappings", term77074);
        setIntField(term77154, term77154.getClass(), "lineNumber", 0);
        setField(term77022, term77022.getClass(), "prefixPosition", term77154);
        term77192 = newInstance(Class.forName("java.io.Writer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term77192;
        args[1] = null;
        callMethod(klass, "appendTo", argTypes, term77022, args);
    }

};


