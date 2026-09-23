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

public class CharacterReader_consumeHexSequence_393737519522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4364090;

    public CharacterReader_consumeHexSequence_393737519522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4364090 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4363977 = (char[]) newCharArray(0);
        setIntField(term4364090, term4364090.getClass(), "pos", -2013265921);
        setIntField(term4364090, term4364090.getClass(), "length", 134217729);
        setCharElement(term4363977, -2013265921, 'd');
        setCharElement(term4363977, -2013265920, 'B');
        setField(term4364090, term4364090.getClass(), "input", term4363977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term4364090, args);
    }

};


