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

public class MultiKey_size_72327285221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term569;

    public MultiKey_size_72327285221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term42 = (Object[]) newArray("java.lang.Object", 1);
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        setElement(term42, 0, term43);
        setField(term41, term41.getClass(), "keys", term42);
        term569 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term570 = (Object[]) newArray("java.lang.Object", 1);
        Object term571 = newInstance(Class.forName("java.lang.Object"));
        setElement(term570, 0, term571);
        setField(term569, term569.getClass(), "keys", term570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term41, args);
        assertTrue(recursiveEquals(term41, term569));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


