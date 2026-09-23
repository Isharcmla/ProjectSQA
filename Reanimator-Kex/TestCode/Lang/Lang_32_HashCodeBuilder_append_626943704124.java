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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class HashCodeBuilder_append_626943704124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34471;
     Object term34033;

    public HashCodeBuilder_append_626943704124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34471 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term34471, term34471.getClass(), "iTotal", 0);
        setIntField(term34471, term34471.getClass(), "iConstant", 0);
        Class<? extends Object> term34489 = Class.forName((String) "java.lang.module.Resolver");
        term34033 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term34036 = (Object[]) newArray("java.lang.Object", 0);
        Object term34575 = newInstance(Class.forName("java.util.Collections$UnmodifiableNavigableSet$EmptyNavigableSet"));
        Object term34709 = newInstance(Class.forName("java.util.Collections$UnmodifiableNavigableSet$EmptyNavigableSet"));
        setElement(term34033, 0, term34489);
        setElement(term34033, 1, "int");
        setElement(term34033, 2, term34036);
        setElement(term34033, 3, term34575);
        setElement(term34033, 4, term34709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term34033;
        try {
            callMethod(klass, "append", argTypes, term34471, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


