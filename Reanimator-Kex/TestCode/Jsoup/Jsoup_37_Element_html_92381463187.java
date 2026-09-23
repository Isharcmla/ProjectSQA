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

public class Element_html_92381463187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8568;

    public Element_html_92381463187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8592 = new HashMap();
        Set<Object> term8655 =  ((Map) term8592).keySet();
        HashSet term8591 = new HashSet((Collection<? extends Object>) term8655);
        ArrayList term8604 = new ArrayList();
        ((ArrayList) term8604).add((Object)null);
        ((ArrayList) term8604).add((Object)null);
        ((ArrayList) term8604).add((Object)null);
        ((ArrayList) term8604).add((Object)null);
        ((ArrayList) term8604).add((Object)null);
        LinkedHashMap term8609 = new LinkedHashMap();
        term8568 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8569 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8608 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8569, term8569.getClass(), "tagName", "hSSCyNEhyH");
        setBooleanField(term8569, term8569.getClass(), "isBlock", true);
        setBooleanField(term8569, term8569.getClass(), "formatAsBlock", true);
        setBooleanField(term8569, term8569.getClass(), "canContainBlock", false);
        setBooleanField(term8569, term8569.getClass(), "canContainInline", true);
        setBooleanField(term8569, term8569.getClass(), "empty", false);
        setBooleanField(term8569, term8569.getClass(), "selfClosing", true);
        setBooleanField(term8569, term8569.getClass(), "preserveWhitespace", false);
        setBooleanField(term8569, term8569.getClass(), "formList", true);
        setBooleanField(term8569, term8569.getClass(), "formSubmit", true);
        setField(term8568, term8568.getClass(), "tag", term8569);
        setField(term8568, term8568.getClass(), "classNames", term8591);
        setField(term8568, term8568.getClass(), "parentNode", null);
        setField(term8568, term8568.getClass(), "childNodes", term8604);
        setField(term8608, term8608.getClass(), "attributes", term8609);
        setField(term8568, term8568.getClass(), "attributes", term8608);
        setField(term8568, term8568.getClass(), "baseUri", "stVcZLTNpu");
        setIntField(term8568, term8568.getClass(), "siblingIndex", 991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LgXdqWrsLL";
        callMethod(klass, "html", argTypes, term8568, args);
    }

};


