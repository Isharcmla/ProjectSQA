package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class LocalDateTime_init_6392399312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670;

    public LocalDateTime_init_6392399312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term670;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


