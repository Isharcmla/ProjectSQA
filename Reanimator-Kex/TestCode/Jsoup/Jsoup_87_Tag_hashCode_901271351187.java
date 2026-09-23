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

public class Tag_hashCode_901271351187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16637;
     Object term16696;

    public Tag_hashCode_901271351187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16637 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16637, term16637.getClass(), "tagName", "");
        setBooleanField(term16637, term16637.getClass(), "isBlock", false);
        setBooleanField(term16637, term16637.getClass(), "formatAsBlock", true);
        setBooleanField(term16637, term16637.getClass(), "canContainInline", false);
        setBooleanField(term16637, term16637.getClass(), "empty", false);
        setBooleanField(term16637, term16637.getClass(), "selfClosing", true);
        term16696 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16696, term16696.getClass(), "tagName", "");
        setBooleanField(term16696, term16696.getClass(), "isBlock", false);
        setBooleanField(term16696, term16696.getClass(), "formatAsBlock", true);
        setBooleanField(term16696, term16696.getClass(), "canContainInline", false);
        setBooleanField(term16696, term16696.getClass(), "empty", false);
        setBooleanField(term16696, term16696.getClass(), "selfClosing", true);
        setBooleanField(term16696, term16696.getClass(), "preserveWhitespace", false);
        setBooleanField(term16696, term16696.getClass(), "formList", false);
        setBooleanField(term16696, term16696.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16637, args);
        assertTrue(recursiveEquals(term16637, term16696));
        assertTrue(recursiveEquals(retValue, 887533472));
    }

};


