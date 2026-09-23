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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SourceFile_getLineOffset_35702561029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term69;

    public SourceFile_getLineOffset_35702561029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term49 = (int[]) newIntArray(5);
        setField(term23, term23.getClass(), "fileName", "sjlJAEtRrb");
        setBooleanField(term23, term23.getClass(), "isExternFile", false);
        setField(term23, term23.getClass(), "originalPath", "MuLcgQHgqz");
        setIntElement(term49, 0, 568599855);
        setIntElement(term49, 1, 1162663216);
        setIntElement(term49, 2, 1484323161);
        setIntElement(term49, 3, 391863371);
        setIntElement(term49, 4, -1922583790);
        setField(term23, term23.getClass(), "lineOffsets", term49);
        setIntField(term23, term23.getClass(), "lastOffset", -616727354);
        setIntField(term23, term23.getClass(), "lastLine", -1955890973);
        setField(term23, term23.getClass(), "code", "xxtlPwDYFs");
        term69 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69;
        try {
            callMethod(klass, "getLineOffset", argTypes, term23, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


