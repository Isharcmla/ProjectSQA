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

public class CharacterReader_consumeToAny_1422703610695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115740;
     Object term3115055;

    public CharacterReader_consumeToAny_1422703610695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3115740 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3115059 = (char[]) newCharArray(261);
        setIntField(term3115740, term3115740.getClass(), "bufPos", 259);
        setIntField(term3115740, term3115740.getClass(), "bufSplitPoint", 260);
        setIntField(term3115740, term3115740.getClass(), "bufLength", 264);
        setField(term3115740, term3115740.getClass(), "charBuf", term3115059);
        setField(term3115740, term3115740.getClass(), "stringCache", null);
        term3115055 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3115055;
        callMethod(klass, "consumeToAny", argTypes, term3115740, args);
    }

};


