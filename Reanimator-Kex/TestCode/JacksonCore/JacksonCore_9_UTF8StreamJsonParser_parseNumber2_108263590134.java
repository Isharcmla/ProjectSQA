package com.fasterxml.jackson.core.json;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class UTF8StreamJsonParser_parseNumber2_108263590134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term73;
     Object term75;
     Object term77;

    public UTF8StreamJsonParser_parseNumber2_108263590134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = (char[]) newCharArray(3);
        setCharElement(term69, 0, 'P');
        setCharElement(term69, 1, 'A');
        setCharElement(term69, 2, 'E');
        term73 = new Integer(-522618178);
        term75 = new Boolean(false);
        term77 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term69;
        args[1] = term73;
        args[2] = term75;
        args[3] = term77;
        try {
            callMethod(klass, "_parseNumber2", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


