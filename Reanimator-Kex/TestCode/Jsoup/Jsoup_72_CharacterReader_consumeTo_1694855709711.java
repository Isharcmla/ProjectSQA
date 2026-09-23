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

public class CharacterReader_consumeTo_1694855709711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3123087;

    public CharacterReader_consumeTo_1694855709711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3123087 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3122991 = (char[]) newCharArray(0);
        setIntField(term3123087, term3123087.getClass(), "bufPos", 1022);
        setIntField(term3123087, term3123087.getClass(), "bufSplitPoint", 1023);
        setIntField(term3123087, term3123087.getClass(), "bufLength", 1023);
        setField(term3123087, term3123087.getClass(), "charBuf", term3122991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "        ";
        callMethod(klass, "consumeTo", argTypes, term3123087, args);
    }

};


