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

public class HtmlTreeBuilder_replaceActiveFormattingElement_1204040075178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106038;

    public HtmlTreeBuilder_replaceActiveFormattingElement_1204040075178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106038 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term106038, term106038.getClass(), "state", null);
        setField(term106038, term106038.getClass(), "originalState", null);
        setBooleanField(term106038, term106038.getClass(), "baseUriSetFromDoc", false);
        setField(term106038, term106038.getClass(), "headElement", null);
        setField(term106038, term106038.getClass(), "formElement", null);
        setField(term106038, term106038.getClass(), "contextElement", null);
        setField(term106038, term106038.getClass(), "formattingElements", null);
        setField(term106038, term106038.getClass(), "pendingTableCharacters", null);
        setField(term106038, term106038.getClass(), "emptyEnd", null);
        setBooleanField(term106038, term106038.getClass(), "framesetOk", false);
        setBooleanField(term106038, term106038.getClass(), "fosterInserts", false);
        setBooleanField(term106038, term106038.getClass(), "fragmentParsing", false);
        setField(term106038, term106038.getClass(), "specificScopeTarget", null);
        setField(term106038, term106038.getClass(), "parser", null);
        setField(term106038, term106038.getClass(), "reader", null);
        setField(term106038, term106038.getClass(), "tokeniser", null);
        setField(term106038, term106038.getClass(), "doc", null);
        setField(term106038, term106038.getClass(), "stack", null);
        setField(term106038, term106038.getClass(), "baseUri", null);
        setField(term106038, term106038.getClass(), "currentToken", null);
        setField(term106038, term106038.getClass(), "settings", null);
        setField(term106038, term106038.getClass(), "start", null);
        setField(term106038, term106038.getClass(), "end", null);
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
            callMethod(klass, "replaceActiveFormattingElement", argTypes, term106038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


