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

public class HtmlTreeBuilderState_isWhitespace_59967364815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18503;
     Object term18707;

    public HtmlTreeBuilderState_isWhitespace_59967364815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18503 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        term18707 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term18707, term18707.getClass(), "tagName", null);
        setField(term18707, term18707.getClass(), "normalName", null);
        setField(term18707, term18707.getClass(), "pendingAttributeName", null);
        setField(term18707, term18707.getClass(), "pendingAttributeValue", null);
        setField(term18707, term18707.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term18707, term18707.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term18707, term18707.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term18707, term18707.getClass(), "selfClosing", false);
        setField(term18707, term18707.getClass(), "attributes", null);
        setField(term18707, term18707.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term18503;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term18503, term18707));
    }

};


