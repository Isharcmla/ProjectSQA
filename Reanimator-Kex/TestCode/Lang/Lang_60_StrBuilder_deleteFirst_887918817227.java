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

public class StrBuilder_deleteFirst_887918817227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7163;
     Object term70643;
     Object term70570;

    public StrBuilder_deleteFirst_887918817227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7163 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7164 = (char[]) newCharArray(32);
        setField(term7163, term7163.getClass(), "buffer", term7164);
        setIntField(term7163, term7163.getClass(), "size", -615654495);
        setField(term7163, term7163.getClass(), "newLine", "EYtfuJaxiM");
        setField(term7163, term7163.getClass(), "nullText", "gCWtLVKVVe");
        term70643 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70644 = (char[]) newCharArray(32);
        setField(term70643, term70643.getClass(), "buffer", term70644);
        setIntField(term70643, term70643.getClass(), "size", -615654495);
        setField(term70643, term70643.getClass(), "newLine", "EYtfuJaxiM");
        setField(term70643, term70643.getClass(), "nullText", "gCWtLVKVVe");
        term70570 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70571 = (char[]) newCharArray(32);
        setField(term70570, term70570.getClass(), "buffer", term70571);
        setIntField(term70570, term70570.getClass(), "size", -615654495);
        setField(term70570, term70570.getClass(), "newLine", "EYtfuJaxiM");
        setField(term70570, term70570.getClass(), "nullText", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term7163, args);
        assertTrue(recursiveEquals(term7163, term70643));
        assertTrue(recursiveEquals(retValue, term70570));
    }

};


