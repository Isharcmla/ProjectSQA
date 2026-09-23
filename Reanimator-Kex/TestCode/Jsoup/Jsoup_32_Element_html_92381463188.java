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

public class Element_html_92381463188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8691;

    public Element_html_92381463188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8713 = new HashMap();
        Set<Object> term8774 =  ((Map) term8713).keySet();
        HashSet term8712 = new HashSet((Collection<? extends Object>) term8774);
        ArrayList term8723 = new ArrayList();
        LinkedHashMap term8728 = new LinkedHashMap();
        term8691 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8692 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8727 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8692, term8692.getClass(), "tagName", "vfennwtmqe");
        setBooleanField(term8692, term8692.getClass(), "isBlock", false);
        setBooleanField(term8692, term8692.getClass(), "formatAsBlock", true);
        setBooleanField(term8692, term8692.getClass(), "canContainBlock", true);
        setBooleanField(term8692, term8692.getClass(), "canContainInline", true);
        setBooleanField(term8692, term8692.getClass(), "empty", true);
        setBooleanField(term8692, term8692.getClass(), "selfClosing", true);
        setBooleanField(term8692, term8692.getClass(), "preserveWhitespace", true);
        setField(term8691, term8691.getClass(), "tag", term8692);
        setField(term8691, term8691.getClass(), "classNames", term8712);
        setField(term8691, term8691.getClass(), "parentNode", null);
        setField(term8691, term8691.getClass(), "childNodes", term8723);
        setField(term8727, term8727.getClass(), "attributes", term8728);
        setField(term8691, term8691.getClass(), "attributes", term8727);
        setField(term8691, term8691.getClass(), "baseUri", "ITrhiKKzcb");
        setIntField(term8691, term8691.getClass(), "siblingIndex", -1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qMKmSzOQXg";
        callMethod(klass, "html", argTypes, term8691, args);
    }

};


