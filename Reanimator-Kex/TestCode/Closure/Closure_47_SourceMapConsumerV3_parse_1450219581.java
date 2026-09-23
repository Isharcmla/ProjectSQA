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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceMapConsumerV3_parse_1450219581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SourceMapConsumerV3_parse_1450219581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113 = new ArrayList();
        HashMap term117 = new HashMap();
        term1 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term2 = (Object[]) newArray("java.lang.String", 5);
        Object[] term63 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2, 0, "PAEBtnZtTD");
        setElement(term2, 1, "sjlJAEtRrb");
        setElement(term2, 2, "MuLcgQHgqz");
        setElement(term2, 3, "xxtlPwDYFs");
        setElement(term2, 4, "jJCZpVmanW");
        setField(term1, term1.getClass(), "sources", term2);
        setElement(term63, 0, "EGtDIRbSSb");
        setElement(term63, 1, "SzjVpOQTyS");
        setElement(term63, 2, "MjGYSRKTNF");
        setElement(term63, 3, "hRNSzYYIrc");
        setField(term1, term1.getClass(), "names", term63);
        setIntField(term1, term1.getClass(), "lineCount", 568599855);
        setField(term1, term1.getClass(), "lines", term113);
        setField(term1, term1.getClass(), "reverseSourceMapping", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "parse", argTypes, term1, args);
    }

};


