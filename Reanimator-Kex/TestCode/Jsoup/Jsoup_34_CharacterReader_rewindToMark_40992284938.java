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

public class CharacterReader_rewindToMark_40992284938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;
     Object term1062;

    public CharacterReader_rewindToMark_40992284938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term109 = (char[]) newCharArray(6);
        setCharElement(term109, 0, 'Q');
        setCharElement(term109, 1, 'H');
        setCharElement(term109, 2, 'g');
        setCharElement(term109, 3, 'q');
        setCharElement(term109, 4, 'z');
        setCharElement(term109, 5, 'x');
        setField(term108, term108.getClass(), "input", term109);
        setIntField(term108, term108.getClass(), "length", -6029667);
        setIntField(term108, term108.getClass(), "pos", -2068769794);
        setIntField(term108, term108.getClass(), "mark", -117576464);
        term1062 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1063 = (char[]) newCharArray(6);
        setCharElement(term1063, 0, 'Q');
        setCharElement(term1063, 1, 'H');
        setCharElement(term1063, 2, 'g');
        setCharElement(term1063, 3, 'q');
        setCharElement(term1063, 4, 'z');
        setCharElement(term1063, 5, 'x');
        setField(term1062, term1062.getClass(), "input", term1063);
        setIntField(term1062, term1062.getClass(), "length", -6029667);
        setIntField(term1062, term1062.getClass(), "pos", -117576464);
        setIntField(term1062, term1062.getClass(), "mark", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rewindToMark", argTypes, term108, args);
        assertTrue(recursiveEquals(term108, term1062));
    }

};


