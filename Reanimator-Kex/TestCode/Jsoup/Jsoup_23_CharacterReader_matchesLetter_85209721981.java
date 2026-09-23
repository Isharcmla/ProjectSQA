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

public class CharacterReader_matchesLetter_85209721981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10180;
     Object term10445;

    public CharacterReader_matchesLetter_85209721981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10180 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term10180, term10180.getClass(), "pos", -2147483648);
        setIntField(term10180, term10180.getClass(), "length", -2147483648);
        term10445 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term10445, term10445.getClass(), "input", null);
        setIntField(term10445, term10445.getClass(), "length", -2147483648);
        setIntField(term10445, term10445.getClass(), "pos", -2147483648);
        setIntField(term10445, term10445.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term10180, args);
        assertTrue(recursiveEquals(term10180, term10445));
        assertTrue(recursiveEquals(retValue, false));
    }

};


