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
import java.lang.Object;
import java.lang.Character;

public class StringUtils_join_1313170632248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1769;
     Object term1771;
     Object term10718;

    public StringUtils_join_1313170632248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1769 = (Object[]) newArray("java.lang.Object", 1);
        Object term1770 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1769, 0, term1770);
        term1771 = new Character('b');
        term10718 = (Object[]) newArray("java.lang.Object", 1);
        Object term10719 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10718, 0, term10719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1769;
        args[1] = term1771;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1769, term10718));
        assertTrue(recursiveEquals(term1771, 'b'));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@4ee39acd"));
    }

};


