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

public class MultiKey_init_52206899915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term7;
     Object term8;
     Object term9;
     Object term147;
     Object term153;
     Object term154;
     Object term155;
     Object term156;

    public MultiKey_init_52206899915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("java.lang.Object"));
        term7 = newInstance(Class.forName("java.lang.Object"));
        term8 = newInstance(Class.forName("java.lang.Object"));
        term9 = newInstance(Class.forName("java.lang.Object"));
        term147 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term148 = (Object[]) newArray("java.lang.Object", 4);
        Object term149 = newInstance(Class.forName("java.lang.Object"));
        Object term150 = newInstance(Class.forName("java.lang.Object"));
        Object term151 = newInstance(Class.forName("java.lang.Object"));
        Object term152 = newInstance(Class.forName("java.lang.Object"));
        setElement(term148, 0, term149);
        setElement(term148, 1, term150);
        setElement(term148, 2, term151);
        setElement(term148, 3, term152);
        setField(term147, term147.getClass(), "keys", term148);
        term153 = newInstance(Class.forName("java.lang.Object"));
        term154 = newInstance(Class.forName("java.lang.Object"));
        term155 = newInstance(Class.forName("java.lang.Object"));
        term156 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term6;
        args[1] = term7;
        args[2] = term8;
        args[3] = term9;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term147));
        assertTrue(recursiveEquals(term6, term153));
        assertTrue(recursiveEquals(term7, term154));
        assertTrue(recursiveEquals(term8, term155));
        assertTrue(recursiveEquals(term9, term156));
    }

};


