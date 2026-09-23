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

public class CharacterReader_matchConsumeIgnoreCase_13476025678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8597;
     Object term9844;

    public CharacterReader_matchConsumeIgnoreCase_13476025678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8597 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term8597, term8597.getClass(), "input", "");
        setIntField(term8597, term8597.getClass(), "pos", 0);
        term9844 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term9844, term9844.getClass(), "input", "");
        setIntField(term9844, term9844.getClass(), "length", 0);
        setIntField(term9844, term9844.getClass(), "pos", 0);
        setIntField(term9844, term9844.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsumeIgnoreCase", argTypes, term8597, args);
        assertTrue(recursiveEquals(term8597, term9844));
        assertTrue(recursiveEquals(retValue, true));
    }

};


