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
import java.lang.Object;
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290700;
     Object term291080;
     Object term291213;
     Object term291220;

    public XmlTreeBuilder_popStackToClose_551050621219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term290878 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term290924 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term290924, term290924.getClass(), "tagName", " ");
        setField(term290878, term290878.getClass(), "tag", term290924);
        Object term291016 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term290818 = new ArrayList();
        ((ArrayList) term290818).add(term290878);
        ((ArrayList) term290818).add(term291016);
        term290700 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term290766 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term290766, term290766.getClass(), "preserveTagCase", false);
        setField(term290700, term290700.getClass(), "settings", term290766);
        setField(term290700, term290700.getClass(), "stack", term290818);
        term291080 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term291080, term291080.getClass(), "tagName", "");
        Object term291216 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term291217 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term291216, term291216.getClass(), "elements", null);
        setField(term291217, term291217.getClass(), "tagName", null);
        setBooleanField(term291217, term291217.getClass(), "isBlock", false);
        setBooleanField(term291217, term291217.getClass(), "formatAsBlock", false);
        setBooleanField(term291217, term291217.getClass(), "canContainInline", false);
        setBooleanField(term291217, term291217.getClass(), "empty", false);
        setBooleanField(term291217, term291217.getClass(), "selfClosing", false);
        setBooleanField(term291217, term291217.getClass(), "preserveWhitespace", false);
        setBooleanField(term291217, term291217.getClass(), "formList", false);
        setBooleanField(term291217, term291217.getClass(), "formSubmit", false);
        setField(term291216, term291216.getClass(), "tag", term291217);
        setField(term291216, term291216.getClass(), "shadowChildrenRef", null);
        setField(term291216, term291216.getClass(), "childNodes", null);
        setField(term291216, term291216.getClass(), "attributes", null);
        setField(term291216, term291216.getClass(), "baseUri", null);
        setField(term291216, term291216.getClass(), "parentNode", null);
        setIntField(term291216, term291216.getClass(), "siblingIndex", 0);
        Object term291218 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term291218, term291218.getClass(), "outputSettings", null);
        setField(term291218, term291218.getClass(), "quirksMode", null);
        setField(term291218, term291218.getClass(), "location", null);
        setBooleanField(term291218, term291218.getClass(), "updateMetaCharset", false);
        setField(term291218, term291218.getClass(), "tag", null);
        setField(term291218, term291218.getClass(), "shadowChildrenRef", null);
        setField(term291218, term291218.getClass(), "childNodes", null);
        setField(term291218, term291218.getClass(), "attributes", null);
        setField(term291218, term291218.getClass(), "baseUri", null);
        setField(term291218, term291218.getClass(), "parentNode", null);
        setIntField(term291218, term291218.getClass(), "siblingIndex", 0);
        ArrayList term291214 = new ArrayList();
        ((ArrayList) term291214).add(term291216);
        ((ArrayList) term291214).add(term291218);
        term291213 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term291219 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term291213, term291213.getClass(), "reader", null);
        setField(term291213, term291213.getClass(), "tokeniser", null);
        setField(term291213, term291213.getClass(), "doc", null);
        setField(term291213, term291213.getClass(), "stack", term291214);
        setField(term291213, term291213.getClass(), "baseUri", null);
        setField(term291213, term291213.getClass(), "currentToken", null);
        setField(term291213, term291213.getClass(), "errors", null);
        setBooleanField(term291219, term291219.getClass(), "preserveTagCase", false);
        setBooleanField(term291219, term291219.getClass(), "preserveAttributeCase", false);
        setField(term291213, term291213.getClass(), "settings", term291219);
        setField(term291213, term291213.getClass(), "start", null);
        setField(term291213, term291213.getClass(), "end", null);
        term291220 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term291220, term291220.getClass(), "tagName", "");
        setField(term291220, term291220.getClass(), "normalName", null);
        setField(term291220, term291220.getClass(), "pendingAttributeName", null);
        setField(term291220, term291220.getClass(), "pendingAttributeValue", null);
        setField(term291220, term291220.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term291220, term291220.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term291220, term291220.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term291220, term291220.getClass(), "selfClosing", false);
        setField(term291220, term291220.getClass(), "attributes", null);
        setField(term291220, term291220.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term291080;
        callMethod(klass, "popStackToClose", argTypes, term290700, args);
        assertTrue(recursiveEquals(term290700, term291213));
        assertTrue(recursiveEquals(term291080, term291220));
    }

};


