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

public class CharacterReader_consumeHexSequence_393737519421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2375306;

    public CharacterReader_consumeHexSequence_393737519421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2375306 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2375192 = (char[]) newCharArray(0);
        setIntField(term2375306, term2375306.getClass(), "pos", -2113929217);
        setIntField(term2375306, term2375306.getClass(), "length", 33554433);
        setCharElement(term2375192, -2113929217, 'd');
        setCharElement(term2375192, -2113929216, 'G');
        setField(term2375306, term2375306.getClass(), "input", term2375192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term2375306, args);
    }

};


