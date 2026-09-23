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

public class SourceFile_getLine_1116699204316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54929;
     Object term55175;

    public SourceFile_getLine_1116699204316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54929 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term54929, term54929.getClass(), "code", "");
        setIntField(term54929, term54929.getClass(), "lastLine", 1073741825);
        term55175 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term55175, term55175.getClass(), "generator", null);
        setField(term55175, term55175.getClass(), "fileName", null);
        setBooleanField(term55175, term55175.getClass(), "isExternFile", false);
        setField(term55175, term55175.getClass(), "originalPath", null);
        setField(term55175, term55175.getClass(), "lineOffsets", null);
        setIntField(term55175, term55175.getClass(), "lastOffset", 0);
        setIntField(term55175, term55175.getClass(), "lastLine", 1073741825);
        setField(term55175, term55175.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1073741824;
        Object retValue = callMethod(klass, "getLine", argTypes, term54929, args);
        assertTrue(recursiveEquals(term54929, term55175));
        assertTrue(recursiveEquals(retValue, null));
    }

};


