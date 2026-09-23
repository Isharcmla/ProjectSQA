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
import java.lang.Object;

public class RandomStringUtils_random_20521094249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term50;
     Object term52;
     Object term54;
     Object term56;
     Object term58;
     Object term63;

    public RandomStringUtils_random_20521094249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = new Integer(1134449235);
        term50 = new Integer(-883034806);
        term52 = new Integer(1585847225);
        term54 = new Boolean(true);
        term56 = new Boolean(true);
        term58 = (char[]) newCharArray(4);
        setCharElement(term58, 0, 'n');
        setCharElement(term58, 1, 'Z');
        setCharElement(term58, 2, 't');
        setCharElement(term58, 3, 'T');
        term63 = newInstance(Class.forName("java.util.Random"));
        Object term64 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term64, term64.getClass(), "value", 266813808522505L);
        setField(term63, term63.getClass(), "seed", term64);
        setDoubleField(term63, term63.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term63, term63.getClass(), "haveNextNextGaussian", false);
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
        args[0] = term48;
        args[1] = term50;
        args[2] = term52;
        args[3] = term54;
        args[4] = term56;
        args[5] = term58;
        args[6] = term63;
        callMethod(klass, "random", argTypes, null, args);
    }

};


