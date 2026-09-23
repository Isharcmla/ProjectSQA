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

public class CharacterReader_consumeToAny_1422703610703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3119662;
     Object term3118504;

    public CharacterReader_consumeToAny_1422703610703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3119662 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3118508 = (char[]) newCharArray(497);
        setIntField(term3119662, term3119662.getClass(), "bufPos", 268435456);
        setIntField(term3119662, term3119662.getClass(), "bufSplitPoint", 268435457);
        setIntField(term3119662, term3119662.getClass(), "bufLength", 268435463);
        setField(term3119662, term3119662.getClass(), "charBuf", term3118508);
        setField(term3119662, term3119662.getClass(), "stringCache", null);
        term3118504 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3118504;
        callMethod(klass, "consumeToAny", argTypes, term3119662, args);
    }

};


