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
import java.lang.Integer;

public class SourceFile_getLine_111669920443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;
     Object term1223;
     Object term4298;

    public SourceFile_getLine_111669920443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1179 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1205 = (int[]) newIntArray(3);
        setField(term1179, term1179.getClass(), "fileName", "GzFkzHGYFt");
        setBooleanField(term1179, term1179.getClass(), "isExternFile", false);
        setField(term1179, term1179.getClass(), "originalPath", "tShwQLRGNe");
        setIntElement(term1205, 0, -1547384488);
        setIntElement(term1205, 1, 1442160736);
        setIntElement(term1205, 2, 1114000454);
        setField(term1179, term1179.getClass(), "lineOffsets", term1205);
        setIntField(term1179, term1179.getClass(), "lastOffset", -556405712);
        setIntField(term1179, term1179.getClass(), "lastLine", -1772434990);
        setField(term1179, term1179.getClass(), "code", "LvtrsXUliU");
        term1223 = new Integer(-1845499264);
        term4298 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term4303 = (int[]) newIntArray(3);
        setField(term4298, term4298.getClass(), "fileName", "GzFkzHGYFt");
        setBooleanField(term4298, term4298.getClass(), "isExternFile", false);
        setField(term4298, term4298.getClass(), "originalPath", "tShwQLRGNe");
        setIntElement(term4303, 0, -1547384488);
        setIntElement(term4303, 1, 1442160736);
        setIntElement(term4303, 2, 1114000454);
        setField(term4298, term4298.getClass(), "lineOffsets", term4303);
        setIntField(term4298, term4298.getClass(), "lastOffset", 0);
        setIntField(term4298, term4298.getClass(), "lastLine", -1845499264);
        setField(term4298, term4298.getClass(), "code", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1223;
        Object retValue = callMethod(klass, "getLine", argTypes, term1179, args);
        assertTrue(recursiveEquals(term1179, term4298));
        assertTrue(recursiveEquals(term1223, -1845499264));
        assertTrue(recursiveEquals(retValue, null));
    }

};


