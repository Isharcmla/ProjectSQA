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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_append_99090775424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;

    public Element_append_99090775424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2134 = new HashMap();
        Set<Object> term2203 =  ((Map) term2134).keySet();
        HashSet term2133 = new HashSet((Collection<? extends Object>) term2203);
        ArrayList term2152 = new ArrayList();
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        LinkedHashMap term2157 = new LinkedHashMap();
        term2112 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2156 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2113, term2113.getClass(), "tagName", "SFqCrhEWLm");
        setBooleanField(term2113, term2113.getClass(), "isBlock", true);
        setBooleanField(term2113, term2113.getClass(), "formatAsBlock", false);
        setBooleanField(term2113, term2113.getClass(), "canContainBlock", false);
        setBooleanField(term2113, term2113.getClass(), "canContainInline", true);
        setBooleanField(term2113, term2113.getClass(), "empty", false);
        setBooleanField(term2113, term2113.getClass(), "selfClosing", true);
        setBooleanField(term2113, term2113.getClass(), "preserveWhitespace", false);
        setField(term2112, term2112.getClass(), "tag", term2113);
        setField(term2112, term2112.getClass(), "classNames", term2133);
        setField(term2112, term2112.getClass(), "parentNode", null);
        setField(term2112, term2112.getClass(), "childNodes", term2152);
        setField(term2156, term2156.getClass(), "attributes", term2157);
        setField(term2112, term2112.getClass(), "attributes", term2156);
        setField(term2112, term2112.getClass(), "baseUri", "xvkbvaEGYd");
        setIntField(term2112, term2112.getClass(), "siblingIndex", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HBGNxdNURv";
        callMethod(klass, "append", argTypes, term2112, args);
    }

};


