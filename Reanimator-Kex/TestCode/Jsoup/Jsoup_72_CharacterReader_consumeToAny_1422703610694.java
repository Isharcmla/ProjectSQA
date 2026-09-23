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

public class CharacterReader_consumeToAny_1422703610694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115053;
     Object term3114591;

    public CharacterReader_consumeToAny_1422703610694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3115053 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term3114591 = (char[]) newCharArray(0);
        setIntField(term3115053, term3115053.getClass(), "bufPos", -6);
        setIntField(term3115053, term3115053.getClass(), "bufSplitPoint", -5);
        setIntField(term3115053, term3115053.getClass(), "bufLength", 41);
        setField(term3115053, term3115053.getClass(), "charBuf", term3114591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3114591;
        callMethod(klass, "consumeToAny", argTypes, term3115053, args);
    }

};


