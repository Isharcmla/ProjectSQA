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

public class MultiKey_getKeys_29330753220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term309;
     Object term301;

    public MultiKey_getKeys_29330753220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term34 = (Object[]) newArray("java.lang.Object", 5);
        Object term35 = newInstance(Class.forName("java.lang.Object"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        Object term37 = newInstance(Class.forName("java.lang.Object"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        Object term39 = newInstance(Class.forName("java.lang.Object"));
        setElement(term34, 0, term35);
        setElement(term34, 1, term36);
        setElement(term34, 2, term37);
        setElement(term34, 3, term38);
        setElement(term34, 4, term39);
        setField(term33, term33.getClass(), "keys", term34);
        term309 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term310 = (Object[]) newArray("java.lang.Object", 5);
        Object term311 = newInstance(Class.forName("java.lang.Object"));
        Object term312 = newInstance(Class.forName("java.lang.Object"));
        Object term313 = newInstance(Class.forName("java.lang.Object"));
        Object term314 = newInstance(Class.forName("java.lang.Object"));
        Object term315 = newInstance(Class.forName("java.lang.Object"));
        setElement(term310, 0, term311);
        setElement(term310, 1, term312);
        setElement(term310, 2, term313);
        setElement(term310, 3, term314);
        setElement(term310, 4, term315);
        setField(term309, term309.getClass(), "keys", term310);
        term301 = (Object[]) newArray("java.lang.Object", 5);
        Object term302 = newInstance(Class.forName("java.lang.Object"));
        Object term303 = newInstance(Class.forName("java.lang.Object"));
        Object term304 = newInstance(Class.forName("java.lang.Object"));
        Object term305 = newInstance(Class.forName("java.lang.Object"));
        Object term306 = newInstance(Class.forName("java.lang.Object"));
        setElement(term301, 0, term302);
        setElement(term301, 1, term303);
        setElement(term301, 2, term304);
        setElement(term301, 3, term305);
        setElement(term301, 4, term306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term33, args);
        assertTrue(recursiveEquals(term33, term309));
        assertTrue(recursiveEquals(retValue, term301));
    }

};


