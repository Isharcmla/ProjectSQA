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

public class CharacterReader_mark_32211479549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;
     Object term6759;

    public CharacterReader_mark_32211479549() {
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
        term6759 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6760 = (char[]) newCharArray(3);
        Object[] term6761 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term6760, 0, 'z');
        setCharElement(term6760, 1, 'x');
        setCharElement(term6760, 2, 'x');
        setField(term6759, term6759.getClass(), "charBuf", term6760);
        setField(term6759, term6759.getClass(), "reader", null);
        setIntField(term6759, term6759.getClass(), "bufLength", -1530420153);
        setIntField(term6759, term6759.getClass(), "bufSplitPoint", -469968304);
        setIntField(term6759, term6759.getClass(), "bufPos", -1145578966);
        setIntField(term6759, term6759.getClass(), "readerPos", 679763016);
        setIntField(term6759, term6759.getClass(), "bufMark", -1145578966);
        setElement(term6761, 0, "TEParAifyi");
        setField(term6759, term6759.getClass(), "stringCache", term6761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mark", argTypes, term755, args);
        assertTrue(recursiveEquals(term755, term6759));
    }

};


