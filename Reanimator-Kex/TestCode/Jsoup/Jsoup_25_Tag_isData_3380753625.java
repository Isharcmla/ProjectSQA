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

public class Tag_isData_3380753625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term950;

    public Tag_isData_3380753625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term195, term195.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term195, term195.getClass(), "isBlock", true);
        setBooleanField(term195, term195.getClass(), "formatAsBlock", true);
        setBooleanField(term195, term195.getClass(), "canContainBlock", true);
        setBooleanField(term195, term195.getClass(), "canContainInline", true);
        setBooleanField(term195, term195.getClass(), "empty", false);
        setBooleanField(term195, term195.getClass(), "selfClosing", false);
        setBooleanField(term195, term195.getClass(), "preserveWhitespace", false);
        term950 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term950, term950.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term950, term950.getClass(), "isBlock", true);
        setBooleanField(term950, term950.getClass(), "formatAsBlock", true);
        setBooleanField(term950, term950.getClass(), "canContainBlock", true);
        setBooleanField(term950, term950.getClass(), "canContainInline", true);
        setBooleanField(term950, term950.getClass(), "empty", false);
        setBooleanField(term950, term950.getClass(), "selfClosing", false);
        setBooleanField(term950, term950.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isData", argTypes, term195, args);
        assertTrue(recursiveEquals(term195, term950));
        assertTrue(recursiveEquals(retValue, false));
    }

};


