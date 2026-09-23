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

public class CharacterReader_consumeToAny_1422703610552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5106150;
     Object term5104215;
     Object term5109322;
     Object term5109327;

    public CharacterReader_consumeToAny_1422703610552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5106150 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5104218 = (char[]) newCharArray(893);
        Object[] term5106005 = (Object[]) newArray("java.lang.String", 9);
        setIntField(term5106150, term5106150.getClass(), "pos", 850);
        setIntField(term5106150, term5106150.getClass(), "length", 853);
        setField(term5106150, term5106150.getClass(), "input", term5104218);
        setField(term5106150, term5106150.getClass(), "stringCache", term5106005);
        term5104215 = (char[]) newCharArray(0);
        term5109322 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5109323 = (char[]) newCharArray(893);
        Object[] term5109324 = (Object[]) newArray("java.lang.String", 9);
        setField(term5109322, term5109322.getClass(), "input", term5109323);
        setIntField(term5109322, term5109322.getClass(), "length", 853);
        setIntField(term5109322, term5109322.getClass(), "pos", 853);
        setIntField(term5109322, term5109322.getClass(), "mark", 0);
        setElement(term5109324, 0, "   ");
        setField(term5109322, term5109322.getClass(), "stringCache", term5109324);
        term5109327 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5104215;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term5106150, args);
        assertTrue(recursiveEquals(term5106150, term5109322));
        assertTrue(recursiveEquals(term5104215, term5109327));
        assertTrue(recursiveEquals(retValue, "   "));
    }

};


