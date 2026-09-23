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

public class Soundex_getMaxLength_33589169419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term2653;

    public Soundex_getMaxLength_33589169419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term347 = (char[]) newCharArray(26);
        setIntField(term345, term345.getClass(), "maxLength", 4);
        setCharElement(term347, 0, (char) 48);
        setCharElement(term347, 1, (char) 49);
        setCharElement(term347, 2, (char) 50);
        setCharElement(term347, 3, (char) 51);
        setCharElement(term347, 4, (char) 48);
        setCharElement(term347, 5, (char) 49);
        setCharElement(term347, 6, (char) 50);
        setCharElement(term347, 7, (char) 48);
        setCharElement(term347, 8, (char) 48);
        setCharElement(term347, 9, (char) 50);
        setCharElement(term347, 10, (char) 50);
        setCharElement(term347, 11, (char) 52);
        setCharElement(term347, 12, (char) 53);
        setCharElement(term347, 13, (char) 53);
        setCharElement(term347, 14, (char) 48);
        setCharElement(term347, 15, (char) 49);
        setCharElement(term347, 16, (char) 50);
        setCharElement(term347, 17, (char) 54);
        setCharElement(term347, 18, (char) 50);
        setCharElement(term347, 19, (char) 51);
        setCharElement(term347, 20, (char) 48);
        setCharElement(term347, 21, (char) 49);
        setCharElement(term347, 22, (char) 48);
        setCharElement(term347, 23, (char) 50);
        setCharElement(term347, 24, (char) 48);
        setCharElement(term347, 25, (char) 50);
        setField(term345, term345.getClass(), "soundexMapping", term347);
        term2653 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term2654 = (char[]) newCharArray(26);
        setIntField(term2653, term2653.getClass(), "maxLength", 4);
        setCharElement(term2654, 0, (char) 48);
        setCharElement(term2654, 1, (char) 49);
        setCharElement(term2654, 2, (char) 50);
        setCharElement(term2654, 3, (char) 51);
        setCharElement(term2654, 4, (char) 48);
        setCharElement(term2654, 5, (char) 49);
        setCharElement(term2654, 6, (char) 50);
        setCharElement(term2654, 7, (char) 48);
        setCharElement(term2654, 8, (char) 48);
        setCharElement(term2654, 9, (char) 50);
        setCharElement(term2654, 10, (char) 50);
        setCharElement(term2654, 11, (char) 52);
        setCharElement(term2654, 12, (char) 53);
        setCharElement(term2654, 13, (char) 53);
        setCharElement(term2654, 14, (char) 48);
        setCharElement(term2654, 15, (char) 49);
        setCharElement(term2654, 16, (char) 50);
        setCharElement(term2654, 17, (char) 54);
        setCharElement(term2654, 18, (char) 50);
        setCharElement(term2654, 19, (char) 51);
        setCharElement(term2654, 20, (char) 48);
        setCharElement(term2654, 21, (char) 49);
        setCharElement(term2654, 22, (char) 48);
        setCharElement(term2654, 23, (char) 50);
        setCharElement(term2654, 24, (char) 48);
        setCharElement(term2654, 25, (char) 50);
        setField(term2653, term2653.getClass(), "soundexMapping", term2654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxLength", argTypes, term345, args);
        assertTrue(recursiveEquals(term345, term2653));
        assertTrue(recursiveEquals(retValue, 4));
    }

};


