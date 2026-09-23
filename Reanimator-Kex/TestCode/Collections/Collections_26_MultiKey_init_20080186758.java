package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_20080186758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7673;
     Object term7900;
     Object term7980;
     Object term12809;
     Object term12814;
     Object term12815;
     Object term12816;

    public MultiKey_init_20080186758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7820 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term7677 = (Object[]) newArray("java.lang.Object", 0);
        setField(term7820, term7820.getClass(), "keys", term7677);
        term7673 = (Object[]) newArray("java.lang.Object", 0);
        term7900 = newInstance(Class.forName("java.util.concurrent.TimeoutException"));
        term7980 = newInstance(Class.forName("java.util.concurrent.TimeoutException"));
        term12809 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term12810 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term12811 = (Object[]) newArray("java.lang.Object", 0);
        Object term12812 = newInstance(Class.forName("java.util.concurrent.TimeoutException"));
        Object term12813 = newInstance(Class.forName("java.util.concurrent.TimeoutException"));
        setElement(term12810, 0, term12811);
        setField(term12812, term12812.getClass(), "backtrace", null);
        setField(term12812, term12812.getClass(), "detailMessage", null);
        setField(term12812, term12812.getClass(), "cause", null);
        setField(term12812, term12812.getClass(), "stackTrace", null);
        setIntField(term12812, term12812.getClass(), "depth", 0);
        setField(term12812, term12812.getClass(), "suppressedExceptions", null);
        setElement(term12810, 1, term12812);
        setField(term12813, term12813.getClass(), "backtrace", null);
        setField(term12813, term12813.getClass(), "detailMessage", null);
        setField(term12813, term12813.getClass(), "cause", null);
        setField(term12813, term12813.getClass(), "stackTrace", null);
        setIntField(term12813, term12813.getClass(), "depth", 0);
        setField(term12813, term12813.getClass(), "suppressedExceptions", null);
        setElement(term12810, 2, term12813);
        setField(term12809, term12809.getClass(), "keys", term12810);
        term12814 = (Object[]) newArray("java.lang.Object", 0);
        term12815 = newInstance(Class.forName("java.util.concurrent.TimeoutException"));
        setField(term12815, term12815.getClass(), "backtrace", null);
        setField(term12815, term12815.getClass(), "detailMessage", null);
        setField(term12815, term12815.getClass(), "cause", null);
        setField(term12815, term12815.getClass(), "stackTrace", null);
        setIntField(term12815, term12815.getClass(), "depth", 0);
        setField(term12815, term12815.getClass(), "suppressedExceptions", null);
        term12816 = newInstance(Class.forName("java.util.concurrent.TimeoutException"));
        setField(term12816, term12816.getClass(), "backtrace", null);
        setField(term12816, term12816.getClass(), "detailMessage", null);
        setField(term12816, term12816.getClass(), "cause", null);
        setField(term12816, term12816.getClass(), "stackTrace", null);
        setIntField(term12816, term12816.getClass(), "depth", 0);
        setField(term12816, term12816.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term7673;
        args[1] = term7900;
        args[2] = term7980;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12809));
        assertTrue(recursiveEquals(term7673, term12814));
        assertTrue(recursiveEquals(term7900, term12815));
        assertTrue(recursiveEquals(term7980, term12816));
    }

};


