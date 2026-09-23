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

public class HtmlTreeBuilder_removeFromStack_1302793563142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41183;

    public HtmlTreeBuilder_removeFromStack_1302793563142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41183 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term41183, term41183.getClass(), "state", null);
        setField(term41183, term41183.getClass(), "originalState", null);
        setBooleanField(term41183, term41183.getClass(), "baseUriSetFromDoc", false);
        setField(term41183, term41183.getClass(), "headElement", null);
        setField(term41183, term41183.getClass(), "formElement", null);
        setField(term41183, term41183.getClass(), "contextElement", null);
        setField(term41183, term41183.getClass(), "formattingElements", null);
        setField(term41183, term41183.getClass(), "pendingTableCharacters", null);
        setField(term41183, term41183.getClass(), "emptyEnd", null);
        setBooleanField(term41183, term41183.getClass(), "framesetOk", false);
        setBooleanField(term41183, term41183.getClass(), "fosterInserts", false);
        setBooleanField(term41183, term41183.getClass(), "fragmentParsing", false);
        setField(term41183, term41183.getClass(), "specificScopeTarget", null);
        setField(term41183, term41183.getClass(), "reader", null);
        setField(term41183, term41183.getClass(), "tokeniser", null);
        setField(term41183, term41183.getClass(), "doc", null);
        setField(term41183, term41183.getClass(), "stack", null);
        setField(term41183, term41183.getClass(), "baseUri", null);
        setField(term41183, term41183.getClass(), "currentToken", null);
        setField(term41183, term41183.getClass(), "errors", null);
        setField(term41183, term41183.getClass(), "settings", null);
        setField(term41183, term41183.getClass(), "start", null);
        setField(term41183, term41183.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromStack", argTypes, term41183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


