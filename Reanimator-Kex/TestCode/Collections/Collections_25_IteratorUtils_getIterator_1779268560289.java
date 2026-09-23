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

public class IteratorUtils_getIterator_1779268560289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38904;
     Object term39045;
     Object term39034;

    public IteratorUtils_getIterator_1779268560289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38904 = newInstance(Class.forName("java.util.stream.SpinedBuffer"));
        term39045 = newInstance(Class.forName("java.util.stream.SpinedBuffer"));
        setField(term39045, term39045.getClass(), "curChunk", null);
        setField(term39045, term39045.getClass(), "spine", null);
        setIntField(term39045, term39045.getClass(), "initialChunkPower", 0);
        setIntField(term39045, term39045.getClass(), "elementIndex", 0);
        setIntField(term39045, term39045.getClass(), "spineIndex", 0);
        setField(term39045, term39045.getClass(), "priorElementCount", null);
        term39034 = newInstance(Class.forName("java.util.Spliterators$1Adapter"));
        Object term39036 = newInstance(Class.forName("java.util.stream.SpinedBuffer$1Splitr"));
        Object term39041 = newInstance(Class.forName("java.util.stream.SpinedBuffer"));
        setBooleanField(term39034, term39034.getClass(), "valueReady", false);
        setField(term39034, term39034.getClass(), "nextElement", null);
        setIntField(term39036, term39036.getClass(), "splSpineIndex", 0);
        setIntField(term39036, term39036.getClass(), "lastSpineIndex", 0);
        setIntField(term39036, term39036.getClass(), "splElementIndex", 0);
        setIntField(term39036, term39036.getClass(), "lastSpineElementFence", 0);
        setField(term39036, term39036.getClass(), "splChunk", null);
        setField(term39041, term39041.getClass(), "curChunk", null);
        setField(term39041, term39041.getClass(), "spine", null);
        setIntField(term39041, term39041.getClass(), "initialChunkPower", 0);
        setIntField(term39041, term39041.getClass(), "elementIndex", 0);
        setIntField(term39041, term39041.getClass(), "spineIndex", 0);
        setField(term39041, term39041.getClass(), "priorElementCount", null);
        setField(term39036, term39036.getClass(), "this$0", term39041);
        setField(term39034, term39034.getClass(), "val$spliterator", term39036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term38904;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term38904, term39045));
        assertTrue(recursiveEquals(retValue, term39034));
    }

};


