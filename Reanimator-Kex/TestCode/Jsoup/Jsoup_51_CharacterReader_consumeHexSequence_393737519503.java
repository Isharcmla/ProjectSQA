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

public class CharacterReader_consumeHexSequence_393737519503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3381528;
     Object term4111091;

    public CharacterReader_consumeHexSequence_393737519503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3381528 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3380426 = (char[]) newCharArray(489);
        Object[] term3381406 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term3381528, term3381528.getClass(), "pos", 0);
        setIntField(term3381528, term3381528.getClass(), "length", 1);
        setCharElement(term3380426, 0, 'A');
        setField(term3381528, term3381528.getClass(), "input", term3380426);
        setElement(term3381406, 0, "");
        setElement(term3381406, 1, "");
        setField(term3381528, term3381528.getClass(), "stringCache", term3381406);
        term4111091 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4111092 = (char[]) newCharArray(489);
        Object[] term4111093 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term4111092, 0, 'A');
        setField(term4111091, term4111091.getClass(), "input", term4111092);
        setIntField(term4111091, term4111091.getClass(), "length", 1);
        setIntField(term4111091, term4111091.getClass(), "pos", 1);
        setIntField(term4111091, term4111091.getClass(), "mark", 0);
        setElement(term4111093, 0, "");
        setElement(term4111093, 1, "A");
        setField(term4111091, term4111091.getClass(), "stringCache", term4111093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term3381528, args);
        assertTrue(recursiveEquals(term3381528, term4111091));
        assertTrue(recursiveEquals(retValue, "A"));
    }

};


