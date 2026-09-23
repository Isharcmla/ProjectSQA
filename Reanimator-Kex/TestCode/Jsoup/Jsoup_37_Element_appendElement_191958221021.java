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

public class Element_appendElement_191958221021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1725;

    public Element_appendElement_191958221021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1749 = new HashMap();
        Set<Object> term1805 =  ((Map) term1749).keySet();
        HashSet term1748 = new HashSet((Collection<? extends Object>) term1805);
        ArrayList term1754 = new ArrayList();
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        ((ArrayList) term1754).add((Object)null);
        LinkedHashMap term1759 = new LinkedHashMap();
        term1725 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1726 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1758 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1726, term1726.getClass(), "tagName", "lFRJFUMVbx");
        setBooleanField(term1726, term1726.getClass(), "isBlock", false);
        setBooleanField(term1726, term1726.getClass(), "formatAsBlock", false);
        setBooleanField(term1726, term1726.getClass(), "canContainBlock", false);
        setBooleanField(term1726, term1726.getClass(), "canContainInline", false);
        setBooleanField(term1726, term1726.getClass(), "empty", true);
        setBooleanField(term1726, term1726.getClass(), "selfClosing", true);
        setBooleanField(term1726, term1726.getClass(), "preserveWhitespace", true);
        setBooleanField(term1726, term1726.getClass(), "formList", false);
        setBooleanField(term1726, term1726.getClass(), "formSubmit", true);
        setField(term1725, term1725.getClass(), "tag", term1726);
        setField(term1725, term1725.getClass(), "classNames", term1748);
        setField(term1725, term1725.getClass(), "parentNode", null);
        setField(term1725, term1725.getClass(), "childNodes", term1754);
        setField(term1758, term1758.getClass(), "attributes", term1759);
        setField(term1725, term1725.getClass(), "attributes", term1758);
        setField(term1725, term1725.getClass(), "baseUri", "DhjNLmRMCu");
        setIntField(term1725, term1725.getClass(), "siblingIndex", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PgPzMSEjjX";
        callMethod(klass, "appendElement", argTypes, term1725, args);
    }

};


