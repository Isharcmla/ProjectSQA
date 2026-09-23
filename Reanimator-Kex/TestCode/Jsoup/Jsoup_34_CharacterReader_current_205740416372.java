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

public class CharacterReader_current_205740416372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8602;
     Object term8741;

    public CharacterReader_current_205740416372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8602 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term8602, term8602.getClass(), "pos", -2147483648);
        setIntField(term8602, term8602.getClass(), "length", -2147483648);
        term8741 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term8741, term8741.getClass(), "input", null);
        setIntField(term8741, term8741.getClass(), "length", -2147483648);
        setIntField(term8741, term8741.getClass(), "pos", -2147483648);
        setIntField(term8741, term8741.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "current", argTypes, term8602, args);
        assertTrue(recursiveEquals(term8602, term8741));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


