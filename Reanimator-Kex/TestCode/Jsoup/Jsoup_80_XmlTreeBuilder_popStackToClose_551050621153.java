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

public class XmlTreeBuilder_popStackToClose_551050621153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248077;
     Object term248457;
     Object term248555;
     Object term248559;

    public XmlTreeBuilder_popStackToClose_551050621153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term248255 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term248301 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term248301, term248301.getClass(), "tagName", "");
        setField(term248255, term248255.getClass(), "tag", term248301);
        Object term248393 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term248195 = new ArrayList();
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add((Object)null);
        ((ArrayList) term248195).add(term248255);
        ((ArrayList) term248195).add(term248393);
        term248077 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term248143 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term248143, term248143.getClass(), "preserveTagCase", false);
        setField(term248077, term248077.getClass(), "settings", term248143);
        setField(term248077, term248077.getClass(), "stack", term248195);
        term248457 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term248457, term248457.getClass(), "tagName", "");
        ArrayList term248556 = new ArrayList();
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        ((ArrayList) term248556).add((Object)null);
        term248555 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term248558 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term248555, term248555.getClass(), "reader", null);
        setField(term248555, term248555.getClass(), "tokeniser", null);
        setField(term248555, term248555.getClass(), "doc", null);
        setField(term248555, term248555.getClass(), "stack", term248556);
        setField(term248555, term248555.getClass(), "baseUri", null);
        setField(term248555, term248555.getClass(), "currentToken", null);
        setField(term248555, term248555.getClass(), "errors", null);
        setBooleanField(term248558, term248558.getClass(), "preserveTagCase", false);
        setBooleanField(term248558, term248558.getClass(), "preserveAttributeCase", false);
        setField(term248555, term248555.getClass(), "settings", term248558);
        setField(term248555, term248555.getClass(), "start", null);
        setField(term248555, term248555.getClass(), "end", null);
        term248559 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term248559, term248559.getClass(), "tagName", "");
        setField(term248559, term248559.getClass(), "normalName", null);
        setField(term248559, term248559.getClass(), "pendingAttributeName", null);
        setField(term248559, term248559.getClass(), "pendingAttributeValue", null);
        setField(term248559, term248559.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term248559, term248559.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term248559, term248559.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term248559, term248559.getClass(), "selfClosing", false);
        setField(term248559, term248559.getClass(), "attributes", null);
        setField(term248559, term248559.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term248457;
        callMethod(klass, "popStackToClose", argTypes, term248077, args);
        assertTrue(recursiveEquals(term248077, term248555));
        assertTrue(recursiveEquals(term248457, term248559));
    }

};


