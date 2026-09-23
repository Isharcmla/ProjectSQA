package org.mockito.internal.configuration.injection.filter;

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
import static org.mockito.internal.configuration.injection.filter.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.configuration.injection.filter.EqualityUtils.*;

public class TypeBasedCandidateFilter_init_19573214202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TypeBasedCandidateFilter_init_19573214202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.configuration.injection.filter.MockCandidateFilter");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


