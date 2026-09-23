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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287265;
     Object term287431;
     Object term287654;
     Object term287662;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term287371 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term287317 = new ArrayList();
        ((ArrayList) term287317).add(term287371);
        term287265 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term287265, term287265.getClass(), "formattingElements", term287317);
        term287431 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term287477 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term287477, term287477.getClass(), "tagName", "#document");
        setField(term287431, term287431.getClass(), "tag", term287477);
        Object term287657 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term287658 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term287657, term287657.getClass(), "outputSettings", null);
        setField(term287657, term287657.getClass(), "quirksMode", null);
        setField(term287657, term287657.getClass(), "location", null);
        setBooleanField(term287657, term287657.getClass(), "updateMetaCharset", false);
        setField(term287657, term287657.getClass(), "tag", null);
        setField(term287657, term287657.getClass(), "shadowChildrenRef", null);
        setField(term287657, term287657.getClass(), "childNodes", null);
        setIntField(term287658, term287658.getClass(), "size", 0);
        setField(term287658, term287658.getClass(), "keys", null);
        setField(term287658, term287658.getClass(), "vals", null);
        setField(term287657, term287657.getClass(), "attributes", term287658);
        setField(term287657, term287657.getClass(), "baseUri", null);
        setField(term287657, term287657.getClass(), "parentNode", null);
        setIntField(term287657, term287657.getClass(), "siblingIndex", 0);
        Object term287659 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term287660 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term287661 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term287659, term287659.getClass(), "elements", null);
        setField(term287660, term287660.getClass(), "tagName", null);
        setBooleanField(term287660, term287660.getClass(), "isBlock", false);
        setBooleanField(term287660, term287660.getClass(), "formatAsBlock", false);
        setBooleanField(term287660, term287660.getClass(), "canContainInline", false);
        setBooleanField(term287660, term287660.getClass(), "empty", false);
        setBooleanField(term287660, term287660.getClass(), "selfClosing", false);
        setBooleanField(term287660, term287660.getClass(), "preserveWhitespace", false);
        setBooleanField(term287660, term287660.getClass(), "formList", false);
        setBooleanField(term287660, term287660.getClass(), "formSubmit", false);
        setField(term287659, term287659.getClass(), "tag", term287660);
        setField(term287659, term287659.getClass(), "shadowChildrenRef", null);
        setField(term287659, term287659.getClass(), "childNodes", null);
        setIntField(term287661, term287661.getClass(), "size", 0);
        setField(term287661, term287661.getClass(), "keys", null);
        setField(term287661, term287661.getClass(), "vals", null);
        setField(term287659, term287659.getClass(), "attributes", term287661);
        setField(term287659, term287659.getClass(), "baseUri", null);
        setField(term287659, term287659.getClass(), "parentNode", null);
        setIntField(term287659, term287659.getClass(), "siblingIndex", 0);
        ArrayList term287655 = new ArrayList();
        ((ArrayList) term287655).add(term287657);
        ((ArrayList) term287655).add(term287659);
        term287654 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term287654, term287654.getClass(), "state", null);
        setField(term287654, term287654.getClass(), "originalState", null);
        setBooleanField(term287654, term287654.getClass(), "baseUriSetFromDoc", false);
        setField(term287654, term287654.getClass(), "headElement", null);
        setField(term287654, term287654.getClass(), "formElement", null);
        setField(term287654, term287654.getClass(), "contextElement", null);
        setField(term287654, term287654.getClass(), "formattingElements", term287655);
        setField(term287654, term287654.getClass(), "pendingTableCharacters", null);
        setField(term287654, term287654.getClass(), "emptyEnd", null);
        setBooleanField(term287654, term287654.getClass(), "framesetOk", false);
        setBooleanField(term287654, term287654.getClass(), "fosterInserts", false);
        setBooleanField(term287654, term287654.getClass(), "fragmentParsing", false);
        setField(term287654, term287654.getClass(), "specificScopeTarget", null);
        setField(term287654, term287654.getClass(), "reader", null);
        setField(term287654, term287654.getClass(), "tokeniser", null);
        setField(term287654, term287654.getClass(), "doc", null);
        setField(term287654, term287654.getClass(), "stack", null);
        setField(term287654, term287654.getClass(), "baseUri", null);
        setField(term287654, term287654.getClass(), "currentToken", null);
        setField(term287654, term287654.getClass(), "errors", null);
        setField(term287654, term287654.getClass(), "settings", null);
        setField(term287654, term287654.getClass(), "start", null);
        setField(term287654, term287654.getClass(), "end", null);
        term287662 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term287663 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term287664 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term287662, term287662.getClass(), "elements", null);
        setField(term287663, term287663.getClass(), "tagName", null);
        setBooleanField(term287663, term287663.getClass(), "isBlock", false);
        setBooleanField(term287663, term287663.getClass(), "formatAsBlock", false);
        setBooleanField(term287663, term287663.getClass(), "canContainInline", false);
        setBooleanField(term287663, term287663.getClass(), "empty", false);
        setBooleanField(term287663, term287663.getClass(), "selfClosing", false);
        setBooleanField(term287663, term287663.getClass(), "preserveWhitespace", false);
        setBooleanField(term287663, term287663.getClass(), "formList", false);
        setBooleanField(term287663, term287663.getClass(), "formSubmit", false);
        setField(term287662, term287662.getClass(), "tag", term287663);
        setField(term287662, term287662.getClass(), "shadowChildrenRef", null);
        setField(term287662, term287662.getClass(), "childNodes", null);
        setIntField(term287664, term287664.getClass(), "size", 0);
        setField(term287664, term287664.getClass(), "keys", null);
        setField(term287664, term287664.getClass(), "vals", null);
        setField(term287662, term287662.getClass(), "attributes", term287664);
        setField(term287662, term287662.getClass(), "baseUri", null);
        setField(term287662, term287662.getClass(), "parentNode", null);
        setIntField(term287662, term287662.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term287431;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term287265, args);
        assertTrue(recursiveEquals(term287265, term287654));
        assertTrue(recursiveEquals(term287431, term287662));
    }

};


