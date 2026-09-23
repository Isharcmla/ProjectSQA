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

public class CharacterReader_matchConsumeIgnoreCase_134760256237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46178;
     Object term46539;

    public CharacterReader_matchConsumeIgnoreCase_134760256237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46178 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term46178, term46178.getClass(), "bufPos", -2147483648);
        setIntField(term46178, term46178.getClass(), "bufSplitPoint", -2147483647);
        term46539 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term46539, term46539.getClass(), "charBuf", null);
        setField(term46539, term46539.getClass(), "reader", null);
        setIntField(term46539, term46539.getClass(), "bufLength", 0);
        setIntField(term46539, term46539.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term46539, term46539.getClass(), "bufPos", -2147483648);
        setIntField(term46539, term46539.getClass(), "readerPos", 0);
        setIntField(term46539, term46539.getClass(), "bufMark", 0);
        setField(term46539, term46539.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsumeIgnoreCase", argTypes, term46178, args);
        assertTrue(recursiveEquals(term46178, term46539));
        assertTrue(recursiveEquals(retValue, false));
    }

};


