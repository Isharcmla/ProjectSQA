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

public class Tag_hashCode_901271351485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41994;
     Object term42076;

    public Tag_hashCode_901271351485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41994 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41994, term41994.getClass(), "tagName", "");
        setBooleanField(term41994, term41994.getClass(), "isBlock", true);
        setBooleanField(term41994, term41994.getClass(), "formatAsBlock", false);
        setBooleanField(term41994, term41994.getClass(), "canContainInline", true);
        setBooleanField(term41994, term41994.getClass(), "empty", false);
        setBooleanField(term41994, term41994.getClass(), "selfClosing", true);
        setBooleanField(term41994, term41994.getClass(), "preserveWhitespace", true);
        setBooleanField(term41994, term41994.getClass(), "formList", true);
        term42076 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42076, term42076.getClass(), "tagName", "");
        setBooleanField(term42076, term42076.getClass(), "isBlock", true);
        setBooleanField(term42076, term42076.getClass(), "formatAsBlock", false);
        setBooleanField(term42076, term42076.getClass(), "canContainInline", true);
        setBooleanField(term42076, term42076.getClass(), "empty", false);
        setBooleanField(term42076, term42076.getClass(), "selfClosing", true);
        setBooleanField(term42076, term42076.getClass(), "preserveWhitespace", true);
        setBooleanField(term42076, term42076.getClass(), "formList", true);
        setBooleanField(term42076, term42076.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41994, args);
        assertTrue(recursiveEquals(term41994, term42076));
        assertTrue(recursiveEquals(retValue, 1771470269));
    }

};


