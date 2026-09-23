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

public class Tag_isKnownTag_581658083480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41514;
     Object term41717;

    public Tag_isKnownTag_581658083480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41514, term41514.getClass(), "tagName", "");
        term41717 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41717, term41717.getClass(), "tagName", "");
        setBooleanField(term41717, term41717.getClass(), "isBlock", false);
        setBooleanField(term41717, term41717.getClass(), "formatAsBlock", false);
        setBooleanField(term41717, term41717.getClass(), "canContainInline", false);
        setBooleanField(term41717, term41717.getClass(), "empty", false);
        setBooleanField(term41717, term41717.getClass(), "selfClosing", false);
        setBooleanField(term41717, term41717.getClass(), "preserveWhitespace", false);
        setBooleanField(term41717, term41717.getClass(), "formList", false);
        setBooleanField(term41717, term41717.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isKnownTag", argTypes, term41514, args);
        assertTrue(recursiveEquals(term41514, term41717));
    }

};


