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

public class Tag_hashCode_901271351472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40872;
     Object term41079;

    public Tag_hashCode_901271351472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40872 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40872, term40872.getClass(), "tagName", "");
        setBooleanField(term40872, term40872.getClass(), "isBlock", true);
        setBooleanField(term40872, term40872.getClass(), "formatAsBlock", true);
        setBooleanField(term40872, term40872.getClass(), "canContainInline", true);
        setBooleanField(term40872, term40872.getClass(), "empty", true);
        setBooleanField(term40872, term40872.getClass(), "selfClosing", true);
        setBooleanField(term40872, term40872.getClass(), "preserveWhitespace", true);
        setBooleanField(term40872, term40872.getClass(), "formList", true);
        term41079 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41079, term41079.getClass(), "tagName", "");
        setBooleanField(term41079, term41079.getClass(), "isBlock", true);
        setBooleanField(term41079, term41079.getClass(), "formatAsBlock", true);
        setBooleanField(term41079, term41079.getClass(), "canContainInline", true);
        setBooleanField(term41079, term41079.getClass(), "empty", true);
        setBooleanField(term41079, term41079.getClass(), "selfClosing", true);
        setBooleanField(term41079, term41079.getClass(), "preserveWhitespace", true);
        setBooleanField(term41079, term41079.getClass(), "formList", true);
        setBooleanField(term41079, term41079.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40872, args);
        assertTrue(recursiveEquals(term40872, term41079));
        assertTrue(recursiveEquals(retValue, -1635069825));
    }

};


