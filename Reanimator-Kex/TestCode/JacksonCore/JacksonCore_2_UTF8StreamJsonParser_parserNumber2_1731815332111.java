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

public class UTF8StreamJsonParser_parserNumber2_1731815332111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term67;
     Object term69;
     Object term71;

    public UTF8StreamJsonParser_parserNumber2_1731815332111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = (char[]) newCharArray(3);
        setCharElement(term63, 0, 'P');
        setCharElement(term63, 1, 'A');
        setCharElement(term63, 2, 'E');
        term67 = new Integer(1227103734);
        term69 = new Boolean(false);
        term71 = new Integer(-1339778481);
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
        args[0] = term63;
        args[1] = term67;
        args[2] = term69;
        args[3] = term71;
        try {
            callMethod(klass, "_parserNumber2", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


