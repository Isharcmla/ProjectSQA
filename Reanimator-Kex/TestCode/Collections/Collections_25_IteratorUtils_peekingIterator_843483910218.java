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

public class IteratorUtils_peekingIterator_843483910218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25696;
     Object term25986;
     Object term25983;

    public IteratorUtils_peekingIterator_843483910218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25696 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        term25986 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        setField(term25986, term25986.getClass(), "next", null);
        setField(term25986, term25986.getClass(), "nextItem", null);
        setField(term25986, term25986.getClass(), "lastRet", null);
        setField(term25986, term25986.getClass(), "ancestor", null);
        setField(term25986, term25986.getClass(), "this$0", null);
        term25983 = newInstance(Class.forName("org.apache.commons.collections4.iterators.PeekingIterator"));
        Object term25978 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        setField(term25978, term25978.getClass(), "next", null);
        setField(term25978, term25978.getClass(), "nextItem", null);
        setField(term25978, term25978.getClass(), "lastRet", null);
        setField(term25978, term25978.getClass(), "ancestor", null);
        setField(term25978, term25978.getClass(), "this$0", null);
        setField(term25983, term25983.getClass(), "iterator", term25978);
        setBooleanField(term25983, term25983.getClass(), "exhausted", false);
        setBooleanField(term25983, term25983.getClass(), "slotFilled", false);
        setField(term25983, term25983.getClass(), "slot", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term25696;
        Object retValue = callMethod(klass, "peekingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25696, term25986));
        assertTrue(recursiveEquals(retValue, term25983));
    }

};


