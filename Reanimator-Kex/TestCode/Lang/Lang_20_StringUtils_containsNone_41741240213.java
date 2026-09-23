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

public class StringUtils_containsNone_41741240213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615;
     Object term7038;

    public StringUtils_containsNone_41741240213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615 = (char[]) newCharArray(2);
        setCharElement(term615, 0, 'A');
        setCharElement(term615, 1, 'E');
        term7038 = (char[]) newCharArray(2);
        setCharElement(term7038, 0, 'A');
        setCharElement(term7038, 1, 'E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term615;
        Object retValue = callMethod(klass, "containsNone", argTypes, null, args);
        assertTrue(recursiveEquals(term615, term7038));
        assertTrue(recursiveEquals(retValue, true));
    }

};


