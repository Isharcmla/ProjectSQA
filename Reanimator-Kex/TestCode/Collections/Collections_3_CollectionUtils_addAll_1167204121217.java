package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class CollectionUtils_addAll_1167204121217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23695;
     Object term24479;

    public CollectionUtils_addAll_1167204121217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23695 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        term24479 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        setField(term24479, term24479.getClass(), "this$0", null);
        setField(term24479, term24479.getClass(), "nextNode", null);
        setField(term24479, term24479.getClass(), "nextItem", null);
        setField(term24479, term24479.getClass(), "lastRet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.util.Iterator");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23695;
        callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term23695, term24479));
    }

};


