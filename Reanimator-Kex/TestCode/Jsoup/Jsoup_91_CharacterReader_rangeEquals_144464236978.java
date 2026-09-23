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
import java.lang.Integer;

public class CharacterReader_rangeEquals_144464236978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4123;
     Object term4128;
     Object term4130;
     Object term15746;

    public CharacterReader_rangeEquals_144464236978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4123 = (char[]) newCharArray(4);
        setCharElement(term4123, 0, 'y');
        setCharElement(term4123, 1, 'x');
        setCharElement(term4123, 2, 'f');
        setCharElement(term4123, 3, 'b');
        term4128 = new Integer(-601863069);
        term4130 = new Integer(663292551);
        term15746 = (char[]) newCharArray(4);
        setCharElement(term15746, 0, 'y');
        setCharElement(term15746, 1, 'x');
        setCharElement(term15746, 2, 'f');
        setCharElement(term15746, 3, 'b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4123;
        args[1] = term4128;
        args[2] = term4130;
        args[3] = "HWkpTmtlrc";
        Object retValue = callMethod(klass, "rangeEquals", argTypes, null, args);
        assertTrue(recursiveEquals(term4123, term15746));
        assertTrue(recursiveEquals(term4128, -601863069));
        assertTrue(recursiveEquals(term4130, 663292551));
        assertTrue(recursiveEquals(retValue, false));
    }

};


