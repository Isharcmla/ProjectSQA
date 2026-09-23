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

public class SourceFile_fromFile_177668135346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4685;

    public SourceFile_fromFile_177668135346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4685 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term4686 = newInstance(Class.forName("java.io.File"));
        setField(term4686, term4686.getClass(), "path", "onpbIeEKoi");
        setField(term4686, term4686.getClass(), "status", null);
        setIntField(term4686, term4686.getClass(), "prefixLength", 0);
        setField(term4686, term4686.getClass(), "filePath", null);
        setField(term4685, term4685.getClass(), "file", term4686);
        setField(term4685, term4685.getClass(), "inputCharset", "UTF-8");
        setField(term4685, term4685.getClass(), "fileName", "onpbIeEKoi");
        setBooleanField(term4685, term4685.getClass(), "isExternFile", false);
        setField(term4685, term4685.getClass(), "originalPath", null);
        setField(term4685, term4685.getClass(), "lineOffsets", null);
        setIntField(term4685, term4685.getClass(), "lastOffset", 0);
        setIntField(term4685, term4685.getClass(), "lastLine", 1);
        setField(term4685, term4685.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = "onpbIeEKoi";
        args[1] = null;
        Object retValue = callMethod(klass, "fromFile", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4685));
    }

};


