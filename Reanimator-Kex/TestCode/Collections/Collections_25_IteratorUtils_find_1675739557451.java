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

public class IteratorUtils_find_1675739557451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75388;
     Object term75498;
     Object term77525;
     Object term77526;

    public IteratorUtils_find_1675739557451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75388 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        term75498 = newInstance(Class.forName("org.apache.commons.collections4.functors.OrPredicate"));
        term77525 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        setField(term77525, term77525.getClass(), "this$0", null);
        setField(term77525, term77525.getClass(), "nextNode", null);
        setField(term77525, term77525.getClass(), "nextItem", null);
        setField(term77525, term77525.getClass(), "lastRet", null);
        term77526 = newInstance(Class.forName("org.apache.commons.collections4.functors.OrPredicate"));
        setField(term77526, term77526.getClass(), "iPredicate1", null);
        setField(term77526, term77526.getClass(), "iPredicate2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term75388;
        args[1] = term75498;
        Object retValue = callMethod(klass, "find", argTypes, null, args);
        assertTrue(recursiveEquals(term75388, term77525));
        assertTrue(recursiveEquals(term75498, term77526));
        assertTrue(recursiveEquals(retValue, null));
    }

};


