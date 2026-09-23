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

public class SourceFile_setCode_35075629935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;
     Object term3201;

    public SourceFile_setCode_35075629935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term523 = (int[]) newIntArray(2);
        setField(term497, term497.getClass(), "fileName", "pCTimMblYc");
        setBooleanField(term497, term497.getClass(), "isExternFile", true);
        setField(term497, term497.getClass(), "originalPath", "hNxWaHcfhY");
        setIntElement(term523, 0, -1530420153);
        setIntElement(term523, 1, -469968304);
        setField(term497, term497.getClass(), "lineOffsets", term523);
        setIntField(term497, term497.getClass(), "lastOffset", -1145578966);
        setIntField(term497, term497.getClass(), "lastLine", 679763016);
        setField(term497, term497.getClass(), "code", "RkybSrpybU");
        term3201 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3206 = (int[]) newIntArray(2);
        setField(term3201, term3201.getClass(), "fileName", "pCTimMblYc");
        setBooleanField(term3201, term3201.getClass(), "isExternFile", true);
        setField(term3201, term3201.getClass(), "originalPath", "hNxWaHcfhY");
        setIntElement(term3206, 0, -1530420153);
        setIntElement(term3206, 1, -469968304);
        setField(term3201, term3201.getClass(), "lineOffsets", term3206);
        setIntField(term3201, term3201.getClass(), "lastOffset", -1145578966);
        setIntField(term3201, term3201.getClass(), "lastLine", 679763016);
        setField(term3201, term3201.getClass(), "code", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setCode", argTypes, term497, args);
        assertTrue(recursiveEquals(term497, term3201));
    }

};


