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

public class CharacterReader_consumeHexSequence_393737519276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594533;

    public CharacterReader_consumeHexSequence_393737519276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594533 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term594408 = (char[]) newCharArray(8);
        setIntField(term594533, term594533.getClass(), "pos", -1);
        setIntField(term594533, term594533.getClass(), "length", 3);
        setCharElement(term594408, 0, (char) 48);
        setCharElement(term594408, 1, (char) 48);
        setCharElement(term594408, 2, (char) 48);
        setCharElement(term594408, 3, (char) 48);
        setCharElement(term594408, 4, (char) 48);
        setCharElement(term594408, 5, (char) 48);
        setCharElement(term594408, 6, (char) 48);
        setCharElement(term594408, 7, (char) 48);
        setCharElement(term594408, -1, (char) 48);
        setField(term594533, term594533.getClass(), "input", term594408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term594533, args);
    }

};


