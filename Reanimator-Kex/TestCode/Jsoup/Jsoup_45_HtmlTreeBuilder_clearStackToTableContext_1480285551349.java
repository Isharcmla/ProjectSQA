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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720239;
     Object term720595;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term720329 = newInstance(Class.forName("java.lang.Object"));
        Object term720389 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term720435 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term720435, term720435.getClass(), "tagName", "html");
        setField(term720389, term720389.getClass(), "tag", term720435);
        ArrayList term720291 = new ArrayList();
        ((ArrayList) term720291).add(term720329);
        ((ArrayList) term720291).add(term720389);
        ((ArrayList) term720291).add(term720389);
        ((ArrayList) term720291).add(term720389);
        term720239 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term720239, term720239.getClass(), "stack", term720291);
        Object term720598 = newInstance(Class.forName("java.lang.Object"));
        Object term720599 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term720600 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term720599, term720599.getClass(), "elements", null);
        setField(term720600, term720600.getClass(), "tagName", null);
        setBooleanField(term720600, term720600.getClass(), "isBlock", false);
        setBooleanField(term720600, term720600.getClass(), "formatAsBlock", false);
        setBooleanField(term720600, term720600.getClass(), "canContainBlock", false);
        setBooleanField(term720600, term720600.getClass(), "canContainInline", false);
        setBooleanField(term720600, term720600.getClass(), "empty", false);
        setBooleanField(term720600, term720600.getClass(), "selfClosing", false);
        setBooleanField(term720600, term720600.getClass(), "preserveWhitespace", false);
        setBooleanField(term720600, term720600.getClass(), "formList", false);
        setBooleanField(term720600, term720600.getClass(), "formSubmit", false);
        setField(term720599, term720599.getClass(), "tag", term720600);
        setField(term720599, term720599.getClass(), "parentNode", null);
        setField(term720599, term720599.getClass(), "childNodes", null);
        setField(term720599, term720599.getClass(), "attributes", null);
        setField(term720599, term720599.getClass(), "baseUri", null);
        setIntField(term720599, term720599.getClass(), "siblingIndex", 0);
        ArrayList term720596 = new ArrayList();
        ((ArrayList) term720596).add(term720598);
        ((ArrayList) term720596).add(term720599);
        ((ArrayList) term720596).add(term720599);
        ((ArrayList) term720596).add(term720599);
        term720595 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term720595, term720595.getClass(), "state", null);
        setField(term720595, term720595.getClass(), "originalState", null);
        setBooleanField(term720595, term720595.getClass(), "baseUriSetFromDoc", false);
        setField(term720595, term720595.getClass(), "headElement", null);
        setField(term720595, term720595.getClass(), "formElement", null);
        setField(term720595, term720595.getClass(), "contextElement", null);
        setField(term720595, term720595.getClass(), "formattingElements", null);
        setField(term720595, term720595.getClass(), "pendingTableCharacters", null);
        setField(term720595, term720595.getClass(), "emptyEnd", null);
        setBooleanField(term720595, term720595.getClass(), "framesetOk", false);
        setBooleanField(term720595, term720595.getClass(), "fosterInserts", false);
        setBooleanField(term720595, term720595.getClass(), "fragmentParsing", false);
        setField(term720595, term720595.getClass(), "specificScopeTarget", null);
        setField(term720595, term720595.getClass(), "reader", null);
        setField(term720595, term720595.getClass(), "tokeniser", null);
        setField(term720595, term720595.getClass(), "doc", null);
        setField(term720595, term720595.getClass(), "stack", term720596);
        setField(term720595, term720595.getClass(), "baseUri", null);
        setField(term720595, term720595.getClass(), "currentToken", null);
        setField(term720595, term720595.getClass(), "errors", null);
        setField(term720595, term720595.getClass(), "start", null);
        setField(term720595, term720595.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term720239, args);
        assertTrue(recursiveEquals(term720239, term720595));
    }

};


