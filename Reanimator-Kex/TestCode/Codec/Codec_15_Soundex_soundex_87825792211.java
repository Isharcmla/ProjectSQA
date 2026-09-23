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

public class Soundex_soundex_87825792211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;

    public Soundex_soundex_87825792211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term571 = (char[]) newCharArray(26);
        setIntField(term569, term569.getClass(), "maxLength", 4);
        setCharElement(term571, 0, (char) 48);
        setCharElement(term571, 1, (char) 49);
        setCharElement(term571, 2, (char) 50);
        setCharElement(term571, 3, (char) 51);
        setCharElement(term571, 4, (char) 48);
        setCharElement(term571, 5, (char) 49);
        setCharElement(term571, 6, (char) 50);
        setCharElement(term571, 7, (char) 48);
        setCharElement(term571, 8, (char) 48);
        setCharElement(term571, 9, (char) 50);
        setCharElement(term571, 10, (char) 50);
        setCharElement(term571, 11, (char) 52);
        setCharElement(term571, 12, (char) 53);
        setCharElement(term571, 13, (char) 53);
        setCharElement(term571, 14, (char) 48);
        setCharElement(term571, 15, (char) 49);
        setCharElement(term571, 16, (char) 50);
        setCharElement(term571, 17, (char) 54);
        setCharElement(term571, 18, (char) 50);
        setCharElement(term571, 19, (char) 51);
        setCharElement(term571, 20, (char) 48);
        setCharElement(term571, 21, (char) 49);
        setCharElement(term571, 22, (char) 48);
        setCharElement(term571, 23, (char) 50);
        setCharElement(term571, 24, (char) 48);
        setCharElement(term571, 25, (char) 50);
        setField(term569, term569.getClass(), "soundexMapping", term571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "soundex", argTypes, term569, args);
    }

};


