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

public class CharacterReader_consumeToAny_1422703610714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3123635;
     Object term3123453;

    public CharacterReader_consumeToAny_1422703610714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3123635 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term3123453 = (char[]) newCharArray(0);
        setIntField(term3123635, term3123635.getClass(), "bufPos", -4);
        setIntField(term3123635, term3123635.getClass(), "bufSplitPoint", -3);
        setIntField(term3123635, term3123635.getClass(), "bufLength", 8);
        setField(term3123635, term3123635.getClass(), "charBuf", term3123453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3123453;
        callMethod(klass, "consumeToAny", argTypes, term3123635, args);
    }

};


