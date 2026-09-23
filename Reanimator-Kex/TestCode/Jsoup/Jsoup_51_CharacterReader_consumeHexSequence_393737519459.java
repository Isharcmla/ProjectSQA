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

public class CharacterReader_consumeHexSequence_393737519459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3120292;

    public CharacterReader_consumeHexSequence_393737519459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3120292 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3120177 = (char[]) newCharArray(0);
        setIntField(term3120292, term3120292.getClass(), "pos", -2146435073);
        setIntField(term3120292, term3120292.getClass(), "length", 1048577);
        setCharElement(term3120177, -2146435073, 'd');
        setCharElement(term3120177, -2146435072, 'g');
        setField(term3120292, term3120292.getClass(), "input", term3120177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term3120292, args);
    }

};


