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

public class CharacterReader_advance_59428796848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term6679;

    public CharacterReader_advance_59428796848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term694 = (char[]) newCharArray(5);
        Object[] term705 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term694, 0, 'g');
        setCharElement(term694, 1, 'Q');
        setCharElement(term694, 2, 'H');
        setCharElement(term694, 3, 'g');
        setCharElement(term694, 4, 'q');
        setField(term693, term693.getClass(), "charBuf", term694);
        setField(term693, term693.getClass(), "reader", null);
        setIntField(term693, term693.getClass(), "bufLength", -1179120542);
        setIntField(term693, term693.getClass(), "bufSplitPoint", -73683645);
        setIntField(term693, term693.getClass(), "bufPos", -226514366);
        setIntField(term693, term693.getClass(), "readerPos", 1193880199);
        setIntField(term693, term693.getClass(), "bufMark", -1087774327);
        setElement(term705, 0, "OclPbYPkcH");
        setElement(term705, 1, "IoAlmYsBwc");
        setField(term693, term693.getClass(), "stringCache", term705);
        term6679 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6680 = (char[]) newCharArray(5);
        Object[] term6681 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term6680, 0, 'g');
        setCharElement(term6680, 1, 'Q');
        setCharElement(term6680, 2, 'H');
        setCharElement(term6680, 3, 'g');
        setCharElement(term6680, 4, 'q');
        setField(term6679, term6679.getClass(), "charBuf", term6680);
        setField(term6679, term6679.getClass(), "reader", null);
        setIntField(term6679, term6679.getClass(), "bufLength", -1179120542);
        setIntField(term6679, term6679.getClass(), "bufSplitPoint", -73683645);
        setIntField(term6679, term6679.getClass(), "bufPos", -226514365);
        setIntField(term6679, term6679.getClass(), "readerPos", 1193880199);
        setIntField(term6679, term6679.getClass(), "bufMark", -1087774327);
        setElement(term6681, 0, "OclPbYPkcH");
        setElement(term6681, 1, "IoAlmYsBwc");
        setField(term6679, term6679.getClass(), "stringCache", term6681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term693, args);
        assertTrue(recursiveEquals(term693, term6679));
    }

};


