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

public class CharacterReader_consumeToEnd_1419030637691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3113913;

    public CharacterReader_consumeToEnd_1419030637691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3113913 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3113325 = (char[]) newCharArray(489);
        setIntField(term3113913, term3113913.getClass(), "bufPos", 1073741824);
        setIntField(term3113913, term3113913.getClass(), "bufSplitPoint", 1073741825);
        setField(term3113913, term3113913.getClass(), "charBuf", term3113325);
        setField(term3113913, term3113913.getClass(), "stringCache", null);
        setIntField(term3113913, term3113913.getClass(), "bufLength", 1073741825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeToEnd", argTypes, term3113913, args);
    }

};


