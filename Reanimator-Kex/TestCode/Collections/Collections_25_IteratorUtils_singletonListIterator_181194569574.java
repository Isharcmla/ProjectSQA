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
import java.lang.Object;

public class IteratorUtils_singletonListIterator_181194569574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term192;
     Object term187;

    public IteratorUtils_singletonListIterator_181194569574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("java.lang.Object"));
        term192 = newInstance(Class.forName("java.lang.Object"));
        term187 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SingletonListIterator"));
        Object term191 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term187, term187.getClass(), "beforeFirst", true);
        setBooleanField(term187, term187.getClass(), "nextCalled", false);
        setBooleanField(term187, term187.getClass(), "removed", false);
        setField(term187, term187.getClass(), "object", term191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2;
        Object retValue = callMethod(klass, "singletonListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term2, term192));
        assertTrue(recursiveEquals(retValue, term187));
    }

};


