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
import java.util.LinkedList;

public class IteratorUtils_chainedIterator_936696383282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38004;
     Object term38328;
     Object term38322;

    public IteratorUtils_chainedIterator_936696383282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38004 = (Object[]) newArray("java.util.Iterator", 0);
        term38328 = (Object[]) newArray("java.util.Iterator", 0);
        LinkedList term38323 = new LinkedList();
        term38322 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term38322, term38322.getClass(), "iteratorChain", term38323);
        setField(term38322, term38322.getClass(), "currentIterator", null);
        setField(term38322, term38322.getClass(), "lastUsedIterator", null);
        setBooleanField(term38322, term38322.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.util.Iterator"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term38004;
        Object retValue = callMethod(klass, "chainedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term38004, term38328));
        assertTrue(recursiveEquals(retValue, term38322));
    }

};


