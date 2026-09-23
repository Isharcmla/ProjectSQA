package com.google.debugging.sourcemap;

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
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.debugging.sourcemap.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceMapConsumerV3_getOriginalSources_122183617523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;
     Object term7117;
     Object term6837;

    public SourceMapConsumerV3_getOriginalSources_122183617523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1131 = new ArrayList();
        HashMap term1135 = new HashMap();
        term959 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term960 = (Object[]) newArray("java.lang.String", 8);
        Object[] term1057 = (Object[]) newArray("java.lang.String", 6);
        setElement(term960, 0, "aKnKipADSo");
        setElement(term960, 1, "wSQxaModmm");
        setElement(term960, 2, "UlajhuVLaP");
        setElement(term960, 3, "gGSMzuGICf");
        setElement(term960, 4, "hxCBltsObl");
        setElement(term960, 5, "BndsHwAFMv");
        setElement(term960, 6, "GzFkzHGYFt");
        setElement(term960, 7, "tShwQLRGNe");
        setField(term959, term959.getClass(), "sources", term960);
        setElement(term1057, 0, "LvtrsXUliU");
        setElement(term1057, 1, "xLbjWUgOIL");
        setElement(term1057, 2, "jDtqGUpnZN");
        setElement(term1057, 3, "nGKItKLYNC");
        setElement(term1057, 4, "UiUYnPrcCi");
        setElement(term1057, 5, "UoYtihxVaS");
        setField(term959, term959.getClass(), "names", term1057);
        setIntField(term959, term959.getClass(), "lineCount", 1227103734);
        setField(term959, term959.getClass(), "lines", term1131);
        setField(term959, term959.getClass(), "reverseSourceMapping", term1135);
        ArrayList term7148 = new ArrayList();
        HashMap term7150 = new HashMap();
        term7117 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term7118 = (Object[]) newArray("java.lang.String", 8);
        Object[] term7135 = (Object[]) newArray("java.lang.String", 6);
        setElement(term7118, 0, "aKnKipADSo");
        setElement(term7118, 1, "wSQxaModmm");
        setElement(term7118, 2, "UlajhuVLaP");
        setElement(term7118, 3, "gGSMzuGICf");
        setElement(term7118, 4, "hxCBltsObl");
        setElement(term7118, 5, "BndsHwAFMv");
        setElement(term7118, 6, "GzFkzHGYFt");
        setElement(term7118, 7, "tShwQLRGNe");
        setField(term7117, term7117.getClass(), "sources", term7118);
        setElement(term7135, 0, "LvtrsXUliU");
        setElement(term7135, 1, "xLbjWUgOIL");
        setElement(term7135, 2, "jDtqGUpnZN");
        setElement(term7135, 3, "nGKItKLYNC");
        setElement(term7135, 4, "UiUYnPrcCi");
        setElement(term7135, 5, "UoYtihxVaS");
        setField(term7117, term7117.getClass(), "names", term7135);
        setIntField(term7117, term7117.getClass(), "lineCount", 1227103734);
        setField(term7117, term7117.getClass(), "lines", term7148);
        setField(term7117, term7117.getClass(), "reverseSourceMapping", term7150);
        term6837 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term6838 = (Object[]) newArray("java.lang.String", 8);
        setElement(term6838, 0, "aKnKipADSo");
        setElement(term6838, 1, "wSQxaModmm");
        setElement(term6838, 2, "UlajhuVLaP");
        setElement(term6838, 3, "gGSMzuGICf");
        setElement(term6838, 4, "hxCBltsObl");
        setElement(term6838, 5, "BndsHwAFMv");
        setElement(term6838, 6, "GzFkzHGYFt");
        setElement(term6838, 7, "tShwQLRGNe");
        setField(term6837, term6837.getClass(), "a", term6838);
        setIntField(term6837, term6837.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalSources", argTypes, term959, args);
        assertTrue(recursiveEquals(term959, term7117));
        assertTrue(recursiveEquals(retValue, term6837));
    }

};


