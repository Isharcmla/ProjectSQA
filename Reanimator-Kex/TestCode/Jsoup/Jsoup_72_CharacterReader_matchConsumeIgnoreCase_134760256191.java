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

public class CharacterReader_matchConsumeIgnoreCase_134760256191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37384;
     Object term37694;

    public CharacterReader_matchConsumeIgnoreCase_134760256191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37384 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term37384, term37384.getClass(), "bufPos", -2147483648);
        setIntField(term37384, term37384.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term37384, term37384.getClass(), "bufLength", -2147483648);
        term37694 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term37694, term37694.getClass(), "charBuf", null);
        setField(term37694, term37694.getClass(), "reader", null);
        setIntField(term37694, term37694.getClass(), "bufLength", -2147483648);
        setIntField(term37694, term37694.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term37694, term37694.getClass(), "bufPos", -2147483648);
        setIntField(term37694, term37694.getClass(), "readerPos", 0);
        setIntField(term37694, term37694.getClass(), "bufMark", 0);
        setField(term37694, term37694.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsumeIgnoreCase", argTypes, term37384, args);
        assertTrue(recursiveEquals(term37384, term37694));
        assertTrue(recursiveEquals(retValue, true));
    }

};


