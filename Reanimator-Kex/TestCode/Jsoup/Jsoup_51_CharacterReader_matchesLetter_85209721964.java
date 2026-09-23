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

public class CharacterReader_matchesLetter_85209721964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;

    public CharacterReader_matchesLetter_85209721964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3157 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3158 = (char[]) newCharArray(9);
        Object[] term3171 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3158, 0, 'Q');
        setCharElement(term3158, 1, 'F');
        setCharElement(term3158, 2, 'p');
        setCharElement(term3158, 3, 'a');
        setCharElement(term3158, 4, 'H');
        setCharElement(term3158, 5, 'E');
        setCharElement(term3158, 6, 'w');
        setCharElement(term3158, 7, 'X');
        setCharElement(term3158, 8, 'R');
        setField(term3157, term3157.getClass(), "input", term3158);
        setIntField(term3157, term3157.getClass(), "length", 1655935355);
        setIntField(term3157, term3157.getClass(), "pos", -481533957);
        setIntField(term3157, term3157.getClass(), "mark", 1240914516);
        setElement(term3171, 0, "AdxvLJhNLe");
        setElement(term3171, 1, "lHfTrWKMPk");
        setElement(term3171, 2, "JDaAnsVTGV");
        setElement(term3171, 3, "mLUZFTfjle");
        setElement(term3171, 4, "xIeFjkHkOe");
        setElement(term3171, 5, "SdCKLMIYnX");
        setElement(term3171, 6, "OJJtVNPyKZ");
        setField(term3157, term3157.getClass(), "stringCache", term3171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesLetter", argTypes, term3157, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


