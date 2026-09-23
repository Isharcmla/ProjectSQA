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

public class Element_className_78448294274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7404;

    public Element_className_78448294274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7426 = new HashMap();
        Set<Object> term7477 =  ((Map) term7426).keySet();
        HashSet term7425 = new HashSet((Collection<? extends Object>) term7477);
        ArrayList term7438 = new ArrayList();
        LinkedHashMap term7443 = new LinkedHashMap();
        term7404 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7405 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7442 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7405, term7405.getClass(), "tagName", "QXyFXBjFde");
        setBooleanField(term7405, term7405.getClass(), "isBlock", true);
        setBooleanField(term7405, term7405.getClass(), "formatAsBlock", false);
        setBooleanField(term7405, term7405.getClass(), "canContainBlock", true);
        setBooleanField(term7405, term7405.getClass(), "canContainInline", false);
        setBooleanField(term7405, term7405.getClass(), "empty", false);
        setBooleanField(term7405, term7405.getClass(), "selfClosing", true);
        setBooleanField(term7405, term7405.getClass(), "preserveWhitespace", true);
        setField(term7404, term7404.getClass(), "tag", term7405);
        setField(term7404, term7404.getClass(), "classNames", term7425);
        setField(term7404, term7404.getClass(), "parentNode", null);
        setField(term7404, term7404.getClass(), "childNodes", term7438);
        setField(term7442, term7442.getClass(), "attributes", term7443);
        setField(term7404, term7404.getClass(), "attributes", term7442);
        setField(term7404, term7404.getClass(), "baseUri", "JptuwlirlS");
        setIntField(term7404, term7404.getClass(), "siblingIndex", 1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term7404, args);
    }

};


