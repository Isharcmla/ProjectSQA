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

public class CharacterReader_current_2057404163159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43516;
     Object term43818;

    public CharacterReader_current_2057404163159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43516 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term43516, term43516.getClass(), "pos", -2147483648);
        setIntField(term43516, term43516.getClass(), "length", -2147483648);
        term43818 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term43818, term43818.getClass(), "input", null);
        setIntField(term43818, term43818.getClass(), "length", -2147483648);
        setIntField(term43818, term43818.getClass(), "pos", -2147483648);
        setIntField(term43818, term43818.getClass(), "mark", 0);
        setField(term43818, term43818.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "current", argTypes, term43516, args);
        assertTrue(recursiveEquals(term43516, term43818));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


