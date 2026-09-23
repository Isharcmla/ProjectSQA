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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_matchesLetter_85209721971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3193;

    public CharacterReader_matchesLetter_85209721971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3193 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3194 = (char[]) newCharArray(6);
        Object[] term3206 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3194, 0, 'a');
        setCharElement(term3194, 1, 'J');
        setCharElement(term3194, 2, 'l');
        setCharElement(term3194, 3, 'i');
        setCharElement(term3194, 4, 'e');
        setCharElement(term3194, 5, 'C');
        setField(term3193, term3193.getClass(), "charBuf", term3194);
        setField(term3193, term3193.getClass(), "reader", null);
        setIntField(term3193, term3193.getClass(), "bufLength", 2095798786);
        setIntField(term3193, term3193.getClass(), "bufSplitPoint", -1565502840);
        setIntField(term3193, term3193.getClass(), "bufPos", 344323424);
        setIntField(term3193, term3193.getClass(), "readerPos", 9726679);
        setIntField(term3193, term3193.getClass(), "bufMark", -25637976);
        setElement(term3206, 0, "hCWPJQKpdc");
        setElement(term3206, 1, "WzMEhMXkKx");
        setElement(term3206, 2, "XOiDvlDhdc");
        setElement(term3206, 3, "AdxvLJhNLe");
        setElement(term3206, 4, "lHfTrWKMPk");
        setElement(term3206, 5, "JDaAnsVTGV");
        setElement(term3206, 6, "mLUZFTfjle");
        setField(term3193, term3193.getClass(), "stringCache", term3206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesLetter", argTypes, term3193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


