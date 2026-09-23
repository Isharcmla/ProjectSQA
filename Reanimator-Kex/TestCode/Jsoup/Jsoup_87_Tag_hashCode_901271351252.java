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

public class Tag_hashCode_901271351252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22163;
     Object term22366;

    public Tag_hashCode_901271351252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22163 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22163, term22163.getClass(), "tagName", "");
        setBooleanField(term22163, term22163.getClass(), "isBlock", true);
        setBooleanField(term22163, term22163.getClass(), "formatAsBlock", false);
        setBooleanField(term22163, term22163.getClass(), "canContainInline", false);
        setBooleanField(term22163, term22163.getClass(), "empty", false);
        setBooleanField(term22163, term22163.getClass(), "selfClosing", false);
        setBooleanField(term22163, term22163.getClass(), "preserveWhitespace", false);
        setBooleanField(term22163, term22163.getClass(), "formList", true);
        setBooleanField(term22163, term22163.getClass(), "formSubmit", true);
        term22366 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22366, term22366.getClass(), "tagName", "");
        setBooleanField(term22366, term22366.getClass(), "isBlock", true);
        setBooleanField(term22366, term22366.getClass(), "formatAsBlock", false);
        setBooleanField(term22366, term22366.getClass(), "canContainInline", false);
        setBooleanField(term22366, term22366.getClass(), "empty", false);
        setBooleanField(term22366, term22366.getClass(), "selfClosing", false);
        setBooleanField(term22366, term22366.getClass(), "preserveWhitespace", false);
        setBooleanField(term22366, term22366.getClass(), "formList", true);
        setBooleanField(term22366, term22366.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22163, args);
        assertTrue(recursiveEquals(term22163, term22366));
        assertTrue(recursiveEquals(retValue, 1742810367));
    }

};


