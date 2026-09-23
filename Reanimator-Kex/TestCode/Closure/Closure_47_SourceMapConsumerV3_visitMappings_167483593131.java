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

public class SourceMapConsumerV3_visitMappings_167483593131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2742;
     Object term10290;

    public SourceMapConsumerV3_visitMappings_167483593131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2866 = new ArrayList();
        HashMap term2870 = new HashMap();
        term2742 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term2743 = (Object[]) newArray("java.lang.String", 2);
        Object[] term2768 = (Object[]) newArray("java.lang.String", 8);
        setElement(term2743, 0, "yGtHPyvYiQ");
        setElement(term2743, 1, "MvRIxilFMJ");
        setField(term2742, term2742.getClass(), "sources", term2743);
        setElement(term2768, 0, "iNwOJRBEjp");
        setElement(term2768, 1, "XylxrMBraH");
        setElement(term2768, 2, "pORebkoRdD");
        setElement(term2768, 3, "mXGCWJDOqA");
        setElement(term2768, 4, "dpNsDgfPso");
        setElement(term2768, 5, "hCWPJQKpdc");
        setElement(term2768, 6, "WzMEhMXkKx");
        setElement(term2768, 7, "XOiDvlDhdc");
        setField(term2742, term2742.getClass(), "names", term2768);
        setIntField(term2742, term2742.getClass(), "lineCount", -1007160944);
        setField(term2742, term2742.getClass(), "lines", term2866);
        setField(term2742, term2742.getClass(), "reverseSourceMapping", term2870);
        ArrayList term10313 = new ArrayList();
        HashMap term10315 = new HashMap();
        term10290 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term10291 = (Object[]) newArray("java.lang.String", 2);
        Object[] term10296 = (Object[]) newArray("java.lang.String", 8);
        setElement(term10291, 0, "yGtHPyvYiQ");
        setElement(term10291, 1, "MvRIxilFMJ");
        setField(term10290, term10290.getClass(), "sources", term10291);
        setElement(term10296, 0, "iNwOJRBEjp");
        setElement(term10296, 1, "XylxrMBraH");
        setElement(term10296, 2, "pORebkoRdD");
        setElement(term10296, 3, "mXGCWJDOqA");
        setElement(term10296, 4, "dpNsDgfPso");
        setElement(term10296, 5, "hCWPJQKpdc");
        setElement(term10296, 6, "WzMEhMXkKx");
        setElement(term10296, 7, "XOiDvlDhdc");
        setField(term10290, term10290.getClass(), "names", term10296);
        setIntField(term10290, term10290.getClass(), "lineCount", -1007160944);
        setField(term10290, term10290.getClass(), "lines", term10313);
        setField(term10290, term10290.getClass(), "reverseSourceMapping", term10315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "visitMappings", argTypes, term2742, args);
        assertTrue(recursiveEquals(term2742, term10290));
    }

};


