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

public class CharacterReader_matchConsumeIgnoreCase_13476025651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term4835;

    public CharacterReader_matchConsumeIgnoreCase_13476025651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term733, term733.getClass(), "input", "IoAlmYsBwc");
        setIntField(term733, term733.getClass(), "length", 933028652);
        setIntField(term733, term733.getClass(), "pos", 287287233);
        setIntField(term733, term733.getClass(), "mark", 962840079);
        term4835 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4835, term4835.getClass(), "input", "IoAlmYsBwc");
        setIntField(term4835, term4835.getClass(), "length", 933028652);
        setIntField(term4835, term4835.getClass(), "pos", 287287233);
        setIntField(term4835, term4835.getClass(), "mark", 962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        Object retValue = callMethod(klass, "matchConsumeIgnoreCase", argTypes, term733, args);
        assertTrue(recursiveEquals(term733, term4835));
        assertTrue(recursiveEquals(retValue, false));
    }

};


