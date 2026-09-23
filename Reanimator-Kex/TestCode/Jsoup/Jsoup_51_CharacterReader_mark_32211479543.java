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

public class CharacterReader_mark_32211479543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;
     Object term5538;

    public CharacterReader_mark_32211479543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term680 = (char[]) newCharArray(5);
        Object[] term689 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term680, 0, 'g');
        setCharElement(term680, 1, 'Q');
        setCharElement(term680, 2, 'H');
        setCharElement(term680, 3, 'g');
        setCharElement(term680, 4, 'q');
        setField(term679, term679.getClass(), "input", term680);
        setIntField(term679, term679.getClass(), "length", 1622346318);
        setIntField(term679, term679.getClass(), "pos", 1048535127);
        setIntField(term679, term679.getClass(), "mark", -655067527);
        setElement(term689, 0, "OclPbYPkcH");
        setElement(term689, 1, "IoAlmYsBwc");
        setField(term679, term679.getClass(), "stringCache", term689);
        term5538 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5539 = (char[]) newCharArray(5);
        Object[] term5540 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term5539, 0, 'g');
        setCharElement(term5539, 1, 'Q');
        setCharElement(term5539, 2, 'H');
        setCharElement(term5539, 3, 'g');
        setCharElement(term5539, 4, 'q');
        setField(term5538, term5538.getClass(), "input", term5539);
        setIntField(term5538, term5538.getClass(), "length", 1622346318);
        setIntField(term5538, term5538.getClass(), "pos", 1048535127);
        setIntField(term5538, term5538.getClass(), "mark", 1048535127);
        setElement(term5540, 0, "OclPbYPkcH");
        setElement(term5540, 1, "IoAlmYsBwc");
        setField(term5538, term5538.getClass(), "stringCache", term5540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mark", argTypes, term679, args);
        assertTrue(recursiveEquals(term679, term5538));
    }

};


