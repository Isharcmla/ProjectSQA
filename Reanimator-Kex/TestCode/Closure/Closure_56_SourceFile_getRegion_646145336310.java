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

public class SourceFile_getRegion_646145336310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54088;
     Object term54573;

    public SourceFile_getRegion_646145336310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54088 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term54088, term54088.getClass(), "code", "");
        term54573 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term54573, term54573.getClass(), "fileName", null);
        setBooleanField(term54573, term54573.getClass(), "isExternFile", false);
        setField(term54573, term54573.getClass(), "originalPath", null);
        setField(term54573, term54573.getClass(), "lineOffsets", null);
        setIntField(term54573, term54573.getClass(), "lastOffset", 0);
        setIntField(term54573, term54573.getClass(), "lastLine", 0);
        setField(term54573, term54573.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 4;
        Object retValue = callMethod(klass, "getRegion", argTypes, term54088, args);
        assertTrue(recursiveEquals(term54088, term54573));
        assertTrue(recursiveEquals(retValue, null));
    }

};


