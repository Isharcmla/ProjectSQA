package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class FormElement_equals_81763627653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30900;
     Object term30994;
     Object term31003;
     Object term31004;

    public FormElement_equals_81763627653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30900 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term30994 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$BindCaller"));
        term31003 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term31003, term31003.getClass(), "elements", null);
        setField(term31003, term31003.getClass(), "tag", null);
        setField(term31003, term31003.getClass(), "parentNode", null);
        setField(term31003, term31003.getClass(), "childNodes", null);
        setField(term31003, term31003.getClass(), "attributes", null);
        setField(term31003, term31003.getClass(), "baseUri", null);
        setIntField(term31003, term31003.getClass(), "siblingIndex", 0);
        term31004 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$BindCaller"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30994;
        callMethod(klass, "equals", argTypes, term30900, args);
        assertTrue(recursiveEquals(term30900, term31003));
        assertTrue(recursiveEquals(term30994, term31004));
    }

};


