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

public class StrBuilder_replaceAll_1949998028368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167426;
     Object term180440;
     Object term179196;

    public StrBuilder_replaceAll_1949998028368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167426 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term160903 = (char[]) newCharArray(490);
        setIntField(term167426, term167426.getClass(), "size", 1048577);
        setCharElement(term160903, 14, (char) 1);
        setCharElement(term160903, 15, (char) 1);
        setCharElement(term160903, 16, (char) 1);
        setCharElement(term160903, 17, (char) 1);
        setCharElement(term160903, 18, (char) 1);
        setCharElement(term160903, 19, (char) 1);
        setCharElement(term160903, 20, (char) 1);
        setCharElement(term160903, 21, (char) 8192);
        setField(term167426, term167426.getClass(), "buffer", term160903);
        term180440 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term180441 = (char[]) newCharArray(490);
        setCharElement(term180441, 14, (char) 1);
        setCharElement(term180441, 15, (char) 1);
        setCharElement(term180441, 16, (char) 1);
        setCharElement(term180441, 17, (char) 1);
        setCharElement(term180441, 18, (char) 1);
        setCharElement(term180441, 19, (char) 1);
        setCharElement(term180441, 20, (char) 1);
        setCharElement(term180441, 21, (char) 8192);
        setField(term180440, term180440.getClass(), "buffer", term180441);
        setIntField(term180440, term180440.getClass(), "size", 1048577);
        setField(term180440, term180440.getClass(), "newLine", null);
        setField(term180440, term180440.getClass(), "nullText", null);
        term179196 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term179197 = (char[]) newCharArray(490);
        setCharElement(term179197, 14, (char) 1);
        setCharElement(term179197, 15, (char) 1);
        setCharElement(term179197, 16, (char) 1);
        setCharElement(term179197, 17, (char) 1);
        setCharElement(term179197, 18, (char) 1);
        setCharElement(term179197, 19, (char) 1);
        setCharElement(term179197, 20, (char) 1);
        setCharElement(term179197, 21, (char) 8192);
        setField(term179196, term179196.getClass(), "buffer", term179197);
        setIntField(term179196, term179196.getClass(), "size", 1048577);
        setField(term179196, term179196.getClass(), "newLine", null);
        setField(term179196, term179196.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                ";
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term167426, args);
        assertTrue(recursiveEquals(term167426, term180440));
        assertTrue(recursiveEquals(retValue, term179196));
    }

};


