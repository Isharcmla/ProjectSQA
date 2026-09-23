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

public class Element_before_69763949326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2334;

    public Element_before_69763949326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2356 = new HashMap();
        Set<Object> term2427 =  ((Map) term2356).keySet();
        HashSet term2355 = new HashSet((Collection<? extends Object>) term2427);
        ArrayList term2376 = new ArrayList();
        ((ArrayList) term2376).add((Object)null);
        ((ArrayList) term2376).add((Object)null);
        ((ArrayList) term2376).add((Object)null);
        ((ArrayList) term2376).add((Object)null);
        ((ArrayList) term2376).add((Object)null);
        ((ArrayList) term2376).add((Object)null);
        ((ArrayList) term2376).add((Object)null);
        LinkedHashMap term2381 = new LinkedHashMap();
        term2334 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2335 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2380 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2335, term2335.getClass(), "tagName", "UKAReurpHG");
        setBooleanField(term2335, term2335.getClass(), "isBlock", false);
        setBooleanField(term2335, term2335.getClass(), "formatAsBlock", false);
        setBooleanField(term2335, term2335.getClass(), "canContainBlock", true);
        setBooleanField(term2335, term2335.getClass(), "canContainInline", true);
        setBooleanField(term2335, term2335.getClass(), "empty", true);
        setBooleanField(term2335, term2335.getClass(), "selfClosing", true);
        setBooleanField(term2335, term2335.getClass(), "preserveWhitespace", false);
        setField(term2334, term2334.getClass(), "tag", term2335);
        setField(term2334, term2334.getClass(), "classNames", term2355);
        setField(term2334, term2334.getClass(), "parentNode", null);
        setField(term2334, term2334.getClass(), "childNodes", term2376);
        setField(term2380, term2380.getClass(), "attributes", term2381);
        setField(term2334, term2334.getClass(), "attributes", term2380);
        setField(term2334, term2334.getClass(), "baseUri", "ypEdrstygY");
        setIntField(term2334, term2334.getClass(), "siblingIndex", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sNQFlATEeQ";
        callMethod(klass, "before", argTypes, term2334, args);
    }

};


