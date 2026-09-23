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

public class Tag_hashCode_901271351241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21321;
     Object term21403;

    public Tag_hashCode_901271351241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21321 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21321, term21321.getClass(), "tagName", "");
        setBooleanField(term21321, term21321.getClass(), "isBlock", true);
        setBooleanField(term21321, term21321.getClass(), "formatAsBlock", false);
        setBooleanField(term21321, term21321.getClass(), "canContainInline", true);
        setBooleanField(term21321, term21321.getClass(), "empty", false);
        setBooleanField(term21321, term21321.getClass(), "selfClosing", false);
        setBooleanField(term21321, term21321.getClass(), "preserveWhitespace", false);
        setBooleanField(term21321, term21321.getClass(), "formList", false);
        setBooleanField(term21321, term21321.getClass(), "formSubmit", true);
        term21403 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21403, term21403.getClass(), "tagName", "");
        setBooleanField(term21403, term21403.getClass(), "isBlock", true);
        setBooleanField(term21403, term21403.getClass(), "formatAsBlock", false);
        setBooleanField(term21403, term21403.getClass(), "canContainInline", true);
        setBooleanField(term21403, term21403.getClass(), "empty", false);
        setBooleanField(term21403, term21403.getClass(), "selfClosing", false);
        setBooleanField(term21403, term21403.getClass(), "preserveWhitespace", false);
        setBooleanField(term21403, term21403.getClass(), "formList", false);
        setBooleanField(term21403, term21403.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21321, args);
        assertTrue(recursiveEquals(term21321, term21403));
        assertTrue(recursiveEquals(retValue, 1771439487));
    }

};


