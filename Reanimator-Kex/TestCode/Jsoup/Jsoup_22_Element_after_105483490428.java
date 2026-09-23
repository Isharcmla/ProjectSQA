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

public class Element_after_105483490428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2530;

    public Element_after_105483490428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2552 = new HashMap();
        Set<Object> term2611 =  ((Map) term2552).keySet();
        HashSet term2551 = new HashSet((Collection<? extends Object>) term2611);
        ArrayList term2560 = new ArrayList();
        ((ArrayList) term2560).add((Object)null);
        ((ArrayList) term2560).add((Object)null);
        ((ArrayList) term2560).add((Object)null);
        ((ArrayList) term2560).add((Object)null);
        ((ArrayList) term2560).add((Object)null);
        LinkedHashMap term2565 = new LinkedHashMap();
        term2530 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2531 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2564 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2531, term2531.getClass(), "tagName", "BwtdjiefJn");
        setBooleanField(term2531, term2531.getClass(), "isBlock", false);
        setBooleanField(term2531, term2531.getClass(), "formatAsBlock", true);
        setBooleanField(term2531, term2531.getClass(), "canContainBlock", false);
        setBooleanField(term2531, term2531.getClass(), "canContainInline", true);
        setBooleanField(term2531, term2531.getClass(), "empty", true);
        setBooleanField(term2531, term2531.getClass(), "selfClosing", false);
        setBooleanField(term2531, term2531.getClass(), "preserveWhitespace", true);
        setField(term2530, term2530.getClass(), "tag", term2531);
        setField(term2530, term2530.getClass(), "classNames", term2551);
        setField(term2530, term2530.getClass(), "parentNode", null);
        setField(term2530, term2530.getClass(), "childNodes", term2560);
        setField(term2564, term2564.getClass(), "attributes", term2565);
        setField(term2530, term2530.getClass(), "attributes", term2564);
        setField(term2530, term2530.getClass(), "baseUri", "zaloBqlrSo");
        setIntField(term2530, term2530.getClass(), "siblingIndex", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vvoLrMGCoN";
        callMethod(klass, "after", argTypes, term2530, args);
    }

};


