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
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_init_39390631736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4312;

    public CharacterReader_init_39390631736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4312 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4313 = (char[]) newCharArray(10);
        Object[] term4314 = (Object[]) newArray("java.lang.String", 512);
        setCharElement(term4313, 0, 'P');
        setCharElement(term4313, 1, 'A');
        setCharElement(term4313, 2, 'E');
        setCharElement(term4313, 3, 'B');
        setCharElement(term4313, 4, 't');
        setCharElement(term4313, 5, 'n');
        setCharElement(term4313, 6, 'Z');
        setCharElement(term4313, 7, 't');
        setCharElement(term4313, 8, 'T');
        setCharElement(term4313, 9, 'D');
        setField(term4312, term4312.getClass(), "input", term4313);
        setIntField(term4312, term4312.getClass(), "length", 10);
        setIntField(term4312, term4312.getClass(), "pos", 0);
        setIntField(term4312, term4312.getClass(), "mark", 0);
        setField(term4312, term4312.getClass(), "stringCache", term4314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4312));
    }

};


