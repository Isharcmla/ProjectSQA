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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410870;
     Object term410912;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410870 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term410870, term410870.getClass(), "baseUriSetFromDoc", true);
        term410912 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term410912, term410912.getClass(), "state", null);
        setField(term410912, term410912.getClass(), "originalState", null);
        setBooleanField(term410912, term410912.getClass(), "baseUriSetFromDoc", true);
        setField(term410912, term410912.getClass(), "headElement", null);
        setField(term410912, term410912.getClass(), "formElement", null);
        setField(term410912, term410912.getClass(), "contextElement", null);
        setField(term410912, term410912.getClass(), "formattingElements", null);
        setField(term410912, term410912.getClass(), "pendingTableCharacters", null);
        setBooleanField(term410912, term410912.getClass(), "framesetOk", false);
        setBooleanField(term410912, term410912.getClass(), "fosterInserts", false);
        setBooleanField(term410912, term410912.getClass(), "fragmentParsing", false);
        setField(term410912, term410912.getClass(), "reader", null);
        setField(term410912, term410912.getClass(), "tokeniser", null);
        setField(term410912, term410912.getClass(), "doc", null);
        setField(term410912, term410912.getClass(), "stack", null);
        setField(term410912, term410912.getClass(), "baseUri", null);
        setField(term410912, term410912.getClass(), "currentToken", null);
        setField(term410912, term410912.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeSetBaseUri", argTypes, term410870, args);
        assertTrue(recursiveEquals(term410870, term410912));
    }

};


