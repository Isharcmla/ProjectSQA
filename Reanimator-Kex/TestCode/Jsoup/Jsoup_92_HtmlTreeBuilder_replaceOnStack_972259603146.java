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

public class HtmlTreeBuilder_replaceOnStack_972259603146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59772;

    public HtmlTreeBuilder_replaceOnStack_972259603146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59772 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term59772, term59772.getClass(), "state", null);
        setField(term59772, term59772.getClass(), "originalState", null);
        setBooleanField(term59772, term59772.getClass(), "baseUriSetFromDoc", false);
        setField(term59772, term59772.getClass(), "headElement", null);
        setField(term59772, term59772.getClass(), "formElement", null);
        setField(term59772, term59772.getClass(), "contextElement", null);
        setField(term59772, term59772.getClass(), "formattingElements", null);
        setField(term59772, term59772.getClass(), "pendingTableCharacters", null);
        setField(term59772, term59772.getClass(), "emptyEnd", null);
        setBooleanField(term59772, term59772.getClass(), "framesetOk", false);
        setBooleanField(term59772, term59772.getClass(), "fosterInserts", false);
        setBooleanField(term59772, term59772.getClass(), "fragmentParsing", false);
        setField(term59772, term59772.getClass(), "specificScopeTarget", null);
        setField(term59772, term59772.getClass(), "parser", null);
        setField(term59772, term59772.getClass(), "reader", null);
        setField(term59772, term59772.getClass(), "tokeniser", null);
        setField(term59772, term59772.getClass(), "doc", null);
        setField(term59772, term59772.getClass(), "stack", null);
        setField(term59772, term59772.getClass(), "baseUri", null);
        setField(term59772, term59772.getClass(), "currentToken", null);
        setField(term59772, term59772.getClass(), "settings", null);
        setField(term59772, term59772.getClass(), "start", null);
        setField(term59772, term59772.getClass(), "end", null);
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
            callMethod(klass, "replaceOnStack", argTypes, term59772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


