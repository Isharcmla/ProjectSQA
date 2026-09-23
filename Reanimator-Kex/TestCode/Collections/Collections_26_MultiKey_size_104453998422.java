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

public class MultiKey_size_104453998422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term615;

    public MultiKey_size_104453998422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term49 = (Object[]) newArray("java.lang.Object", 3);
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        Object term52 = newInstance(Class.forName("java.lang.Object"));
        setElement(term49, 0, term50);
        setElement(term49, 1, term51);
        setElement(term49, 2, term52);
        setField(term48, term48.getClass(), "keys", term49);
        term615 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term616 = (Object[]) newArray("java.lang.Object", 3);
        Object term617 = newInstance(Class.forName("java.lang.Object"));
        Object term618 = newInstance(Class.forName("java.lang.Object"));
        Object term619 = newInstance(Class.forName("java.lang.Object"));
        setElement(term616, 0, term617);
        setElement(term616, 1, term618);
        setElement(term616, 2, term619);
        setField(term615, term615.getClass(), "keys", term616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term48, args);
        assertTrue(recursiveEquals(term48, term615));
        assertTrue(recursiveEquals(retValue, 3));
    }

};


