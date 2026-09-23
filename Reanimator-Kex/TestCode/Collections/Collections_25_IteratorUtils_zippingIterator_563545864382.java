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

public class IteratorUtils_zippingIterator_563545864382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57428;
     Object term57789;
     Object term57779;

    public IteratorUtils_zippingIterator_563545864382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57428 = (Object[]) newArray("java.util.Iterator", 0);
        term57789 = (Object[]) newArray("java.util.Iterator", 0);
        ArrayList term57782 = new ArrayList();
        term57779 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ZippingIterator"));
        Object term57780 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5$1"));
        Object term57781 = newInstance(Class.forName("org.apache.commons.collections4.IterableUtils$5"));
        setField(term57781, term57781.getClass(), "val$iterable", term57782);
        setField(term57781, term57781.getClass(), "iterable", term57781);
        setField(term57780, term57780.getClass(), "this$0", term57781);
        setIntField(term57780, term57780.getClass(), "callCounter", 0);
        setBooleanField(term57780, term57780.getClass(), "chainExhausted", false);
        setField(term57780, term57780.getClass(), "currentIterator", null);
        setField(term57780, term57780.getClass(), "lastUsedIterator", null);
        setField(term57779, term57779.getClass(), "iterators", term57780);
        setField(term57779, term57779.getClass(), "nextIterator", null);
        setField(term57779, term57779.getClass(), "lastReturned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.util.Iterator"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term57428;
        Object retValue = callMethod(klass, "zippingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term57428, term57789));
        assertTrue(recursiveEquals(retValue, term57779));
    }

};


