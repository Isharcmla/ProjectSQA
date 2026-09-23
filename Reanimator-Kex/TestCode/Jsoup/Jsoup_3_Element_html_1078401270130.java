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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_html_1078401270130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7030;

    public Element_html_1078401270130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7052 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7052, term7052.getClass(), "tagName", null);
        setBooleanField(term7052, term7052.getClass(), "isBlock", false);
        setBooleanField(term7052, term7052.getClass(), "canContainBlock", false);
        setBooleanField(term7052, term7052.getClass(), "canContainInline", true);
        setBooleanField(term7052, term7052.getClass(), "optionalClosing", false);
        setBooleanField(term7052, term7052.getClass(), "empty", false);
        setBooleanField(term7052, term7052.getClass(), "preserveWhitespace", false);
        setField(term7052, term7052.getClass(), "ancestors", null);
        Object term7059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7059, term7059.getClass(), "tagName", null);
        setBooleanField(term7059, term7059.getClass(), "isBlock", false);
        setBooleanField(term7059, term7059.getClass(), "canContainBlock", false);
        setBooleanField(term7059, term7059.getClass(), "canContainInline", false);
        setBooleanField(term7059, term7059.getClass(), "optionalClosing", true);
        setBooleanField(term7059, term7059.getClass(), "empty", true);
        setBooleanField(term7059, term7059.getClass(), "preserveWhitespace", false);
        setField(term7059, term7059.getClass(), "ancestors", null);
        Object term7066 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7066, term7066.getClass(), "tagName", null);
        setBooleanField(term7066, term7066.getClass(), "isBlock", false);
        setBooleanField(term7066, term7066.getClass(), "canContainBlock", false);
        setBooleanField(term7066, term7066.getClass(), "canContainInline", true);
        setBooleanField(term7066, term7066.getClass(), "optionalClosing", false);
        setBooleanField(term7066, term7066.getClass(), "empty", false);
        setBooleanField(term7066, term7066.getClass(), "preserveWhitespace", false);
        setField(term7066, term7066.getClass(), "ancestors", null);
        Object term7073 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7073, term7073.getClass(), "tagName", null);
        setBooleanField(term7073, term7073.getClass(), "isBlock", true);
        setBooleanField(term7073, term7073.getClass(), "canContainBlock", false);
        setBooleanField(term7073, term7073.getClass(), "canContainInline", true);
        setBooleanField(term7073, term7073.getClass(), "optionalClosing", true);
        setBooleanField(term7073, term7073.getClass(), "empty", true);
        setBooleanField(term7073, term7073.getClass(), "preserveWhitespace", true);
        setField(term7073, term7073.getClass(), "ancestors", null);
        Object term7080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7080, term7080.getClass(), "tagName", null);
        setBooleanField(term7080, term7080.getClass(), "isBlock", false);
        setBooleanField(term7080, term7080.getClass(), "canContainBlock", true);
        setBooleanField(term7080, term7080.getClass(), "canContainInline", true);
        setBooleanField(term7080, term7080.getClass(), "optionalClosing", true);
        setBooleanField(term7080, term7080.getClass(), "empty", false);
        setBooleanField(term7080, term7080.getClass(), "preserveWhitespace", false);
        setField(term7080, term7080.getClass(), "ancestors", null);
        Object term7087 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7087, term7087.getClass(), "tagName", null);
        setBooleanField(term7087, term7087.getClass(), "isBlock", true);
        setBooleanField(term7087, term7087.getClass(), "canContainBlock", false);
        setBooleanField(term7087, term7087.getClass(), "canContainInline", true);
        setBooleanField(term7087, term7087.getClass(), "optionalClosing", false);
        setBooleanField(term7087, term7087.getClass(), "empty", true);
        setBooleanField(term7087, term7087.getClass(), "preserveWhitespace", false);
        setField(term7087, term7087.getClass(), "ancestors", null);
        Object term7094 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7094, term7094.getClass(), "tagName", null);
        setBooleanField(term7094, term7094.getClass(), "isBlock", false);
        setBooleanField(term7094, term7094.getClass(), "canContainBlock", true);
        setBooleanField(term7094, term7094.getClass(), "canContainInline", false);
        setBooleanField(term7094, term7094.getClass(), "optionalClosing", false);
        setBooleanField(term7094, term7094.getClass(), "empty", true);
        setBooleanField(term7094, term7094.getClass(), "preserveWhitespace", false);
        setField(term7094, term7094.getClass(), "ancestors", null);
        ArrayList term7050 = new ArrayList();
        ((ArrayList) term7050).add(term7052);
        ((ArrayList) term7050).add(term7059);
        ((ArrayList) term7050).add(term7066);
        ((ArrayList) term7050).add(term7073);
        ((ArrayList) term7050).add(term7080);
        ((ArrayList) term7050).add(term7059);
        ((ArrayList) term7050).add(term7087);
        ((ArrayList) term7050).add(term7052);
        ((ArrayList) term7050).add(term7094);
        HashMap term7104 = new HashMap();
        Set<Object> term53643 =  ((Map) term7104).keySet();
        HashSet term7103 = new HashSet((Collection<? extends Object>) term53643);
        ArrayList term7114 = new ArrayList();
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        ((ArrayList) term7114).add((Object)null);
        LinkedHashMap term7119 = new LinkedHashMap();
        term7030 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7031 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7118 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7031, term7031.getClass(), "tagName", "Yrvtdcltri");
        setBooleanField(term7031, term7031.getClass(), "isBlock", false);
        setBooleanField(term7031, term7031.getClass(), "canContainBlock", true);
        setBooleanField(term7031, term7031.getClass(), "canContainInline", false);
        setBooleanField(term7031, term7031.getClass(), "optionalClosing", false);
        setBooleanField(term7031, term7031.getClass(), "empty", false);
        setBooleanField(term7031, term7031.getClass(), "preserveWhitespace", false);
        setField(term7031, term7031.getClass(), "ancestors", term7050);
        setField(term7030, term7030.getClass(), "tag", term7031);
        setField(term7030, term7030.getClass(), "classNames", term7103);
        setField(term7030, term7030.getClass(), "parentNode", null);
        setField(term7030, term7030.getClass(), "childNodes", term7114);
        setField(term7118, term7118.getClass(), "attributes", term7119);
        setField(term7030, term7030.getClass(), "attributes", term7118);
        setField(term7030, term7030.getClass(), "baseUri", "eKcEJRxNSu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "html", argTypes, term7030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


