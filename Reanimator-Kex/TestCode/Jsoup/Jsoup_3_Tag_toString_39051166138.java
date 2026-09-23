package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;

public class Tag_toString_39051166138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036;
     Object term3587;

    public Tag_toString_39051166138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1055 = new ArrayList();
        term1036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1036, term1036.getClass(), "tagName", "EYtfuJaxiM");
        setBooleanField(term1036, term1036.getClass(), "isBlock", false);
        setBooleanField(term1036, term1036.getClass(), "canContainBlock", true);
        setBooleanField(term1036, term1036.getClass(), "canContainInline", true);
        setBooleanField(term1036, term1036.getClass(), "optionalClosing", false);
        setBooleanField(term1036, term1036.getClass(), "empty", true);
        setBooleanField(term1036, term1036.getClass(), "preserveWhitespace", false);
        setField(term1036, term1036.getClass(), "ancestors", term1055);
        ArrayList term3590 = new ArrayList();
        term3587 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3587, term3587.getClass(), "tagName", "EYtfuJaxiM");
        setBooleanField(term3587, term3587.getClass(), "isBlock", false);
        setBooleanField(term3587, term3587.getClass(), "canContainBlock", true);
        setBooleanField(term3587, term3587.getClass(), "canContainInline", true);
        setBooleanField(term3587, term3587.getClass(), "optionalClosing", false);
        setBooleanField(term3587, term3587.getClass(), "empty", true);
        setBooleanField(term3587, term3587.getClass(), "preserveWhitespace", false);
        setField(term3587, term3587.getClass(), "ancestors", term3590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1036, args);
        assertTrue(recursiveEquals(term1036, term3587));
        assertTrue(recursiveEquals(retValue, "EYtfuJaxiM"));
    }

};


