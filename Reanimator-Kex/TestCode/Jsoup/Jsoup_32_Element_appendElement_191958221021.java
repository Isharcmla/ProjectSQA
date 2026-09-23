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
     Object term1687;

    public Element_appendElement_191958221021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1709 = new HashMap();
        Set<Object> term1765 =  ((Map) term1709).keySet();
        HashSet term1708 = new HashSet((Collection<? extends Object>) term1765);
        ArrayList term1714 = new ArrayList();
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        ((ArrayList) term1714).add((Object)null);
        LinkedHashMap term1719 = new LinkedHashMap();
        term1687 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1688 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1718 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1688, term1688.getClass(), "tagName", "lFRJFUMVbx");
        setBooleanField(term1688, term1688.getClass(), "isBlock", false);
        setBooleanField(term1688, term1688.getClass(), "formatAsBlock", false);
        setBooleanField(term1688, term1688.getClass(), "canContainBlock", true);
        setBooleanField(term1688, term1688.getClass(), "canContainInline", true);
        setBooleanField(term1688, term1688.getClass(), "empty", false);
        setBooleanField(term1688, term1688.getClass(), "selfClosing", true);
        setBooleanField(term1688, term1688.getClass(), "preserveWhitespace", true);
        setField(term1687, term1687.getClass(), "tag", term1688);
        setField(term1687, term1687.getClass(), "classNames", term1708);
        setField(term1687, term1687.getClass(), "parentNode", null);
        setField(term1687, term1687.getClass(), "childNodes", term1714);
        setField(term1718, term1718.getClass(), "attributes", term1719);
        setField(term1687, term1687.getClass(), "attributes", term1718);
        setField(term1687, term1687.getClass(), "baseUri", "DhjNLmRMCu");
        setIntField(term1687, term1687.getClass(), "siblingIndex", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PgPzMSEjjX";
        callMethod(klass, "appendElement", argTypes, term1687, args);
    }

};


