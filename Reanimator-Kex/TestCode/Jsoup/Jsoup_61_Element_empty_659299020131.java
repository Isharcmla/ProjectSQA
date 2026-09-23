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

public class Element_empty_659299020131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2602;
     Object term19736;
     Object term19690;

    public Element_empty_659299020131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2624 = new ArrayList();
        ((ArrayList) term2624).add((Object)null);
        ((ArrayList) term2624).add((Object)null);
        LinkedHashMap term2629 = new LinkedHashMap();
        term2602 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2603 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2628 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2603, term2603.getClass(), "tagName", "kVEZMHmRtR");
        setBooleanField(term2603, term2603.getClass(), "isBlock", false);
        setBooleanField(term2603, term2603.getClass(), "formatAsBlock", false);
        setBooleanField(term2603, term2603.getClass(), "canContainInline", false);
        setBooleanField(term2603, term2603.getClass(), "empty", false);
        setBooleanField(term2603, term2603.getClass(), "selfClosing", false);
        setBooleanField(term2603, term2603.getClass(), "preserveWhitespace", false);
        setBooleanField(term2603, term2603.getClass(), "formList", false);
        setBooleanField(term2603, term2603.getClass(), "formSubmit", true);
        setField(term2602, term2602.getClass(), "tag", term2603);
        setField(term2602, term2602.getClass(), "parentNode", null);
        setField(term2602, term2602.getClass(), "childNodes", term2624);
        setField(term2628, term2628.getClass(), "attributes", term2629);
        setField(term2602, term2602.getClass(), "attributes", term2628);
        setField(term2602, term2602.getClass(), "baseUri", "JppkknKVOw");
        setIntField(term2602, term2602.getClass(), "siblingIndex", 1193880199);
        ArrayList term19740 = new ArrayList();
        LinkedHashMap term19743 = new LinkedHashMap();
        term19736 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19737 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19742 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19737, term19737.getClass(), "tagName", "kVEZMHmRtR");
        setBooleanField(term19737, term19737.getClass(), "isBlock", false);
        setBooleanField(term19737, term19737.getClass(), "formatAsBlock", false);
        setBooleanField(term19737, term19737.getClass(), "canContainInline", false);
        setBooleanField(term19737, term19737.getClass(), "empty", false);
        setBooleanField(term19737, term19737.getClass(), "selfClosing", false);
        setBooleanField(term19737, term19737.getClass(), "preserveWhitespace", false);
        setBooleanField(term19737, term19737.getClass(), "formList", false);
        setBooleanField(term19737, term19737.getClass(), "formSubmit", true);
        setField(term19736, term19736.getClass(), "tag", term19737);
        setField(term19736, term19736.getClass(), "parentNode", null);
        setField(term19736, term19736.getClass(), "childNodes", term19740);
        setField(term19742, term19742.getClass(), "attributes", term19743);
        setField(term19736, term19736.getClass(), "attributes", term19742);
        setField(term19736, term19736.getClass(), "baseUri", "JppkknKVOw");
        setIntField(term19736, term19736.getClass(), "siblingIndex", 1193880199);
        ArrayList term19712 = new ArrayList();
        LinkedHashMap term19717 = new LinkedHashMap();
        term19690 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19691 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19716 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19691, term19691.getClass(), "tagName", "kVEZMHmRtR");
        setBooleanField(term19691, term19691.getClass(), "isBlock", false);
        setBooleanField(term19691, term19691.getClass(), "formatAsBlock", false);
        setBooleanField(term19691, term19691.getClass(), "canContainInline", false);
        setBooleanField(term19691, term19691.getClass(), "empty", false);
        setBooleanField(term19691, term19691.getClass(), "selfClosing", false);
        setBooleanField(term19691, term19691.getClass(), "preserveWhitespace", false);
        setBooleanField(term19691, term19691.getClass(), "formList", false);
        setBooleanField(term19691, term19691.getClass(), "formSubmit", true);
        setField(term19690, term19690.getClass(), "tag", term19691);
        setField(term19690, term19690.getClass(), "parentNode", null);
        setField(term19690, term19690.getClass(), "childNodes", term19712);
        setField(term19716, term19716.getClass(), "attributes", term19717);
        setField(term19690, term19690.getClass(), "attributes", term19716);
        setField(term19690, term19690.getClass(), "baseUri", "JppkknKVOw");
        setIntField(term19690, term19690.getClass(), "siblingIndex", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term2602, args);
        assertTrue(recursiveEquals(term2602, term19736));
        assertTrue(recursiveEquals(retValue, term19690));
    }

};


