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

public class CharacterReader_rewindToMark_40992284944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739;
     Object term5616;

    public CharacterReader_rewindToMark_40992284944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term740 = (char[]) newCharArray(3);
        Object[] term747 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term740, 0, 'z');
        setCharElement(term740, 1, 'x');
        setCharElement(term740, 2, 'x');
        setField(term739, term739.getClass(), "input", term740);
        setIntField(term739, term739.getClass(), "length", -6029667);
        setIntField(term739, term739.getClass(), "pos", -2068769794);
        setIntField(term739, term739.getClass(), "mark", -117576464);
        setElement(term747, 0, "TEParAifyi");
        setField(term739, term739.getClass(), "stringCache", term747);
        term5616 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5617 = (char[]) newCharArray(3);
        Object[] term5618 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term5617, 0, 'z');
        setCharElement(term5617, 1, 'x');
        setCharElement(term5617, 2, 'x');
        setField(term5616, term5616.getClass(), "input", term5617);
        setIntField(term5616, term5616.getClass(), "length", -6029667);
        setIntField(term5616, term5616.getClass(), "pos", -117576464);
        setIntField(term5616, term5616.getClass(), "mark", -117576464);
        setElement(term5618, 0, "TEParAifyi");
        setField(term5616, term5616.getClass(), "stringCache", term5618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rewindToMark", argTypes, term739, args);
        assertTrue(recursiveEquals(term739, term5616));
    }

};


