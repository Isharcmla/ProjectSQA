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

public class IteratorUtils_find_1675739557362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53702;
     Object term53838;
     Object term53844;
     Object term53845;

    public IteratorUtils_find_1675739557362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53702 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        term53838 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullIsExceptionPredicate"));
        term53844 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        setField(term53844, term53844.getClass(), "this$0", null);
        setField(term53844, term53844.getClass(), "nextNode", null);
        setField(term53844, term53844.getClass(), "nextItem", null);
        setField(term53844, term53844.getClass(), "lastRet", null);
        term53845 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullIsExceptionPredicate"));
        setField(term53845, term53845.getClass(), "iPredicate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term53702;
        args[1] = term53838;
        Object retValue = callMethod(klass, "find", argTypes, null, args);
        assertTrue(recursiveEquals(term53702, term53844));
        assertTrue(recursiveEquals(term53838, term53845));
        assertTrue(recursiveEquals(retValue, null));
    }

};


