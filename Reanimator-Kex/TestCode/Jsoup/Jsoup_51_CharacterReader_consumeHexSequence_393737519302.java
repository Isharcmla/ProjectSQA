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

public class CharacterReader_consumeHexSequence_393737519302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596928;
     Object term2051818;

    public CharacterReader_consumeHexSequence_393737519302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term596928 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term596801 = (char[]) newCharArray(1);
        Object[] term596805 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term596928, term596928.getClass(), "pos", 0);
        setIntField(term596928, term596928.getClass(), "length", 1);
        setCharElement(term596801, 0, (char) 52);
        setField(term596928, term596928.getClass(), "input", term596801);
        setElement(term596805, 0, "");
        setElement(term596805, 1, "");
        setElement(term596805, 2, "");
        setElement(term596805, 3, "");
        setElement(term596805, 4, "");
        setElement(term596805, 5, "");
        setElement(term596805, 6, "");
        setElement(term596805, 7, "");
        setElement(term596805, 8, "");
        setElement(term596805, 9, "");
        setElement(term596805, 10, "");
        setElement(term596805, 11, "");
        setElement(term596805, 12, "");
        setElement(term596805, 13, "");
        setElement(term596805, 14, "");
        setElement(term596805, 15, "");
        setElement(term596805, 16, "");
        setField(term596928, term596928.getClass(), "stringCache", term596805);
        term2051818 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2051819 = (char[]) newCharArray(1);
        Object[] term2051820 = (Object[]) newArray("java.lang.String", 17);
        setCharElement(term2051819, 0, (char) 52);
        setField(term2051818, term2051818.getClass(), "input", term2051819);
        setIntField(term2051818, term2051818.getClass(), "length", 1);
        setIntField(term2051818, term2051818.getClass(), "pos", 1);
        setIntField(term2051818, term2051818.getClass(), "mark", 0);
        setElement(term2051820, 0, "");
        setElement(term2051820, 1, "");
        setElement(term2051820, 2, "");
        setElement(term2051820, 3, "");
        setElement(term2051820, 4, "");
        setElement(term2051820, 5, "");
        setElement(term2051820, 6, "");
        setElement(term2051820, 7, "");
        setElement(term2051820, 8, "");
        setElement(term2051820, 9, "");
        setElement(term2051820, 10, "");
        setElement(term2051820, 11, "");
        setElement(term2051820, 12, "");
        setElement(term2051820, 13, "");
        setElement(term2051820, 14, "");
        setElement(term2051820, 15, "");
        setElement(term2051820, 16, "4");
        setField(term2051818, term2051818.getClass(), "stringCache", term2051820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term596928, args);
        assertTrue(recursiveEquals(term596928, term2051818));
        assertTrue(recursiveEquals(retValue, "4"));
    }

};


