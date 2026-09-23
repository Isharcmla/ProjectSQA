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

public class CharacterReader_bufferUp_98524938343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term5160;

    public CharacterReader_bufferUp_98524938343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term26 = (char[]) newCharArray(5);
        Object[] term37 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term26, 0, 'P');
        setCharElement(term26, 1, 'A');
        setCharElement(term26, 2, 'E');
        setCharElement(term26, 3, 'B');
        setCharElement(term26, 4, 't');
        setField(term25, term25.getClass(), "charBuf", term26);
        setField(term25, term25.getClass(), "reader", null);
        setIntField(term25, term25.getClass(), "bufLength", 1162663216);
        setIntField(term25, term25.getClass(), "bufSplitPoint", 1484323161);
        setIntField(term25, term25.getClass(), "bufPos", 391863371);
        setIntField(term25, term25.getClass(), "readerPos", -1922583790);
        setIntField(term25, term25.getClass(), "bufMark", -616727354);
        setElement(term37, 0, "sjlJAEtRrb");
        setElement(term37, 1, "MuLcgQHgqz");
        setElement(term37, 2, "xxtlPwDYFs");
        setElement(term37, 3, "jJCZpVmanW");
        setField(term25, term25.getClass(), "stringCache", term37);
        term5160 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5161 = (char[]) newCharArray(5);
        Object[] term5162 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term5161, 0, 'P');
        setCharElement(term5161, 1, 'A');
        setCharElement(term5161, 2, 'E');
        setCharElement(term5161, 3, 'B');
        setCharElement(term5161, 4, 't');
        setField(term5160, term5160.getClass(), "charBuf", term5161);
        setField(term5160, term5160.getClass(), "reader", null);
        setIntField(term5160, term5160.getClass(), "bufLength", 1162663216);
        setIntField(term5160, term5160.getClass(), "bufSplitPoint", 1484323161);
        setIntField(term5160, term5160.getClass(), "bufPos", 391863371);
        setIntField(term5160, term5160.getClass(), "readerPos", -1922583790);
        setIntField(term5160, term5160.getClass(), "bufMark", -616727354);
        setElement(term5162, 0, "sjlJAEtRrb");
        setElement(term5162, 1, "MuLcgQHgqz");
        setElement(term5162, 2, "xxtlPwDYFs");
        setElement(term5162, 3, "jJCZpVmanW");
        setField(term5160, term5160.getClass(), "stringCache", term5162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bufferUp", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term5160));
    }

};


