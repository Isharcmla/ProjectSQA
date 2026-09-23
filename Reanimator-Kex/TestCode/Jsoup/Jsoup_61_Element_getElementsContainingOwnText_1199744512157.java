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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsContainingOwnText_1199744512157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5028;
     Object term31559;
     Object term31555;

    public Element_getElementsContainingOwnText_1199744512157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5050 = new ArrayList();
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        LinkedHashMap term5055 = new LinkedHashMap();
        term5028 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5029 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5054 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5029, term5029.getClass(), "tagName", "GPSEWEDSTo");
        setBooleanField(term5029, term5029.getClass(), "isBlock", false);
        setBooleanField(term5029, term5029.getClass(), "formatAsBlock", true);
        setBooleanField(term5029, term5029.getClass(), "canContainInline", false);
        setBooleanField(term5029, term5029.getClass(), "empty", false);
        setBooleanField(term5029, term5029.getClass(), "selfClosing", false);
        setBooleanField(term5029, term5029.getClass(), "preserveWhitespace", true);
        setBooleanField(term5029, term5029.getClass(), "formList", false);
        setBooleanField(term5029, term5029.getClass(), "formSubmit", true);
        setField(term5028, term5028.getClass(), "tag", term5029);
        setField(term5028, term5028.getClass(), "parentNode", null);
        setField(term5028, term5028.getClass(), "childNodes", term5050);
        setField(term5054, term5054.getClass(), "attributes", term5055);
        setField(term5028, term5028.getClass(), "attributes", term5054);
        setField(term5028, term5028.getClass(), "baseUri", "vOVuNSCCLe");
        setIntField(term5028, term5028.getClass(), "siblingIndex", 444029505);
        ArrayList term31563 = new ArrayList();
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        ((ArrayList) term31563).add((Object)null);
        LinkedHashMap term31566 = new LinkedHashMap();
        term31559 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term31560 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term31565 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term31560, term31560.getClass(), "tagName", "GPSEWEDSTo");
        setBooleanField(term31560, term31560.getClass(), "isBlock", false);
        setBooleanField(term31560, term31560.getClass(), "formatAsBlock", true);
        setBooleanField(term31560, term31560.getClass(), "canContainInline", false);
        setBooleanField(term31560, term31560.getClass(), "empty", false);
        setBooleanField(term31560, term31560.getClass(), "selfClosing", false);
        setBooleanField(term31560, term31560.getClass(), "preserveWhitespace", true);
        setBooleanField(term31560, term31560.getClass(), "formList", false);
        setBooleanField(term31560, term31560.getClass(), "formSubmit", true);
        setField(term31559, term31559.getClass(), "tag", term31560);
        setField(term31559, term31559.getClass(), "parentNode", null);
        setField(term31559, term31559.getClass(), "childNodes", term31563);
        setField(term31565, term31565.getClass(), "attributes", term31566);
        setField(term31559, term31559.getClass(), "attributes", term31565);
        setField(term31559, term31559.getClass(), "baseUri", "vOVuNSCCLe");
        setIntField(term31559, term31559.getClass(), "siblingIndex", 444029505);
        term31555 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term31556 = (Object[]) newArray("java.lang.Object", 0);
        setField(term31555, term31555.getClass(), "elementData", term31556);
        setIntField(term31555, term31555.getClass(), "size", 0);
        setIntField(term31555, term31555.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzeqPnzpnt";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term5028, args);
        assertTrue(recursiveEquals(term5028, term31559));
        assertTrue(recursiveEquals(retValue, term31555));
    }

};


