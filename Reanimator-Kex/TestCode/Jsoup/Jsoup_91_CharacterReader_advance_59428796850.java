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

public class CharacterReader_advance_59428796850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;
     Object term7470;

    public CharacterReader_advance_59428796850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term755 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term756 = (char[]) newCharArray(3);
        Object[] term765 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term756, 0, 'z');
        setCharElement(term756, 1, 'x');
        setCharElement(term756, 2, 'x');
        setField(term755, term755.getClass(), "charBuf", term756);
        setField(term755, term755.getClass(), "reader", null);
        setIntField(term755, term755.getClass(), "bufLength", -1530420153);
        setIntField(term755, term755.getClass(), "bufSplitPoint", -469968304);
        setIntField(term755, term755.getClass(), "bufPos", -1145578966);
        setIntField(term755, term755.getClass(), "readerPos", 679763016);
        setIntField(term755, term755.getClass(), "bufMark", 1962444399);
        setElement(term765, 0, "TEParAifyi");
        setField(term755, term755.getClass(), "stringCache", term765);
        term7470 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term7471 = (char[]) newCharArray(3);
        Object[] term7472 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term7471, 0, 'z');
        setCharElement(term7471, 1, 'x');
        setCharElement(term7471, 2, 'x');
        setField(term7470, term7470.getClass(), "charBuf", term7471);
        setField(term7470, term7470.getClass(), "reader", null);
        setIntField(term7470, term7470.getClass(), "bufLength", -1530420153);
        setIntField(term7470, term7470.getClass(), "bufSplitPoint", -469968304);
        setIntField(term7470, term7470.getClass(), "bufPos", -1145578965);
        setIntField(term7470, term7470.getClass(), "readerPos", 679763016);
        setIntField(term7470, term7470.getClass(), "bufMark", 1962444399);
        setElement(term7472, 0, "TEParAifyi");
        setField(term7470, term7470.getClass(), "stringCache", term7472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term755, args);
        assertTrue(recursiveEquals(term755, term7470));
    }

};


