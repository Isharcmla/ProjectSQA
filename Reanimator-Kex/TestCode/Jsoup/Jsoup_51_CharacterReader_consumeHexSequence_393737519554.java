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

public class CharacterReader_consumeHexSequence_393737519554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5111914;

    public CharacterReader_consumeHexSequence_393737519554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5111914 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5111794 = (char[]) newCharArray(1);
        setIntField(term5111914, term5111914.getClass(), "pos", -1);
        setIntField(term5111914, term5111914.getClass(), "length", 3);
        setCharElement(term5111794, 0, (char) 48);
        setCharElement(term5111794, -1, 'd');
        setField(term5111914, term5111914.getClass(), "input", term5111794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5111914, args);
    }

};


