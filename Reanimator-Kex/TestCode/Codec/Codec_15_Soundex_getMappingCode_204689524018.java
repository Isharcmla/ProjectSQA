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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Soundex_getMappingCode_204689524018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266;
     Object term307;

    public Soundex_getMappingCode_204689524018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term268 = (char[]) newCharArray(26);
        setIntField(term266, term266.getClass(), "maxLength", 4);
        setCharElement(term268, 0, (char) 48);
        setCharElement(term268, 1, (char) 49);
        setCharElement(term268, 2, (char) 50);
        setCharElement(term268, 3, (char) 51);
        setCharElement(term268, 4, (char) 48);
        setCharElement(term268, 5, (char) 49);
        setCharElement(term268, 6, (char) 50);
        setCharElement(term268, 7, (char) 48);
        setCharElement(term268, 8, (char) 48);
        setCharElement(term268, 9, (char) 50);
        setCharElement(term268, 10, (char) 50);
        setCharElement(term268, 11, (char) 52);
        setCharElement(term268, 12, (char) 53);
        setCharElement(term268, 13, (char) 53);
        setCharElement(term268, 14, (char) 48);
        setCharElement(term268, 15, (char) 49);
        setCharElement(term268, 16, (char) 50);
        setCharElement(term268, 17, (char) 54);
        setCharElement(term268, 18, (char) 50);
        setCharElement(term268, 19, (char) 51);
        setCharElement(term268, 20, (char) 48);
        setCharElement(term268, 21, (char) 49);
        setCharElement(term268, 22, (char) 48);
        setCharElement(term268, 23, (char) 50);
        setCharElement(term268, 24, (char) 48);
        setCharElement(term268, 25, (char) 50);
        setField(term266, term266.getClass(), "soundexMapping", term268);
        term307 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term307;
        try {
            callMethod(klass, "getMappingCode", argTypes, term266, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


