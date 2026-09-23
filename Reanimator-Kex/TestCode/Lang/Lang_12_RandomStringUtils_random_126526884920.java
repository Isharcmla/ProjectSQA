package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class RandomStringUtils_random_126526884920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;
     Object term141;
     Object term143;
     Object term145;
     Object term147;
     Object term149;

    public RandomStringUtils_random_126526884920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("org.apache.commons.lang3.RandomStringUtils"));
        term141 = new Integer(0);
        term143 = new Integer(0);
        term145 = new Integer(0);
        term147 = new Boolean(false);
        term149 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.RandomStringUtils");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term141;
        args[1] = term143;
        args[2] = term145;
        args[3] = term147;
        args[4] = term149;
        args[5] = null;
        callMethod(klass, "random", argTypes, term140, args);
    }

};


