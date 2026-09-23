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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsContainingOwnText_1199744512149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5426;
     Object term30427;
     Object term30422;

    public Element_getElementsContainingOwnText_1199744512149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5448 = new HashMap();
        Set<Object> term30451 =  ((Map) term5448).keySet();
        HashSet term5447 = new HashSet((Collection<? extends Object>) term30451);
        ArrayList term5458 = new ArrayList();
        ((ArrayList) term5458).add((Object)null);
        ((ArrayList) term5458).add((Object)null);
        ((ArrayList) term5458).add((Object)null);
        ((ArrayList) term5458).add((Object)null);
        ((ArrayList) term5458).add((Object)null);
        ((ArrayList) term5458).add((Object)null);
        ((ArrayList) term5458).add((Object)null);
        LinkedHashMap term5463 = new LinkedHashMap();
        term5426 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5427 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5462 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5427, term5427.getClass(), "tagName", "pDkMNnAGgv");
        setBooleanField(term5427, term5427.getClass(), "isBlock", false);
        setBooleanField(term5427, term5427.getClass(), "formatAsBlock", false);
        setBooleanField(term5427, term5427.getClass(), "canContainBlock", false);
        setBooleanField(term5427, term5427.getClass(), "canContainInline", false);
        setBooleanField(term5427, term5427.getClass(), "empty", false);
        setBooleanField(term5427, term5427.getClass(), "selfClosing", true);
        setBooleanField(term5427, term5427.getClass(), "preserveWhitespace", true);
        setField(term5426, term5426.getClass(), "tag", term5427);
        setField(term5426, term5426.getClass(), "classNames", term5447);
        setField(term5426, term5426.getClass(), "parentNode", null);
        setField(term5426, term5426.getClass(), "childNodes", term5458);
        setField(term5462, term5462.getClass(), "attributes", term5463);
        setField(term5426, term5426.getClass(), "attributes", term5462);
        setField(term5426, term5426.getClass(), "baseUri", "bucTnYicnp");
        setIntField(term5426, term5426.getClass(), "siblingIndex", 1655935355);
        HashMap term30432 = new HashMap();
        Set<Object> term30482 =  ((Map) term30432).keySet();
        HashSet term30431 = new HashSet((Collection<? extends Object>) term30482);
        ArrayList term30433 = new ArrayList();
        ((ArrayList) term30433).add((Object)null);
        ((ArrayList) term30433).add((Object)null);
        ((ArrayList) term30433).add((Object)null);
        ((ArrayList) term30433).add((Object)null);
        ((ArrayList) term30433).add((Object)null);
        ((ArrayList) term30433).add((Object)null);
        ((ArrayList) term30433).add((Object)null);
        LinkedHashMap term30436 = new LinkedHashMap();
        term30427 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30428 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30435 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30428, term30428.getClass(), "tagName", "pDkMNnAGgv");
        setBooleanField(term30428, term30428.getClass(), "isBlock", false);
        setBooleanField(term30428, term30428.getClass(), "formatAsBlock", false);
        setBooleanField(term30428, term30428.getClass(), "canContainBlock", false);
        setBooleanField(term30428, term30428.getClass(), "canContainInline", false);
        setBooleanField(term30428, term30428.getClass(), "empty", false);
        setBooleanField(term30428, term30428.getClass(), "selfClosing", true);
        setBooleanField(term30428, term30428.getClass(), "preserveWhitespace", true);
        setField(term30427, term30427.getClass(), "tag", term30428);
        setField(term30427, term30427.getClass(), "classNames", term30431);
        setField(term30427, term30427.getClass(), "parentNode", null);
        setField(term30427, term30427.getClass(), "childNodes", term30433);
        setField(term30435, term30435.getClass(), "attributes", term30436);
        setField(term30427, term30427.getClass(), "attributes", term30435);
        setField(term30427, term30427.getClass(), "baseUri", "bucTnYicnp");
        setIntField(term30427, term30427.getClass(), "siblingIndex", 1655935355);
        ArrayList term30423 = new ArrayList();
        term30422 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term30422, term30422.getClass(), "contents", term30423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EkgprvqZlM";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term5426, args);
        assertTrue(recursiveEquals(term5426, term30427));
        assertTrue(recursiveEquals(retValue, term30422));
    }

};


