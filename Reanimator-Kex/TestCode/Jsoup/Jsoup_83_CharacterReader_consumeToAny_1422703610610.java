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

public class CharacterReader_consumeToAny_1422703610610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172433;
     Object term172123;

    public CharacterReader_consumeToAny_1422703610610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172433 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term172123 = (char[]) newCharArray(0);
        setIntField(term172433, term172433.getClass(), "bufPos", -9);
        setIntField(term172433, term172433.getClass(), "bufSplitPoint", -8);
        setIntField(term172433, term172433.getClass(), "bufLength", 19);
        setField(term172433, term172433.getClass(), "charBuf", term172123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term172123;
        callMethod(klass, "consumeToAny", argTypes, term172433, args);
    }

};


