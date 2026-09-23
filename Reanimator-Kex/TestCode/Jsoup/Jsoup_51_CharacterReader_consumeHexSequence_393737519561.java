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

public class CharacterReader_consumeHexSequence_393737519561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5119343;

    public CharacterReader_consumeHexSequence_393737519561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5119343 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5119104 = (char[]) newCharArray(1);
        setIntField(term5119343, term5119343.getClass(), "pos", -8);
        setIntField(term5119343, term5119343.getClass(), "length", 2147483647);
        setCharElement(term5119104, 0, 'b');
        setCharElement(term5119104, -8, 'b');
        setCharElement(term5119104, -7, (char) 48);
        setCharElement(term5119104, -6, (char) 48);
        setCharElement(term5119104, -5, (char) 48);
        setCharElement(term5119104, -4, 'b');
        setCharElement(term5119104, -3, 'b');
        setCharElement(term5119104, -2, 'b');
        setCharElement(term5119104, -1, 'b');
        setField(term5119343, term5119343.getClass(), "input", term5119104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5119343, args);
    }

};


