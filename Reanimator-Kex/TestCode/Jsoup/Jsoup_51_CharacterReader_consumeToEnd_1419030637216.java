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

public class CharacterReader_consumeToEnd_1419030637216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68140;
     Object term70220;

    public CharacterReader_consumeToEnd_1419030637216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68140 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term67550 = (char[]) newCharArray(489);
        Object[] term68040 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term68140, term68140.getClass(), "pos", 0);
        setIntField(term68140, term68140.getClass(), "length", 1);
        setField(term68140, term68140.getClass(), "input", term67550);
        setField(term68140, term68140.getClass(), "stringCache", term68040);
        term70220 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term70221 = (char[]) newCharArray(489);
        Object[] term70222 = (Object[]) newArray("java.lang.String", 492);
        setField(term70220, term70220.getClass(), "input", term70221);
        setIntField(term70220, term70220.getClass(), "length", 1);
        setIntField(term70220, term70220.getClass(), "pos", 1);
        setIntField(term70220, term70220.getClass(), "mark", 0);
        setElement(term70222, 0, " ");
        setField(term70220, term70220.getClass(), "stringCache", term70222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeToEnd", argTypes, term68140, args);
        assertTrue(recursiveEquals(term68140, term70220));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


