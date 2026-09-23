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

public class Tag_hashCode_90127135166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3834;
     Object term3999;

    public Tag_hashCode_90127135166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3834 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3834, term3834.getClass(), "tagName", "");
        setBooleanField(term3834, term3834.getClass(), "isBlock", true);
        term3999 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3999, term3999.getClass(), "tagName", "");
        setBooleanField(term3999, term3999.getClass(), "isBlock", true);
        setBooleanField(term3999, term3999.getClass(), "formatAsBlock", false);
        setBooleanField(term3999, term3999.getClass(), "canContainInline", false);
        setBooleanField(term3999, term3999.getClass(), "empty", false);
        setBooleanField(term3999, term3999.getClass(), "selfClosing", false);
        setBooleanField(term3999, term3999.getClass(), "preserveWhitespace", false);
        setBooleanField(term3999, term3999.getClass(), "formList", false);
        setBooleanField(term3999, term3999.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3834, args);
        assertTrue(recursiveEquals(term3834, term3999));
        assertTrue(recursiveEquals(retValue, 1742810335));
    }

};


