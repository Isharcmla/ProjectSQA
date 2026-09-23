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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_matchConsumeIgnoreCase_134760256588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1158978;

    public CharacterReader_matchConsumeIgnoreCase_134760256588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1158978 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1159028 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term1158978, term1158978.getClass(), "bufPos", -2147483648);
        setIntField(term1158978, term1158978.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1158978, term1158978.getClass(), "readerPos", 0);
        setField(term1158978, term1158978.getClass(), "reader", term1159028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchConsumeIgnoreCase", argTypes, term1158978, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


