package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;

public class IteratorUtils_isEmpty_564450106290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39030;
     Object term39051;

    public IteratorUtils_isEmpty_564450106290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39030 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        term39051 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        setField(term39051, term39051.getClass(), "this$0", null);
        setField(term39051, term39051.getClass(), "nextNode", null);
        setField(term39051, term39051.getClass(), "nextItem", null);
        setField(term39051, term39051.getClass(), "lastRet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term39030;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term39030, term39051));
        assertTrue(recursiveEquals(retValue, true));
    }

};


