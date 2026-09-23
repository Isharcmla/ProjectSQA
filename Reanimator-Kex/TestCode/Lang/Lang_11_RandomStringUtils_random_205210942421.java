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

public class RandomStringUtils_random_205210942421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term152;
     Object term154;
     Object term156;
     Object term158;
     Object term160;

    public RandomStringUtils_random_205210942421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("org.apache.commons.lang3.RandomStringUtils"));
        term152 = new Integer(0);
        term154 = new Integer(0);
        term156 = new Integer(0);
        term158 = new Boolean(false);
        term160 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.RandomStringUtils");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = Array.newInstance(char.class, 0).getClass();
        argTypes[6] = Class.forName("java.util.Random");
        Object[] args = new Object[7];
        args[0] = term152;
        args[1] = term154;
        args[2] = term156;
        args[3] = term158;
        args[4] = term160;
        args[5] = null;
        args[6] = null;
        callMethod(klass, "random", argTypes, term151, args);
    }

};


