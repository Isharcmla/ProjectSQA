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

public class CharacterReader_matchConsume_210446496297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29955;
     Object term30004;

    public CharacterReader_matchConsume_210446496297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29955 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term29955, term29955.getClass(), "length", -1);
        setIntField(term29955, term29955.getClass(), "pos", 0);
        term30004 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term30004, term30004.getClass(), "input", null);
        setIntField(term30004, term30004.getClass(), "length", -1);
        setIntField(term30004, term30004.getClass(), "pos", 0);
        setIntField(term30004, term30004.getClass(), "mark", 0);
        setField(term30004, term30004.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term29955, args);
        assertTrue(recursiveEquals(term29955, term30004));
        assertTrue(recursiveEquals(retValue, false));
    }

};


