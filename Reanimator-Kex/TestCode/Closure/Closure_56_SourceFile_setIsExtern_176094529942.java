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
import java.lang.Boolean;

public class SourceFile_setIsExtern_176094529942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1102;
     Object term1145;
     Object term4166;

    public SourceFile_setIsExtern_176094529942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1102 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1128 = (int[]) newIntArray(2);
        setField(term1102, term1102.getClass(), "fileName", "gGSMzuGICf");
        setBooleanField(term1102, term1102.getClass(), "isExternFile", true);
        setField(term1102, term1102.getClass(), "originalPath", "hxCBltsObl");
        setIntElement(term1128, 0, -481533957);
        setIntElement(term1128, 1, 1240914516);
        setField(term1102, term1102.getClass(), "lineOffsets", term1128);
        setIntField(term1102, term1102.getClass(), "lastOffset", -1465035361);
        setIntField(term1102, term1102.getClass(), "lastLine", 1090617576);
        setField(term1102, term1102.getClass(), "code", "BndsHwAFMv");
        term1145 = new Boolean(false);
        term4166 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term4171 = (int[]) newIntArray(2);
        setField(term4166, term4166.getClass(), "fileName", "gGSMzuGICf");
        setBooleanField(term4166, term4166.getClass(), "isExternFile", false);
        setField(term4166, term4166.getClass(), "originalPath", "hxCBltsObl");
        setIntElement(term4171, 0, -481533957);
        setIntElement(term4171, 1, 1240914516);
        setField(term4166, term4166.getClass(), "lineOffsets", term4171);
        setIntField(term4166, term4166.getClass(), "lastOffset", -1465035361);
        setIntField(term4166, term4166.getClass(), "lastLine", 1090617576);
        setField(term4166, term4166.getClass(), "code", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1145;
        callMethod(klass, "setIsExtern", argTypes, term1102, args);
        assertTrue(recursiveEquals(term1102, term4166));
        assertTrue(recursiveEquals(term1145, false));
    }

};


