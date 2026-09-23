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

public class CharacterReader_consumeToAny_1422703610588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164954;
     Object term164588;

    public CharacterReader_consumeToAny_1422703610588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164954 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term164592 = (char[]) newCharArray(9);
        setIntField(term164954, term164954.getClass(), "bufPos", 260046842);
        setIntField(term164954, term164954.getClass(), "bufSplitPoint", 260046843);
        setIntField(term164954, term164954.getClass(), "bufLength", 260046875);
        setField(term164954, term164954.getClass(), "charBuf", term164592);
        term164588 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term164588;
        callMethod(klass, "consumeToAny", argTypes, term164954, args);
    }

};


