package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;

public class Metaphone_isMetaphoneEqual_74199918821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;
     Object term2652;

    public Metaphone_isMetaphoneEqual_74199918821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term332, term332.getClass(), "maxCodeLen", 4);
        term2652 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term2652, term2652.getClass(), "maxCodeLen", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = "hRNSzYYIrc";
        callMethod(klass, "isMetaphoneEqual", argTypes, term332, args);
        assertTrue(recursiveEquals(term332, term2652));
    }

};
