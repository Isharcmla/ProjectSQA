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
import java.util.ArrayList;
import java.lang.Object;

public class IteratorUtils_loopingIterator_1027289695188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23500;
     Object term23657;
     Object term23648;

    public IteratorUtils_loopingIterator_1027289695188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23500 = new ArrayList();
        term23657 = new ArrayList();
        ArrayList term23649 = new ArrayList();
        term23648 = newInstance(Class.forName("org.apache.commons.collections4.iterators.LoopingIterator"));
        Object term23653 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setField(term23648, term23648.getClass(), "collection", term23649);
        setIntField(term23653, term23653.getClass(), "cursor", 0);
        setIntField(term23653, term23653.getClass(), "lastRet", -1);
        setIntField(term23653, term23653.getClass(), "expectedModCount", 0);
        setField(term23653, term23653.getClass(), "this$0", term23649);
        setField(term23648, term23648.getClass(), "iterator", term23653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term23500;
        Object retValue = callMethod(klass, "loopingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term23500, term23657));
        assertTrue(recursiveEquals(retValue, term23648));
    }

};


