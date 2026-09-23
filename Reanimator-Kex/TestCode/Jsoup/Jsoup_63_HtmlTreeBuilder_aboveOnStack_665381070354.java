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
import java.lang.Object;

public class HtmlTreeBuilder_aboveOnStack_665381070354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269109;
     Object term269229;

    public HtmlTreeBuilder_aboveOnStack_665381070354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term269213 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term269161 = new ArrayList();
        ((ArrayList) term269161).add(term269213);
        term269109 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term269109, term269109.getClass(), "stack", term269161);
        Object term269232 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term269232, term269232.getClass(), "tag", null);
        setField(term269232, term269232.getClass(), "shadowChildrenRef", null);
        setField(term269232, term269232.getClass(), "parentNode", null);
        setField(term269232, term269232.getClass(), "childNodes", null);
        setField(term269232, term269232.getClass(), "attributes", null);
        setField(term269232, term269232.getClass(), "baseUri", null);
        setIntField(term269232, term269232.getClass(), "siblingIndex", 0);
        ArrayList term269230 = new ArrayList();
        ((ArrayList) term269230).add(term269232);
        term269229 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term269229, term269229.getClass(), "state", null);
        setField(term269229, term269229.getClass(), "originalState", null);
        setBooleanField(term269229, term269229.getClass(), "baseUriSetFromDoc", false);
        setField(term269229, term269229.getClass(), "headElement", null);
        setField(term269229, term269229.getClass(), "formElement", null);
        setField(term269229, term269229.getClass(), "contextElement", null);
        setField(term269229, term269229.getClass(), "formattingElements", null);
        setField(term269229, term269229.getClass(), "pendingTableCharacters", null);
        setField(term269229, term269229.getClass(), "emptyEnd", null);
        setBooleanField(term269229, term269229.getClass(), "framesetOk", false);
        setBooleanField(term269229, term269229.getClass(), "fosterInserts", false);
        setBooleanField(term269229, term269229.getClass(), "fragmentParsing", false);
        setField(term269229, term269229.getClass(), "specificScopeTarget", null);
        setField(term269229, term269229.getClass(), "reader", null);
        setField(term269229, term269229.getClass(), "tokeniser", null);
        setField(term269229, term269229.getClass(), "doc", null);
        setField(term269229, term269229.getClass(), "stack", term269230);
        setField(term269229, term269229.getClass(), "baseUri", null);
        setField(term269229, term269229.getClass(), "currentToken", null);
        setField(term269229, term269229.getClass(), "errors", null);
        setField(term269229, term269229.getClass(), "settings", null);
        setField(term269229, term269229.getClass(), "start", null);
        setField(term269229, term269229.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term269109, args);
        assertTrue(recursiveEquals(term269109, term269229));
        assertTrue(recursiveEquals(retValue, null));
    }

};


