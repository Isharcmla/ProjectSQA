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

public class CharacterReader_unconsume_105085539347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;
     Object term6517;

    public CharacterReader_unconsume_105085539347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term564 = (char[]) newCharArray(6);
        Object[] term576 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term564, 0, 'r');
        setCharElement(term564, 1, 'b');
        setCharElement(term564, 2, 'M');
        setCharElement(term564, 3, 'u');
        setCharElement(term564, 4, 'L');
        setCharElement(term564, 5, 'c');
        setField(term563, term563.getClass(), "charBuf", term564);
        setField(term563, term563.getClass(), "reader", null);
        setIntField(term563, term563.getClass(), "bufLength", 590364439);
        setIntField(term563, term563.getClass(), "bufSplitPoint", 865208305);
        setIntField(term563, term563.getClass(), "bufPos", -1275173084);
        setIntField(term563, term563.getClass(), "readerPos", -244121226);
        setIntField(term563, term563.getClass(), "bufMark", -203030934);
        setElement(term576, 0, "xOEqzGAmDU");
        setElement(term576, 1, "eZFUvlxvGV");
        setElement(term576, 2, "BYqFIqCKAV");
        setElement(term576, 3, "vrQLuWIDJX");
        setElement(term576, 4, "flxyYxBRtu");
        setField(term563, term563.getClass(), "stringCache", term576);
        term6517 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6518 = (char[]) newCharArray(6);
        Object[] term6519 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term6518, 0, 'r');
        setCharElement(term6518, 1, 'b');
        setCharElement(term6518, 2, 'M');
        setCharElement(term6518, 3, 'u');
        setCharElement(term6518, 4, 'L');
        setCharElement(term6518, 5, 'c');
        setField(term6517, term6517.getClass(), "charBuf", term6518);
        setField(term6517, term6517.getClass(), "reader", null);
        setIntField(term6517, term6517.getClass(), "bufLength", 590364439);
        setIntField(term6517, term6517.getClass(), "bufSplitPoint", 865208305);
        setIntField(term6517, term6517.getClass(), "bufPos", -1275173085);
        setIntField(term6517, term6517.getClass(), "readerPos", -244121226);
        setIntField(term6517, term6517.getClass(), "bufMark", -203030934);
        setElement(term6519, 0, "xOEqzGAmDU");
        setElement(term6519, 1, "eZFUvlxvGV");
        setElement(term6519, 2, "BYqFIqCKAV");
        setElement(term6519, 3, "vrQLuWIDJX");
        setElement(term6519, 4, "flxyYxBRtu");
        setField(term6517, term6517.getClass(), "stringCache", term6519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unconsume", argTypes, term563, args);
        assertTrue(recursiveEquals(term563, term6517));
    }

};


