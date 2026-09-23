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

public class IteratorUtils_chainedIterator_936696383427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67733;
     Object term68502;
     Object term68491;

    public IteratorUtils_chainedIterator_936696383427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67733 = (Object[]) newArray("java.util.Iterator", 1);
        Object term67885 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        setElement(term67733, 0, term67885);
        term68502 = (Object[]) newArray("java.util.Iterator", 1);
        Object term68503 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        setField(term68503, term68503.getClass(), "this$0", null);
        setField(term68503, term68503.getClass(), "nextNode", null);
        setField(term68503, term68503.getClass(), "nextItem", null);
        setField(term68503, term68503.getClass(), "lastRet", null);
        setElement(term68502, 0, term68503);
        Object term68495 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        setField(term68495, term68495.getClass(), "this$0", null);
        setField(term68495, term68495.getClass(), "nextNode", null);
        setField(term68495, term68495.getClass(), "nextItem", null);
        setField(term68495, term68495.getClass(), "lastRet", null);
        LinkedList term68492 = new LinkedList();
        ((LinkedList) term68492).add(term68495);
        term68491 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term68491, term68491.getClass(), "iteratorChain", term68492);
        setField(term68491, term68491.getClass(), "currentIterator", null);
        setField(term68491, term68491.getClass(), "lastUsedIterator", null);
        setBooleanField(term68491, term68491.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.util.Iterator"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term67733;
        Object retValue = callMethod(klass, "chainedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term67733, term68502));
        assertTrue(recursiveEquals(retValue, term68491));
    }

};


