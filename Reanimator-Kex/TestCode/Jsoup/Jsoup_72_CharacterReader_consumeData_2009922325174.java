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

public class CharacterReader_consumeData_2009922325174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34620;
     Object term34715;

    public CharacterReader_consumeData_2009922325174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34620 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term34620, term34620.getClass(), "bufPos", -2147483648);
        setIntField(term34620, term34620.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term34620, term34620.getClass(), "bufLength", -2147483648);
        setField(term34620, term34620.getClass(), "charBuf", null);
        term34715 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term34715, term34715.getClass(), "charBuf", null);
        setField(term34715, term34715.getClass(), "reader", null);
        setIntField(term34715, term34715.getClass(), "bufLength", -2147483648);
        setIntField(term34715, term34715.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term34715, term34715.getClass(), "bufPos", -2147483648);
        setIntField(term34715, term34715.getClass(), "readerPos", 0);
        setIntField(term34715, term34715.getClass(), "bufMark", 0);
        setField(term34715, term34715.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeData", argTypes, term34620, args);
        assertTrue(recursiveEquals(term34620, term34715));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


