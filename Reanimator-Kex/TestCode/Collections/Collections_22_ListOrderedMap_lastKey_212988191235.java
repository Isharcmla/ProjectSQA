package org.apache.commons.collections4.map;

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
import java.util.NoSuchElementException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ListOrderedMap_lastKey_212988191235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4982;

    public ListOrderedMap_lastKey_212988191235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4985 = newInstance(Class.forName("java.lang.Object"));
        Object term4986 = newInstance(Class.forName("java.lang.Object"));
        Object term4987 = newInstance(Class.forName("java.lang.Object"));
        Object term4988 = newInstance(Class.forName("java.lang.Object"));
        Object term4989 = newInstance(Class.forName("java.lang.Object"));
        Object term4990 = newInstance(Class.forName("java.lang.Object"));
        Object term4991 = newInstance(Class.forName("java.lang.Object"));
        Object term4992 = newInstance(Class.forName("java.lang.Object"));
        Object term4993 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term4983 = new ArrayList();
        ((ArrayList) term4983).add(term4985);
        ((ArrayList) term4983).add(term4986);
        ((ArrayList) term4983).add(term4987);
        ((ArrayList) term4983).add(term4988);
        ((ArrayList) term4983).add(term4989);
        ((ArrayList) term4983).add(term4990);
        ((ArrayList) term4983).add(term4991);
        ((ArrayList) term4983).add(term4992);
        ((ArrayList) term4983).add(term4993);
        HashMap term4996 = new HashMap();
        term4982 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term4982, term4982.getClass(), "insertOrder", term4983);
        setField(term4982, term4982.getClass(), "map", term4996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastKey", argTypes, term4982, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


