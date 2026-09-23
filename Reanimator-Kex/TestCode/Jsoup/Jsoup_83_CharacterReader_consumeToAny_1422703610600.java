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

public class CharacterReader_consumeToAny_1422703610600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169196;
     Object term168985;

    public CharacterReader_consumeToAny_1422703610600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169196 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term168985 = (char[]) newCharArray(0);
        setIntField(term169196, term169196.getClass(), "bufPos", -805306373);
        setIntField(term169196, term169196.getClass(), "bufSplitPoint", -805306372);
        setIntField(term169196, term169196.getClass(), "bufLength", -805306358);
        setField(term169196, term169196.getClass(), "charBuf", term168985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term168985;
        callMethod(klass, "consumeToAny", argTypes, term169196, args);
    }

};


