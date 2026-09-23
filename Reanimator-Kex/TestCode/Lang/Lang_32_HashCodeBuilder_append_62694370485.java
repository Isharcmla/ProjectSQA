package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.lang.Object;

public class HashCodeBuilder_append_62694370485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9559;
     Object term9188;
     Object term9737;
     Object term9738;
     Object term9717;

    public HashCodeBuilder_append_62694370485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9559 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term9559, term9559.getClass(), "iTotal", 0);
        setIntField(term9559, term9559.getClass(), "iConstant", 0);
        term9188 = (Object[]) newArray("java.lang.Object", 2);
        Object term9610 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        Object term9712 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        setElement(term9188, 0, term9610);
        setElement(term9188, 1, term9712);
        term9737 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term9737, term9737.getClass(), "iConstant", 0);
        setIntField(term9737, term9737.getClass(), "iTotal", 1489271211);
        term9738 = (Object[]) newArray("java.lang.Object", 2);
        Object term9739 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        Object term9740 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        setIntField(term9739, term9739.getClass(), "remaining", 0);
        setIntField(term9739, term9739.getClass(), "idx", 0);
        setField(term9739, term9739.getClass(), "this$0", null);
        setElement(term9738, 0, term9739);
        setIntField(term9740, term9740.getClass(), "remaining", 0);
        setIntField(term9740, term9740.getClass(), "idx", 0);
        setField(term9740, term9740.getClass(), "this$0", null);
        setElement(term9738, 1, term9740);
        term9717 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term9717, term9717.getClass(), "iConstant", 0);
        setIntField(term9717, term9717.getClass(), "iTotal", 1489271211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9188;
        Object retValue = callMethod(klass, "append", argTypes, term9559, args);
        assertTrue(recursiveEquals(term9559, term9737));
        assertTrue(recursiveEquals(term9188, term9738));
        assertTrue(recursiveEquals(retValue, term9717));
    }

};


