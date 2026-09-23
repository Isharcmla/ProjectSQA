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

public class IteratorUtils_apply_1953012169223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26476;
     Object term26584;
     Object term26592;
     Object term26593;

    public IteratorUtils_apply_1953012169223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26476 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        term26584 = newInstance(Class.forName("org.apache.commons.collections4.functors.NOPClosure"));
        term26592 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        setIntField(term26592, term26592.getClass(), "remaining", 0);
        setIntField(term26592, term26592.getClass(), "idx", 0);
        setField(term26592, term26592.getClass(), "this$0", null);
        term26593 = newInstance(Class.forName("org.apache.commons.collections4.functors.NOPClosure"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Closure");
        Object[] args = new Object[2];
        args[0] = term26476;
        args[1] = term26584;
        callMethod(klass, "apply", argTypes, null, args);
        assertTrue(recursiveEquals(term26476, term26592));
        assertTrue(recursiveEquals(term26584, term26593));
    }

};


