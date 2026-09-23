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

public class CharacterReader_matchesLetter_852097219165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30238;
     Object term32220;

    public CharacterReader_matchesLetter_852097219165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30238 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term30238, term30238.getClass(), "bufPos", -2147483648);
        setIntField(term30238, term30238.getClass(), "bufLength", -2147483648);
        term32220 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term32220, term32220.getClass(), "charBuf", null);
        setField(term32220, term32220.getClass(), "reader", null);
        setIntField(term32220, term32220.getClass(), "bufLength", -2147483648);
        setIntField(term32220, term32220.getClass(), "bufSplitPoint", 0);
        setIntField(term32220, term32220.getClass(), "bufPos", -2147483648);
        setIntField(term32220, term32220.getClass(), "readerPos", 0);
        setIntField(term32220, term32220.getClass(), "bufMark", 0);
        setField(term32220, term32220.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term30238, args);
        assertTrue(recursiveEquals(term30238, term32220));
        assertTrue(recursiveEquals(retValue, false));
    }

};


