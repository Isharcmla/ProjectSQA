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

public class SourceFile_getOriginalPath_51841194036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594;
     Object term3355;

    public SourceFile_getOriginalPath_51841194036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term620 = (int[]) newIntArray(6);
        setField(term594, term594.getClass(), "fileName", "eZFUvlxvGV");
        setBooleanField(term594, term594.getClass(), "isExternFile", true);
        setField(term594, term594.getClass(), "originalPath", "BYqFIqCKAV");
        setIntElement(term620, 0, 1962444399);
        setIntElement(term620, 1, 767834723);
        setIntElement(term620, 2, -602026508);
        setIntElement(term620, 3, -157887805);
        setIntElement(term620, 4, 1876565163);
        setIntElement(term620, 5, -817164822);
        setField(term594, term594.getClass(), "lineOffsets", term620);
        setIntField(term594, term594.getClass(), "lastOffset", -1016503459);
        setIntField(term594, term594.getClass(), "lastLine", -1968847291);
        setField(term594, term594.getClass(), "code", "vrQLuWIDJX");
        term3355 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3360 = (int[]) newIntArray(6);
        setField(term3355, term3355.getClass(), "fileName", "eZFUvlxvGV");
        setBooleanField(term3355, term3355.getClass(), "isExternFile", true);
        setField(term3355, term3355.getClass(), "originalPath", "BYqFIqCKAV");
        setIntElement(term3360, 0, 1962444399);
        setIntElement(term3360, 1, 767834723);
        setIntElement(term3360, 2, -602026508);
        setIntElement(term3360, 3, -157887805);
        setIntElement(term3360, 4, 1876565163);
        setIntElement(term3360, 5, -817164822);
        setField(term3355, term3355.getClass(), "lineOffsets", term3360);
        setIntField(term3355, term3355.getClass(), "lastOffset", -1016503459);
        setIntField(term3355, term3355.getClass(), "lastLine", -1968847291);
        setField(term3355, term3355.getClass(), "code", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalPath", argTypes, term594, args);
        assertTrue(recursiveEquals(term594, term3355));
        assertTrue(recursiveEquals(retValue, "BYqFIqCKAV"));
    }

};


