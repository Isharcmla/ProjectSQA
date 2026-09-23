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

public class CharacterReader_advance_59428796842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;
     Object term5378;

    public CharacterReader_advance_59428796842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term552 = (char[]) newCharArray(6);
        Object[] term562 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term552, 0, 'r');
        setCharElement(term552, 1, 'b');
        setCharElement(term552, 2, 'M');
        setCharElement(term552, 3, 'u');
        setCharElement(term552, 4, 'L');
        setCharElement(term552, 5, 'c');
        setField(term551, term551.getClass(), "input", term552);
        setIntField(term551, term551.getClass(), "length", 597278769);
        setIntField(term551, term551.getClass(), "pos", -1685132342);
        setIntField(term551, term551.getClass(), "mark", -1456670397);
        setElement(term562, 0, "xOEqzGAmDU");
        setElement(term562, 1, "eZFUvlxvGV");
        setElement(term562, 2, "BYqFIqCKAV");
        setElement(term562, 3, "vrQLuWIDJX");
        setElement(term562, 4, "flxyYxBRtu");
        setField(term551, term551.getClass(), "stringCache", term562);
        term5378 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5379 = (char[]) newCharArray(6);
        Object[] term5380 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term5379, 0, 'r');
        setCharElement(term5379, 1, 'b');
        setCharElement(term5379, 2, 'M');
        setCharElement(term5379, 3, 'u');
        setCharElement(term5379, 4, 'L');
        setCharElement(term5379, 5, 'c');
        setField(term5378, term5378.getClass(), "input", term5379);
        setIntField(term5378, term5378.getClass(), "length", 597278769);
        setIntField(term5378, term5378.getClass(), "pos", -1685132341);
        setIntField(term5378, term5378.getClass(), "mark", -1456670397);
        setElement(term5380, 0, "xOEqzGAmDU");
        setElement(term5380, 1, "eZFUvlxvGV");
        setElement(term5380, 2, "BYqFIqCKAV");
        setElement(term5380, 3, "vrQLuWIDJX");
        setElement(term5380, 4, "flxyYxBRtu");
        setField(term5378, term5378.getClass(), "stringCache", term5380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term551, args);
        assertTrue(recursiveEquals(term551, term5378));
    }

};


