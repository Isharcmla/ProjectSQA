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

public class Element_prepend_112302132225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;

    public Element_prepend_112302132225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2246 = new HashMap();
        Set<Object> term2313 =  ((Map) term2246).keySet();
        HashSet term2245 = new HashSet((Collection<? extends Object>) term2313);
        ArrayList term2262 = new ArrayList();
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        ((ArrayList) term2262).add((Object)null);
        LinkedHashMap term2267 = new LinkedHashMap();
        term2224 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2225 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2266 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2225, term2225.getClass(), "tagName", "mfCpTPPQQm");
        setBooleanField(term2225, term2225.getClass(), "isBlock", true);
        setBooleanField(term2225, term2225.getClass(), "formatAsBlock", true);
        setBooleanField(term2225, term2225.getClass(), "canContainBlock", true);
        setBooleanField(term2225, term2225.getClass(), "canContainInline", false);
        setBooleanField(term2225, term2225.getClass(), "empty", true);
        setBooleanField(term2225, term2225.getClass(), "selfClosing", false);
        setBooleanField(term2225, term2225.getClass(), "preserveWhitespace", true);
        setField(term2224, term2224.getClass(), "tag", term2225);
        setField(term2224, term2224.getClass(), "classNames", term2245);
        setField(term2224, term2224.getClass(), "parentNode", null);
        setField(term2224, term2224.getClass(), "childNodes", term2262);
        setField(term2266, term2266.getClass(), "attributes", term2267);
        setField(term2224, term2224.getClass(), "attributes", term2266);
        setField(term2224, term2224.getClass(), "baseUri", "PqtVXXZMqK");
        setIntField(term2224, term2224.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rYbtIDVdnd";
        callMethod(klass, "prepend", argTypes, term2224, args);
    }

};


