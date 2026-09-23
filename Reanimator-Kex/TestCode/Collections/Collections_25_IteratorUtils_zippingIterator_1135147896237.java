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

public class IteratorUtils_zippingIterator_1135147896237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28371;
     Object term28517;
     Object term28637;
     Object term28746;
     Object term28747;
     Object term28748;
     Object term28726;

    public IteratorUtils_zippingIterator_1135147896237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28371 = newInstance(Class.forName("java.util.TreeMap$DescendingKeyIterator"));
        term28517 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractLinkedMap$EntrySetIterator"));
        term28637 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        term28746 = newInstance(Class.forName("java.util.TreeMap$DescendingKeyIterator"));
        setField(term28746, term28746.getClass(), "this$0", null);
        setField(term28746, term28746.getClass(), "next", null);
        setField(term28746, term28746.getClass(), "lastReturned", null);
        setIntField(term28746, term28746.getClass(), "expectedModCount", 0);
        term28747 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractLinkedMap$EntrySetIterator"));
        setField(term28747, term28747.getClass(), "parent", null);
        setField(term28747, term28747.getClass(), "last", null);
        setField(term28747, term28747.getClass(), "next", null);
        setIntField(term28747, term28747.getClass(), "expectedModCount", 0);
        term28748 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        setField(term28748, term28748.getClass(), "iterators", null);
        setField(term28748, term28748.getClass(), "nextIterator", null);
        setField(term28748, term28748.getClass(), "lastReturned", null);
        ArrayList term28729 = new ArrayList();
        ((ArrayList) term28729).add((Object)null);
        ((ArrayList) term28729).add((Object)null);
        ((ArrayList) term28729).add((Object)null);
        term28726 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        Object term28727 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5$1"));
        Object term28728 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5"));
        setField(term28728, term28728.getClass(), "val$iterable", term28729);
        setField(term28728, term28728.getClass(), "iterable", term28728);
        setField(term28727, term28727.getClass(), "this$0", term28728);
        setIntField(term28727, term28727.getClass(), "callCounter", 0);
        setBooleanField(term28727, term28727.getClass(), "chainExhausted", false);
        setField(term28727, term28727.getClass(), "currentIterator", null);
        setField(term28727, term28727.getClass(), "lastUsedIterator", null);
        setField(term28726, term28726.getClass(), "iterators", term28727);
        setField(term28726, term28726.getClass(), "nextIterator", null);
        setField(term28726, term28726.getClass(), "lastReturned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.util.Iterator");
        argTypes[2] = Class.forName("java.util.Iterator");
        Object[] args = new Object[3];
        args[0] = term28371;
        args[1] = term28517;
        args[2] = term28637;
        Object retValue = callMethod(klass, "zippingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term28371, term28746));
        assertTrue(recursiveEquals(term28517, term28747));
        assertTrue(recursiveEquals(term28637, term28748));
        assertTrue(recursiveEquals(retValue, term28726));
    }

};


