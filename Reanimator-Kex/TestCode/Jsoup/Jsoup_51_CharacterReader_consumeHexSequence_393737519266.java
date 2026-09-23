package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeHexSequence_393737519266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350681;

    public CharacterReader_consumeHexSequence_393737519266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350681 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term350357 = (char[]) newCharArray(61);
        Object[] term350543 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term350681, term350681.getClass(), "pos", -5089);
        setIntField(term350681, term350681.getClass(), "length", -5087);
        setCharElement(term350357, 0, (char) 50);
        setCharElement(term350357, 1, (char) 50);
        setCharElement(term350357, 2, (char) 50);
        setCharElement(term350357, 3, (char) 50);
        setCharElement(term350357, 4, (char) 50);
        setCharElement(term350357, 5, (char) 50);
        setCharElement(term350357, 6, (char) 50);
        setCharElement(term350357, 7, (char) 50);
        setCharElement(term350357, 8, (char) 50);
        setCharElement(term350357, 9, (char) 50);
        setCharElement(term350357, 10, (char) 50);
        setCharElement(term350357, 11, (char) 50);
        setCharElement(term350357, 12, (char) 50);
        setCharElement(term350357, 13, (char) 50);
        setCharElement(term350357, 14, (char) 50);
        setCharElement(term350357, 15, (char) 50);
        setCharElement(term350357, 16, (char) 50);
        setCharElement(term350357, 17, (char) 50);
        setCharElement(term350357, 18, (char) 50);
        setCharElement(term350357, 19, (char) 50);
        setCharElement(term350357, 20, (char) 50);
        setCharElement(term350357, 21, (char) 50);
        setCharElement(term350357, 22, (char) 50);
        setCharElement(term350357, 23, (char) 50);
        setCharElement(term350357, 24, (char) 50);
        setCharElement(term350357, 25, (char) 50);
        setCharElement(term350357, 26, (char) 50);
        setCharElement(term350357, 27, (char) 50);
        setCharElement(term350357, 28, (char) 50);
        setCharElement(term350357, 29, (char) 50);
        setCharElement(term350357, 30, (char) 50);
        setCharElement(term350357, 31, (char) 50);
        setCharElement(term350357, 32, (char) 50);
        setCharElement(term350357, 33, (char) 50);
        setCharElement(term350357, 34, (char) 50);
        setCharElement(term350357, 35, (char) 50);
        setCharElement(term350357, 36, (char) 50);
        setCharElement(term350357, 37, (char) 50);
        setCharElement(term350357, 38, (char) 50);
        setCharElement(term350357, 39, (char) 50);
        setCharElement(term350357, 40, (char) 50);
        setCharElement(term350357, 41, (char) 50);
        setCharElement(term350357, 42, (char) 50);
        setCharElement(term350357, 43, (char) 50);
        setCharElement(term350357, 44, (char) 50);
        setCharElement(term350357, 45, (char) 50);
        setCharElement(term350357, 46, (char) 50);
        setCharElement(term350357, 47, (char) 50);
        setCharElement(term350357, 48, (char) 50);
        setCharElement(term350357, 49, (char) 50);
        setCharElement(term350357, 50, (char) 50);
        setCharElement(term350357, 51, (char) 50);
        setCharElement(term350357, 52, (char) 50);
        setCharElement(term350357, 53, (char) 50);
        setCharElement(term350357, 54, (char) 50);
        setCharElement(term350357, 55, (char) 50);
        setCharElement(term350357, 56, (char) 50);
        setCharElement(term350357, 57, (char) 50);
        setCharElement(term350357, 58, (char) 50);
        setCharElement(term350357, 59, (char) 50);
        setCharElement(term350357, 60, (char) 50);
        setCharElement(term350357, -5089, (char) 50);
        setCharElement(term350357, -5088, (char) 52);
        setField(term350681, term350681.getClass(), "input", term350357);
        setField(term350681, term350681.getClass(), "stringCache", term350543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term350681, args);
    }

};


