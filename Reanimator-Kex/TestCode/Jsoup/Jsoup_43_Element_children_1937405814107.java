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

public class Element_children_1937405814107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996;
     Object term10809;
     Object term10754;

    public Element_children_1937405814107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1019 = new ArrayList();
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        LinkedHashMap term1024 = new LinkedHashMap();
        term996 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term997 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1023 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term997, term997.getClass(), "tagName", "whBvTVIIlC");
        setBooleanField(term997, term997.getClass(), "isBlock", true);
        setBooleanField(term997, term997.getClass(), "formatAsBlock", false);
        setBooleanField(term997, term997.getClass(), "canContainBlock", false);
        setBooleanField(term997, term997.getClass(), "canContainInline", true);
        setBooleanField(term997, term997.getClass(), "empty", true);
        setBooleanField(term997, term997.getClass(), "selfClosing", false);
        setBooleanField(term997, term997.getClass(), "preserveWhitespace", false);
        setBooleanField(term997, term997.getClass(), "formList", true);
        setBooleanField(term997, term997.getClass(), "formSubmit", false);
        setField(term996, term996.getClass(), "tag", term997);
        setField(term996, term996.getClass(), "parentNode", null);
        setField(term996, term996.getClass(), "childNodes", term1019);
        setField(term1023, term1023.getClass(), "attributes", term1024);
        setField(term996, term996.getClass(), "attributes", term1023);
        setField(term996, term996.getClass(), "baseUri", "HqBOwkVqjD");
        setIntField(term996, term996.getClass(), "siblingIndex", -883034806);
        ArrayList term10813 = new ArrayList();
        ((ArrayList) term10813).add((Object)null);
        ((ArrayList) term10813).add((Object)null);
        ((ArrayList) term10813).add((Object)null);
        ((ArrayList) term10813).add((Object)null);
        ((ArrayList) term10813).add((Object)null);
        LinkedHashMap term10816 = new LinkedHashMap();
        term10809 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10810 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10815 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10810, term10810.getClass(), "tagName", "whBvTVIIlC");
        setBooleanField(term10810, term10810.getClass(), "isBlock", true);
        setBooleanField(term10810, term10810.getClass(), "formatAsBlock", false);
        setBooleanField(term10810, term10810.getClass(), "canContainBlock", false);
        setBooleanField(term10810, term10810.getClass(), "canContainInline", true);
        setBooleanField(term10810, term10810.getClass(), "empty", true);
        setBooleanField(term10810, term10810.getClass(), "selfClosing", false);
        setBooleanField(term10810, term10810.getClass(), "preserveWhitespace", false);
        setBooleanField(term10810, term10810.getClass(), "formList", true);
        setBooleanField(term10810, term10810.getClass(), "formSubmit", false);
        setField(term10809, term10809.getClass(), "tag", term10810);
        setField(term10809, term10809.getClass(), "parentNode", null);
        setField(term10809, term10809.getClass(), "childNodes", term10813);
        setField(term10815, term10815.getClass(), "attributes", term10816);
        setField(term10809, term10809.getClass(), "attributes", term10815);
        setField(term10809, term10809.getClass(), "baseUri", "HqBOwkVqjD");
        setIntField(term10809, term10809.getClass(), "siblingIndex", -883034806);
        term10754 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term10755 = (Object[]) newArray("java.lang.Object", 0);
        setField(term10754, term10754.getClass(), "elementData", term10755);
        setIntField(term10754, term10754.getClass(), "size", 0);
        setIntField(term10754, term10754.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term996, args);
        assertTrue(recursiveEquals(term996, term10809));
        assertTrue(recursiveEquals(retValue, term10754));
    }

};


