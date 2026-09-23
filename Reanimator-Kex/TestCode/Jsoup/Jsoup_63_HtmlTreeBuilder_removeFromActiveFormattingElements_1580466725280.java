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
import java.util.ArrayList;

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227089;
     Object term227152;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term227141 = new ArrayList();
        term227089 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227089, term227089.getClass(), "formattingElements", term227141);
        ArrayList term227153 = new ArrayList();
        term227152 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227152, term227152.getClass(), "state", null);
        setField(term227152, term227152.getClass(), "originalState", null);
        setBooleanField(term227152, term227152.getClass(), "baseUriSetFromDoc", false);
        setField(term227152, term227152.getClass(), "headElement", null);
        setField(term227152, term227152.getClass(), "formElement", null);
        setField(term227152, term227152.getClass(), "contextElement", null);
        setField(term227152, term227152.getClass(), "formattingElements", term227153);
        setField(term227152, term227152.getClass(), "pendingTableCharacters", null);
        setField(term227152, term227152.getClass(), "emptyEnd", null);
        setBooleanField(term227152, term227152.getClass(), "framesetOk", false);
        setBooleanField(term227152, term227152.getClass(), "fosterInserts", false);
        setBooleanField(term227152, term227152.getClass(), "fragmentParsing", false);
        setField(term227152, term227152.getClass(), "specificScopeTarget", null);
        setField(term227152, term227152.getClass(), "reader", null);
        setField(term227152, term227152.getClass(), "tokeniser", null);
        setField(term227152, term227152.getClass(), "doc", null);
        setField(term227152, term227152.getClass(), "stack", null);
        setField(term227152, term227152.getClass(), "baseUri", null);
        setField(term227152, term227152.getClass(), "currentToken", null);
        setField(term227152, term227152.getClass(), "errors", null);
        setField(term227152, term227152.getClass(), "settings", null);
        setField(term227152, term227152.getClass(), "start", null);
        setField(term227152, term227152.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term227089, args);
        assertTrue(recursiveEquals(term227089, term227152));
    }

};


