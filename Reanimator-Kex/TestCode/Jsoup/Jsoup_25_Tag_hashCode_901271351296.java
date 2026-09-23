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

public class Tag_hashCode_901271351296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23481;
     Object term23704;

    public Tag_hashCode_901271351296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23481 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23481, term23481.getClass(), "tagName", "");
        setBooleanField(term23481, term23481.getClass(), "isBlock", false);
        setBooleanField(term23481, term23481.getClass(), "formatAsBlock", true);
        setBooleanField(term23481, term23481.getClass(), "canContainBlock", false);
        setBooleanField(term23481, term23481.getClass(), "canContainInline", false);
        setBooleanField(term23481, term23481.getClass(), "empty", true);
        setBooleanField(term23481, term23481.getClass(), "selfClosing", false);
        setBooleanField(term23481, term23481.getClass(), "preserveWhitespace", true);
        term23704 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23704, term23704.getClass(), "tagName", "");
        setBooleanField(term23704, term23704.getClass(), "isBlock", false);
        setBooleanField(term23704, term23704.getClass(), "formatAsBlock", true);
        setBooleanField(term23704, term23704.getClass(), "canContainBlock", false);
        setBooleanField(term23704, term23704.getClass(), "canContainInline", false);
        setBooleanField(term23704, term23704.getClass(), "empty", true);
        setBooleanField(term23704, term23704.getClass(), "selfClosing", false);
        setBooleanField(term23704, term23704.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23481, args);
        assertTrue(recursiveEquals(term23481, term23704));
        assertTrue(recursiveEquals(retValue, 28630113));
    }

};


