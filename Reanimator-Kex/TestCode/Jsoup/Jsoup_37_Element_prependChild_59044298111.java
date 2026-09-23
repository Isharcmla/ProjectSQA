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
import java.lang.IllegalArgumentException;
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

public class Element_prependChild_59044298111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1635;

    public Element_prependChild_59044298111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1659 = new HashMap();
        Set<Object> term13567 =  ((Map) term1659).keySet();
        HashSet term1658 = new HashSet((Collection<? extends Object>) term13567);
        ArrayList term1671 = new ArrayList();
        ((ArrayList) term1671).add((Object)null);
        ((ArrayList) term1671).add((Object)null);
        ((ArrayList) term1671).add((Object)null);
        ((ArrayList) term1671).add((Object)null);
        ((ArrayList) term1671).add((Object)null);
        LinkedHashMap term1676 = new LinkedHashMap();
        term1635 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1636 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1675 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1636, term1636.getClass(), "tagName", "zUlRdimJtU");
        setBooleanField(term1636, term1636.getClass(), "isBlock", true);
        setBooleanField(term1636, term1636.getClass(), "formatAsBlock", false);
        setBooleanField(term1636, term1636.getClass(), "canContainBlock", true);
        setBooleanField(term1636, term1636.getClass(), "canContainInline", false);
        setBooleanField(term1636, term1636.getClass(), "empty", true);
        setBooleanField(term1636, term1636.getClass(), "selfClosing", true);
        setBooleanField(term1636, term1636.getClass(), "preserveWhitespace", true);
        setBooleanField(term1636, term1636.getClass(), "formList", false);
        setBooleanField(term1636, term1636.getClass(), "formSubmit", true);
        setField(term1635, term1635.getClass(), "tag", term1636);
        setField(term1635, term1635.getClass(), "classNames", term1658);
        setField(term1635, term1635.getClass(), "parentNode", null);
        setField(term1635, term1635.getClass(), "childNodes", term1671);
        setField(term1675, term1675.getClass(), "attributes", term1676);
        setField(term1635, term1635.getClass(), "attributes", term1675);
        setField(term1635, term1635.getClass(), "baseUri", "igCAtimmYB");
        setIntField(term1635, term1635.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prependChild", argTypes, term1635, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


