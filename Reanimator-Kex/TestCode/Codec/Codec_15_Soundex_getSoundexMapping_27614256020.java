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

public class Soundex_getSoundexMapping_27614256020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;
     Object term2763;
     Object term2707;

    public Soundex_getSoundexMapping_27614256020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term402 = (char[]) newCharArray(26);
        setIntField(term400, term400.getClass(), "maxLength", 4);
        setCharElement(term402, 0, (char) 48);
        setCharElement(term402, 1, (char) 49);
        setCharElement(term402, 2, (char) 50);
        setCharElement(term402, 3, (char) 51);
        setCharElement(term402, 4, (char) 48);
        setCharElement(term402, 5, (char) 49);
        setCharElement(term402, 6, (char) 50);
        setCharElement(term402, 7, (char) 48);
        setCharElement(term402, 8, (char) 48);
        setCharElement(term402, 9, (char) 50);
        setCharElement(term402, 10, (char) 50);
        setCharElement(term402, 11, (char) 52);
        setCharElement(term402, 12, (char) 53);
        setCharElement(term402, 13, (char) 53);
        setCharElement(term402, 14, (char) 48);
        setCharElement(term402, 15, (char) 49);
        setCharElement(term402, 16, (char) 50);
        setCharElement(term402, 17, (char) 54);
        setCharElement(term402, 18, (char) 50);
        setCharElement(term402, 19, (char) 51);
        setCharElement(term402, 20, (char) 48);
        setCharElement(term402, 21, (char) 49);
        setCharElement(term402, 22, (char) 48);
        setCharElement(term402, 23, (char) 50);
        setCharElement(term402, 24, (char) 48);
        setCharElement(term402, 25, (char) 50);
        setField(term400, term400.getClass(), "soundexMapping", term402);
        term2763 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term2764 = (char[]) newCharArray(26);
        setIntField(term2763, term2763.getClass(), "maxLength", 4);
        setCharElement(term2764, 0, (char) 48);
        setCharElement(term2764, 1, (char) 49);
        setCharElement(term2764, 2, (char) 50);
        setCharElement(term2764, 3, (char) 51);
        setCharElement(term2764, 4, (char) 48);
        setCharElement(term2764, 5, (char) 49);
        setCharElement(term2764, 6, (char) 50);
        setCharElement(term2764, 7, (char) 48);
        setCharElement(term2764, 8, (char) 48);
        setCharElement(term2764, 9, (char) 50);
        setCharElement(term2764, 10, (char) 50);
        setCharElement(term2764, 11, (char) 52);
        setCharElement(term2764, 12, (char) 53);
        setCharElement(term2764, 13, (char) 53);
        setCharElement(term2764, 14, (char) 48);
        setCharElement(term2764, 15, (char) 49);
        setCharElement(term2764, 16, (char) 50);
        setCharElement(term2764, 17, (char) 54);
        setCharElement(term2764, 18, (char) 50);
        setCharElement(term2764, 19, (char) 51);
        setCharElement(term2764, 20, (char) 48);
        setCharElement(term2764, 21, (char) 49);
        setCharElement(term2764, 22, (char) 48);
        setCharElement(term2764, 23, (char) 50);
        setCharElement(term2764, 24, (char) 48);
        setCharElement(term2764, 25, (char) 50);
        setField(term2763, term2763.getClass(), "soundexMapping", term2764);
        term2707 = (char[]) newCharArray(26);
        setCharElement(term2707, 0, (char) 48);
        setCharElement(term2707, 1, (char) 49);
        setCharElement(term2707, 2, (char) 50);
        setCharElement(term2707, 3, (char) 51);
        setCharElement(term2707, 4, (char) 48);
        setCharElement(term2707, 5, (char) 49);
        setCharElement(term2707, 6, (char) 50);
        setCharElement(term2707, 7, (char) 48);
        setCharElement(term2707, 8, (char) 48);
        setCharElement(term2707, 9, (char) 50);
        setCharElement(term2707, 10, (char) 50);
        setCharElement(term2707, 11, (char) 52);
        setCharElement(term2707, 12, (char) 53);
        setCharElement(term2707, 13, (char) 53);
        setCharElement(term2707, 14, (char) 48);
        setCharElement(term2707, 15, (char) 49);
        setCharElement(term2707, 16, (char) 50);
        setCharElement(term2707, 17, (char) 54);
        setCharElement(term2707, 18, (char) 50);
        setCharElement(term2707, 19, (char) 51);
        setCharElement(term2707, 20, (char) 48);
        setCharElement(term2707, 21, (char) 49);
        setCharElement(term2707, 22, (char) 48);
        setCharElement(term2707, 23, (char) 50);
        setCharElement(term2707, 24, (char) 48);
        setCharElement(term2707, 25, (char) 50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSoundexMapping", argTypes, term400, args);
        assertTrue(recursiveEquals(term400, term2763));
        assertTrue(recursiveEquals(retValue, term2707));
    }

};


