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

public class Soundex_init_37524428714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;

    public Soundex_init_37524428714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term761 = (char[]) newCharArray(10);
        setIntField(term760, term760.getClass(), "maxLength", 4);
        setCharElement(term761, 0, 'P');
        setCharElement(term761, 1, 'A');
        setCharElement(term761, 2, 'E');
        setCharElement(term761, 3, 'B');
        setCharElement(term761, 4, 't');
        setCharElement(term761, 5, 'n');
        setCharElement(term761, 6, 'Z');
        setCharElement(term761, 7, 't');
        setCharElement(term761, 8, 'T');
        setCharElement(term761, 9, 'D');
        setField(term760, term760.getClass(), "soundexMapping", term761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term760));
    }

};


