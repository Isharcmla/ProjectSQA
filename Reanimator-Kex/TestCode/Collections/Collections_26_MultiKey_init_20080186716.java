package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_20080186716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term7;
     Object term8;
     Object term9;
     Object term162;
     Object term168;
     Object term169;
     Object term170;
     Object term171;

    public MultiKey_init_20080186716() {
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
        term162 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term163 = (Object[]) newArray("java.lang.Object", 4);
        Object term164 = newInstance(Class.forName("java.lang.Object"));
        Object term165 = newInstance(Class.forName("java.lang.Object"));
        Object term166 = newInstance(Class.forName("java.lang.Object"));
        Object term167 = newInstance(Class.forName("java.lang.Object"));
        setElement(term163, 0, term164);
        setElement(term163, 1, term165);
        setElement(term163, 2, term166);
        setElement(term163, 3, term167);
        setField(term162, term162.getClass(), "keys", term163);
        term168 = newInstance(Class.forName("java.lang.Object"));
        term169 = newInstance(Class.forName("java.lang.Object"));
        term170 = newInstance(Class.forName("java.lang.Object"));
        term171 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
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
        assertTrue(recursiveEquals(instance, term162));
        assertTrue(recursiveEquals(term6, term168));
        assertTrue(recursiveEquals(term7, term169));
        assertTrue(recursiveEquals(term8, term170));
        assertTrue(recursiveEquals(term9, term171));
    }

};


