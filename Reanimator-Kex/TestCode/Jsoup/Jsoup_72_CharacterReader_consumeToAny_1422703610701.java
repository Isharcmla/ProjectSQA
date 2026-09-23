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

public class CharacterReader_consumeToAny_1422703610701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3118405;
     Object term3118039;

    public CharacterReader_consumeToAny_1422703610701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3118405 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term3118039 = (char[]) newCharArray(0);
        setIntField(term3118405, term3118405.getClass(), "bufPos", -6);
        setIntField(term3118405, term3118405.getClass(), "bufSplitPoint", -5);
        setIntField(term3118405, term3118405.getClass(), "bufLength", 29);
        setField(term3118405, term3118405.getClass(), "charBuf", term3118039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3118039;
        callMethod(klass, "consumeToAny", argTypes, term3118405, args);
    }

};


