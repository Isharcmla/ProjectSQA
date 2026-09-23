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

public class CharacterReader_consumeHexSequence_39373751964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165;
     Object term10988;

    public CharacterReader_consumeHexSequence_39373751964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2165 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2166 = (char[]) newCharArray(8);
        Object[] term2180 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term2166, 0, 'J');
        setCharElement(term2166, 1, 'l');
        setCharElement(term2166, 2, 'h');
        setCharElement(term2166, 3, 'k');
        setCharElement(term2166, 4, 'X');
        setCharElement(term2166, 5, 'u');
        setCharElement(term2166, 6, 'u');
        setCharElement(term2166, 7, 'a');
        setField(term2165, term2165.getClass(), "charBuf", term2166);
        setField(term2165, term2165.getClass(), "reader", null);
        setIntField(term2165, term2165.getClass(), "bufLength", -663691365);
        setIntField(term2165, term2165.getClass(), "bufSplitPoint", 339854490);
        setIntField(term2165, term2165.getClass(), "bufPos", -615654495);
        setIntField(term2165, term2165.getClass(), "readerPos", -1476117762);
        setIntField(term2165, term2165.getClass(), "bufMark", -341962980);
        setElement(term2180, 0, "VgZnGoIFwQ");
        setElement(term2180, 1, "jUbSRrkrYZ");
        setElement(term2180, 2, "bWWfajKbEX");
        setField(term2165, term2165.getClass(), "stringCache", term2180);
        term10988 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term10989 = (char[]) newCharArray(8);
        Object[] term10990 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term10989, 0, 'J');
        setCharElement(term10989, 1, 'l');
        setCharElement(term10989, 2, 'h');
        setCharElement(term10989, 3, 'k');
        setCharElement(term10989, 4, 'X');
        setCharElement(term10989, 5, 'u');
        setCharElement(term10989, 6, 'u');
        setCharElement(term10989, 7, 'a');
        setField(term10988, term10988.getClass(), "charBuf", term10989);
        setField(term10988, term10988.getClass(), "reader", null);
        setIntField(term10988, term10988.getClass(), "bufLength", -663691365);
        setIntField(term10988, term10988.getClass(), "bufSplitPoint", 339854490);
        setIntField(term10988, term10988.getClass(), "bufPos", -615654495);
        setIntField(term10988, term10988.getClass(), "readerPos", -1476117762);
        setIntField(term10988, term10988.getClass(), "bufMark", -341962980);
        setElement(term10990, 0, "VgZnGoIFwQ");
        setElement(term10990, 1, "jUbSRrkrYZ");
        setElement(term10990, 2, "bWWfajKbEX");
        setField(term10988, term10988.getClass(), "stringCache", term10990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term2165, args);
        assertTrue(recursiveEquals(term2165, term10988));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


