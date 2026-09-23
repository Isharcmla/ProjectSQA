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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494541;
     Object term494612;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term494593 = new ArrayList();
        term494541 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term494541, term494541.getClass(), "stack", term494593);
        ArrayList term494613 = new ArrayList();
        term494612 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term494612, term494612.getClass(), "state", null);
        setField(term494612, term494612.getClass(), "originalState", null);
        setBooleanField(term494612, term494612.getClass(), "baseUriSetFromDoc", false);
        setField(term494612, term494612.getClass(), "headElement", null);
        setField(term494612, term494612.getClass(), "formElement", null);
        setField(term494612, term494612.getClass(), "contextElement", null);
        setField(term494612, term494612.getClass(), "formattingElements", null);
        setField(term494612, term494612.getClass(), "pendingTableCharacters", null);
        setField(term494612, term494612.getClass(), "emptyEnd", null);
        setBooleanField(term494612, term494612.getClass(), "framesetOk", false);
        setBooleanField(term494612, term494612.getClass(), "fosterInserts", false);
        setBooleanField(term494612, term494612.getClass(), "fragmentParsing", false);
        setField(term494612, term494612.getClass(), "specificScopeTarget", null);
        setField(term494612, term494612.getClass(), "parser", null);
        setField(term494612, term494612.getClass(), "reader", null);
        setField(term494612, term494612.getClass(), "tokeniser", null);
        setField(term494612, term494612.getClass(), "doc", null);
        setField(term494612, term494612.getClass(), "stack", term494613);
        setField(term494612, term494612.getClass(), "baseUri", null);
        setField(term494612, term494612.getClass(), "currentToken", null);
        setField(term494612, term494612.getClass(), "settings", null);
        setField(term494612, term494612.getClass(), "start", null);
        setField(term494612, term494612.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term494541, args);
        assertTrue(recursiveEquals(term494541, term494612));
    }

};


