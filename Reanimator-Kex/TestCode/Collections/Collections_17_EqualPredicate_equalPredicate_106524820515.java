package org.apache.commons.collections.functors;

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
import static org.apache.commons.collections.functors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.functors.EqualityUtils.*;

public class EqualPredicate_equalPredicate_106524820515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534;

    public EqualPredicate_equalPredicate_106524820515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534 = newInstance(Class.forName("org.apache.commons.collections.functors.NullPredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.functors.EqualPredicate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.apache.commons.collections.functors.Equator");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "equalPredicate", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term534));
    }

};


