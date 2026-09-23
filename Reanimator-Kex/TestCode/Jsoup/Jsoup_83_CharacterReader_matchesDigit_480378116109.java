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

public class CharacterReader_matchesDigit_480378116109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20758;
     Object term21045;

    public CharacterReader_matchesDigit_480378116109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20758 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term20658 = (char[]) newCharArray(8);
        setIntField(term20758, term20758.getClass(), "bufPos", 6);
        setIntField(term20758, term20758.getClass(), "bufSplitPoint", 7);
        setIntField(term20758, term20758.getClass(), "bufLength", 7);
        setField(term20758, term20758.getClass(), "charBuf", term20658);
        term21045 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term21046 = (char[]) newCharArray(8);
        setField(term21045, term21045.getClass(), "charBuf", term21046);
        setField(term21045, term21045.getClass(), "reader", null);
        setIntField(term21045, term21045.getClass(), "bufLength", 7);
        setIntField(term21045, term21045.getClass(), "bufSplitPoint", 7);
        setIntField(term21045, term21045.getClass(), "bufPos", 6);
        setIntField(term21045, term21045.getClass(), "readerPos", 0);
        setIntField(term21045, term21045.getClass(), "bufMark", 0);
        setField(term21045, term21045.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term20758, args);
        assertTrue(recursiveEquals(term20758, term21045));
        assertTrue(recursiveEquals(retValue, false));
    }

};


