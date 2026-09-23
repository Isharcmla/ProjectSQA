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

public class CharacterReader_matchConsumeIgnoreCase_134760256103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13653;
     Object term13962;

    public CharacterReader_matchConsumeIgnoreCase_134760256103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13653 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term13653, term13653.getClass(), "length", 0);
        setIntField(term13653, term13653.getClass(), "pos", 0);
        term13962 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term13962, term13962.getClass(), "input", null);
        setIntField(term13962, term13962.getClass(), "length", 0);
        setIntField(term13962, term13962.getClass(), "pos", 0);
        setIntField(term13962, term13962.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsumeIgnoreCase", argTypes, term13653, args);
        assertTrue(recursiveEquals(term13653, term13962));
        assertTrue(recursiveEquals(retValue, true));
    }

};


