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

public class CharacterReader_matchesDigit_480378116194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37909;
     Object term38027;

    public CharacterReader_matchesDigit_480378116194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37909 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term37805 = (char[]) newCharArray(8);
        setIntField(term37909, term37909.getClass(), "bufPos", 6);
        setIntField(term37909, term37909.getClass(), "bufSplitPoint", 7);
        setIntField(term37909, term37909.getClass(), "bufLength", 7);
        setCharElement(term37805, 0, (char) 48);
        setCharElement(term37805, 1, (char) 48);
        setCharElement(term37805, 2, (char) 48);
        setCharElement(term37805, 3, (char) 48);
        setCharElement(term37805, 4, (char) 48);
        setCharElement(term37805, 5, (char) 48);
        setCharElement(term37805, 6, (char) 48);
        setCharElement(term37805, 7, (char) 48);
        setField(term37909, term37909.getClass(), "charBuf", term37805);
        term38027 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term38028 = (char[]) newCharArray(8);
        setCharElement(term38028, 0, (char) 48);
        setCharElement(term38028, 1, (char) 48);
        setCharElement(term38028, 2, (char) 48);
        setCharElement(term38028, 3, (char) 48);
        setCharElement(term38028, 4, (char) 48);
        setCharElement(term38028, 5, (char) 48);
        setCharElement(term38028, 6, (char) 48);
        setCharElement(term38028, 7, (char) 48);
        setField(term38027, term38027.getClass(), "charBuf", term38028);
        setField(term38027, term38027.getClass(), "reader", null);
        setIntField(term38027, term38027.getClass(), "bufLength", 7);
        setIntField(term38027, term38027.getClass(), "bufSplitPoint", 7);
        setIntField(term38027, term38027.getClass(), "bufPos", 6);
        setIntField(term38027, term38027.getClass(), "readerPos", 0);
        setIntField(term38027, term38027.getClass(), "bufMark", 0);
        setField(term38027, term38027.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term37909, args);
        assertTrue(recursiveEquals(term37909, term38027));
        assertTrue(recursiveEquals(retValue, true));
    }

};


