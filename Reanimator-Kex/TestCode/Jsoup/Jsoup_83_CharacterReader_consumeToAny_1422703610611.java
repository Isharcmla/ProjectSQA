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

public class CharacterReader_consumeToAny_1422703610611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172817;
     Object term172435;

    public CharacterReader_consumeToAny_1422703610611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172817 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term172435 = (char[]) newCharArray(0);
        setIntField(term172817, term172817.getClass(), "bufPos", -7);
        setIntField(term172817, term172817.getClass(), "bufSplitPoint", -6);
        setIntField(term172817, term172817.getClass(), "bufLength", 30);
        setField(term172817, term172817.getClass(), "charBuf", term172435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term172435;
        callMethod(klass, "consumeToAny", argTypes, term172817, args);
    }

};


