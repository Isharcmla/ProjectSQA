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

public class CharacterReader_matchConsume_210446496250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term4758;

    public CharacterReader_matchConsume_210446496250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term685, term685.getClass(), "input", "flxyYxBRtu");
        setIntField(term685, term685.getClass(), "length", -1588772968);
        setIntField(term685, term685.getClass(), "pos", -93135961);
        setIntField(term685, term685.getClass(), "mark", -112921587);
        term4758 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4758, term4758.getClass(), "input", "flxyYxBRtu");
        setIntField(term4758, term4758.getClass(), "length", -1588772968);
        setIntField(term4758, term4758.getClass(), "pos", -93135961);
        setIntField(term4758, term4758.getClass(), "mark", -112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term685, args);
        assertTrue(recursiveEquals(term685, term4758));
        assertTrue(recursiveEquals(retValue, false));
    }

};


