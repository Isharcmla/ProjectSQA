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

public class Tag_hashCode_901271351379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32667;
     Object term33016;

    public Tag_hashCode_901271351379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32667 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32667, term32667.getClass(), "tagName", "");
        setBooleanField(term32667, term32667.getClass(), "isBlock", true);
        setBooleanField(term32667, term32667.getClass(), "formatAsBlock", false);
        setBooleanField(term32667, term32667.getClass(), "canContainInline", false);
        setBooleanField(term32667, term32667.getClass(), "empty", true);
        setBooleanField(term32667, term32667.getClass(), "selfClosing", true);
        setBooleanField(term32667, term32667.getClass(), "preserveWhitespace", false);
        setBooleanField(term32667, term32667.getClass(), "formList", false);
        setBooleanField(term32667, term32667.getClass(), "formSubmit", true);
        term33016 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33016, term33016.getClass(), "tagName", "");
        setBooleanField(term33016, term33016.getClass(), "isBlock", true);
        setBooleanField(term33016, term33016.getClass(), "formatAsBlock", false);
        setBooleanField(term33016, term33016.getClass(), "canContainInline", false);
        setBooleanField(term33016, term33016.getClass(), "empty", true);
        setBooleanField(term33016, term33016.getClass(), "selfClosing", true);
        setBooleanField(term33016, term33016.getClass(), "preserveWhitespace", false);
        setBooleanField(term33016, term33016.getClass(), "formList", false);
        setBooleanField(term33016, term33016.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32667, args);
        assertTrue(recursiveEquals(term32667, term33016));
        assertTrue(recursiveEquals(retValue, 1743763648));
    }

};


