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

public class CharacterReader_consumeToAny_1422703610324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066997;
     Object term2066853;

    public CharacterReader_consumeToAny_1422703610324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066997 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term2066853 = (char[]) newCharArray(0);
        Object[] term2066856 = (Object[]) newArray("java.lang.String", 128);
        setIntField(term2066997, term2066997.getClass(), "pos", -1083949055);
        setIntField(term2066997, term2066997.getClass(), "length", -1083949053);
        setCharElement(term2066853, -1083949055, (char) 201);
        setCharElement(term2066853, -1083949054, (char) 57760);
        setField(term2066997, term2066997.getClass(), "input", term2066853);
        setField(term2066997, term2066997.getClass(), "stringCache", term2066856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2066853;
        callMethod(klass, "consumeToAny", argTypes, term2066997, args);
    }

};


