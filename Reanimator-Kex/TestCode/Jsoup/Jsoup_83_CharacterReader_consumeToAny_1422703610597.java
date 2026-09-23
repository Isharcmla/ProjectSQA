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
import java.lang.Object;

public class CharacterReader_consumeToAny_1422703610597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167905;
     Object term167263;

    public CharacterReader_consumeToAny_1422703610597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167905 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term167267 = (char[]) newCharArray(246);
        Object[] term167760 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term167905, term167905.getClass(), "bufPos", -239759233);
        setIntField(term167905, term167905.getClass(), "bufSplitPoint", -239759232);
        setIntField(term167905, term167905.getClass(), "bufLength", -239759232);
        setField(term167905, term167905.getClass(), "charBuf", term167267);
        setElement(term167760, 0, " ");
        setElement(term167760, 1, " ");
        setElement(term167760, 2, " ");
        setElement(term167760, 3, " ");
        setField(term167905, term167905.getClass(), "stringCache", term167760);
        term167263 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term167263;
        callMethod(klass, "consumeToAny", argTypes, term167905, args);
    }

};


