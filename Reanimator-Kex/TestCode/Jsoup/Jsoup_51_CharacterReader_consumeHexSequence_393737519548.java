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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeHexSequence_393737519548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4374105;

    public CharacterReader_consumeHexSequence_393737519548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4374105 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4373884 = (char[]) newCharArray(32);
        setIntField(term4374105, term4374105.getClass(), "pos", 7);
        setIntField(term4374105, term4374105.getClass(), "length", 11);
        setCharElement(term4373884, 0, 'd');
        setCharElement(term4373884, 1, 'd');
        setCharElement(term4373884, 2, 'd');
        setCharElement(term4373884, 3, 'd');
        setCharElement(term4373884, 4, 'd');
        setCharElement(term4373884, 5, 'd');
        setCharElement(term4373884, 6, 'd');
        setCharElement(term4373884, 7, 'd');
        setCharElement(term4373884, 8, (char) 48);
        setCharElement(term4373884, 9, (char) 60);
        setCharElement(term4373884, 10, 'd');
        setCharElement(term4373884, 11, 'd');
        setCharElement(term4373884, 12, 'd');
        setCharElement(term4373884, 13, 'd');
        setCharElement(term4373884, 14, 'd');
        setCharElement(term4373884, 15, 'd');
        setCharElement(term4373884, 16, 'd');
        setCharElement(term4373884, 17, 'd');
        setCharElement(term4373884, 18, 'd');
        setCharElement(term4373884, 19, 'd');
        setCharElement(term4373884, 20, 'd');
        setCharElement(term4373884, 21, 'd');
        setCharElement(term4373884, 22, 'd');
        setCharElement(term4373884, 23, 'd');
        setCharElement(term4373884, 24, 'd');
        setCharElement(term4373884, 25, 'd');
        setCharElement(term4373884, 26, 'd');
        setCharElement(term4373884, 27, 'd');
        setCharElement(term4373884, 28, 'd');
        setCharElement(term4373884, 29, 'd');
        setCharElement(term4373884, 30, 'd');
        setCharElement(term4373884, 31, 'd');
        setField(term4374105, term4374105.getClass(), "input", term4373884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4374105, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


