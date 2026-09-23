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

public class CharacterReader_matchesDigit_480378116224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44954;
     Object term46589;

    public CharacterReader_matchesDigit_480378116224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44954 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term44850 = (char[]) newCharArray(8);
        setIntField(term44954, term44954.getClass(), "bufPos", 6);
        setIntField(term44954, term44954.getClass(), "bufSplitPoint", 7);
        setIntField(term44954, term44954.getClass(), "bufLength", 7);
        setCharElement(term44850, 0, (char) 48);
        setCharElement(term44850, 1, (char) 48);
        setCharElement(term44850, 2, (char) 48);
        setCharElement(term44850, 3, (char) 48);
        setCharElement(term44850, 4, (char) 48);
        setCharElement(term44850, 5, (char) 48);
        setCharElement(term44850, 6, (char) 48);
        setCharElement(term44850, 7, (char) 48);
        setField(term44954, term44954.getClass(), "charBuf", term44850);
        term46589 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term46590 = (char[]) newCharArray(8);
        setCharElement(term46590, 0, (char) 48);
        setCharElement(term46590, 1, (char) 48);
        setCharElement(term46590, 2, (char) 48);
        setCharElement(term46590, 3, (char) 48);
        setCharElement(term46590, 4, (char) 48);
        setCharElement(term46590, 5, (char) 48);
        setCharElement(term46590, 6, (char) 48);
        setCharElement(term46590, 7, (char) 48);
        setField(term46589, term46589.getClass(), "charBuf", term46590);
        setField(term46589, term46589.getClass(), "reader", null);
        setIntField(term46589, term46589.getClass(), "bufLength", 7);
        setIntField(term46589, term46589.getClass(), "bufSplitPoint", 7);
        setIntField(term46589, term46589.getClass(), "bufPos", 6);
        setIntField(term46589, term46589.getClass(), "readerPos", 0);
        setIntField(term46589, term46589.getClass(), "bufMark", 0);
        setField(term46589, term46589.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term44954, args);
        assertTrue(recursiveEquals(term44954, term46589));
        assertTrue(recursiveEquals(retValue, true));
    }

};


