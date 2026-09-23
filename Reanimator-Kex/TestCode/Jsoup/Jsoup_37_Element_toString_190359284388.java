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

public class Element_toString_190359284388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8676;

    public Element_toString_190359284388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8700 = new HashMap();
        Set<Object> term8753 =  ((Map) term8700).keySet();
        HashSet term8699 = new HashSet((Collection<? extends Object>) term8753);
        ArrayList term8714 = new ArrayList();
        ((ArrayList) term8714).add((Object)null);
        ((ArrayList) term8714).add((Object)null);
        LinkedHashMap term8719 = new LinkedHashMap();
        term8676 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8677 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8718 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8677, term8677.getClass(), "tagName", "bbHWyibNmy");
        setBooleanField(term8677, term8677.getClass(), "isBlock", true);
        setBooleanField(term8677, term8677.getClass(), "formatAsBlock", false);
        setBooleanField(term8677, term8677.getClass(), "canContainBlock", true);
        setBooleanField(term8677, term8677.getClass(), "canContainInline", false);
        setBooleanField(term8677, term8677.getClass(), "empty", false);
        setBooleanField(term8677, term8677.getClass(), "selfClosing", false);
        setBooleanField(term8677, term8677.getClass(), "preserveWhitespace", true);
        setBooleanField(term8677, term8677.getClass(), "formList", true);
        setBooleanField(term8677, term8677.getClass(), "formSubmit", false);
        setField(term8676, term8676.getClass(), "tag", term8677);
        setField(term8676, term8676.getClass(), "classNames", term8699);
        setField(term8676, term8676.getClass(), "parentNode", null);
        setField(term8676, term8676.getClass(), "childNodes", term8714);
        setField(term8718, term8718.getClass(), "attributes", term8719);
        setField(term8676, term8676.getClass(), "attributes", term8718);
        setField(term8676, term8676.getClass(), "baseUri", "uUgJfKAzDM");
        setIntField(term8676, term8676.getClass(), "siblingIndex", -506958186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8676, args);
    }

};


