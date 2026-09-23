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

public class CharacterReader_mark_32211479551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791;
     Object term6810;

    public CharacterReader_mark_32211479551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term792 = (char[]) newCharArray(0);
        Object[] term798 = (Object[]) newArray("java.lang.String", 2);
        setField(term791, term791.getClass(), "charBuf", term792);
        setField(term791, term791.getClass(), "reader", null);
        setIntField(term791, term791.getClass(), "bufLength", 767834723);
        setIntField(term791, term791.getClass(), "bufSplitPoint", -602026508);
        setIntField(term791, term791.getClass(), "bufPos", -157887805);
        setIntField(term791, term791.getClass(), "readerPos", 1876565163);
        setIntField(term791, term791.getClass(), "bufMark", -817164822);
        setElement(term798, 0, "OWDIEULEFu");
        setElement(term798, 1, "dWRymuLBtr");
        setField(term791, term791.getClass(), "stringCache", term798);
        term6810 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6814 = (char[]) newCharArray(0);
        Object[] term6819 = (Object[]) newArray("java.lang.String", 2);
        setField(term6810, term6810.getClass(), "charBuf", term6814);
        setField(term6810, term6810.getClass(), "reader", null);
        setIntField(term6810, term6810.getClass(), "bufLength", 767834723);
        setIntField(term6810, term6810.getClass(), "bufSplitPoint", -602026508);
        setIntField(term6810, term6810.getClass(), "bufPos", -157887805);
        setIntField(term6810, term6810.getClass(), "readerPos", 1876565163);
        setIntField(term6810, term6810.getClass(), "bufMark", -157887805);
        setElement(term6819, 0, "OWDIEULEFu");
        setElement(term6819, 1, "dWRymuLBtr");
        setField(term6810, term6810.getClass(), "stringCache", term6819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mark", argTypes, term791, args);
        assertTrue(recursiveEquals(term791, term6810));
    }

};


