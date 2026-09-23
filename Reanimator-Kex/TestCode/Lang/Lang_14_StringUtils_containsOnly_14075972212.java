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
import static org.apache.commons.lang3.EqualityUtils.*;

public class StringUtils_containsOnly_14075972212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580;
     Object term7774;

    public StringUtils_containsOnly_14075972212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580 = (char[]) newCharArray(6);
        setCharElement(term580, 0, 'T');
        setCharElement(term580, 1, 'D');
        setCharElement(term580, 2, 's');
        setCharElement(term580, 3, 'j');
        setCharElement(term580, 4, 'l');
        setCharElement(term580, 5, 'J');
        term7774 = (char[]) newCharArray(6);
        setCharElement(term7774, 0, 'T');
        setCharElement(term7774, 1, 'D');
        setCharElement(term7774, 2, 's');
        setCharElement(term7774, 3, 'j');
        setCharElement(term7774, 4, 'l');
        setCharElement(term7774, 5, 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term580;
        Object retValue = callMethod(klass, "containsOnly", argTypes, null, args);
        assertTrue(recursiveEquals(term580, term7774));
        assertTrue(recursiveEquals(retValue, false));
    }

};


