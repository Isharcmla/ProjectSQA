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

public class Soundex_encode_1064883425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;

    public Soundex_encode_1064883425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term191 = (char[]) newCharArray(26);
        setIntField(term189, term189.getClass(), "maxLength", 4);
        setCharElement(term191, 0, (char) 48);
        setCharElement(term191, 1, (char) 49);
        setCharElement(term191, 2, (char) 50);
        setCharElement(term191, 3, (char) 51);
        setCharElement(term191, 4, (char) 48);
        setCharElement(term191, 5, (char) 49);
        setCharElement(term191, 6, (char) 50);
        setCharElement(term191, 7, (char) 48);
        setCharElement(term191, 8, (char) 48);
        setCharElement(term191, 9, (char) 50);
        setCharElement(term191, 10, (char) 50);
        setCharElement(term191, 11, (char) 52);
        setCharElement(term191, 12, (char) 53);
        setCharElement(term191, 13, (char) 53);
        setCharElement(term191, 14, (char) 48);
        setCharElement(term191, 15, (char) 49);
        setCharElement(term191, 16, (char) 50);
        setCharElement(term191, 17, (char) 54);
        setCharElement(term191, 18, (char) 50);
        setCharElement(term191, 19, (char) 51);
        setCharElement(term191, 20, (char) 48);
        setCharElement(term191, 21, (char) 49);
        setCharElement(term191, 22, (char) 48);
        setCharElement(term191, 23, (char) 50);
        setCharElement(term191, 24, (char) 48);
        setCharElement(term191, 25, (char) 50);
        setField(term189, term189.getClass(), "soundexMapping", term191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "encode", argTypes, term189, args);
    }

};


