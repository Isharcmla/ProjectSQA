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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197399;
     Object term197682;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197399 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term197399, term197399.getClass(), "baseUriSetFromDoc", true);
        term197682 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term197682, term197682.getClass(), "state", null);
        setField(term197682, term197682.getClass(), "originalState", null);
        setBooleanField(term197682, term197682.getClass(), "baseUriSetFromDoc", true);
        setField(term197682, term197682.getClass(), "headElement", null);
        setField(term197682, term197682.getClass(), "formElement", null);
        setField(term197682, term197682.getClass(), "contextElement", null);
        setField(term197682, term197682.getClass(), "formattingElements", null);
        setField(term197682, term197682.getClass(), "pendingTableCharacters", null);
        setField(term197682, term197682.getClass(), "emptyEnd", null);
        setBooleanField(term197682, term197682.getClass(), "framesetOk", false);
        setBooleanField(term197682, term197682.getClass(), "fosterInserts", false);
        setBooleanField(term197682, term197682.getClass(), "fragmentParsing", false);
        setField(term197682, term197682.getClass(), "specificScopeTarget", null);
        setField(term197682, term197682.getClass(), "reader", null);
        setField(term197682, term197682.getClass(), "tokeniser", null);
        setField(term197682, term197682.getClass(), "doc", null);
        setField(term197682, term197682.getClass(), "stack", null);
        setField(term197682, term197682.getClass(), "baseUri", null);
        setField(term197682, term197682.getClass(), "currentToken", null);
        setField(term197682, term197682.getClass(), "errors", null);
        setField(term197682, term197682.getClass(), "settings", null);
        setField(term197682, term197682.getClass(), "start", null);
        setField(term197682, term197682.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeSetBaseUri", argTypes, term197399, args);
        assertTrue(recursiveEquals(term197399, term197682));
    }

};


