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
     Object term70426;
     Object term70353;

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
        term70426 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70427 = (char[]) newCharArray(32);
        setField(term70426, term70426.getClass(), "buffer", term70427);
        setIntField(term70426, term70426.getClass(), "size", -615654495);
        setField(term70426, term70426.getClass(), "newLine", "EYtfuJaxiM");
        setField(term70426, term70426.getClass(), "nullText", "gCWtLVKVVe");
        term70353 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70354 = (char[]) newCharArray(32);
        setField(term70353, term70353.getClass(), "buffer", term70354);
        setIntField(term70353, term70353.getClass(), "size", -615654495);
        setField(term70353, term70353.getClass(), "newLine", "EYtfuJaxiM");
        setField(term70353, term70353.getClass(), "nullText", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term7163, args);
        assertTrue(recursiveEquals(term7163, term70426));
        assertTrue(recursiveEquals(retValue, term70353));
    }

};


