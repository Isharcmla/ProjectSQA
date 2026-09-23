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

public class HtmlTreeBuilderState_isWhitespace_59967364821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35076;
     Object term35083;

    public HtmlTreeBuilderState_isWhitespace_59967364821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35076 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        term35083 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term35083, term35083.getClass(), "tagName", null);
        setField(term35083, term35083.getClass(), "pendingAttributeName", null);
        setField(term35083, term35083.getClass(), "pendingAttributeValue", null);
        setBooleanField(term35083, term35083.getClass(), "selfClosing", false);
        setField(term35083, term35083.getClass(), "attributes", null);
        setField(term35083, term35083.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term35076;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term35076, term35083));
        assertTrue(recursiveEquals(retValue, false));
    }

};


