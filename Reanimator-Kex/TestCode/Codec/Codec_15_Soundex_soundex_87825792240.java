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

public class Soundex_soundex_87825792240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24028;
     Object term35297;

    public Soundex_soundex_87825792240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24028 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        term35297 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        setIntField(term35297, term35297.getClass(), "maxLength", 0);
        setField(term35297, term35297.getClass(), "soundexMapping", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "[                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        Object retValue = callMethod(klass, "soundex", argTypes, term24028, args);
        assertTrue(recursiveEquals(term24028, term35297));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


