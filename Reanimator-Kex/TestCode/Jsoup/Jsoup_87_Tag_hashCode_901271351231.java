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

public class Tag_hashCode_901271351231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20496;
     Object term20578;

    public Tag_hashCode_901271351231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20496 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20496, term20496.getClass(), "tagName", "");
        setBooleanField(term20496, term20496.getClass(), "isBlock", false);
        setBooleanField(term20496, term20496.getClass(), "formatAsBlock", false);
        setBooleanField(term20496, term20496.getClass(), "canContainInline", false);
        setBooleanField(term20496, term20496.getClass(), "empty", true);
        setBooleanField(term20496, term20496.getClass(), "selfClosing", true);
        setBooleanField(term20496, term20496.getClass(), "preserveWhitespace", true);
        term20578 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20578, term20578.getClass(), "tagName", "");
        setBooleanField(term20578, term20578.getClass(), "isBlock", false);
        setBooleanField(term20578, term20578.getClass(), "formatAsBlock", false);
        setBooleanField(term20578, term20578.getClass(), "canContainInline", false);
        setBooleanField(term20578, term20578.getClass(), "empty", true);
        setBooleanField(term20578, term20578.getClass(), "selfClosing", true);
        setBooleanField(term20578, term20578.getClass(), "preserveWhitespace", true);
        setBooleanField(term20578, term20578.getClass(), "formList", false);
        setBooleanField(term20578, term20578.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20496, args);
        assertTrue(recursiveEquals(term20496, term20578));
        assertTrue(recursiveEquals(retValue, 954273));
    }

};


