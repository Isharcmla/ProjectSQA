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

public class MultiKey_hashCode_214593743024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term642;

    public MultiKey_hashCode_214593743024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term61 = (Object[]) newArray("java.lang.Object", 1);
        Object term62 = newInstance(Class.forName("java.lang.Object"));
        setElement(term61, 0, term62);
        setField(term60, term60.getClass(), "keys", term61);
        term642 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term643 = (Object[]) newArray("java.lang.Object", 1);
        Object term644 = newInstance(Class.forName("java.lang.Object"));
        setElement(term643, 0, term644);
        setField(term642, term642.getClass(), "keys", term643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term642));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


