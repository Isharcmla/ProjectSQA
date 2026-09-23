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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_appendText_83357295719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1844;

    public Element_appendText_83357295719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1866 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1866, term1866.getClass(), "tagName", null);
        setBooleanField(term1866, term1866.getClass(), "isBlock", false);
        setBooleanField(term1866, term1866.getClass(), "canContainBlock", true);
        setBooleanField(term1866, term1866.getClass(), "canContainInline", true);
        setBooleanField(term1866, term1866.getClass(), "optionalClosing", false);
        setBooleanField(term1866, term1866.getClass(), "empty", true);
        setBooleanField(term1866, term1866.getClass(), "preserveWhitespace", true);
        setField(term1866, term1866.getClass(), "ancestors", null);
        Object term1873 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1873, term1873.getClass(), "tagName", null);
        setBooleanField(term1873, term1873.getClass(), "isBlock", true);
        setBooleanField(term1873, term1873.getClass(), "canContainBlock", false);
        setBooleanField(term1873, term1873.getClass(), "canContainInline", true);
        setBooleanField(term1873, term1873.getClass(), "optionalClosing", true);
        setBooleanField(term1873, term1873.getClass(), "empty", false);
        setBooleanField(term1873, term1873.getClass(), "preserveWhitespace", false);
        setField(term1873, term1873.getClass(), "ancestors", null);
        Object term1880 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1880, term1880.getClass(), "tagName", null);
        setBooleanField(term1880, term1880.getClass(), "isBlock", false);
        setBooleanField(term1880, term1880.getClass(), "canContainBlock", false);
        setBooleanField(term1880, term1880.getClass(), "canContainInline", true);
        setBooleanField(term1880, term1880.getClass(), "optionalClosing", true);
        setBooleanField(term1880, term1880.getClass(), "empty", true);
        setBooleanField(term1880, term1880.getClass(), "preserveWhitespace", false);
        setField(term1880, term1880.getClass(), "ancestors", null);
        Object term1887 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1887, term1887.getClass(), "tagName", null);
        setBooleanField(term1887, term1887.getClass(), "isBlock", false);
        setBooleanField(term1887, term1887.getClass(), "canContainBlock", true);
        setBooleanField(term1887, term1887.getClass(), "canContainInline", false);
        setBooleanField(term1887, term1887.getClass(), "optionalClosing", true);
        setBooleanField(term1887, term1887.getClass(), "empty", true);
        setBooleanField(term1887, term1887.getClass(), "preserveWhitespace", false);
        setField(term1887, term1887.getClass(), "ancestors", null);
        Object term1894 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1894, term1894.getClass(), "tagName", null);
        setBooleanField(term1894, term1894.getClass(), "isBlock", false);
        setBooleanField(term1894, term1894.getClass(), "canContainBlock", false);
        setBooleanField(term1894, term1894.getClass(), "canContainInline", false);
        setBooleanField(term1894, term1894.getClass(), "optionalClosing", false);
        setBooleanField(term1894, term1894.getClass(), "empty", false);
        setBooleanField(term1894, term1894.getClass(), "preserveWhitespace", false);
        setField(term1894, term1894.getClass(), "ancestors", null);
        Object term1901 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1901, term1901.getClass(), "tagName", null);
        setBooleanField(term1901, term1901.getClass(), "isBlock", false);
        setBooleanField(term1901, term1901.getClass(), "canContainBlock", true);
        setBooleanField(term1901, term1901.getClass(), "canContainInline", false);
        setBooleanField(term1901, term1901.getClass(), "optionalClosing", false);
        setBooleanField(term1901, term1901.getClass(), "empty", false);
        setBooleanField(term1901, term1901.getClass(), "preserveWhitespace", false);
        setField(term1901, term1901.getClass(), "ancestors", null);
        ArrayList term1864 = new ArrayList();
        ((ArrayList) term1864).add(term1866);
        ((ArrayList) term1864).add(term1873);
        ((ArrayList) term1864).add(term1880);
        ((ArrayList) term1864).add(term1866);
        ((ArrayList) term1864).add(term1887);
        ((ArrayList) term1864).add(term1880);
        ((ArrayList) term1864).add(term1880);
        ((ArrayList) term1864).add(term1894);
        ((ArrayList) term1864).add(term1901);
        HashMap term1911 = new HashMap();
        Set<Object> term1974 =  ((Map) term1911).keySet();
        HashSet term1910 = new HashSet((Collection<? extends Object>) term1974);
        ArrayList term1929 = new ArrayList();
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        LinkedHashMap term1934 = new LinkedHashMap();
        term1844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1933 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1845, term1845.getClass(), "tagName", "ZKMLioamsY");
        setBooleanField(term1845, term1845.getClass(), "isBlock", false);
        setBooleanField(term1845, term1845.getClass(), "canContainBlock", false);
        setBooleanField(term1845, term1845.getClass(), "canContainInline", false);
        setBooleanField(term1845, term1845.getClass(), "optionalClosing", true);
        setBooleanField(term1845, term1845.getClass(), "empty", true);
        setBooleanField(term1845, term1845.getClass(), "preserveWhitespace", true);
        setField(term1845, term1845.getClass(), "ancestors", term1864);
        setField(term1844, term1844.getClass(), "tag", term1845);
        setField(term1844, term1844.getClass(), "classNames", term1910);
        setField(term1844, term1844.getClass(), "parentNode", null);
        setField(term1844, term1844.getClass(), "childNodes", term1929);
        setField(term1933, term1933.getClass(), "attributes", term1934);
        setField(term1844, term1844.getClass(), "attributes", term1933);
        setField(term1844, term1844.getClass(), "baseUri", "uPuCVuZYOI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TweMFhxNdj";
        callMethod(klass, "appendText", argTypes, term1844, args);
    }

};


