package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class FieldUtils_equals_1820364782130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13620;
     Object term13704;
     Object term13713;
     Object term13714;

    public FieldUtils_equals_1820364782130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13620 = newInstance(Class.forName("java.util.TreeMap$DescendingKeyIterator"));
        term13704 = newInstance(Class.forName("java.util.TreeMap$DescendingKeyIterator"));
        term13713 = newInstance(Class.forName("java.util.TreeMap$DescendingKeyIterator"));
        setField(term13713, term13713.getClass(), "this$0", null);
        setField(term13713, term13713.getClass(), "next", null);
        setField(term13713, term13713.getClass(), "lastReturned", null);
        setIntField(term13713, term13713.getClass(), "expectedModCount", 0);
        term13714 = newInstance(Class.forName("java.util.TreeMap$DescendingKeyIterator"));
        setField(term13714, term13714.getClass(), "this$0", null);
        setField(term13714, term13714.getClass(), "next", null);
        setField(term13714, term13714.getClass(), "lastReturned", null);
        setIntField(term13714, term13714.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term13620;
        args[1] = term13704;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term13620, term13713));
        assertTrue(recursiveEquals(term13704, term13714));
        assertTrue(recursiveEquals(retValue, false));
    }

};


