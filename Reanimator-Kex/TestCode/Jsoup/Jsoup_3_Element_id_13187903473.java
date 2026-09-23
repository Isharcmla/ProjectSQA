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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_id_13187903473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615;
     Object term8897;

    public Element_id_13187903473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term637 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term637, term637.getClass(), "tagName", null);
        setBooleanField(term637, term637.getClass(), "isBlock", true);
        setBooleanField(term637, term637.getClass(), "canContainBlock", true);
        setBooleanField(term637, term637.getClass(), "canContainInline", true);
        setBooleanField(term637, term637.getClass(), "optionalClosing", true);
        setBooleanField(term637, term637.getClass(), "empty", false);
        setBooleanField(term637, term637.getClass(), "preserveWhitespace", true);
        setField(term637, term637.getClass(), "ancestors", null);
        Object term644 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term644, term644.getClass(), "tagName", null);
        setBooleanField(term644, term644.getClass(), "isBlock", false);
        setBooleanField(term644, term644.getClass(), "canContainBlock", true);
        setBooleanField(term644, term644.getClass(), "canContainInline", true);
        setBooleanField(term644, term644.getClass(), "optionalClosing", false);
        setBooleanField(term644, term644.getClass(), "empty", true);
        setBooleanField(term644, term644.getClass(), "preserveWhitespace", true);
        setField(term644, term644.getClass(), "ancestors", null);
        ArrayList term635 = new ArrayList();
        ((ArrayList) term635).add(term637);
        ((ArrayList) term635).add(term644);
        HashMap term654 = new HashMap();
        Set<Object> term8923 =  ((Map) term654).keySet();
        HashSet term653 = new HashSet((Collection<? extends Object>) term8923);
        ArrayList term659 = new ArrayList();
        ((ArrayList) term659).add((Object)null);
        ((ArrayList) term659).add((Object)null);
        ((ArrayList) term659).add((Object)null);
        ((ArrayList) term659).add((Object)null);
        ((ArrayList) term659).add((Object)null);
        ((ArrayList) term659).add((Object)null);
        LinkedHashMap term664 = new LinkedHashMap();
        term615 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term616 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term663 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term616, term616.getClass(), "tagName", "bLPjGVBhlX");
        setBooleanField(term616, term616.getClass(), "isBlock", true);
        setBooleanField(term616, term616.getClass(), "canContainBlock", true);
        setBooleanField(term616, term616.getClass(), "canContainInline", false);
        setBooleanField(term616, term616.getClass(), "optionalClosing", false);
        setBooleanField(term616, term616.getClass(), "empty", false);
        setBooleanField(term616, term616.getClass(), "preserveWhitespace", false);
        setField(term616, term616.getClass(), "ancestors", term635);
        setField(term615, term615.getClass(), "tag", term616);
        setField(term615, term615.getClass(), "classNames", term653);
        setField(term615, term615.getClass(), "parentNode", null);
        setField(term615, term615.getClass(), "childNodes", term659);
        setField(term663, term663.getClass(), "attributes", term664);
        setField(term615, term615.getClass(), "attributes", term663);
        setField(term615, term615.getClass(), "baseUri", "OWKQODBLzb");
        Object term8903 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8903, term8903.getClass(), "tagName", null);
        setBooleanField(term8903, term8903.getClass(), "isBlock", true);
        setBooleanField(term8903, term8903.getClass(), "canContainBlock", true);
        setBooleanField(term8903, term8903.getClass(), "canContainInline", true);
        setBooleanField(term8903, term8903.getClass(), "optionalClosing", true);
        setBooleanField(term8903, term8903.getClass(), "empty", false);
        setBooleanField(term8903, term8903.getClass(), "preserveWhitespace", true);
        setField(term8903, term8903.getClass(), "ancestors", null);
        Object term8904 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8904, term8904.getClass(), "tagName", null);
        setBooleanField(term8904, term8904.getClass(), "isBlock", false);
        setBooleanField(term8904, term8904.getClass(), "canContainBlock", true);
        setBooleanField(term8904, term8904.getClass(), "canContainInline", true);
        setBooleanField(term8904, term8904.getClass(), "optionalClosing", false);
        setBooleanField(term8904, term8904.getClass(), "empty", true);
        setBooleanField(term8904, term8904.getClass(), "preserveWhitespace", true);
        setField(term8904, term8904.getClass(), "ancestors", null);
        ArrayList term8901 = new ArrayList();
        ((ArrayList) term8901).add(term8903);
        ((ArrayList) term8901).add(term8904);
        HashMap term8906 = new HashMap();
        Set<Object> term8944 =  ((Map) term8906).keySet();
        HashSet term8905 = new HashSet((Collection<? extends Object>) term8944);
        ArrayList term8907 = new ArrayList();
        ((ArrayList) term8907).add((Object)null);
        ((ArrayList) term8907).add((Object)null);
        ((ArrayList) term8907).add((Object)null);
        ((ArrayList) term8907).add((Object)null);
        ((ArrayList) term8907).add((Object)null);
        ((ArrayList) term8907).add((Object)null);
        LinkedHashMap term8910 = new LinkedHashMap();
        term8897 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8898 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8909 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8898, term8898.getClass(), "tagName", "bLPjGVBhlX");
        setBooleanField(term8898, term8898.getClass(), "isBlock", true);
        setBooleanField(term8898, term8898.getClass(), "canContainBlock", true);
        setBooleanField(term8898, term8898.getClass(), "canContainInline", false);
        setBooleanField(term8898, term8898.getClass(), "optionalClosing", false);
        setBooleanField(term8898, term8898.getClass(), "empty", false);
        setBooleanField(term8898, term8898.getClass(), "preserveWhitespace", false);
        setField(term8898, term8898.getClass(), "ancestors", term8901);
        setField(term8897, term8897.getClass(), "tag", term8898);
        setField(term8897, term8897.getClass(), "classNames", term8905);
        setField(term8897, term8897.getClass(), "parentNode", null);
        setField(term8897, term8897.getClass(), "childNodes", term8907);
        setField(term8909, term8909.getClass(), "attributes", term8910);
        setField(term8897, term8897.getClass(), "attributes", term8909);
        setField(term8897, term8897.getClass(), "baseUri", "OWKQODBLzb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term615, args);
        assertTrue(recursiveEquals(term615, term8897));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


