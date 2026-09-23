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

public class Tag_hashCode_901271351151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13710;
     Object term13769;

    public Tag_hashCode_901271351151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13710 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13710, term13710.getClass(), "tagName", "");
        setBooleanField(term13710, term13710.getClass(), "isBlock", true);
        setBooleanField(term13710, term13710.getClass(), "formatAsBlock", true);
        setBooleanField(term13710, term13710.getClass(), "canContainInline", false);
        setBooleanField(term13710, term13710.getClass(), "empty", true);
        term13769 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13769, term13769.getClass(), "tagName", "");
        setBooleanField(term13769, term13769.getClass(), "isBlock", true);
        setBooleanField(term13769, term13769.getClass(), "formatAsBlock", true);
        setBooleanField(term13769, term13769.getClass(), "canContainInline", false);
        setBooleanField(term13769, term13769.getClass(), "empty", true);
        setBooleanField(term13769, term13769.getClass(), "selfClosing", false);
        setBooleanField(term13769, term13769.getClass(), "preserveWhitespace", false);
        setBooleanField(term13769, term13769.getClass(), "formList", false);
        setBooleanField(term13769, term13769.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13710, args);
        assertTrue(recursiveEquals(term13710, term13769));
        assertTrue(recursiveEquals(retValue, -1663729759));
    }

};


