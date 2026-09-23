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

public class SourceMapConsumerV3_parse_9618422162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;

    public SourceMapConsumerV3_parse_9618422162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term298 = new ArrayList();
        HashMap term302 = new HashMap();
        term234 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term235 = (Object[]) newArray("java.lang.String", 4);
        Object[] term284 = (Object[]) newArray("java.lang.String", 1);
        setElement(term235, 0, "NRdvgJlhkX");
        setElement(term235, 1, "uuaPigETmJ");
        setElement(term235, 2, "MxlszYVzRf");
        setElement(term235, 3, "LQFpaHEwXR");
        setField(term234, term234.getClass(), "sources", term235);
        setElement(term284, 0, "oVcInYnLWB");
        setField(term234, term234.getClass(), "names", term284);
        setIntField(term234, term234.getClass(), "lineCount", 1162663216);
        setField(term234, term234.getClass(), "lines", term298);
        setField(term234, term234.getClass(), "reverseSourceMapping", term302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Object[] args = new Object[2];
        args[0] = "aJlieCFVtF";
        args[1] = null;
        callMethod(klass, "parse", argTypes, term234, args);
    }

};


