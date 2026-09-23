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

public class HtmlTreeBuilder_isInActiveFormattingElements_610388722372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258951;
     Object term259107;
     Object term259196;
     Object term259200;

    public HtmlTreeBuilder_isInActiveFormattingElements_610388722372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term259055 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term259003 = new ArrayList();
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add((Object)null);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        ((ArrayList) term259003).add(term259055);
        term258951 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term258951, term258951.getClass(), "formattingElements", term259003);
        term259107 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term259199 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term259199, term259199.getClass(), "tag", null);
        setField(term259199, term259199.getClass(), "shadowChildrenRef", null);
        setField(term259199, term259199.getClass(), "childNodes", null);
        setField(term259199, term259199.getClass(), "attributes", null);
        setField(term259199, term259199.getClass(), "baseUri", null);
        setField(term259199, term259199.getClass(), "parentNode", null);
        setIntField(term259199, term259199.getClass(), "siblingIndex", 0);
        ArrayList term259197 = new ArrayList();
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add((Object)null);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        ((ArrayList) term259197).add(term259199);
        term259196 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term259196, term259196.getClass(), "state", null);
        setField(term259196, term259196.getClass(), "originalState", null);
        setBooleanField(term259196, term259196.getClass(), "baseUriSetFromDoc", false);
        setField(term259196, term259196.getClass(), "headElement", null);
        setField(term259196, term259196.getClass(), "formElement", null);
        setField(term259196, term259196.getClass(), "contextElement", null);
        setField(term259196, term259196.getClass(), "formattingElements", term259197);
        setField(term259196, term259196.getClass(), "pendingTableCharacters", null);
        setField(term259196, term259196.getClass(), "emptyEnd", null);
        setBooleanField(term259196, term259196.getClass(), "framesetOk", false);
        setBooleanField(term259196, term259196.getClass(), "fosterInserts", false);
        setBooleanField(term259196, term259196.getClass(), "fragmentParsing", false);
        setField(term259196, term259196.getClass(), "specificScopeTarget", null);
        setField(term259196, term259196.getClass(), "reader", null);
        setField(term259196, term259196.getClass(), "tokeniser", null);
        setField(term259196, term259196.getClass(), "doc", null);
        setField(term259196, term259196.getClass(), "stack", null);
        setField(term259196, term259196.getClass(), "baseUri", null);
        setField(term259196, term259196.getClass(), "currentToken", null);
        setField(term259196, term259196.getClass(), "errors", null);
        setField(term259196, term259196.getClass(), "settings", null);
        setField(term259196, term259196.getClass(), "start", null);
        setField(term259196, term259196.getClass(), "end", null);
        term259200 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term259200, term259200.getClass(), "tag", null);
        setField(term259200, term259200.getClass(), "shadowChildrenRef", null);
        setField(term259200, term259200.getClass(), "childNodes", null);
        setField(term259200, term259200.getClass(), "attributes", null);
        setField(term259200, term259200.getClass(), "baseUri", null);
        setField(term259200, term259200.getClass(), "parentNode", null);
        setIntField(term259200, term259200.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term259107;
        callMethod(klass, "isInActiveFormattingElements", argTypes, term258951, args);
        assertTrue(recursiveEquals(term258951, term259196));
        assertTrue(recursiveEquals(term259107, term259200));
    }

};


