package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;

public class Soundex_init_22299116412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675;

    public Soundex_init_22299116412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term676 = (char[]) newCharArray(26);
        setIntField(term675, term675.getClass(), "maxLength", 4);
        setCharElement(term676, 0, (char) 48);
        setCharElement(term676, 1, (char) 49);
        setCharElement(term676, 2, (char) 50);
        setCharElement(term676, 3, (char) 51);
        setCharElement(term676, 4, (char) 48);
        setCharElement(term676, 5, (char) 49);
        setCharElement(term676, 6, (char) 50);
        setCharElement(term676, 7, (char) 48);
        setCharElement(term676, 8, (char) 48);
        setCharElement(term676, 9, (char) 50);
        setCharElement(term676, 10, (char) 50);
        setCharElement(term676, 11, (char) 52);
        setCharElement(term676, 12, (char) 53);
        setCharElement(term676, 13, (char) 53);
        setCharElement(term676, 14, (char) 48);
        setCharElement(term676, 15, (char) 49);
        setCharElement(term676, 16, (char) 50);
        setCharElement(term676, 17, (char) 54);
        setCharElement(term676, 18, (char) 50);
        setCharElement(term676, 19, (char) 51);
        setCharElement(term676, 20, (char) 48);
        setCharElement(term676, 21, (char) 49);
        setCharElement(term676, 22, (char) 48);
        setCharElement(term676, 23, (char) 50);
        setCharElement(term676, 24, (char) 48);
        setCharElement(term676, 25, (char) 50);
        setField(term675, term675.getClass(), "soundexMapping", term676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term675));
    }

};


