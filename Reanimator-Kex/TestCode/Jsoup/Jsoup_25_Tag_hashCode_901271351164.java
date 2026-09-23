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

public class Tag_hashCode_901271351164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12788;
     Object term12969;

    public Tag_hashCode_901271351164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12788 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12788, term12788.getClass(), "tagName", "");
        setBooleanField(term12788, term12788.getClass(), "isBlock", false);
        setBooleanField(term12788, term12788.getClass(), "formatAsBlock", false);
        setBooleanField(term12788, term12788.getClass(), "canContainBlock", true);
        setBooleanField(term12788, term12788.getClass(), "canContainInline", false);
        setBooleanField(term12788, term12788.getClass(), "empty", false);
        setBooleanField(term12788, term12788.getClass(), "selfClosing", true);
        term12969 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12969, term12969.getClass(), "tagName", "");
        setBooleanField(term12969, term12969.getClass(), "isBlock", false);
        setBooleanField(term12969, term12969.getClass(), "formatAsBlock", false);
        setBooleanField(term12969, term12969.getClass(), "canContainBlock", true);
        setBooleanField(term12969, term12969.getClass(), "canContainInline", false);
        setBooleanField(term12969, term12969.getClass(), "empty", false);
        setBooleanField(term12969, term12969.getClass(), "selfClosing", true);
        setBooleanField(term12969, term12969.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12788, args);
        assertTrue(recursiveEquals(term12788, term12969));
        assertTrue(recursiveEquals(retValue, 923552));
    }

};


