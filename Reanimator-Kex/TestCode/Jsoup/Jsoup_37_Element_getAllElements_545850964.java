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

public class Element_getAllElements_545850964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6297;

    public Element_getAllElements_545850964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6321 = new HashMap();
        Set<Object> term6374 =  ((Map) term6321).keySet();
        HashSet term6320 = new HashSet((Collection<? extends Object>) term6374);
        ArrayList term6335 = new ArrayList();
        LinkedHashMap term6340 = new LinkedHashMap();
        term6297 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6298 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6339 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6298, term6298.getClass(), "tagName", "HNVOAXYNEZ");
        setBooleanField(term6298, term6298.getClass(), "isBlock", false);
        setBooleanField(term6298, term6298.getClass(), "formatAsBlock", false);
        setBooleanField(term6298, term6298.getClass(), "canContainBlock", true);
        setBooleanField(term6298, term6298.getClass(), "canContainInline", false);
        setBooleanField(term6298, term6298.getClass(), "empty", false);
        setBooleanField(term6298, term6298.getClass(), "selfClosing", false);
        setBooleanField(term6298, term6298.getClass(), "preserveWhitespace", false);
        setBooleanField(term6298, term6298.getClass(), "formList", true);
        setBooleanField(term6298, term6298.getClass(), "formSubmit", true);
        setField(term6297, term6297.getClass(), "tag", term6298);
        setField(term6297, term6297.getClass(), "classNames", term6320);
        setField(term6297, term6297.getClass(), "parentNode", null);
        setField(term6297, term6297.getClass(), "childNodes", term6335);
        setField(term6339, term6339.getClass(), "attributes", term6340);
        setField(term6297, term6297.getClass(), "attributes", term6339);
        setField(term6297, term6297.getClass(), "baseUri", "lLiSiPCciB");
        setIntField(term6297, term6297.getClass(), "siblingIndex", 98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term6297, args);
    }

};


