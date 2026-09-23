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

public class StrBuilder_replaceFirst_1238446619520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1479219;
     Object term1494302;
     Object term1493290;

    public StrBuilder_replaceFirst_1238446619520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1479219 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1465921 = (char[]) newCharArray(511);
        setIntField(term1479219, term1479219.getClass(), "size", 518);
        setField(term1479219, term1479219.getClass(), "buffer", term1465921);
        term1494302 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1494303 = (char[]) newCharArray(511);
        setField(term1494302, term1494302.getClass(), "buffer", term1494303);
        setIntField(term1494302, term1494302.getClass(), "size", 518);
        setField(term1494302, term1494302.getClass(), "newLine", null);
        setField(term1494302, term1494302.getClass(), "nullText", null);
        term1493290 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1493291 = (char[]) newCharArray(511);
        setField(term1493290, term1493290.getClass(), "buffer", term1493291);
        setIntField(term1493290, term1493290.getClass(), "size", 518);
        setField(term1493290, term1493290.getClass(), "newLine", null);
        setField(term1493290, term1493290.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
        args[1] = null;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term1479219, args);
        assertTrue(recursiveEquals(term1479219, term1494302));
        assertTrue(recursiveEquals(retValue, term1493290));
    }

};


