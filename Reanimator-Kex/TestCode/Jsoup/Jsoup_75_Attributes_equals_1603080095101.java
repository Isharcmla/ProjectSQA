package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attributes_equals_1603080095101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65297;
     Object term65367;
     Object term65375;
     Object term65376;

    public Attributes_equals_1603080095101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65297 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term65367 = newInstance(Class.forName("java.util.stream.IntPipeline$2$1"));
        term65375 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term65375, term65375.getClass(), "size", 0);
        setField(term65375, term65375.getClass(), "keys", null);
        setField(term65375, term65375.getClass(), "vals", null);
        term65376 = newInstance(Class.forName("java.util.stream.IntPipeline$2$1"));
        setField(term65376, term65376.getClass(), "this$1", null);
        setField(term65376, term65376.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65367;
        Object retValue = callMethod(klass, "equals", argTypes, term65297, args);
        assertTrue(recursiveEquals(term65297, term65375));
        assertTrue(recursiveEquals(term65367, term65376));
        assertTrue(recursiveEquals(retValue, false));
    }

};


