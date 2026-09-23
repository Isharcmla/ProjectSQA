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

public class IteratorUtils_zippingIterator_1852638964220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25851;
     Object term25971;
     Object term26353;
     Object term26354;
     Object term26339;

    public IteratorUtils_zippingIterator_1852638964220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25851 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        term25971 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        term26353 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        setField(term26353, term26353.getClass(), "iterators", null);
        setField(term26353, term26353.getClass(), "nextIterator", null);
        setField(term26353, term26353.getClass(), "lastReturned", null);
        term26354 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        setField(term26354, term26354.getClass(), "iterators", null);
        setField(term26354, term26354.getClass(), "nextIterator", null);
        setField(term26354, term26354.getClass(), "lastReturned", null);
        ArrayList term26342 = new ArrayList();
        ((ArrayList) term26342).add((Object)null);
        ((ArrayList) term26342).add((Object)null);
        term26339 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        Object term26340 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5$1"));
        Object term26341 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5"));
        setField(term26341, term26341.getClass(), "val$iterable", term26342);
        setField(term26341, term26341.getClass(), "iterable", term26341);
        setField(term26340, term26340.getClass(), "this$0", term26341);
        setIntField(term26340, term26340.getClass(), "callCounter", 0);
        setBooleanField(term26340, term26340.getClass(), "chainExhausted", false);
        setField(term26340, term26340.getClass(), "currentIterator", null);
        setField(term26340, term26340.getClass(), "lastUsedIterator", null);
        setField(term26339, term26339.getClass(), "iterators", term26340);
        setField(term26339, term26339.getClass(), "nextIterator", null);
        setField(term26339, term26339.getClass(), "lastReturned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.util.Iterator");
        Object[] args = new Object[2];
        args[0] = term25851;
        args[1] = term25971;
        Object retValue = callMethod(klass, "zippingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25851, term26353));
        assertTrue(recursiveEquals(term25971, term26354));
        assertTrue(recursiveEquals(retValue, term26339));
    }

};


