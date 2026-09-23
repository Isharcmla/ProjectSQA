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

public class CharacterReader_matchesDigit_480378116188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37147;
     Object term37266;

    public CharacterReader_matchesDigit_480378116188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37147 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term37050 = (char[]) newCharArray(8);
        setIntField(term37147, term37147.getClass(), "bufPos", 6);
        setIntField(term37147, term37147.getClass(), "bufLength", 7);
        setField(term37147, term37147.getClass(), "charBuf", term37050);
        term37266 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term37267 = (char[]) newCharArray(8);
        setField(term37266, term37266.getClass(), "charBuf", term37267);
        setField(term37266, term37266.getClass(), "reader", null);
        setIntField(term37266, term37266.getClass(), "bufLength", 7);
        setIntField(term37266, term37266.getClass(), "bufSplitPoint", 0);
        setIntField(term37266, term37266.getClass(), "bufPos", 6);
        setIntField(term37266, term37266.getClass(), "readerPos", 0);
        setIntField(term37266, term37266.getClass(), "bufMark", 0);
        setField(term37266, term37266.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term37147, args);
        assertTrue(recursiveEquals(term37147, term37266));
        assertTrue(recursiveEquals(retValue, false));
    }

};


