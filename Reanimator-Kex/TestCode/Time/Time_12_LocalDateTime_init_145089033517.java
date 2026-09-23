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
import java.lang.Integer;

public class LocalDateTime_init_145089033517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term687;
     Object term689;
     Object term691;
     Object term693;
     Object term695;

    public LocalDateTime_init_145089033517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = new Integer(-1955890973);
        term687 = new Integer(-2038273078);
        term689 = new Integer(1227103734);
        term691 = new Integer(-1339778481);
        term693 = new Integer(1725571209);
        term695 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term685;
        args[1] = term687;
        args[2] = term689;
        args[3] = term691;
        args[4] = term693;
        args[5] = term695;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


