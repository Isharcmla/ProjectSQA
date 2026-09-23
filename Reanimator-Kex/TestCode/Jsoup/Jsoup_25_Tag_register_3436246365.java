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

public class Tag_register_3436246365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4621;
     Object term4712;
     Object term4702;

    public Tag_register_3436246365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4621 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4621, term4621.getClass(), "tagName", "");
        term4712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4712, term4712.getClass(), "tagName", "");
        setBooleanField(term4712, term4712.getClass(), "isBlock", false);
        setBooleanField(term4712, term4712.getClass(), "formatAsBlock", false);
        setBooleanField(term4712, term4712.getClass(), "canContainBlock", false);
        setBooleanField(term4712, term4712.getClass(), "canContainInline", false);
        setBooleanField(term4712, term4712.getClass(), "empty", false);
        setBooleanField(term4712, term4712.getClass(), "selfClosing", false);
        setBooleanField(term4712, term4712.getClass(), "preserveWhitespace", false);
        term4702 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4702, term4702.getClass(), "tagName", "");
        setBooleanField(term4702, term4702.getClass(), "isBlock", false);
        setBooleanField(term4702, term4702.getClass(), "formatAsBlock", false);
        setBooleanField(term4702, term4702.getClass(), "canContainBlock", false);
        setBooleanField(term4702, term4702.getClass(), "canContainInline", false);
        setBooleanField(term4702, term4702.getClass(), "empty", false);
        setBooleanField(term4702, term4702.getClass(), "selfClosing", false);
        setBooleanField(term4702, term4702.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term4621;
        Object retValue = callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term4621, term4712));
        assertTrue(recursiveEquals(retValue, term4702));
    }

};


