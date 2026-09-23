package org.apache.commons.collections.set;

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
import java.lang.NullPointerException;
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class ListOrderedSet_removeAll_1328121463151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114615;
     Object term116903;

    public ListOrderedSet_removeAll_1328121463151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114615 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term114719 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term114823 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term114927 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115031 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115135 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115239 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115343 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115447 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115551 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115655 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115759 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115863 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term115967 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116071 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116175 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116279 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116383 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116487 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116591 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116695 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term116799 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term116799, term116799.getClass(), "collection", null);
        setField(term116695, term116695.getClass(), "collection", term116799);
        setField(term116591, term116591.getClass(), "collection", term116695);
        setField(term116487, term116487.getClass(), "collection", term116591);
        setField(term116383, term116383.getClass(), "collection", term116487);
        setField(term116279, term116279.getClass(), "collection", term116383);
        setField(term116175, term116175.getClass(), "collection", term116279);
        setField(term116071, term116071.getClass(), "collection", term116175);
        setField(term115967, term115967.getClass(), "collection", term116071);
        setField(term115863, term115863.getClass(), "collection", term115967);
        setField(term115759, term115759.getClass(), "collection", term115863);
        setField(term115655, term115655.getClass(), "collection", term115759);
        setField(term115551, term115551.getClass(), "collection", term115655);
        setField(term115447, term115447.getClass(), "collection", term115551);
        setField(term115343, term115343.getClass(), "collection", term115447);
        setField(term115239, term115239.getClass(), "collection", term115343);
        setField(term115135, term115135.getClass(), "collection", term115239);
        setField(term115031, term115031.getClass(), "collection", term115135);
        setField(term114927, term114927.getClass(), "collection", term115031);
        setField(term114823, term114823.getClass(), "collection", term114927);
        setField(term114719, term114719.getClass(), "collection", term114823);
        setField(term114615, term114615.getClass(), "collection", term114719);
        Object term117097 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator"));
        ArrayList term116955 = new ArrayList();
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        ((ArrayList) term116955).add(term117097);
        term116903 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term116903, term116903.getClass(), "setOrder", term116955);
        setField(term116903, term116903.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term116903;
        try {
            callMethod(klass, "removeAll", argTypes, term114615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


