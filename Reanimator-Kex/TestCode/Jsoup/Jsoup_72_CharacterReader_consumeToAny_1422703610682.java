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

public class CharacterReader_consumeToAny_1422703610682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3111056;
     Object term3110834;

    public CharacterReader_consumeToAny_1422703610682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3111056 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term3110834 = (char[]) newCharArray(0);
        setIntField(term3111056, term3111056.getClass(), "bufPos", -3);
        setIntField(term3111056, term3111056.getClass(), "bufSplitPoint", -2);
        setIntField(term3111056, term3111056.getClass(), "bufLength", 14);
        setField(term3111056, term3111056.getClass(), "charBuf", term3110834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3110834;
        callMethod(klass, "consumeToAny", argTypes, term3111056, args);
    }

};


