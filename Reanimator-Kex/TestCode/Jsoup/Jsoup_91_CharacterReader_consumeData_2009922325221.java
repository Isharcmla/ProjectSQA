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

public class CharacterReader_consumeData_2009922325221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44834;
     Object term44845;

    public CharacterReader_consumeData_2009922325221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44834 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term44834, term44834.getClass(), "bufPos", -2147483648);
        setIntField(term44834, term44834.getClass(), "bufLength", -2147483648);
        setField(term44834, term44834.getClass(), "charBuf", null);
        term44845 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term44845, term44845.getClass(), "charBuf", null);
        setField(term44845, term44845.getClass(), "reader", null);
        setIntField(term44845, term44845.getClass(), "bufLength", -2147483648);
        setIntField(term44845, term44845.getClass(), "bufSplitPoint", 0);
        setIntField(term44845, term44845.getClass(), "bufPos", -2147483648);
        setIntField(term44845, term44845.getClass(), "readerPos", 0);
        setIntField(term44845, term44845.getClass(), "bufMark", 0);
        setField(term44845, term44845.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeData", argTypes, term44834, args);
        assertTrue(recursiveEquals(term44834, term44845));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


