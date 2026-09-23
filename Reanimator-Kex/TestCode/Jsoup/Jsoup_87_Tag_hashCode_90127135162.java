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

public class Tag_hashCode_90127135162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3554;
     Object term3747;

    public Tag_hashCode_90127135162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3554 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3554, term3554.getClass(), "tagName", "");
        setBooleanField(term3554, term3554.getClass(), "isBlock", false);
        setBooleanField(term3554, term3554.getClass(), "formatAsBlock", false);
        setBooleanField(term3554, term3554.getClass(), "canContainInline", true);
        setBooleanField(term3554, term3554.getClass(), "empty", true);
        setBooleanField(term3554, term3554.getClass(), "selfClosing", false);
        setBooleanField(term3554, term3554.getClass(), "preserveWhitespace", false);
        setBooleanField(term3554, term3554.getClass(), "formList", true);
        term3747 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3747, term3747.getClass(), "tagName", "");
        setBooleanField(term3747, term3747.getClass(), "isBlock", false);
        setBooleanField(term3747, term3747.getClass(), "formatAsBlock", false);
        setBooleanField(term3747, term3747.getClass(), "canContainInline", true);
        setBooleanField(term3747, term3747.getClass(), "empty", true);
        setBooleanField(term3747, term3747.getClass(), "selfClosing", false);
        setBooleanField(term3747, term3747.getClass(), "preserveWhitespace", false);
        setBooleanField(term3747, term3747.getClass(), "formList", true);
        setBooleanField(term3747, term3747.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3554, args);
        assertTrue(recursiveEquals(term3554, term3747));
        assertTrue(recursiveEquals(retValue, 29552703));
    }

};


