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

public class Tag_hashCode_901271351593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51224;
     Object term51306;

    public Tag_hashCode_901271351593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51224 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51224, term51224.getClass(), "tagName", "");
        setBooleanField(term51224, term51224.getClass(), "isBlock", true);
        setBooleanField(term51224, term51224.getClass(), "formatAsBlock", true);
        setBooleanField(term51224, term51224.getClass(), "canContainInline", true);
        setBooleanField(term51224, term51224.getClass(), "empty", true);
        setBooleanField(term51224, term51224.getClass(), "selfClosing", false);
        setBooleanField(term51224, term51224.getClass(), "preserveWhitespace", false);
        setBooleanField(term51224, term51224.getClass(), "formList", true);
        term51306 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51306, term51306.getClass(), "tagName", "");
        setBooleanField(term51306, term51306.getClass(), "isBlock", true);
        setBooleanField(term51306, term51306.getClass(), "formatAsBlock", true);
        setBooleanField(term51306, term51306.getClass(), "canContainInline", true);
        setBooleanField(term51306, term51306.getClass(), "empty", true);
        setBooleanField(term51306, term51306.getClass(), "selfClosing", false);
        setBooleanField(term51306, term51306.getClass(), "preserveWhitespace", false);
        setBooleanField(term51306, term51306.getClass(), "formList", true);
        setBooleanField(term51306, term51306.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term51224, args);
        assertTrue(recursiveEquals(term51224, term51306));
        assertTrue(recursiveEquals(retValue, -1635100577));
    }

};


