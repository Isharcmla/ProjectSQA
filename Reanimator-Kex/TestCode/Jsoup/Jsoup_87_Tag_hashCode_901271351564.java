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

public class Tag_hashCode_901271351564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48572;
     Object term48783;

    public Tag_hashCode_901271351564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48572 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48572, term48572.getClass(), "tagName", "");
        setBooleanField(term48572, term48572.getClass(), "isBlock", true);
        setBooleanField(term48572, term48572.getClass(), "formatAsBlock", false);
        setBooleanField(term48572, term48572.getClass(), "canContainInline", true);
        setBooleanField(term48572, term48572.getClass(), "empty", true);
        setBooleanField(term48572, term48572.getClass(), "selfClosing", true);
        setBooleanField(term48572, term48572.getClass(), "preserveWhitespace", true);
        setBooleanField(term48572, term48572.getClass(), "formList", true);
        term48783 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48783, term48783.getClass(), "tagName", "");
        setBooleanField(term48783, term48783.getClass(), "isBlock", true);
        setBooleanField(term48783, term48783.getClass(), "formatAsBlock", false);
        setBooleanField(term48783, term48783.getClass(), "canContainInline", true);
        setBooleanField(term48783, term48783.getClass(), "empty", true);
        setBooleanField(term48783, term48783.getClass(), "selfClosing", true);
        setBooleanField(term48783, term48783.getClass(), "preserveWhitespace", true);
        setBooleanField(term48783, term48783.getClass(), "formList", true);
        setBooleanField(term48783, term48783.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term48572, args);
        assertTrue(recursiveEquals(term48572, term48783));
        assertTrue(recursiveEquals(retValue, 1772393790));
    }

};


