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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253178;
     Object term253344;
     Object term253657;
     Object term253663;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term253284 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term253230 = new ArrayList();
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add((Object)null);
        ((ArrayList) term253230).add(term253284);
        term253178 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term253178, term253178.getClass(), "formattingElements", term253230);
        term253344 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term253390 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term253390, term253390.getClass(), "tagName", "");
        setField(term253344, term253344.getClass(), "tag", term253390);
        Object term253660 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term253660, term253660.getClass(), "outputSettings", null);
        setField(term253660, term253660.getClass(), "quirksMode", null);
        setField(term253660, term253660.getClass(), "location", null);
        setBooleanField(term253660, term253660.getClass(), "updateMetaCharset", false);
        setField(term253660, term253660.getClass(), "tag", null);
        setField(term253660, term253660.getClass(), "shadowChildrenRef", null);
        setField(term253660, term253660.getClass(), "childNodes", null);
        setField(term253660, term253660.getClass(), "attributes", null);
        setField(term253660, term253660.getClass(), "baseUri", null);
        setField(term253660, term253660.getClass(), "parentNode", null);
        setIntField(term253660, term253660.getClass(), "siblingIndex", 0);
        Object term253661 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term253662 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term253661, term253661.getClass(), "elements", null);
        setField(term253662, term253662.getClass(), "tagName", null);
        setBooleanField(term253662, term253662.getClass(), "isBlock", false);
        setBooleanField(term253662, term253662.getClass(), "formatAsBlock", false);
        setBooleanField(term253662, term253662.getClass(), "canContainInline", false);
        setBooleanField(term253662, term253662.getClass(), "empty", false);
        setBooleanField(term253662, term253662.getClass(), "selfClosing", false);
        setBooleanField(term253662, term253662.getClass(), "preserveWhitespace", false);
        setBooleanField(term253662, term253662.getClass(), "formList", false);
        setBooleanField(term253662, term253662.getClass(), "formSubmit", false);
        setField(term253661, term253661.getClass(), "tag", term253662);
        setField(term253661, term253661.getClass(), "shadowChildrenRef", null);
        setField(term253661, term253661.getClass(), "childNodes", null);
        setField(term253661, term253661.getClass(), "attributes", null);
        setField(term253661, term253661.getClass(), "baseUri", null);
        setField(term253661, term253661.getClass(), "parentNode", null);
        setIntField(term253661, term253661.getClass(), "siblingIndex", 0);
        ArrayList term253658 = new ArrayList();
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add((Object)null);
        ((ArrayList) term253658).add(term253660);
        ((ArrayList) term253658).add(term253661);
        term253657 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term253657, term253657.getClass(), "state", null);
        setField(term253657, term253657.getClass(), "originalState", null);
        setBooleanField(term253657, term253657.getClass(), "baseUriSetFromDoc", false);
        setField(term253657, term253657.getClass(), "headElement", null);
        setField(term253657, term253657.getClass(), "formElement", null);
        setField(term253657, term253657.getClass(), "contextElement", null);
        setField(term253657, term253657.getClass(), "formattingElements", term253658);
        setField(term253657, term253657.getClass(), "pendingTableCharacters", null);
        setField(term253657, term253657.getClass(), "emptyEnd", null);
        setBooleanField(term253657, term253657.getClass(), "framesetOk", false);
        setBooleanField(term253657, term253657.getClass(), "fosterInserts", false);
        setBooleanField(term253657, term253657.getClass(), "fragmentParsing", false);
        setField(term253657, term253657.getClass(), "specificScopeTarget", null);
        setField(term253657, term253657.getClass(), "reader", null);
        setField(term253657, term253657.getClass(), "tokeniser", null);
        setField(term253657, term253657.getClass(), "doc", null);
        setField(term253657, term253657.getClass(), "stack", null);
        setField(term253657, term253657.getClass(), "baseUri", null);
        setField(term253657, term253657.getClass(), "currentToken", null);
        setField(term253657, term253657.getClass(), "errors", null);
        setField(term253657, term253657.getClass(), "settings", null);
        setField(term253657, term253657.getClass(), "start", null);
        setField(term253657, term253657.getClass(), "end", null);
        term253663 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term253664 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term253663, term253663.getClass(), "elements", null);
        setField(term253664, term253664.getClass(), "tagName", null);
        setBooleanField(term253664, term253664.getClass(), "isBlock", false);
        setBooleanField(term253664, term253664.getClass(), "formatAsBlock", false);
        setBooleanField(term253664, term253664.getClass(), "canContainInline", false);
        setBooleanField(term253664, term253664.getClass(), "empty", false);
        setBooleanField(term253664, term253664.getClass(), "selfClosing", false);
        setBooleanField(term253664, term253664.getClass(), "preserveWhitespace", false);
        setBooleanField(term253664, term253664.getClass(), "formList", false);
        setBooleanField(term253664, term253664.getClass(), "formSubmit", false);
        setField(term253663, term253663.getClass(), "tag", term253664);
        setField(term253663, term253663.getClass(), "shadowChildrenRef", null);
        setField(term253663, term253663.getClass(), "childNodes", null);
        setField(term253663, term253663.getClass(), "attributes", null);
        setField(term253663, term253663.getClass(), "baseUri", null);
        setField(term253663, term253663.getClass(), "parentNode", null);
        setIntField(term253663, term253663.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term253344;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term253178, args);
        assertTrue(recursiveEquals(term253178, term253657));
        assertTrue(recursiveEquals(term253344, term253663));
    }

};


