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
import java.lang.Object;

public class SourceFile_fromFile_62405974247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4832;

    public SourceFile_fromFile_62405974247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4832 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term4833 = newInstance(Class.forName("java.io.File"));
        setField(term4833, term4833.getClass(), "path", "YRHGsAkhxb");
        setField(term4833, term4833.getClass(), "status", null);
        setIntField(term4833, term4833.getClass(), "prefixLength", 0);
        setField(term4833, term4833.getClass(), "filePath", null);
        setField(term4832, term4832.getClass(), "file", term4833);
        setField(term4832, term4832.getClass(), "inputCharset", "UTF-8");
        setField(term4832, term4832.getClass(), "fileName", "YRHGsAkhxb");
        setBooleanField(term4832, term4832.getClass(), "isExternFile", false);
        setField(term4832, term4832.getClass(), "originalPath", null);
        setField(term4832, term4832.getClass(), "lineOffsets", null);
        setIntField(term4832, term4832.getClass(), "lastOffset", 0);
        setIntField(term4832, term4832.getClass(), "lastLine", 1);
        setField(term4832, term4832.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        Object retValue = callMethod(klass, "fromFile", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4832));
    }

};


