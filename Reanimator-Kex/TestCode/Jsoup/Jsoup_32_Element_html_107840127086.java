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

public class Element_html_107840127086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8490;

    public Element_html_107840127086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8512 = new HashMap();
        Set<Object> term8567 =  ((Map) term8512).keySet();
        HashSet term8511 = new HashSet((Collection<? extends Object>) term8567);
        ArrayList term8528 = new ArrayList();
        ((ArrayList) term8528).add((Object)null);
        ((ArrayList) term8528).add((Object)null);
        LinkedHashMap term8533 = new LinkedHashMap();
        term8490 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8491 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8532 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8491, term8491.getClass(), "tagName", "GDGBPlYeLn");
        setBooleanField(term8491, term8491.getClass(), "isBlock", false);
        setBooleanField(term8491, term8491.getClass(), "formatAsBlock", false);
        setBooleanField(term8491, term8491.getClass(), "canContainBlock", true);
        setBooleanField(term8491, term8491.getClass(), "canContainInline", false);
        setBooleanField(term8491, term8491.getClass(), "empty", true);
        setBooleanField(term8491, term8491.getClass(), "selfClosing", false);
        setBooleanField(term8491, term8491.getClass(), "preserveWhitespace", true);
        setField(term8490, term8490.getClass(), "tag", term8491);
        setField(term8490, term8490.getClass(), "classNames", term8511);
        setField(term8490, term8490.getClass(), "parentNode", null);
        setField(term8490, term8490.getClass(), "childNodes", term8528);
        setField(term8532, term8532.getClass(), "attributes", term8533);
        setField(term8490, term8490.getClass(), "attributes", term8532);
        setField(term8490, term8490.getClass(), "baseUri", "tThwsqWKcE");
        setIntField(term8490, term8490.getClass(), "siblingIndex", -506958186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term8490, args);
    }

};


