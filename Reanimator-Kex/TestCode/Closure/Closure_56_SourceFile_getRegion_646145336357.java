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

public class SourceFile_getRegion_646145336357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61593;
     Object term61645;

    public SourceFile_getRegion_646145336357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61593 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term61593, term61593.getClass(), "code", "");
        term61645 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term61645, term61645.getClass(), "fileName", null);
        setBooleanField(term61645, term61645.getClass(), "isExternFile", false);
        setField(term61645, term61645.getClass(), "originalPath", null);
        setField(term61645, term61645.getClass(), "lineOffsets", null);
        setIntField(term61645, term61645.getClass(), "lastOffset", 0);
        setIntField(term61645, term61645.getClass(), "lastLine", 0);
        setField(term61645, term61645.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "getRegion", argTypes, term61593, args);
        assertTrue(recursiveEquals(term61593, term61645));
        assertTrue(recursiveEquals(retValue, null));
    }

};


