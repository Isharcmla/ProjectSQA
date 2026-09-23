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

public class CharacterReader_consumeToAny_1422703610718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3127277;
     Object term3127074;

    public CharacterReader_consumeToAny_1422703610718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3127277 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term3127074 = (char[]) newCharArray(0);
        setIntField(term3127277, term3127277.getClass(), "bufPos", 40957);
        setIntField(term3127277, term3127277.getClass(), "bufSplitPoint", 40958);
        setIntField(term3127277, term3127277.getClass(), "bufLength", 40971);
        setField(term3127277, term3127277.getClass(), "charBuf", term3127074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3127074;
        callMethod(klass, "consumeToAny", argTypes, term3127277, args);
    }

};


