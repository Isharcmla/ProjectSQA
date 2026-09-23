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

public class Element_is_2062761729116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1406;
     Object term13223;

    public Element_is_2062761729116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1428 = new ArrayList();
        ((ArrayList) term1428).add((Object)null);
        ((ArrayList) term1428).add((Object)null);
        LinkedHashMap term1433 = new LinkedHashMap();
        term1406 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1407 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1432 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1407, term1407.getClass(), "tagName", "XPKmummaqg");
        setBooleanField(term1407, term1407.getClass(), "isBlock", true);
        setBooleanField(term1407, term1407.getClass(), "formatAsBlock", false);
        setBooleanField(term1407, term1407.getClass(), "canContainInline", false);
        setBooleanField(term1407, term1407.getClass(), "empty", false);
        setBooleanField(term1407, term1407.getClass(), "selfClosing", true);
        setBooleanField(term1407, term1407.getClass(), "preserveWhitespace", false);
        setBooleanField(term1407, term1407.getClass(), "formList", false);
        setBooleanField(term1407, term1407.getClass(), "formSubmit", false);
        setField(term1406, term1406.getClass(), "tag", term1407);
        setField(term1406, term1406.getClass(), "parentNode", null);
        setField(term1406, term1406.getClass(), "childNodes", term1428);
        setField(term1432, term1432.getClass(), "attributes", term1433);
        setField(term1406, term1406.getClass(), "attributes", term1432);
        setField(term1406, term1406.getClass(), "baseUri", "AWRooQKkdW");
        setIntField(term1406, term1406.getClass(), "siblingIndex", 1622346318);
        ArrayList term13227 = new ArrayList();
        ((ArrayList) term13227).add((Object)null);
        ((ArrayList) term13227).add((Object)null);
        LinkedHashMap term13230 = new LinkedHashMap();
        term13223 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term13224 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13229 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13224, term13224.getClass(), "tagName", "XPKmummaqg");
        setBooleanField(term13224, term13224.getClass(), "isBlock", true);
        setBooleanField(term13224, term13224.getClass(), "formatAsBlock", false);
        setBooleanField(term13224, term13224.getClass(), "canContainInline", false);
        setBooleanField(term13224, term13224.getClass(), "empty", false);
        setBooleanField(term13224, term13224.getClass(), "selfClosing", true);
        setBooleanField(term13224, term13224.getClass(), "preserveWhitespace", false);
        setBooleanField(term13224, term13224.getClass(), "formList", false);
        setBooleanField(term13224, term13224.getClass(), "formSubmit", false);
        setField(term13223, term13223.getClass(), "tag", term13224);
        setField(term13223, term13223.getClass(), "parentNode", null);
        setField(term13223, term13223.getClass(), "childNodes", term13227);
        setField(term13229, term13229.getClass(), "attributes", term13230);
        setField(term13223, term13223.getClass(), "attributes", term13229);
        setField(term13223, term13223.getClass(), "baseUri", "AWRooQKkdW");
        setIntField(term13223, term13223.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "is", argTypes, term1406, args);
        assertTrue(recursiveEquals(term1406, term13223));
    }

};


