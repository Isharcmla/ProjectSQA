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

public class CharacterReader_consumeHexSequence_393737519290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1323133;

    public CharacterReader_consumeHexSequence_393737519290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1323133 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1323026 = (char[]) newCharArray(0);
        setIntField(term1323133, term1323133.getClass(), "pos", -2143289345);
        setIntField(term1323133, term1323133.getClass(), "length", 4194305);
        setCharElement(term1323026, -2143289345, (char) 48);
        setCharElement(term1323026, -2143289344, (char) 60);
        setField(term1323133, term1323133.getClass(), "input", term1323026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term1323133, args);
    }

};


