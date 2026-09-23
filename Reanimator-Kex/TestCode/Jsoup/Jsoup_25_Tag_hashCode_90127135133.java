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

public class Tag_hashCode_90127135133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428;
     Object term1319;

    public Tag_hashCode_90127135133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term428, term428.getClass(), "tagName", "aJlieCFVtF");
        setBooleanField(term428, term428.getClass(), "isBlock", true);
        setBooleanField(term428, term428.getClass(), "formatAsBlock", false);
        setBooleanField(term428, term428.getClass(), "canContainBlock", true);
        setBooleanField(term428, term428.getClass(), "canContainInline", false);
        setBooleanField(term428, term428.getClass(), "empty", false);
        setBooleanField(term428, term428.getClass(), "selfClosing", true);
        setBooleanField(term428, term428.getClass(), "preserveWhitespace", true);
        term1319 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1319, term1319.getClass(), "tagName", "aJlieCFVtF");
        setBooleanField(term1319, term1319.getClass(), "isBlock", true);
        setBooleanField(term1319, term1319.getClass(), "formatAsBlock", false);
        setBooleanField(term1319, term1319.getClass(), "canContainBlock", true);
        setBooleanField(term1319, term1319.getClass(), "canContainInline", false);
        setBooleanField(term1319, term1319.getClass(), "empty", false);
        setBooleanField(term1319, term1319.getClass(), "selfClosing", true);
        setBooleanField(term1319, term1319.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term428, args);
        assertTrue(recursiveEquals(term428, term1319));
        assertTrue(recursiveEquals(retValue, 16606396));
    }

};


