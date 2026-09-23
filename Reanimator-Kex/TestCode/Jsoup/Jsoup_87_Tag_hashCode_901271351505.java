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

public class Tag_hashCode_901271351505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43565;
     Object term43647;

    public Tag_hashCode_901271351505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43565 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43565, term43565.getClass(), "tagName", "");
        setBooleanField(term43565, term43565.getClass(), "isBlock", true);
        setBooleanField(term43565, term43565.getClass(), "formatAsBlock", true);
        setBooleanField(term43565, term43565.getClass(), "canContainInline", true);
        setBooleanField(term43565, term43565.getClass(), "empty", true);
        setBooleanField(term43565, term43565.getClass(), "selfClosing", true);
        setBooleanField(term43565, term43565.getClass(), "preserveWhitespace", true);
        setBooleanField(term43565, term43565.getClass(), "formList", true);
        setBooleanField(term43565, term43565.getClass(), "formSubmit", true);
        term43647 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43647, term43647.getClass(), "tagName", "");
        setBooleanField(term43647, term43647.getClass(), "isBlock", true);
        setBooleanField(term43647, term43647.getClass(), "formatAsBlock", true);
        setBooleanField(term43647, term43647.getClass(), "canContainInline", true);
        setBooleanField(term43647, term43647.getClass(), "empty", true);
        setBooleanField(term43647, term43647.getClass(), "selfClosing", true);
        setBooleanField(term43647, term43647.getClass(), "preserveWhitespace", true);
        setBooleanField(term43647, term43647.getClass(), "formList", true);
        setBooleanField(term43647, term43647.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term43565, args);
        assertTrue(recursiveEquals(term43565, term43647));
        assertTrue(recursiveEquals(retValue, -1635069824));
    }

};


