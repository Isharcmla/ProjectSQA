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

public class RandomStringUtils_random_12652688498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term29;
     Object term31;
     Object term33;
     Object term35;
     Object term37;

    public RandomStringUtils_random_12652688498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = new Integer(-1339778481);
        term29 = new Integer(1725571209);
        term31 = new Integer(-522618178);
        term33 = new Boolean(true);
        term35 = new Boolean(true);
        term37 = (char[]) newCharArray(5);
        setCharElement(term37, 0, 'P');
        setCharElement(term37, 1, 'A');
        setCharElement(term37, 2, 'E');
        setCharElement(term37, 3, 'B');
        setCharElement(term37, 4, 't');
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
        args[0] = term27;
        args[1] = term29;
        args[2] = term31;
        args[3] = term33;
        args[4] = term35;
        args[5] = term37;
        callMethod(klass, "random", argTypes, null, args);
    }

};


