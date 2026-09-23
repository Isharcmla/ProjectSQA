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

public class CharacterReader_matchesDigit_480378116129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24837;
     Object term25124;

    public CharacterReader_matchesDigit_480378116129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24837 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term24737 = (char[]) newCharArray(8);
        setIntField(term24837, term24837.getClass(), "bufPos", 6);
        setIntField(term24837, term24837.getClass(), "bufSplitPoint", 7);
        setIntField(term24837, term24837.getClass(), "bufLength", 7);
        setField(term24837, term24837.getClass(), "charBuf", term24737);
        term25124 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term25125 = (char[]) newCharArray(8);
        setField(term25124, term25124.getClass(), "charBuf", term25125);
        setField(term25124, term25124.getClass(), "reader", null);
        setIntField(term25124, term25124.getClass(), "bufLength", 7);
        setIntField(term25124, term25124.getClass(), "bufSplitPoint", 7);
        setIntField(term25124, term25124.getClass(), "bufPos", 6);
        setIntField(term25124, term25124.getClass(), "readerPos", 0);
        setIntField(term25124, term25124.getClass(), "bufMark", 0);
        setField(term25124, term25124.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term24837, args);
        assertTrue(recursiveEquals(term24837, term25124));
        assertTrue(recursiveEquals(retValue, false));
    }

};


