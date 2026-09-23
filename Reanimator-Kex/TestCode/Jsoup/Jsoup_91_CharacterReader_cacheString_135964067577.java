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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class CharacterReader_cacheString_135964067577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4085;
     Object term4091;
     Object term4104;
     Object term4106;

    public CharacterReader_cacheString_135964067577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4085 = (char[]) newCharArray(5);
        setCharElement(term4085, 0, 'I');
        setCharElement(term4085, 1, 'f');
        setCharElement(term4085, 2, 'E');
        setCharElement(term4085, 3, 'R');
        setCharElement(term4085, 4, 'H');
        term4091 = (Object[]) newArray("java.lang.String", 1);
        setElement(term4091, 0, "PtirvZmsGt");
        term4104 = new Integer(-1274456137);
        term4106 = new Integer(1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4085;
        args[1] = term4091;
        args[2] = term4104;
        args[3] = term4106;
        try {
            callMethod(klass, "cacheString", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


