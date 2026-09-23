package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_52206899942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2344;
     Object term2452;
     Object term4764;
     Object term4768;
     Object term4769;

    public MultiKey_init_52206899942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2236 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term2109 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2236, term2236.getClass(), "keys", term2109);
        term2344 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        term2452 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        term4764 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term4765 = (Object[]) newArray("java.lang.Object", 4);
        Object term4766 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        Object term4767 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        setField(term4766, term4766.getClass(), "this$0", null);
        setField(term4766, term4766.getClass(), "lastReturned", null);
        setField(term4766, term4766.getClass(), "next", null);
        setField(term4766, term4766.getClass(), "fenceKey", null);
        setIntField(term4766, term4766.getClass(), "expectedModCount", 0);
        setElement(term4765, 0, term4766);
        setField(term4767, term4767.getClass(), "this$0", null);
        setField(term4767, term4767.getClass(), "lastReturned", null);
        setField(term4767, term4767.getClass(), "next", null);
        setField(term4767, term4767.getClass(), "fenceKey", null);
        setIntField(term4767, term4767.getClass(), "expectedModCount", 0);
        setElement(term4765, 2, term4767);
        setField(term4764, term4764.getClass(), "keys", term4765);
        term4768 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        setField(term4768, term4768.getClass(), "this$0", null);
        setField(term4768, term4768.getClass(), "lastReturned", null);
        setField(term4768, term4768.getClass(), "next", null);
        setField(term4768, term4768.getClass(), "fenceKey", null);
        setIntField(term4768, term4768.getClass(), "expectedModCount", 0);
        term4769 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        setField(term4769, term4769.getClass(), "this$0", null);
        setField(term4769, term4769.getClass(), "lastReturned", null);
        setField(term4769, term4769.getClass(), "next", null);
        setField(term4769, term4769.getClass(), "fenceKey", null);
        setIntField(term4769, term4769.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term2344;
        args[1] = null;
        args[2] = term2452;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4764));
        assertTrue(recursiveEquals(term2344, term4768));
        assertTrue(recursiveEquals(term2452, term4769));
    }

};


