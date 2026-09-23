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

public class Element_getAllElements_545850963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6231;

    public Element_getAllElements_545850963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6253 = new HashMap();
        Set<Object> term6306 =  ((Map) term6253).keySet();
        HashSet term6252 = new HashSet((Collection<? extends Object>) term6306);
        ArrayList term6267 = new ArrayList();
        LinkedHashMap term6272 = new LinkedHashMap();
        term6231 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6232 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6271 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6232, term6232.getClass(), "tagName", "HNVOAXYNEZ");
        setBooleanField(term6232, term6232.getClass(), "isBlock", false);
        setBooleanField(term6232, term6232.getClass(), "formatAsBlock", true);
        setBooleanField(term6232, term6232.getClass(), "canContainBlock", true);
        setBooleanField(term6232, term6232.getClass(), "canContainInline", true);
        setBooleanField(term6232, term6232.getClass(), "empty", true);
        setBooleanField(term6232, term6232.getClass(), "selfClosing", false);
        setBooleanField(term6232, term6232.getClass(), "preserveWhitespace", false);
        setField(term6231, term6231.getClass(), "tag", term6232);
        setField(term6231, term6231.getClass(), "classNames", term6252);
        setField(term6231, term6231.getClass(), "parentNode", null);
        setField(term6231, term6231.getClass(), "childNodes", term6267);
        setField(term6271, term6271.getClass(), "attributes", term6272);
        setField(term6231, term6231.getClass(), "attributes", term6271);
        setField(term6231, term6231.getClass(), "baseUri", "lLiSiPCciB");
        setIntField(term6231, term6231.getClass(), "siblingIndex", -1697741339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term6231, args);
    }

};


