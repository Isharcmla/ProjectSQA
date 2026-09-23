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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consume_97879059848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;

    public CharacterReader_consume_97879059848() {
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consume", argTypes, term563, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


