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

public class StrBuilder_replaceAll_1949998028424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1702505;
     Object term1715160;
     Object term1713657;

    public StrBuilder_replaceAll_1949998028424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1702505 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1691229 = (char[]) newCharArray(511);
        setIntField(term1702505, term1702505.getClass(), "size", 514);
        setField(term1702505, term1702505.getClass(), "buffer", term1691229);
        term1715160 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1715161 = (char[]) newCharArray(511);
        setField(term1715160, term1715160.getClass(), "buffer", term1715161);
        setIntField(term1715160, term1715160.getClass(), "size", 514);
        setField(term1715160, term1715160.getClass(), "newLine", null);
        setField(term1715160, term1715160.getClass(), "nullText", null);
        term1713657 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1713658 = (char[]) newCharArray(511);
        setField(term1713657, term1713657.getClass(), "buffer", term1713658);
        setIntField(term1713657, term1713657.getClass(), "size", 514);
        setField(term1713657, term1713657.getClass(), "newLine", null);
        setField(term1713657, term1713657.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term1702505, args);
        assertTrue(recursiveEquals(term1702505, term1715160));
        assertTrue(recursiveEquals(retValue, term1713657));
    }

};


