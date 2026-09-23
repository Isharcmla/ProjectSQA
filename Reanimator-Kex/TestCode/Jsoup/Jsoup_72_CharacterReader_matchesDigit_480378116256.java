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

public class CharacterReader_matchesDigit_480378116256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54175;
     Object term54350;

    public CharacterReader_matchesDigit_480378116256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54175 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term54074 = (char[]) newCharArray(8);
        setIntField(term54175, term54175.getClass(), "bufPos", 6);
        setIntField(term54175, term54175.getClass(), "bufLength", 7);
        setCharElement(term54074, 0, (char) 48);
        setCharElement(term54074, 1, (char) 48);
        setCharElement(term54074, 2, (char) 48);
        setCharElement(term54074, 3, (char) 48);
        setCharElement(term54074, 4, (char) 48);
        setCharElement(term54074, 5, (char) 48);
        setCharElement(term54074, 6, (char) 48);
        setCharElement(term54074, 7, (char) 48);
        setField(term54175, term54175.getClass(), "charBuf", term54074);
        term54350 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term54351 = (char[]) newCharArray(8);
        setCharElement(term54351, 0, (char) 48);
        setCharElement(term54351, 1, (char) 48);
        setCharElement(term54351, 2, (char) 48);
        setCharElement(term54351, 3, (char) 48);
        setCharElement(term54351, 4, (char) 48);
        setCharElement(term54351, 5, (char) 48);
        setCharElement(term54351, 6, (char) 48);
        setCharElement(term54351, 7, (char) 48);
        setField(term54350, term54350.getClass(), "charBuf", term54351);
        setField(term54350, term54350.getClass(), "reader", null);
        setIntField(term54350, term54350.getClass(), "bufLength", 7);
        setIntField(term54350, term54350.getClass(), "bufSplitPoint", 0);
        setIntField(term54350, term54350.getClass(), "bufPos", 6);
        setIntField(term54350, term54350.getClass(), "readerPos", 0);
        setIntField(term54350, term54350.getClass(), "bufMark", 0);
        setField(term54350, term54350.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term54175, args);
        assertTrue(recursiveEquals(term54175, term54350));
        assertTrue(recursiveEquals(retValue, true));
    }

};


