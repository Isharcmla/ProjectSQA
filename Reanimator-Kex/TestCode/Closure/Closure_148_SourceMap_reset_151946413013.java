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
import java.util.ArrayList;
import java.lang.Object;

public class SourceMap_reset_151946413013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term934;

    public SourceMap_reset_151946413013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term248 = new ArrayList();
        term247 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term252 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term255 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term247, term247.getClass(), "mappings", term248);
        setIntField(term252, term252.getClass(), "lineNumber", 0);
        setIntField(term252, term252.getClass(), "characterIndex", 0);
        setField(term247, term247.getClass(), "offsetPosition", term252);
        setIntField(term255, term255.getClass(), "lineNumber", 0);
        setIntField(term255, term255.getClass(), "characterIndex", 0);
        setField(term247, term247.getClass(), "prefixPosition", term255);
        setField(term247, term247.getClass(), "lastSourceFile", "hRNSzYYIrc");
        setField(term247, term247.getClass(), "lastSourceFileEscaped", "RMFIsYGgne");
        ArrayList term935 = new ArrayList();
        term934 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term937 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term938 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term934, term934.getClass(), "mappings", term935);
        setIntField(term937, term937.getClass(), "lineNumber", 0);
        setIntField(term937, term937.getClass(), "characterIndex", 0);
        setField(term934, term934.getClass(), "offsetPosition", term937);
        setIntField(term938, term938.getClass(), "lineNumber", 0);
        setIntField(term938, term938.getClass(), "characterIndex", 0);
        setField(term934, term934.getClass(), "prefixPosition", term938);
        setField(term934, term934.getClass(), "lastSourceFile", "hRNSzYYIrc");
        setField(term934, term934.getClass(), "lastSourceFileEscaped", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term247, args);
        assertTrue(recursiveEquals(term247, term934));
    }

};


