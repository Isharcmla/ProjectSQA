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
import java.lang.Character;

public class Soundex_map_7343102049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;
     Object term484;

    public Soundex_map_7343102049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term457 = (char[]) newCharArray(26);
        setIntField(term455, term455.getClass(), "maxLength", 4);
        setCharElement(term457, 0, (char) 48);
        setCharElement(term457, 1, (char) 49);
        setCharElement(term457, 2, (char) 50);
        setCharElement(term457, 3, (char) 51);
        setCharElement(term457, 4, (char) 48);
        setCharElement(term457, 5, (char) 49);
        setCharElement(term457, 6, (char) 50);
        setCharElement(term457, 7, (char) 48);
        setCharElement(term457, 8, (char) 48);
        setCharElement(term457, 9, (char) 50);
        setCharElement(term457, 10, (char) 50);
        setCharElement(term457, 11, (char) 52);
        setCharElement(term457, 12, (char) 53);
        setCharElement(term457, 13, (char) 53);
        setCharElement(term457, 14, (char) 48);
        setCharElement(term457, 15, (char) 49);
        setCharElement(term457, 16, (char) 50);
        setCharElement(term457, 17, (char) 54);
        setCharElement(term457, 18, (char) 50);
        setCharElement(term457, 19, (char) 51);
        setCharElement(term457, 20, (char) 48);
        setCharElement(term457, 21, (char) 49);
        setCharElement(term457, 22, (char) 48);
        setCharElement(term457, 23, (char) 50);
        setCharElement(term457, 24, (char) 48);
        setCharElement(term457, 25, (char) 50);
        setField(term455, term455.getClass(), "soundexMapping", term457);
        term484 = new Character('n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term484;
        callMethod(klass, "map", argTypes, term455, args);
    }

};


