package org.jsoup.nodes;

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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_body_26470769222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;

    public Document_body_26470769222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7899 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term7898 = ((Class) term7899).getDeclaredField((String) "limitedQuirks");
        ((Field) term7898).setAccessible(true);
        Object enum20 = ((Field) term7898).get((Object) null);
        HashMap term427 = new HashMap();
        Set<Object> term8129 =  ((Map) term427).keySet();
        HashSet term426 = new HashSet((Collection<? extends Object>) term8129);
        ArrayList term439 = new ArrayList();
        ((ArrayList) term439).add((Object)null);
        ((ArrayList) term439).add((Object)null);
        ((ArrayList) term439).add((Object)null);
        ((ArrayList) term439).add((Object)null);
        LinkedHashMap term444 = new LinkedHashMap();
        term385 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term386 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term406 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term443 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term386, term386.getClass(), "escapeMode", null);
        setField(term386, term386.getClass(), "charset", null);
        setField(term386, term386.getClass(), "charsetEncoder", null);
        setBooleanField(term386, term386.getClass(), "prettyPrint", false);
        setIntField(term386, term386.getClass(), "indentAmount", 1484323161);
        setField(term385, term385.getClass(), "outputSettings", term386);
        setField(term385, term385.getClass(), "quirksMode", enum20);
        setField(term406, term406.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term406, term406.getClass(), "isBlock", true);
        setBooleanField(term406, term406.getClass(), "formatAsBlock", false);
        setBooleanField(term406, term406.getClass(), "canContainBlock", true);
        setBooleanField(term406, term406.getClass(), "canContainInline", false);
        setBooleanField(term406, term406.getClass(), "empty", true);
        setBooleanField(term406, term406.getClass(), "selfClosing", false);
        setBooleanField(term406, term406.getClass(), "preserveWhitespace", false);
        setField(term385, term385.getClass(), "tag", term406);
        setField(term385, term385.getClass(), "classNames", term426);
        setField(term385, term385.getClass(), "parentNode", null);
        setField(term385, term385.getClass(), "childNodes", term439);
        setField(term443, term443.getClass(), "attributes", term444);
        setField(term385, term385.getClass(), "attributes", term443);
        setField(term385, term385.getClass(), "baseUri", "pCTimMblYc");
        setIntField(term385, term385.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "body", argTypes, term385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


