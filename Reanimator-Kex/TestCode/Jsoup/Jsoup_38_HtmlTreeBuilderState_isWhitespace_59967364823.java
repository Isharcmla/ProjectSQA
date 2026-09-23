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

public class HtmlTreeBuilderState_isWhitespace_59967364823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39634;
     Object term39965;

    public HtmlTreeBuilderState_isWhitespace_59967364823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39634 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        term39965 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term39965, term39965.getClass(), "tagName", null);
        setField(term39965, term39965.getClass(), "pendingAttributeName", null);
        setField(term39965, term39965.getClass(), "pendingAttributeValue", null);
        setBooleanField(term39965, term39965.getClass(), "selfClosing", false);
        setField(term39965, term39965.getClass(), "attributes", null);
        setField(term39965, term39965.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term39634;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term39634, term39965));
        assertTrue(recursiveEquals(retValue, false));
    }

};


