package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_142030084043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2626;
     Object term2740;
     Object term4787;
     Object term4791;
     Object term4792;
     Object term4793;

    public MultiKey_init_142030084043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2588 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term2588, term2588.getClass(), "keys", null);
        term2626 = newInstance(Class.forName("java.lang.Object"));
        term2740 = newInstance(Class.forName("java.lang.ProcessBuilder$Redirect$5"));
        term4787 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term4788 = (Object[]) newArray("java.lang.Object", 3);
        Object term4789 = newInstance(Class.forName("java.lang.Object"));
        Object term4790 = newInstance(Class.forName("java.lang.ProcessBuilder$Redirect$5"));
        setElement(term4788, 0, term4789);
        setField(term4790, term4790.getClass(), "val$file", null);
        setElement(term4788, 1, term4790);
        setElement(term4788, 2, term4790);
        setField(term4787, term4787.getClass(), "keys", term4788);
        term4791 = newInstance(Class.forName("java.lang.Object"));
        term4792 = newInstance(Class.forName("java.lang.ProcessBuilder$Redirect$5"));
        setField(term4792, term4792.getClass(), "val$file", null);
        term4793 = newInstance(Class.forName("java.lang.ProcessBuilder$Redirect$5"));
        setField(term4793, term4793.getClass(), "val$file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term2626;
        args[1] = term2740;
        args[2] = term2740;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4787));
        assertTrue(recursiveEquals(term2626, term4791));
        assertTrue(recursiveEquals(term2740, term4792));
        assertTrue(recursiveEquals(term2740, term4793));
    }

};


