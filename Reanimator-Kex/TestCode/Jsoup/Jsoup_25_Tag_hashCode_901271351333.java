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

public class Tag_hashCode_901271351333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26542;
     Object term26641;

    public Tag_hashCode_901271351333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26542 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26542, term26542.getClass(), "tagName", "");
        setBooleanField(term26542, term26542.getClass(), "isBlock", false);
        setBooleanField(term26542, term26542.getClass(), "formatAsBlock", false);
        setBooleanField(term26542, term26542.getClass(), "canContainBlock", true);
        setBooleanField(term26542, term26542.getClass(), "canContainInline", true);
        setBooleanField(term26542, term26542.getClass(), "empty", true);
        setBooleanField(term26542, term26542.getClass(), "selfClosing", true);
        term26641 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26641, term26641.getClass(), "tagName", "");
        setBooleanField(term26641, term26641.getClass(), "isBlock", false);
        setBooleanField(term26641, term26641.getClass(), "formatAsBlock", false);
        setBooleanField(term26641, term26641.getClass(), "canContainBlock", true);
        setBooleanField(term26641, term26641.getClass(), "canContainInline", true);
        setBooleanField(term26641, term26641.getClass(), "empty", true);
        setBooleanField(term26641, term26641.getClass(), "selfClosing", true);
        setBooleanField(term26641, term26641.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26542, args);
        assertTrue(recursiveEquals(term26542, term26641));
        assertTrue(recursiveEquals(retValue, 954304));
    }

};


