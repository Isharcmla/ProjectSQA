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

public class CharacterReader_matchConsumeIgnoreCase_134760256126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24112;
     Object term24529;

    public CharacterReader_matchConsumeIgnoreCase_134760256126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24112 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term24112, term24112.getClass(), "bufPos", -2147483648);
        setIntField(term24112, term24112.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term24112, term24112.getClass(), "bufLength", 2147483647);
        term24529 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term24529, term24529.getClass(), "charBuf", null);
        setField(term24529, term24529.getClass(), "reader", null);
        setIntField(term24529, term24529.getClass(), "bufLength", 2147483647);
        setIntField(term24529, term24529.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term24529, term24529.getClass(), "bufPos", -2147483648);
        setIntField(term24529, term24529.getClass(), "readerPos", 0);
        setIntField(term24529, term24529.getClass(), "bufMark", 0);
        setField(term24529, term24529.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsumeIgnoreCase", argTypes, term24112, args);
        assertTrue(recursiveEquals(term24112, term24529));
        assertTrue(recursiveEquals(retValue, false));
    }

};


