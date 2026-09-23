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

public class CharacterReader_init_39390631730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588;

    public CharacterReader_init_39390631730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term589 = (char[]) newCharArray(10);
        setCharElement(term589, 0, 'P');
        setCharElement(term589, 1, 'A');
        setCharElement(term589, 2, 'E');
        setCharElement(term589, 3, 'B');
        setCharElement(term589, 4, 't');
        setCharElement(term589, 5, 'n');
        setCharElement(term589, 6, 'Z');
        setCharElement(term589, 7, 't');
        setCharElement(term589, 8, 'T');
        setCharElement(term589, 9, 'D');
        setField(term588, term588.getClass(), "input", term589);
        setIntField(term588, term588.getClass(), "length", 10);
        setIntField(term588, term588.getClass(), "pos", 0);
        setIntField(term588, term588.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term588));
    }

};


