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

public class MultiKey_hashCode_182776273423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term599;

    public MultiKey_hashCode_182776273423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term54 = (Object[]) newArray("java.lang.Object", 2);
        Object term55 = newInstance(Class.forName("java.lang.Object"));
        Object term56 = newInstance(Class.forName("java.lang.Object"));
        setElement(term54, 0, term55);
        setElement(term54, 1, term56);
        setField(term53, term53.getClass(), "keys", term54);
        term599 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term600 = (Object[]) newArray("java.lang.Object", 2);
        Object term601 = newInstance(Class.forName("java.lang.Object"));
        Object term602 = newInstance(Class.forName("java.lang.Object"));
        setElement(term600, 0, term601);
        setElement(term600, 1, term602);
        setField(term599, term599.getClass(), "keys", term600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term53, args);
        assertTrue(recursiveEquals(term53, term599));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


