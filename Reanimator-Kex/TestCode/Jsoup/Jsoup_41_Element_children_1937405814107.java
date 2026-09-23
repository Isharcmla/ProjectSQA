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
     Object term10822;
     Object term10767;

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
        ArrayList term10826 = new ArrayList();
        ((ArrayList) term10826).add((Object)null);
        ((ArrayList) term10826).add((Object)null);
        ((ArrayList) term10826).add((Object)null);
        ((ArrayList) term10826).add((Object)null);
        ((ArrayList) term10826).add((Object)null);
        LinkedHashMap term10829 = new LinkedHashMap();
        term10822 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10828 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10823, term10823.getClass(), "tagName", "whBvTVIIlC");
        setBooleanField(term10823, term10823.getClass(), "isBlock", true);
        setBooleanField(term10823, term10823.getClass(), "formatAsBlock", false);
        setBooleanField(term10823, term10823.getClass(), "canContainBlock", false);
        setBooleanField(term10823, term10823.getClass(), "canContainInline", true);
        setBooleanField(term10823, term10823.getClass(), "empty", true);
        setBooleanField(term10823, term10823.getClass(), "selfClosing", false);
        setBooleanField(term10823, term10823.getClass(), "preserveWhitespace", false);
        setBooleanField(term10823, term10823.getClass(), "formList", true);
        setBooleanField(term10823, term10823.getClass(), "formSubmit", false);
        setField(term10822, term10822.getClass(), "tag", term10823);
        setField(term10822, term10822.getClass(), "parentNode", null);
        setField(term10822, term10822.getClass(), "childNodes", term10826);
        setField(term10828, term10828.getClass(), "attributes", term10829);
        setField(term10822, term10822.getClass(), "attributes", term10828);
        setField(term10822, term10822.getClass(), "baseUri", "HqBOwkVqjD");
        setIntField(term10822, term10822.getClass(), "siblingIndex", -883034806);
        term10767 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term10768 = (Object[]) newArray("java.lang.Object", 0);
        setField(term10767, term10767.getClass(), "elementData", term10768);
        setIntField(term10767, term10767.getClass(), "size", 0);
        setIntField(term10767, term10767.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term996, args);
        assertTrue(recursiveEquals(term996, term10822));
        assertTrue(recursiveEquals(retValue, term10767));
    }

};


