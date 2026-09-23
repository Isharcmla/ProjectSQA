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

public class SourceMap_setWrapperPrefix_80753460911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term728;

    public SourceMap_setWrapperPrefix_80753460911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112 = new ArrayList();
        term111 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term116 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term119 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term111, term111.getClass(), "mappings", term112);
        setIntField(term116, term116.getClass(), "lineNumber", 0);
        setIntField(term116, term116.getClass(), "characterIndex", 0);
        setField(term111, term111.getClass(), "offsetPosition", term116);
        setIntField(term119, term119.getClass(), "lineNumber", 0);
        setIntField(term119, term119.getClass(), "characterIndex", 0);
        setField(term111, term111.getClass(), "prefixPosition", term119);
        setField(term111, term111.getClass(), "lastSourceFile", "xxtlPwDYFs");
        setField(term111, term111.getClass(), "lastSourceFileEscaped", "jJCZpVmanW");
        ArrayList term729 = new ArrayList();
        term728 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term731 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term732 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term728, term728.getClass(), "mappings", term729);
        setIntField(term731, term731.getClass(), "lineNumber", 0);
        setIntField(term731, term731.getClass(), "characterIndex", 0);
        setField(term728, term728.getClass(), "offsetPosition", term731);
        setIntField(term732, term732.getClass(), "lineNumber", 0);
        setIntField(term732, term732.getClass(), "characterIndex", 10);
        setField(term728, term728.getClass(), "prefixPosition", term732);
        setField(term728, term728.getClass(), "lastSourceFile", "xxtlPwDYFs");
        setField(term728, term728.getClass(), "lastSourceFileEscaped", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "setWrapperPrefix", argTypes, term111, args);
        assertTrue(recursiveEquals(term111, term728));
    }

};


