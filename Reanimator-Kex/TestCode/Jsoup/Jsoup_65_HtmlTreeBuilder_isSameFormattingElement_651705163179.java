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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_isSameFormattingElement_651705163179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92232;

    public HtmlTreeBuilder_isSameFormattingElement_651705163179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92232 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term92232, term92232.getClass(), "state", null);
        setField(term92232, term92232.getClass(), "originalState", null);
        setBooleanField(term92232, term92232.getClass(), "baseUriSetFromDoc", false);
        setField(term92232, term92232.getClass(), "headElement", null);
        setField(term92232, term92232.getClass(), "formElement", null);
        setField(term92232, term92232.getClass(), "contextElement", null);
        setField(term92232, term92232.getClass(), "formattingElements", null);
        setField(term92232, term92232.getClass(), "pendingTableCharacters", null);
        setField(term92232, term92232.getClass(), "emptyEnd", null);
        setBooleanField(term92232, term92232.getClass(), "framesetOk", false);
        setBooleanField(term92232, term92232.getClass(), "fosterInserts", false);
        setBooleanField(term92232, term92232.getClass(), "fragmentParsing", false);
        setField(term92232, term92232.getClass(), "specificScopeTarget", null);
        setField(term92232, term92232.getClass(), "reader", null);
        setField(term92232, term92232.getClass(), "tokeniser", null);
        setField(term92232, term92232.getClass(), "doc", null);
        setField(term92232, term92232.getClass(), "stack", null);
        setField(term92232, term92232.getClass(), "baseUri", null);
        setField(term92232, term92232.getClass(), "currentToken", null);
        setField(term92232, term92232.getClass(), "errors", null);
        setField(term92232, term92232.getClass(), "settings", null);
        setField(term92232, term92232.getClass(), "start", null);
        setField(term92232, term92232.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "isSameFormattingElement", argTypes, term92232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


