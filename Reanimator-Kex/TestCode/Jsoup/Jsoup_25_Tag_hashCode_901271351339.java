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

public class Tag_hashCode_901271351339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27055;
     Object term27133;

    public Tag_hashCode_901271351339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27055 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27055, term27055.getClass(), "tagName", "");
        setBooleanField(term27055, term27055.getClass(), "isBlock", false);
        setBooleanField(term27055, term27055.getClass(), "formatAsBlock", true);
        setBooleanField(term27055, term27055.getClass(), "canContainBlock", true);
        setBooleanField(term27055, term27055.getClass(), "canContainInline", false);
        setBooleanField(term27055, term27055.getClass(), "empty", true);
        setBooleanField(term27055, term27055.getClass(), "selfClosing", true);
        setBooleanField(term27055, term27055.getClass(), "preserveWhitespace", true);
        term27133 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27133, term27133.getClass(), "tagName", "");
        setBooleanField(term27133, term27133.getClass(), "isBlock", false);
        setBooleanField(term27133, term27133.getClass(), "formatAsBlock", true);
        setBooleanField(term27133, term27133.getClass(), "canContainBlock", true);
        setBooleanField(term27133, term27133.getClass(), "canContainInline", false);
        setBooleanField(term27133, term27133.getClass(), "empty", true);
        setBooleanField(term27133, term27133.getClass(), "selfClosing", true);
        setBooleanField(term27133, term27133.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27055, args);
        assertTrue(recursiveEquals(term27055, term27133));
        assertTrue(recursiveEquals(retValue, 29553665));
    }

};


