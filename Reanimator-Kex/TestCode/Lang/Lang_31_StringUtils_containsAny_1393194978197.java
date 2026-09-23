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

public class StringUtils_containsAny_1393194978197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1294;
     Object term9383;

    public StringUtils_containsAny_1393194978197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1294 = (char[]) newCharArray(4);
        setCharElement(term1294, 0, 'T');
        setCharElement(term1294, 1, 'D');
        setCharElement(term1294, 2, 's');
        setCharElement(term1294, 3, 'j');
        term9383 = (char[]) newCharArray(4);
        setCharElement(term9383, 0, 'T');
        setCharElement(term9383, 1, 'D');
        setCharElement(term9383, 2, 's');
        setCharElement(term9383, 3, 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1294;
        Object retValue = callMethod(klass, "containsAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1294, term9383));
        assertTrue(recursiveEquals(retValue, false));
    }

};


