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

public class CharacterReader_consumeToAny_1422703610608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171729;
     Object term171403;

    public CharacterReader_consumeToAny_1422703610608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171729 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term171729, term171729.getClass(), "bufPos", -2);
        setIntField(term171729, term171729.getClass(), "bufSplitPoint", -1);
        setIntField(term171729, term171729.getClass(), "bufLength", 28);
        setField(term171729, term171729.getClass(), "charBuf", null);
        term171403 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term171403;
        callMethod(klass, "consumeToAny", argTypes, term171729, args);
    }

};


