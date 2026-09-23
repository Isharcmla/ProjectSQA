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
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_consumeToAny_1422703610505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3383422;
     Object term3382269;
     Object term4112934;
     Object term4112939;

    public CharacterReader_consumeToAny_1422703610505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3383422 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3382272 = (char[]) newCharArray(493);
        Object[] term3383259 = (Object[]) newArray("java.lang.String", 12);
        setIntField(term3383422, term3383422.getClass(), "pos", 34);
        setIntField(term3383422, term3383422.getClass(), "length", 38);
        setField(term3383422, term3383422.getClass(), "input", term3382272);
        setField(term3383422, term3383422.getClass(), "stringCache", term3383259);
        term3382269 = (char[]) newCharArray(0);
        term4112934 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4112935 = (char[]) newCharArray(493);
        Object[] term4112936 = (Object[]) newArray("java.lang.String", 12);
        setField(term4112934, term4112934.getClass(), "input", term4112935);
        setIntField(term4112934, term4112934.getClass(), "length", 38);
        setIntField(term4112934, term4112934.getClass(), "pos", 38);
        setIntField(term4112934, term4112934.getClass(), "mark", 0);
        setElement(term4112936, 0, "    ");
        setField(term4112934, term4112934.getClass(), "stringCache", term4112936);
        term4112939 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3382269;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term3383422, args);
        assertTrue(recursiveEquals(term3383422, term4112934));
        assertTrue(recursiveEquals(term3382269, term4112939));
        assertTrue(recursiveEquals(retValue, "    "));
    }

};


