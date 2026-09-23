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
import java.lang.Boolean;

public class MultiKey_init_103657788019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term31;
     Object term288;
     Object term295;

    public MultiKey_init_103657788019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = (Object[]) newArray("java.lang.Object", 5);
        Object term26 = newInstance(Class.forName("java.lang.Object"));
        Object term27 = newInstance(Class.forName("java.lang.Object"));
        Object term28 = newInstance(Class.forName("java.lang.Object"));
        Object term29 = newInstance(Class.forName("java.lang.Object"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        setElement(term25, 0, term26);
        setElement(term25, 1, term27);
        setElement(term25, 2, term28);
        setElement(term25, 3, term29);
        setElement(term25, 4, term30);
        term31 = new Boolean(false);
        term288 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term289 = (Object[]) newArray("java.lang.Object", 5);
        Object term290 = newInstance(Class.forName("java.lang.Object"));
        Object term291 = newInstance(Class.forName("java.lang.Object"));
        Object term292 = newInstance(Class.forName("java.lang.Object"));
        Object term293 = newInstance(Class.forName("java.lang.Object"));
        Object term294 = newInstance(Class.forName("java.lang.Object"));
        setElement(term289, 0, term290);
        setElement(term289, 1, term291);
        setElement(term289, 2, term292);
        setElement(term289, 3, term293);
        setElement(term289, 4, term294);
        setField(term288, term288.getClass(), "keys", term289);
        term295 = (Object[]) newArray("java.lang.Object", 5);
        Object term296 = newInstance(Class.forName("java.lang.Object"));
        Object term297 = newInstance(Class.forName("java.lang.Object"));
        Object term298 = newInstance(Class.forName("java.lang.Object"));
        Object term299 = newInstance(Class.forName("java.lang.Object"));
        Object term300 = newInstance(Class.forName("java.lang.Object"));
        setElement(term295, 0, term296);
        setElement(term295, 1, term297);
        setElement(term295, 2, term298);
        setElement(term295, 3, term299);
        setElement(term295, 4, term300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25;
        args[1] = term31;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term288));
        assertTrue(recursiveEquals(term25, term295));
        assertTrue(recursiveEquals(term31, false));
    }

};


