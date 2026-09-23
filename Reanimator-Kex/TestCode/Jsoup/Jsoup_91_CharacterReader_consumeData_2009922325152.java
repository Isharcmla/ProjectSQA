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

public class CharacterReader_consumeData_2009922325152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29032;
     Object term29222;

    public CharacterReader_consumeData_2009922325152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29032 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term28938 = (char[]) newCharArray(8);
        setIntField(term29032, term29032.getClass(), "bufPos", 6);
        setIntField(term29032, term29032.getClass(), "bufLength", 7);
        setField(term29032, term29032.getClass(), "charBuf", term28938);
        term29222 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term29223 = (char[]) newCharArray(8);
        setField(term29222, term29222.getClass(), "charBuf", term29223);
        setField(term29222, term29222.getClass(), "reader", null);
        setIntField(term29222, term29222.getClass(), "bufLength", 7);
        setIntField(term29222, term29222.getClass(), "bufSplitPoint", 0);
        setIntField(term29222, term29222.getClass(), "bufPos", 6);
        setIntField(term29222, term29222.getClass(), "readerPos", 0);
        setIntField(term29222, term29222.getClass(), "bufMark", 0);
        setField(term29222, term29222.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeData", argTypes, term29032, args);
        assertTrue(recursiveEquals(term29032, term29222));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


