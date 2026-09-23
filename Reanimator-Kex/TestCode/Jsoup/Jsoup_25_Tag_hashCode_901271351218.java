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

public class Tag_hashCode_901271351218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16937;
     Object term17154;

    public Tag_hashCode_901271351218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16937 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16937, term16937.getClass(), "tagName", "");
        setBooleanField(term16937, term16937.getClass(), "isBlock", false);
        setBooleanField(term16937, term16937.getClass(), "formatAsBlock", false);
        setBooleanField(term16937, term16937.getClass(), "canContainBlock", true);
        setBooleanField(term16937, term16937.getClass(), "canContainInline", false);
        setBooleanField(term16937, term16937.getClass(), "empty", true);
        setBooleanField(term16937, term16937.getClass(), "selfClosing", true);
        term17154 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17154, term17154.getClass(), "tagName", "");
        setBooleanField(term17154, term17154.getClass(), "isBlock", false);
        setBooleanField(term17154, term17154.getClass(), "formatAsBlock", false);
        setBooleanField(term17154, term17154.getClass(), "canContainBlock", true);
        setBooleanField(term17154, term17154.getClass(), "canContainInline", false);
        setBooleanField(term17154, term17154.getClass(), "empty", true);
        setBooleanField(term17154, term17154.getClass(), "selfClosing", true);
        setBooleanField(term17154, term17154.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16937, args);
        assertTrue(recursiveEquals(term16937, term17154));
        assertTrue(recursiveEquals(retValue, 924513));
    }

};


