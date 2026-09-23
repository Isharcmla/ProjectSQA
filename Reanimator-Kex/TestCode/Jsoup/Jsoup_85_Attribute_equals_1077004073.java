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

public class Attribute_equals_1077004073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143433;
     Object term143505;
     Object term143514;
     Object term143515;

    public Attribute_equals_1077004073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143433 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term143505 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        term143514 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term143514, term143514.getClass(), "key", null);
        setField(term143514, term143514.getClass(), "val", null);
        setField(term143514, term143514.getClass(), "parent", null);
        term143515 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        setField(term143515, term143515.getClass(), "this$0", null);
        setIntField(term143515, term143515.getClass(), "index", 0);
        setField(term143515, term143515.getClass(), "entry", null);
        setField(term143515, term143515.getClass(), "lastReturned", null);
        setIntField(term143515, term143515.getClass(), "expectedModCount", 0);
        setField(term143515, term143515.getClass(), "nextKey", null);
        setField(term143515, term143515.getClass(), "currentKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term143505;
        Object retValue = callMethod(klass, "equals", argTypes, term143433, args);
        assertTrue(recursiveEquals(term143433, term143514));
        assertTrue(recursiveEquals(term143505, term143515));
        assertTrue(recursiveEquals(retValue, false));
    }

};


