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

public class SourceFile_getRegion_646145336355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61387;
     Object term61464;

    public SourceFile_getRegion_646145336355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61387 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term61387, term61387.getClass(), "code", "");
        term61464 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term61464, term61464.getClass(), "file", null);
        setField(term61464, term61464.getClass(), "inputCharset", null);
        setField(term61464, term61464.getClass(), "fileName", null);
        setBooleanField(term61464, term61464.getClass(), "isExternFile", false);
        setField(term61464, term61464.getClass(), "originalPath", null);
        setField(term61464, term61464.getClass(), "lineOffsets", null);
        setIntField(term61464, term61464.getClass(), "lastOffset", 0);
        setIntField(term61464, term61464.getClass(), "lastLine", 0);
        setField(term61464, term61464.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 4;
        Object retValue = callMethod(klass, "getRegion", argTypes, term61387, args);
        assertTrue(recursiveEquals(term61387, term61464));
        assertTrue(recursiveEquals(retValue, null));
    }

};


