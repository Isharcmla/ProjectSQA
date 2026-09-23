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
import java.util.ArrayList;

public class IteratorUtils_zippingIterator_563545864352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50708;
     Object term50917;
     Object term50906;

    public IteratorUtils_zippingIterator_563545864352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50708 = (Object[]) newArray("java.util.Iterator", 1);
        Object term50858 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        setElement(term50708, 0, term50858);
        term50917 = (Object[]) newArray("java.util.Iterator", 1);
        Object term50918 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        setField(term50918, term50918.getClass(), "iterators", null);
        setField(term50918, term50918.getClass(), "nextIterator", null);
        setField(term50918, term50918.getClass(), "lastReturned", null);
        setElement(term50917, 0, term50918);
        ArrayList term50909 = new ArrayList();
        ((ArrayList) term50909).add((Object)null);
        term50906 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        Object term50907 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5$1"));
        Object term50908 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5"));
        setField(term50908, term50908.getClass(), "val$iterable", term50909);
        setField(term50908, term50908.getClass(), "iterable", term50908);
        setField(term50907, term50907.getClass(), "this$0", term50908);
        setIntField(term50907, term50907.getClass(), "callCounter", 0);
        setBooleanField(term50907, term50907.getClass(), "chainExhausted", false);
        setField(term50907, term50907.getClass(), "currentIterator", null);
        setField(term50907, term50907.getClass(), "lastUsedIterator", null);
        setField(term50906, term50906.getClass(), "iterators", term50907);
        setField(term50906, term50906.getClass(), "nextIterator", null);
        setField(term50906, term50906.getClass(), "lastReturned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.util.Iterator"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term50708;
        Object retValue = callMethod(klass, "zippingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term50708, term50917));
        assertTrue(recursiveEquals(retValue, term50906));
    }

};


