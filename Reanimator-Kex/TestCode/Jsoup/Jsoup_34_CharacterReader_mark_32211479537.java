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

public class CharacterReader_mark_32211479537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term1045;

    public CharacterReader_mark_32211479537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term100 = (char[]) newCharArray(2);
        setCharElement(term100, 0, 'c');
        setCharElement(term100, 1, 'g');
        setField(term99, term99.getClass(), "input", term100);
        setIntField(term99, term99.getClass(), "length", 1622346318);
        setIntField(term99, term99.getClass(), "pos", 1048535127);
        setIntField(term99, term99.getClass(), "mark", -655067527);
        term1045 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1046 = (char[]) newCharArray(2);
        setCharElement(term1046, 0, 'c');
        setCharElement(term1046, 1, 'g');
        setField(term1045, term1045.getClass(), "input", term1046);
        setIntField(term1045, term1045.getClass(), "length", 1622346318);
        setIntField(term1045, term1045.getClass(), "pos", 1048535127);
        setIntField(term1045, term1045.getClass(), "mark", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mark", argTypes, term99, args);
        assertTrue(recursiveEquals(term99, term1045));
    }

};


