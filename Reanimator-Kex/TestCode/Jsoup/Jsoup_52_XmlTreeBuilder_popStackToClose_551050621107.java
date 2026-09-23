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

public class XmlTreeBuilder_popStackToClose_551050621107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116977;
     Object term117229;
     Object term121243;
     Object term121248;

    public XmlTreeBuilder_popStackToClose_551050621107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117081 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term117127 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term117127, term117127.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term117081, term117081.getClass(), "tag", term117127);
        ArrayList term117029 = new ArrayList();
        ((ArrayList) term117029).add(term117081);
        term116977 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term116977, term116977.getClass(), "stack", term117029);
        term117229 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term117229, term117229.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term121246 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term121247 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term121247, term121247.getClass(), "tagName", null);
        setBooleanField(term121247, term121247.getClass(), "isBlock", false);
        setBooleanField(term121247, term121247.getClass(), "formatAsBlock", false);
        setBooleanField(term121247, term121247.getClass(), "canContainBlock", false);
        setBooleanField(term121247, term121247.getClass(), "canContainInline", false);
        setBooleanField(term121247, term121247.getClass(), "empty", false);
        setBooleanField(term121247, term121247.getClass(), "selfClosing", false);
        setBooleanField(term121247, term121247.getClass(), "preserveWhitespace", false);
        setBooleanField(term121247, term121247.getClass(), "formList", false);
        setBooleanField(term121247, term121247.getClass(), "formSubmit", false);
        setField(term121246, term121246.getClass(), "tag", term121247);
        setField(term121246, term121246.getClass(), "parentNode", null);
        setField(term121246, term121246.getClass(), "childNodes", null);
        setField(term121246, term121246.getClass(), "attributes", null);
        setField(term121246, term121246.getClass(), "baseUri", null);
        setIntField(term121246, term121246.getClass(), "siblingIndex", 0);
        ArrayList term121244 = new ArrayList();
        ((ArrayList) term121244).add(term121246);
        term121243 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term121243, term121243.getClass(), "reader", null);
        setField(term121243, term121243.getClass(), "tokeniser", null);
        setField(term121243, term121243.getClass(), "doc", null);
        setField(term121243, term121243.getClass(), "stack", term121244);
        setField(term121243, term121243.getClass(), "baseUri", null);
        setField(term121243, term121243.getClass(), "currentToken", null);
        setField(term121243, term121243.getClass(), "errors", null);
        setField(term121243, term121243.getClass(), "start", null);
        setField(term121243, term121243.getClass(), "end", null);
        term121248 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term121248, term121248.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term121248, term121248.getClass(), "pendingAttributeName", null);
        setField(term121248, term121248.getClass(), "pendingAttributeValue", null);
        setField(term121248, term121248.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term121248, term121248.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term121248, term121248.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term121248, term121248.getClass(), "selfClosing", false);
        setField(term121248, term121248.getClass(), "attributes", null);
        setField(term121248, term121248.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term117229;
        callMethod(klass, "popStackToClose", argTypes, term116977, args);
        assertTrue(recursiveEquals(term116977, term121243));
        assertTrue(recursiveEquals(term117229, term121248));
    }

};


