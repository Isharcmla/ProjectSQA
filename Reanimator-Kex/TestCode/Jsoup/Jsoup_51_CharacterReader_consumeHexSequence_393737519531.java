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

public class CharacterReader_consumeHexSequence_393737519531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4371670;

    public CharacterReader_consumeHexSequence_393737519531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4371670 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4371563 = (char[]) newCharArray(0);
        setIntField(term4371670, term4371670.getClass(), "pos", -2080374785);
        setIntField(term4371670, term4371670.getClass(), "length", 67108865);
        setCharElement(term4371563, -2080374785, 'D');
        setField(term4371670, term4371670.getClass(), "input", term4371563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term4371670, args);
    }

};


