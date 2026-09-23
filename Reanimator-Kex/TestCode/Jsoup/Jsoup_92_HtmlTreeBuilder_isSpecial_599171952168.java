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

public class HtmlTreeBuilder_isSpecial_599171952168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91388;

    public HtmlTreeBuilder_isSpecial_599171952168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91388 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term91388, term91388.getClass(), "state", null);
        setField(term91388, term91388.getClass(), "originalState", null);
        setBooleanField(term91388, term91388.getClass(), "baseUriSetFromDoc", false);
        setField(term91388, term91388.getClass(), "headElement", null);
        setField(term91388, term91388.getClass(), "formElement", null);
        setField(term91388, term91388.getClass(), "contextElement", null);
        setField(term91388, term91388.getClass(), "formattingElements", null);
        setField(term91388, term91388.getClass(), "pendingTableCharacters", null);
        setField(term91388, term91388.getClass(), "emptyEnd", null);
        setBooleanField(term91388, term91388.getClass(), "framesetOk", false);
        setBooleanField(term91388, term91388.getClass(), "fosterInserts", false);
        setBooleanField(term91388, term91388.getClass(), "fragmentParsing", false);
        setField(term91388, term91388.getClass(), "specificScopeTarget", null);
        setField(term91388, term91388.getClass(), "parser", null);
        setField(term91388, term91388.getClass(), "reader", null);
        setField(term91388, term91388.getClass(), "tokeniser", null);
        setField(term91388, term91388.getClass(), "doc", null);
        setField(term91388, term91388.getClass(), "stack", null);
        setField(term91388, term91388.getClass(), "baseUri", null);
        setField(term91388, term91388.getClass(), "currentToken", null);
        setField(term91388, term91388.getClass(), "settings", null);
        setField(term91388, term91388.getClass(), "start", null);
        setField(term91388, term91388.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSpecial", argTypes, term91388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


