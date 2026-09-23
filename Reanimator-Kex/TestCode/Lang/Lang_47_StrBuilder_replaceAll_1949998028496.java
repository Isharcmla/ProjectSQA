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

public class StrBuilder_replaceAll_1949998028496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334970;
     Object term363354;
     Object term361850;

    public StrBuilder_replaceAll_1949998028496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334970 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term320118 = (char[]) newCharArray(511);
        setIntField(term334970, term334970.getClass(), "size", 522);
        setField(term334970, term334970.getClass(), "buffer", term320118);
        term363354 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term363355 = (char[]) newCharArray(511);
        setField(term363354, term363354.getClass(), "buffer", term363355);
        setIntField(term363354, term363354.getClass(), "size", 522);
        setField(term363354, term363354.getClass(), "newLine", null);
        setField(term363354, term363354.getClass(), "nullText", null);
        term361850 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term361851 = (char[]) newCharArray(511);
        setField(term361850, term361850.getClass(), "buffer", term361851);
        setIntField(term361850, term361850.getClass(), "size", 522);
        setField(term361850, term361850.getClass(), "newLine", null);
        setField(term361850, term361850.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term334970, args);
        assertTrue(recursiveEquals(term334970, term363354));
        assertTrue(recursiveEquals(retValue, term361850));
    }

};


