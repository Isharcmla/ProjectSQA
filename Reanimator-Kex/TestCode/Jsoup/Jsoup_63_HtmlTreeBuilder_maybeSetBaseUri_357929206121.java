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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16623;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16623 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term16623, term16623.getClass(), "state", null);
        setField(term16623, term16623.getClass(), "originalState", null);
        setBooleanField(term16623, term16623.getClass(), "baseUriSetFromDoc", false);
        setField(term16623, term16623.getClass(), "headElement", null);
        setField(term16623, term16623.getClass(), "formElement", null);
        setField(term16623, term16623.getClass(), "contextElement", null);
        setField(term16623, term16623.getClass(), "formattingElements", null);
        setField(term16623, term16623.getClass(), "pendingTableCharacters", null);
        setField(term16623, term16623.getClass(), "emptyEnd", null);
        setBooleanField(term16623, term16623.getClass(), "framesetOk", false);
        setBooleanField(term16623, term16623.getClass(), "fosterInserts", false);
        setBooleanField(term16623, term16623.getClass(), "fragmentParsing", false);
        setField(term16623, term16623.getClass(), "specificScopeTarget", null);
        setField(term16623, term16623.getClass(), "reader", null);
        setField(term16623, term16623.getClass(), "tokeniser", null);
        setField(term16623, term16623.getClass(), "doc", null);
        setField(term16623, term16623.getClass(), "stack", null);
        setField(term16623, term16623.getClass(), "baseUri", null);
        setField(term16623, term16623.getClass(), "currentToken", null);
        setField(term16623, term16623.getClass(), "errors", null);
        setField(term16623, term16623.getClass(), "settings", null);
        setField(term16623, term16623.getClass(), "start", null);
        setField(term16623, term16623.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "maybeSetBaseUri", argTypes, term16623, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


