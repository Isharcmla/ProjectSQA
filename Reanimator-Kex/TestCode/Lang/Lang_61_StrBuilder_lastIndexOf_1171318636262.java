package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Character;

public class StrBuilder_lastIndexOf_1171318636262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11014;
     Object term11073;
     Object term80145;

    public StrBuilder_lastIndexOf_1171318636262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11014 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11015 = (char[]) newCharArray(32);
        setField(term11014, term11014.getClass(), "buffer", term11015);
        setIntField(term11014, term11014.getClass(), "size", -523949691);
        setField(term11014, term11014.getClass(), "newLine", "QduALnDSVo");
        setField(term11014, term11014.getClass(), "nullText", "izPpKDErnQ");
        term11073 = new Character('J');
        term80145 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term80146 = (char[]) newCharArray(32);
        setField(term80145, term80145.getClass(), "buffer", term80146);
        setIntField(term80145, term80145.getClass(), "size", -523949691);
        setField(term80145, term80145.getClass(), "newLine", "QduALnDSVo");
        setField(term80145, term80145.getClass(), "nullText", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term11073;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term11014, args);
        assertTrue(recursiveEquals(term11014, term80145));
        assertTrue(recursiveEquals(term11073, 'J'));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


