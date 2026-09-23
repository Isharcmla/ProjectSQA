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

public class CharacterReader_consume_97879059834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term993;

    public CharacterReader_consume_97879059834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term63 = (char[]) newCharArray(4);
        setCharElement(term63, 0, 'l');
        setCharElement(term63, 1, 'J');
        setCharElement(term63, 2, 'A');
        setCharElement(term63, 3, 'E');
        setField(term62, term62.getClass(), "input", term63);
        setIntField(term62, term62.getClass(), "length", -1339778481);
        setIntField(term62, term62.getClass(), "pos", 1725571209);
        setIntField(term62, term62.getClass(), "mark", -522618178);
        term993 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term994 = (char[]) newCharArray(4);
        setCharElement(term994, 0, 'l');
        setCharElement(term994, 1, 'J');
        setCharElement(term994, 2, 'A');
        setCharElement(term994, 3, 'E');
        setField(term993, term993.getClass(), "input", term994);
        setIntField(term993, term993.getClass(), "length", -1339778481);
        setIntField(term993, term993.getClass(), "pos", 1725571210);
        setIntField(term993, term993.getClass(), "mark", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consume", argTypes, term62, args);
        assertTrue(recursiveEquals(term62, term993));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


