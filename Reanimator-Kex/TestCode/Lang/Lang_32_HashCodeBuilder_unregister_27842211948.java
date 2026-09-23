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

public class HashCodeBuilder_unregister_27842211948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;
     Object term4879;
     Object term4881;

    public HashCodeBuilder_unregister_27842211948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("java.lang.Object"));
        term4879 = newInstance(Class.forName("org.apache.commons.lang3.builder.IDKey"));
        Object term4880 = newInstance(Class.forName("java.lang.Object"));
        setField(term4879, term4879.getClass(), "value", term4880);
        setIntField(term4879, term4879.getClass(), "id", 215988820);
        term4881 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term310;
        callMethod(klass, "unregister", argTypes, null, args);
        assertTrue(recursiveEquals(null, term4879));
        assertTrue(recursiveEquals(term310, term4881));
    }

};


