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
import java.lang.IndexOutOfBoundsException;
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class SourceMapConsumerV3_compareEntry_17257228227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2042;
     Object term2151;
     Object term2155;
     Object term2157;

    public SourceMapConsumerV3_compareEntry_17257228227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2142 = new ArrayList();
        HashMap term2146 = new HashMap();
        term2042 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term2043 = (Object[]) newArray("java.lang.String", 7);
        Object[] term2128 = (Object[]) newArray("java.lang.String", 1);
        setElement(term2043, 0, "LvJFtLBaxj");
        setElement(term2043, 1, "PHvxnGHptP");
        setElement(term2043, 2, "TimdotUuNC");
        setElement(term2043, 3, "PkWMRdJcBb");
        setElement(term2043, 4, "jSpAteRute");
        setElement(term2043, 5, "swZVeJAxjt");
        setElement(term2043, 6, "xOcJIiQQDu");
        setField(term2042, term2042.getClass(), "sources", term2043);
        setElement(term2128, 0, "GVizqqzXpy");
        setField(term2042, term2042.getClass(), "names", term2128);
        setIntField(term2042, term2042.getClass(), "lineCount", -1456670397);
        setField(term2042, term2042.getClass(), "lines", term2142);
        setField(term2042, term2042.getClass(), "reverseSourceMapping", term2146);
        term2151 = new ArrayList();
        term2155 = new Integer(1622346318);
        term2157 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2151;
        args[1] = term2155;
        args[2] = term2157;
        try {
            callMethod(klass, "compareEntry", argTypes, term2042, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


