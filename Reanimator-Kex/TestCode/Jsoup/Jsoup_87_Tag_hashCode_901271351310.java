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

public class Tag_hashCode_901271351310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26964;
     Object term27169;

    public Tag_hashCode_901271351310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26964 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26964, term26964.getClass(), "tagName", "");
        setBooleanField(term26964, term26964.getClass(), "isBlock", true);
        setBooleanField(term26964, term26964.getClass(), "formatAsBlock", false);
        setBooleanField(term26964, term26964.getClass(), "canContainInline", false);
        setBooleanField(term26964, term26964.getClass(), "empty", false);
        setBooleanField(term26964, term26964.getClass(), "selfClosing", true);
        setBooleanField(term26964, term26964.getClass(), "preserveWhitespace", false);
        setBooleanField(term26964, term26964.getClass(), "formList", true);
        term27169 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27169, term27169.getClass(), "tagName", "");
        setBooleanField(term27169, term27169.getClass(), "isBlock", true);
        setBooleanField(term27169, term27169.getClass(), "formatAsBlock", false);
        setBooleanField(term27169, term27169.getClass(), "canContainInline", false);
        setBooleanField(term27169, term27169.getClass(), "empty", false);
        setBooleanField(term27169, term27169.getClass(), "selfClosing", true);
        setBooleanField(term27169, term27169.getClass(), "preserveWhitespace", false);
        setBooleanField(term27169, term27169.getClass(), "formList", true);
        setBooleanField(term27169, term27169.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26964, args);
        assertTrue(recursiveEquals(term26964, term27169));
        assertTrue(recursiveEquals(retValue, 1742840157));
    }

};


