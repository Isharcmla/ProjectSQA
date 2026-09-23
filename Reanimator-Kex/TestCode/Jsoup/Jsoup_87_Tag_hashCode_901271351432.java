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

public class Tag_hashCode_901271351432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37402;
     Object term37622;

    public Tag_hashCode_901271351432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37402, term37402.getClass(), "tagName", "");
        setBooleanField(term37402, term37402.getClass(), "isBlock", false);
        setBooleanField(term37402, term37402.getClass(), "formatAsBlock", false);
        setBooleanField(term37402, term37402.getClass(), "canContainInline", false);
        setBooleanField(term37402, term37402.getClass(), "empty", false);
        setBooleanField(term37402, term37402.getClass(), "selfClosing", false);
        setBooleanField(term37402, term37402.getClass(), "preserveWhitespace", true);
        setBooleanField(term37402, term37402.getClass(), "formList", true);
        setBooleanField(term37402, term37402.getClass(), "formSubmit", true);
        term37622 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37622, term37622.getClass(), "tagName", "");
        setBooleanField(term37622, term37622.getClass(), "isBlock", false);
        setBooleanField(term37622, term37622.getClass(), "formatAsBlock", false);
        setBooleanField(term37622, term37622.getClass(), "canContainInline", false);
        setBooleanField(term37622, term37622.getClass(), "empty", false);
        setBooleanField(term37622, term37622.getClass(), "selfClosing", false);
        setBooleanField(term37622, term37622.getClass(), "preserveWhitespace", true);
        setBooleanField(term37622, term37622.getClass(), "formList", true);
        setBooleanField(term37622, term37622.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term37402, args);
        assertTrue(recursiveEquals(term37402, term37622));
        assertTrue(recursiveEquals(retValue, 993));
    }

};


