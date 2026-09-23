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

public class HtmlTreeBuilder_replaceActiveFormattingElement_1204040075185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100697;

    public HtmlTreeBuilder_replaceActiveFormattingElement_1204040075185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100697 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term100697, term100697.getClass(), "state", null);
        setField(term100697, term100697.getClass(), "originalState", null);
        setBooleanField(term100697, term100697.getClass(), "baseUriSetFromDoc", false);
        setField(term100697, term100697.getClass(), "headElement", null);
        setField(term100697, term100697.getClass(), "formElement", null);
        setField(term100697, term100697.getClass(), "contextElement", null);
        setField(term100697, term100697.getClass(), "formattingElements", null);
        setField(term100697, term100697.getClass(), "pendingTableCharacters", null);
        setField(term100697, term100697.getClass(), "emptyEnd", null);
        setBooleanField(term100697, term100697.getClass(), "framesetOk", false);
        setBooleanField(term100697, term100697.getClass(), "fosterInserts", false);
        setBooleanField(term100697, term100697.getClass(), "fragmentParsing", false);
        setField(term100697, term100697.getClass(), "specificScopeTarget", null);
        setField(term100697, term100697.getClass(), "reader", null);
        setField(term100697, term100697.getClass(), "tokeniser", null);
        setField(term100697, term100697.getClass(), "doc", null);
        setField(term100697, term100697.getClass(), "stack", null);
        setField(term100697, term100697.getClass(), "baseUri", null);
        setField(term100697, term100697.getClass(), "currentToken", null);
        setField(term100697, term100697.getClass(), "errors", null);
        setField(term100697, term100697.getClass(), "settings", null);
        setField(term100697, term100697.getClass(), "start", null);
        setField(term100697, term100697.getClass(), "end", null);
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
            callMethod(klass, "replaceActiveFormattingElement", argTypes, term100697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


