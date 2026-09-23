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

public class IteratorUtils_toList_478063174439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73999;
     Object term74015;
     Object term74011;

    public IteratorUtils_toList_478063174439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73999 = newInstance(Class.forName("java.util.ImmutableCollections$Set12$1"));
        term74015 = newInstance(Class.forName("java.util.ImmutableCollections$Set12$1"));
        setIntField(term74015, term74015.getClass(), "idx", 0);
        setField(term74015, term74015.getClass(), "this$0", null);
        term74011 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term73999;
        Object retValue = callMethod(klass, "toList", argTypes, null, args);
        assertTrue(recursiveEquals(term73999, term74015));
        assertTrue(recursiveEquals(retValue, term74011));
    }

};


