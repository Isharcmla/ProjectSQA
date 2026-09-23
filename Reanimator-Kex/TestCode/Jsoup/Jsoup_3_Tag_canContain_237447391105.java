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

public class Tag_canContain_237447391105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23003;
     Object term23015;
     Object term23016;

    public Tag_canContain_237447391105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23003 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term23003, term23003.getClass(), "isBlock", true);
        term23015 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23015, term23015.getClass(), "tagName", null);
        setBooleanField(term23015, term23015.getClass(), "isBlock", true);
        setBooleanField(term23015, term23015.getClass(), "canContainBlock", false);
        setBooleanField(term23015, term23015.getClass(), "canContainInline", false);
        setBooleanField(term23015, term23015.getClass(), "optionalClosing", false);
        setBooleanField(term23015, term23015.getClass(), "empty", false);
        setBooleanField(term23015, term23015.getClass(), "preserveWhitespace", false);
        setField(term23015, term23015.getClass(), "ancestors", null);
        term23016 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23016, term23016.getClass(), "tagName", null);
        setBooleanField(term23016, term23016.getClass(), "isBlock", true);
        setBooleanField(term23016, term23016.getClass(), "canContainBlock", false);
        setBooleanField(term23016, term23016.getClass(), "canContainInline", false);
        setBooleanField(term23016, term23016.getClass(), "optionalClosing", false);
        setBooleanField(term23016, term23016.getClass(), "empty", false);
        setBooleanField(term23016, term23016.getClass(), "preserveWhitespace", false);
        setField(term23016, term23016.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term23003;
        Object retValue = callMethod(klass, "canContain", argTypes, term23003, args);
        assertTrue(recursiveEquals(term23003, term23015));
        assertTrue(recursiveEquals(term23003, term23016));
        assertTrue(recursiveEquals(retValue, false));
    }

};


