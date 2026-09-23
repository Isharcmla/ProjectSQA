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

public class SourceMap_findLastLine_195484416214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302;
     Object term1024;

    public SourceMap_findLastLine_195484416214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term303 = new ArrayList();
        term302 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term307 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term310 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term302, term302.getClass(), "mappings", term303);
        setIntField(term307, term307.getClass(), "lineNumber", 0);
        setIntField(term307, term307.getClass(), "characterIndex", 0);
        setField(term302, term302.getClass(), "offsetPosition", term307);
        setIntField(term310, term310.getClass(), "lineNumber", 0);
        setIntField(term310, term310.getClass(), "characterIndex", 0);
        setField(term302, term302.getClass(), "prefixPosition", term310);
        setField(term302, term302.getClass(), "lastSourceFile", "NRdvgJlhkX");
        setField(term302, term302.getClass(), "lastSourceFileEscaped", "uuaPigETmJ");
        ArrayList term1025 = new ArrayList();
        term1024 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term1027 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term1028 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term1024, term1024.getClass(), "mappings", term1025);
        setIntField(term1027, term1027.getClass(), "lineNumber", 0);
        setIntField(term1027, term1027.getClass(), "characterIndex", 0);
        setField(term1024, term1024.getClass(), "offsetPosition", term1027);
        setIntField(term1028, term1028.getClass(), "lineNumber", 0);
        setIntField(term1028, term1028.getClass(), "characterIndex", 0);
        setField(term1024, term1024.getClass(), "prefixPosition", term1028);
        setField(term1024, term1024.getClass(), "lastSourceFile", "NRdvgJlhkX");
        setField(term1024, term1024.getClass(), "lastSourceFileEscaped", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "findLastLine", argTypes, term302, args);
        assertTrue(recursiveEquals(term302, term1024));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


