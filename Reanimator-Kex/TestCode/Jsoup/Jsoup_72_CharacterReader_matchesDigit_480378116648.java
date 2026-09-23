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

public class CharacterReader_matchesDigit_480378116648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2371848;
     Object term2618325;

    public CharacterReader_matchesDigit_480378116648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2371848 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2371746 = (char[]) newCharArray(8);
        setIntField(term2371848, term2371848.getClass(), "bufPos", 6);
        setIntField(term2371848, term2371848.getClass(), "bufLength", 7);
        setCharElement(term2371746, 0, (char) 58);
        setCharElement(term2371746, 1, (char) 58);
        setCharElement(term2371746, 2, (char) 58);
        setCharElement(term2371746, 3, (char) 58);
        setCharElement(term2371746, 4, (char) 58);
        setCharElement(term2371746, 5, (char) 58);
        setCharElement(term2371746, 6, (char) 58);
        setCharElement(term2371746, 7, (char) 58);
        setField(term2371848, term2371848.getClass(), "charBuf", term2371746);
        term2618325 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2618326 = (char[]) newCharArray(8);
        setCharElement(term2618326, 0, (char) 58);
        setCharElement(term2618326, 1, (char) 58);
        setCharElement(term2618326, 2, (char) 58);
        setCharElement(term2618326, 3, (char) 58);
        setCharElement(term2618326, 4, (char) 58);
        setCharElement(term2618326, 5, (char) 58);
        setCharElement(term2618326, 6, (char) 58);
        setCharElement(term2618326, 7, (char) 58);
        setField(term2618325, term2618325.getClass(), "charBuf", term2618326);
        setField(term2618325, term2618325.getClass(), "reader", null);
        setIntField(term2618325, term2618325.getClass(), "bufLength", 7);
        setIntField(term2618325, term2618325.getClass(), "bufSplitPoint", 0);
        setIntField(term2618325, term2618325.getClass(), "bufPos", 6);
        setIntField(term2618325, term2618325.getClass(), "readerPos", 0);
        setIntField(term2618325, term2618325.getClass(), "bufMark", 0);
        setField(term2618325, term2618325.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term2371848, args);
        assertTrue(recursiveEquals(term2371848, term2618325));
        assertTrue(recursiveEquals(retValue, false));
    }

};


