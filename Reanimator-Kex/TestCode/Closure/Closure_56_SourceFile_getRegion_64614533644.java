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

public class SourceFile_getRegion_64614533644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258;
     Object term1300;
     Object term4432;

    public SourceFile_getRegion_64614533644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1284 = (int[]) newIntArray(1);
        setField(term1258, term1258.getClass(), "fileName", "xLbjWUgOIL");
        setBooleanField(term1258, term1258.getClass(), "isExternFile", true);
        setField(term1258, term1258.getClass(), "originalPath", "jDtqGUpnZN");
        setIntElement(term1284, 0, -505439934);
        setField(term1258, term1258.getClass(), "lineOffsets", term1284);
        setIntField(term1258, term1258.getClass(), "lastOffset", -344842608);
        setIntField(term1258, term1258.getClass(), "lastLine", 941650513);
        setField(term1258, term1258.getClass(), "code", "nGKItKLYNC");
        term1300 = new Integer(444029505);
        term4432 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term4437 = (int[]) newIntArray(1);
        setField(term4432, term4432.getClass(), "fileName", "xLbjWUgOIL");
        setBooleanField(term4432, term4432.getClass(), "isExternFile", true);
        setField(term4432, term4432.getClass(), "originalPath", "jDtqGUpnZN");
        setIntElement(term4437, 0, -505439934);
        setField(term4432, term4432.getClass(), "lineOffsets", term4437);
        setIntField(term4432, term4432.getClass(), "lastOffset", -344842608);
        setIntField(term4432, term4432.getClass(), "lastLine", 941650513);
        setField(term4432, term4432.getClass(), "code", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1300;
        Object retValue = callMethod(klass, "getRegion", argTypes, term1258, args);
        assertTrue(recursiveEquals(term1258, term4432));
        assertTrue(recursiveEquals(term1300, 444029505));
        assertTrue(recursiveEquals(retValue, null));
    }

};


