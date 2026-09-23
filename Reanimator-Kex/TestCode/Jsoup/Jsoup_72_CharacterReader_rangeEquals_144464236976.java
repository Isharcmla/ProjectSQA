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
import java.lang.Integer;

public class CharacterReader_rangeEquals_144464236976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4283;
     Object term4289;
     Object term4291;
     Object term16206;

    public CharacterReader_rangeEquals_144464236976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4283 = (char[]) newCharArray(5);
        setCharElement(term4283, 0, 'n');
        setCharElement(term4283, 1, 'z');
        setCharElement(term4283, 2, 'T');
        setCharElement(term4283, 3, 's');
        setCharElement(term4283, 4, 't');
        term4289 = new Integer(-2014576105);
        term4291 = new Integer(1296895584);
        term16206 = (char[]) newCharArray(5);
        setCharElement(term16206, 0, 'n');
        setCharElement(term16206, 1, 'z');
        setCharElement(term16206, 2, 'T');
        setCharElement(term16206, 3, 's');
        setCharElement(term16206, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4283;
        args[1] = term4289;
        args[2] = term4291;
        args[3] = "XYtryyobou";
        Object retValue = callMethod(klass, "rangeEquals", argTypes, null, args);
        assertTrue(recursiveEquals(term4283, term16206));
        assertTrue(recursiveEquals(term4289, -2014576105));
        assertTrue(recursiveEquals(term4291, 1296895584));
        assertTrue(recursiveEquals(retValue, false));
    }

};


