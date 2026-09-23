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

public class SourceFile_getCode_136912026932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term2761;

    public SourceFile_getCode_136912026932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term288 = (int[]) newIntArray(4);
        setField(term262, term262.getClass(), "fileName", "NRdvgJlhkX");
        setBooleanField(term262, term262.getClass(), "isExternFile", false);
        setField(term262, term262.getClass(), "originalPath", "uuaPigETmJ");
        setIntElement(term288, 0, 1048535127);
        setIntElement(term288, 1, -655067527);
        setIntElement(term288, 2, -6029667);
        setIntElement(term288, 3, -2068769794);
        setField(term262, term262.getClass(), "lineOffsets", term288);
        setIntField(term262, term262.getClass(), "lastOffset", -117576464);
        setIntField(term262, term262.getClass(), "lastLine", -1007160944);
        setField(term262, term262.getClass(), "code", "MxlszYVzRf");
        term2761 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term2766 = (int[]) newIntArray(4);
        setField(term2761, term2761.getClass(), "fileName", "NRdvgJlhkX");
        setBooleanField(term2761, term2761.getClass(), "isExternFile", false);
        setField(term2761, term2761.getClass(), "originalPath", "uuaPigETmJ");
        setIntElement(term2766, 0, 1048535127);
        setIntElement(term2766, 1, -655067527);
        setIntElement(term2766, 2, -6029667);
        setIntElement(term2766, 3, -2068769794);
        setField(term2761, term2761.getClass(), "lineOffsets", term2766);
        setIntField(term2761, term2761.getClass(), "lastOffset", -117576464);
        setIntField(term2761, term2761.getClass(), "lastLine", -1007160944);
        setField(term2761, term2761.getClass(), "code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCode", argTypes, term262, args);
        assertTrue(recursiveEquals(term262, term2761));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


