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
import java.lang.Integer;

public class Soundex_setMaxLength_210400064422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;
     Object term541;
     Object term3238;

    public Soundex_setMaxLength_210400064422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term514 = (char[]) newCharArray(26);
        setIntField(term512, term512.getClass(), "maxLength", 4);
        setCharElement(term514, 0, (char) 48);
        setCharElement(term514, 1, (char) 49);
        setCharElement(term514, 2, (char) 50);
        setCharElement(term514, 3, (char) 51);
        setCharElement(term514, 4, (char) 48);
        setCharElement(term514, 5, (char) 49);
        setCharElement(term514, 6, (char) 50);
        setCharElement(term514, 7, (char) 48);
        setCharElement(term514, 8, (char) 48);
        setCharElement(term514, 9, (char) 50);
        setCharElement(term514, 10, (char) 50);
        setCharElement(term514, 11, (char) 52);
        setCharElement(term514, 12, (char) 53);
        setCharElement(term514, 13, (char) 53);
        setCharElement(term514, 14, (char) 48);
        setCharElement(term514, 15, (char) 49);
        setCharElement(term514, 16, (char) 50);
        setCharElement(term514, 17, (char) 54);
        setCharElement(term514, 18, (char) 50);
        setCharElement(term514, 19, (char) 51);
        setCharElement(term514, 20, (char) 48);
        setCharElement(term514, 21, (char) 49);
        setCharElement(term514, 22, (char) 48);
        setCharElement(term514, 23, (char) 50);
        setCharElement(term514, 24, (char) 48);
        setCharElement(term514, 25, (char) 50);
        setField(term512, term512.getClass(), "soundexMapping", term514);
        term541 = new Integer(1162663216);
        term3238 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term3239 = (char[]) newCharArray(26);
        setIntField(term3238, term3238.getClass(), "maxLength", 1162663216);
        setCharElement(term3239, 0, (char) 48);
        setCharElement(term3239, 1, (char) 49);
        setCharElement(term3239, 2, (char) 50);
        setCharElement(term3239, 3, (char) 51);
        setCharElement(term3239, 4, (char) 48);
        setCharElement(term3239, 5, (char) 49);
        setCharElement(term3239, 6, (char) 50);
        setCharElement(term3239, 7, (char) 48);
        setCharElement(term3239, 8, (char) 48);
        setCharElement(term3239, 9, (char) 50);
        setCharElement(term3239, 10, (char) 50);
        setCharElement(term3239, 11, (char) 52);
        setCharElement(term3239, 12, (char) 53);
        setCharElement(term3239, 13, (char) 53);
        setCharElement(term3239, 14, (char) 48);
        setCharElement(term3239, 15, (char) 49);
        setCharElement(term3239, 16, (char) 50);
        setCharElement(term3239, 17, (char) 54);
        setCharElement(term3239, 18, (char) 50);
        setCharElement(term3239, 19, (char) 51);
        setCharElement(term3239, 20, (char) 48);
        setCharElement(term3239, 21, (char) 49);
        setCharElement(term3239, 22, (char) 48);
        setCharElement(term3239, 23, (char) 50);
        setCharElement(term3239, 24, (char) 48);
        setCharElement(term3239, 25, (char) 50);
        setField(term3238, term3238.getClass(), "soundexMapping", term3239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term541;
        callMethod(klass, "setMaxLength", argTypes, term512, args);
        assertTrue(recursiveEquals(term512, term3238));
        assertTrue(recursiveEquals(term541, 1162663216));
    }

};


